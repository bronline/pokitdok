
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
    "in_plan_network",
    "service_type_codes",
    "coverage_level",
    "benefit_percent",
    "messages",
    "authorization_required"

})
public class Coinsurance {

    @JsonProperty("service_types")
    public List<String> serviceTypes = new ArrayList<String>();
    @JsonProperty("in_plan_network")
    public String inPlanNetwork;
    @JsonProperty("service_type_codes")
    public List<String> serviceTypeCodes = new ArrayList<String>();
    @JsonProperty("coverage_level")
    public String coverageLevel;
    @JsonProperty("benefit_percent")
    public Float benefitPercent;
    @JsonProperty("messages")
    public List<Message> messages = new ArrayList<Message>();
    @JsonProperty("authorization_required")
    public String authorizationRequired;

}
