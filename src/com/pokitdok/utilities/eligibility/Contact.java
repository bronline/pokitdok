
package com.pokitdok.utilities.eligibility;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "address",
    "name",
    "contact_type"
})
public class Contact {

    @JsonProperty("address")
    public Address address;
    @JsonProperty("name")
    public String name;
    @JsonProperty("contact_type")
    public String contactType;

}
