package com.jessethouin.util;

import org.apache.commons.collections4.list.SetUniqueList;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * Created by jesse on June 11, 2016.
 *
 */
public class PalindromeUtil {
	private static final Logger logger = LoggerFactory.getLogger(PalindromeUtil.class);

	private PalindromeUtil() {
	}

	/**
	 * Get an actual list of all possible palindromes.
	 * @param names A unique list of names with which to create palindromes
	 * @return The list of palindromes
	 */
	public static SortedMap<String, List<String>> getPalindromes(SetUniqueList<String> names) {
		TreeMap<String, List<String>> retVal = new TreeMap<>();
		names.forEach(name -> {
			List<String> palindromes = createPalindromes(name);
			retVal.put(name, palindromes);
		});
		return retVal;
	}

	/**
	 * Get a count of possible palindromes.
	 * @param names A unique list of names with which to create palindromes
	 * @return The list of names and the number of palindromes possible
	 */
	public static SortedMap<String, Integer> calculatePalindromes(SetUniqueList<String> names) {
		TreeMap<String, Integer> retVal = new TreeMap<>();
		names.forEach(name -> {
			int palindromes = countPalindromes(name);
			retVal.put(name, palindromes);
		});
		return retVal;
	}

	/**
	 * Sorts a Map by value (rather than Key, which is more common)
	 * @param map The map to be sorted
	 * @param <K> The map key
	 * @param <V> The map value
	 * @return The sorted map.
	 */
	public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
		Map<K, V> result = new LinkedHashMap<>();
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(e -> result.put(e.getKey(), e.getValue()));
		return result;
	}

	/**
	 * Calculates the possible number of palindromes based on the name supplied
	 * @param name The name with which to seed the palindrome calculator
	 * @return The number of possible palindromes
	 */
	public static int countPalindromes(String name) {
		double nameLength = Math.ceil((double) name.length() / 2);
		int uniqueCharacters = getUniqueCharacters(name).size();
		return (int) Math.pow(uniqueCharacters, nameLength);
	}

	/**
	 * Creates a list of palindromes based on the name supplied
	 * @param name The name with which to seed the palindrome builder
	 * @return A list of palindromes
	 */
	public static List<String> createPalindromes(String name) {
		List<String> palindromes = new ArrayList<>();

		SetUniqueList<Character> uniqueCharacters = getUniqueCharacters(name);
		logger.debug("Printing combinations for {}.", name);
		double positionsToFill = Math.ceil((double) name.length() / 2);
		List<Integer> odometer = new ArrayList<>(Collections.nCopies((int) positionsToFill, 0));
		do {
			odometer = loop(uniqueCharacters, (int) positionsToFill, odometer, palindromes);
		} while (!odometer.isEmpty());

		return palindromes;
	}

	private static SetUniqueList<Character> getUniqueCharacters(String name) {
		SetUniqueList<Character> chars = SetUniqueList.setUniqueList(new ArrayList<>());
		char[] letters = name.toLowerCase().toCharArray();
		for (char letter : letters) {
			chars.add(letter);
		}
		return chars;
	}

	private static List<Integer> loop(List<Character> characters, int positionsToFill, List<Integer> odometer, List<String> palindromes) {
		int thisCharacterIndex = 0;
		int tripCharacter = 0;

		StringBuilder palindrome = new StringBuilder();
		for (int odometerReading : odometer) {
			char character = characters.get(odometerReading);
			palindrome.append(character);

			if (tripCharacter >= thisCharacterIndex) {
				if ((odometerReading + 1) == characters.size() && (thisCharacterIndex + 1) == positionsToFill) {
					String lastHalfOfPalindrome = StringUtils.reverse(StringUtils.substring(palindrome.toString(), 0, palindrome.toString().length() - 1));
					palindromes.add(palindrome.toString() + lastHalfOfPalindrome);
					return new ArrayList<>();
				} else if ((odometerReading + 1) == characters.size()) {
					odometer.set(thisCharacterIndex, 0);
					tripCharacter++;
				} else {
					odometer.set(thisCharacterIndex, ++odometerReading);
					tripCharacter = 0;
				}
			}

			thisCharacterIndex++;
		}

		String lastHalfOfPalindrome = StringUtils.reverse(StringUtils.substring(palindrome.toString(), 0, palindrome.toString().length() - 1));
		palindromes.add(palindrome.toString() + lastHalfOfPalindrome);

		return odometer;
	}
}
