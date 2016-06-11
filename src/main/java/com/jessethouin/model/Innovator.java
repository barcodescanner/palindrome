
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
    "lname",
    "mname",
    "company",
    "order",
    "fname"
})
public class Innovator {

    @JsonProperty("lname")
    private String lname;
    @JsonProperty("mname")
    private String mname;
    @JsonProperty("company")
    private String company;
    @JsonProperty("order")
    private String order;
    @JsonProperty("fname")
    private String fname;

    /**
     * 
     * @return
     *     The lname
     */
    @JsonProperty("lname")
    public String getLname() {
        return lname;
    }

    /**
     * 
     * @param lname
     *     The lname
     */
    @JsonProperty("lname")
    public void setLname(String lname) {
        this.lname = lname;
    }

    /**
     * 
     * @return
     *     The mname
     */
    @JsonProperty("mname")
    public String getMname() {
        return mname;
    }

    /**
     * 
     * @param mname
     *     The mname
     */
    @JsonProperty("mname")
    public void setMname(String mname) {
        this.mname = mname;
    }

    /**
     * 
     * @return
     *     The company
     */
    @JsonProperty("company")
    public String getCompany() {
        return company;
    }

    /**
     * 
     * @param company
     *     The company
     */
    @JsonProperty("company")
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * 
     * @return
     *     The order
     */
    @JsonProperty("order")
    public String getOrder() {
        return order;
    }

    /**
     * 
     * @param order
     *     The order
     */
    @JsonProperty("order")
    public void setOrder(String order) {
        this.order = order;
    }

    /**
     * 
     * @return
     *     The fname
     */
    @JsonProperty("fname")
    public String getFname() {
        return fname;
    }

    /**
     * 
     * @param fname
     *     The fname
     */
    @JsonProperty("fname")
    public void setFname(String fname) {
        this.fname = fname;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(lname).append(mname).append(company).append(order).append(fname).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Innovator) == false) {
            return false;
        }
        Innovator rhs = ((Innovator) other);
        return new EqualsBuilder().append(lname, rhs.lname).append(mname, rhs.mname).append(company, rhs.company).append(order, rhs.order).append(fname, rhs.fname).isEquals();
    }

}
