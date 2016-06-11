
package com.jessethouin.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "0",
    "1",
    "2",
    "3",
    "4",
    "5",
    "6",
    "7"
})
public class Concepts {

    @JsonProperty("0")
    private String _0;
    @JsonProperty("1")
    private String _1;
    @JsonProperty("2")
    private String _2;
    @JsonProperty("3")
    private String _3;
    @JsonProperty("4")
    private String _4;
    @JsonProperty("5")
    private String _5;
    @JsonProperty("6")
    private String _6;
    @JsonProperty("7")
    private String _7;

    /**
     * 
     * @return
     *     The _0
     */
    @JsonProperty("0")
    public String get0() {
        return _0;
    }

    /**
     * 
     * @param _0
     *     The 0
     */
    @JsonProperty("0")
    public void set0(String _0) {
        this._0 = _0;
    }

    /**
     * 
     * @return
     *     The _1
     */
    @JsonProperty("1")
    public String get1() {
        return _1;
    }

    /**
     * 
     * @param _1
     *     The 1
     */
    @JsonProperty("1")
    public void set1(String _1) {
        this._1 = _1;
    }

    /**
     * 
     * @return
     *     The _2
     */
    @JsonProperty("2")
    public String get2() {
        return _2;
    }

    /**
     * 
     * @param _2
     *     The 2
     */
    @JsonProperty("2")
    public void set2(String _2) {
        this._2 = _2;
    }

    /**
     * 
     * @return
     *     The _3
     */
    @JsonProperty("3")
    public String get3() {
        return _3;
    }

    /**
     * 
     * @param _3
     *     The 3
     */
    @JsonProperty("3")
    public void set3(String _3) {
        this._3 = _3;
    }

    /**
     * 
     * @return
     *     The _4
     */
    @JsonProperty("4")
    public String get4() {
        return _4;
    }

    /**
     * 
     * @param _4
     *     The 4
     */
    @JsonProperty("4")
    public void set4(String _4) {
        this._4 = _4;
    }

    /**
     * 
     * @return
     *     The _5
     */
    @JsonProperty("5")
    public String get5() {
        return _5;
    }

    /**
     * 
     * @param _5
     *     The 5
     */
    @JsonProperty("5")
    public void set5(String _5) {
        this._5 = _5;
    }

    /**
     * 
     * @return
     *     The _6
     */
    @JsonProperty("6")
    public String get6() {
        return _6;
    }

    /**
     * 
     * @param _6
     *     The 6
     */
    @JsonProperty("6")
    public void set6(String _6) {
        this._6 = _6;
    }

    /**
     * 
     * @return
     *     The _7
     */
    @JsonProperty("7")
    public String get7() {
        return _7;
    }

    /**
     * 
     * @param _7
     *     The 7
     */
    @JsonProperty("7")
    public void set7(String _7) {
        this._7 = _7;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(_0).append(_1).append(_2).append(_3).append(_4).append(_5).append(_6).append(_7).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Concepts) == false) {
            return false;
        }
        Concepts rhs = ((Concepts) other);
        return new EqualsBuilder().append(_0, rhs._0).append(_1, rhs._1).append(_2, rhs._2).append(_3, rhs._3).append(_4, rhs._4).append(_5, rhs._5).append(_6, rhs._6).append(_7, rhs._7).isEquals();
    }

}
