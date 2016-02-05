
package com.pokitdok.utilities.claim;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "information_release",
    "plan_participation",
    "provider_signature",
    "total_charge_amount",
    "claim_frequency",
    "direct_payment",
    "service_lines",
    "place_of_service"
})
public class Claim {

    @JsonProperty("information_release")
    public String informationRelease;
    @JsonProperty("plan_participation")
    public String planParticipation;
    @JsonProperty("provider_signature")
    public Boolean providerSignature;
    @JsonProperty("total_charge_amount")
    public String totalChargeAmount;
    @JsonProperty("claim_frequency")
    public String claimFrequency;
    @JsonProperty("direct_payment")
    public String directPayment;
    @JsonProperty("service_lines")
    public List<ClaimServiceLine> serviceLines = new ArrayList<ClaimServiceLine>();
    @JsonProperty("place_of_service")
    public String placeOfService;

}
