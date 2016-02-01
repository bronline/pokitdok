
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
public class OutOfNetwork__ {

    @JsonProperty("limit")
    public Limit_____ limit;
    @JsonProperty("remaining")
    public Remaining_____ remaining;
    @JsonProperty("applied")
    public Applied_____ applied;

}