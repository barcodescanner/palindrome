
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
    "email",
    "office",
    "facility"
})
public class Contact {

    @JsonProperty("email")
    private String email;
    @JsonProperty("office")
    private String office;
    @JsonProperty("facility")
    private String facility;

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

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(email).append(office).append(facility).toHashCode();
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
        return new EqualsBuilder().append(email, rhs.email).append(office, rhs.office).append(facility, rhs.facility).isEquals();
    }

}
