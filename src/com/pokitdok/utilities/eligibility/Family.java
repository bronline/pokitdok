
package com.pokitdok.utilities.eligibility;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "in_network",
    "out_of_network"
})
public class Family {

    @JsonProperty("in_network")
    public InNetwork_ inNetwork;
    @JsonProperty("out_of_network")
    public OutOfNetwork_ outOfNetwork;

}
