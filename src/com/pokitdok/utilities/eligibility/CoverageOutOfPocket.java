
package com.pokitdok.utilities.eligibility;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "service_type_codes",
    "in_plan_network",
    "service_types",
    "coverage_level",
    "benefit_amount",
    "time_period",
    "messages"
})
public class CoverageOutOfPocket {
    @JsonProperty("service_type_codes")
    public List<String> serviceTypeCodes = new ArrayList<String>();
    @JsonProperty("in_plan_network")
    public String inPlanNetwork;
    @JsonProperty("service_types")
    public List<String> serviceTypes = new ArrayList<String>();
    @JsonProperty("coverage_level")
    public String coverageLevel;
    @JsonProperty("benefit_amount")
    public BenefitAmount benefitAmount;
    @JsonProperty("time_period")
    public String timePeriod;
    @JsonProperty("messages")
    public List<Message> messages = new ArrayList<Message>();

}
