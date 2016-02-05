
package com.pokitdok.utilities.claim;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "zipcode",
    "address_lines",
    "city",
    "state"
})
public class Address {

    @JsonProperty("zipcode")
    public String zipcode;
    @JsonProperty("address_lines")
    public List<String> addressLines = new ArrayList<String>();
    @JsonProperty("city")
    public String city;
    @JsonProperty("state")
    public String state;

}
