
package com.pokitdok.utilities.eligibility;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "copay",
    "is_eligible"
})
public class Pharmacy {
    @JsonProperty("copay")
    public List<PharmacyCopay> copay = new ArrayList<PharmacyCopay>();
    @JsonProperty("is_eligible")
    public Boolean isEligible;

}
