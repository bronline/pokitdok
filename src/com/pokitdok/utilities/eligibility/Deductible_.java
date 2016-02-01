
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
    "time_period",
    "service_types",
    "in_plan_network",
    "service_type_codes",
    "eligibility_date",
    "coverage_level",
    "benefit_amount",
    "messages"
})
public class Deductible_ {

    @JsonProperty("time_period")
    public String timePeriod;
    @JsonProperty("service_types")
    public List<String> serviceTypes = new ArrayList<String>();
    @JsonProperty("in_plan_network")
    public String inPlanNetwork;
    @JsonProperty("service_type_codes")
    public List<String> serviceTypeCodes = new ArrayList<String>();
    @JsonProperty("eligibility_date")
    public String eligibilityDate;
    @JsonProperty("coverage_level")
    public String coverageLevel;
    @JsonProperty("benefit_amount")
    public BenefitAmount__ benefitAmount;
    @JsonProperty("messages")
    public List<Message___> messages = new ArrayList<Message___>();

}
