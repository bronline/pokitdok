
package com.pokitdok.utilities.eligibility;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "credits_billed",
    "activity_id",
    "rate_limit_reset",
    "rate_limit_amount",
    "processing_time",
    "credits_remaining",
    "rate_limit_cap",
    "application_mode"
})
public class Meta {

    @JsonProperty("credits_billed")
    public Integer creditsBilled;
    @JsonProperty("activity_id")
    public String activityId;
    @JsonProperty("rate_limit_reset")
    public Integer rateLimitReset;
    @JsonProperty("rate_limit_amount")
    public Integer rateLimitAmount;
    @JsonProperty("processing_time")
    public Integer processingTime;
    @JsonProperty("credits_remaining")
    public Integer creditsRemaining;
    @JsonProperty("rate_limit_cap")
    public Integer rateLimitCap;
    @JsonProperty("application_mode")
    public String applicationMode;

}
