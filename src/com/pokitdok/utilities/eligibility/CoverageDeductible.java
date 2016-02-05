
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
    "service_type_codes",
    "eligibility_date",
    "in_plan_network",
    "service_types",
    "messages",
    "coverage_level",
    "time_period",
    "benefit_amount"
})
public class CoverageDeductible {

    @JsonProperty("service_type_codes")
    public List<String> serviceTypeCodes = new ArrayList<String>();
    @JsonProperty("eligibility_date")
    public String eligibilityDate;
    @JsonProperty("in_plan_network")
    public String inPlanNetwork;
    @JsonProperty("service_types")
    public List<String> serviceTypes = new ArrayList<String>();
    @JsonProperty("messages")
    public List<Message> messages = new ArrayList<Message>();
    @JsonProperty("coverage_level")
    public String coverageLevel;
    @JsonProperty("time_period")
    public String timePeriod;
    @JsonProperty("benefit_amount")
    public BenefitAmount benefitAmount;

}
