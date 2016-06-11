package com.jessethouin.controller;

import com.jessethouin.util.PalindromeUtil;
import org.junit.Test;

import java.util.List;

/**
 * Created by jesse on 6/11/16.
 */
public class PalindromeControllerTest {
	@Test
	public void palindromes() throws Exception {
		List<String> palindromes = PalindromeUtil.createPalindromes("abcd");
		System.out.println(palindromes);
		assert palindromes.size() == 16;
	}

	@Test
	public void countPalindromes() throws Exception {
		assert PalindromeUtil.countPalindromes("Jesse") == 27;
	}
}