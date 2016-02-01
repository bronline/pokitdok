
package com.pokitdok.utilities.eligibility;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "address_lines",
    "zipcode",
    "state",
    "city"
})
public class Address_ {

    @JsonProperty("address_lines")
    public List<String> addressLines = new ArrayList<String>();
    @JsonProperty("zipcode")
    public String zipcode;
    @JsonProperty("state")
    public String state;
    @JsonProperty("city")
    public String city;

}
