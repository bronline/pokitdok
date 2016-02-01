
package com.pokitdok.utilities.eligibility;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "out_of_pocket",
    "deductible"
})
public class Summary {

    @JsonProperty("out_of_pocket")
    public OutOfPocket outOfPocket;
    @JsonProperty("deductible")
    public Deductible deductible;

}
