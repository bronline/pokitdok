
package com.pokitdok.utilities.eligibility;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "limit",
    "remaining",
    "applied"
})
public class InNetwork___ {

    @JsonProperty("limit")
    public Limit______ limit;
    @JsonProperty("remaining")
    public Remaining______ remaining;
    @JsonProperty("applied")
    public Applied______ applied;

}
