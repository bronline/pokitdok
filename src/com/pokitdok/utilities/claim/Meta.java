
package com.pokitdok.utilities.claim;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "processing_time",
    "credits_billed",
    "rate_limit_amount",
    "rate_limit_reset",
    "activity_id",
    "application_mode",
    "credits_remaining",
    "rate_limit_cap"
})
public class Meta {

    @JsonProperty("processing_time")
    public Integer processingTime;
    @JsonProperty("credits_billed")
    public Integer creditsBilled;
    @JsonProperty("rate_limit_amount")
    public Integer rateLimitAmount;
    @JsonProperty("rate_limit_reset")
    public Integer rateLimitReset;
    @JsonProperty("activity_id")
    public String activityId;
    @JsonProperty("application_mode")
    public String applicationMode;
    @JsonProperty("credits_remaining")
    public Integer creditsRemaining;
    @JsonProperty("rate_limit_cap")
    public Integer rateLimitCap;

}
