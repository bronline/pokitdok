
package com.pokitdok.utilities.eligibility;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "first_name",
    "npi",
    "last_name"
})
public class Provider {

    @JsonProperty("first_name")
    public String firstName;
    @JsonProperty("npi")
    public String npi;
    @JsonProperty("last_name")
    public String lastName;

}
