
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
    "name",
    "office",
    "facility",
    "phone",
    "address",
    "email"
})
public class Contact {

    @JsonProperty("name")
    private String name;
    @JsonProperty("office")
    private String office;
    @JsonProperty("facility")
    private String facility;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("address")
    private String address;
    @JsonProperty("email")
    private String email;

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The office
     */
    @JsonProperty("office")
    public String getOffice() {
        return office;
    }

    /**
     * 
     * @param office
     *     The office
     */
    @JsonProperty("office")
    public void setOffice(String office) {
        this.office = office;
    }

    /**
     * 
     * @return
     *     The facility
     */
    @JsonProperty("facility")
    public String getFacility() {
        return facility;
    }

    /**
     * 
     * @param facility
     *     The facility
     */
    @JsonProperty("facility")
    public void setFacility(String facility) {
        this.facility = facility;
    }

    /**
     * 
     * @return
     *     The phone
     */
    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    /**
     * 
     * @param phone
     *     The phone
     */
    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 
     * @return
     *     The address
     */
    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    /**
     * 
     * @param address
     *     The address
     */
    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 
     * @return
     *     The email
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email
     *     The email
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(office).append(facility).append(phone).append(address).append(email).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Contact) == false) {
            return false;
        }
        Contact rhs = ((Contact) other);
        return new EqualsBuilder().append(name, rhs.name).append(office, rhs.office).append(facility, rhs.facility).append(phone, rhs.phone).append(address, rhs.address).append(email, rhs.email).isEquals();
    }

}
