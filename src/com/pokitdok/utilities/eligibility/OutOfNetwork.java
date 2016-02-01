
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
public class OutOfNetwork {

    @JsonProperty("limit")
    public Limit_ limit;
    @JsonProperty("remaining")
    public Remaining_ remaining;
    @JsonProperty("applied")
    public Applied_ applied;

}
