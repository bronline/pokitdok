
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
    "service_types",
    "service_type_codes",
    "in_plan_network",
    "coverage_level",
    "benefit_amount",
    "time_period"
})
public class OutOfPocket_ {

    @JsonProperty("service_types")
    public List<String> serviceTypes = new ArrayList<String>();
    @JsonProperty("service_type_codes")
    public List<String> serviceTypeCodes = new ArrayList<String>();
    @JsonProperty("in_plan_network")
    public String inPlanNetwork;
    @JsonProperty("coverage_level")
    public String coverageLevel;
    @JsonProperty("benefit_amount")
    public BenefitAmount_ benefitAmount;
    @JsonProperty("time_period")
    public String timePeriod;

}
