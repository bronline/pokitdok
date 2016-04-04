
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
    "coverage_level",
    "messages",
    "benefit_amount",
    "in_plan_network",
    "delivery"
})
public class Limitation {

    @JsonProperty("service_types")
    public List<String> serviceTypes = new ArrayList<String>();
    @JsonProperty("service_type_codes")
    public List<String> serviceTypeCodes = new ArrayList<String>();
    @JsonProperty("coverage_level")
    public String coverageLevel;
    @JsonProperty("messages")
    public List<Message> messages = new ArrayList<Message>();
    @JsonProperty("benefit_amount")
    public BenefitAmount benefitAmount;
    @JsonProperty("in_plan_network")
    public String inPlanNetwork;
    @JsonProperty("delivery")
    public List<Delivery> delivery = new ArrayList<Delivery>();
}
