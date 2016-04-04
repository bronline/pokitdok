
package com.pokitdok.utilities.eligibility;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.pokitdok.utilities.eligibility.CoverageOutOfPocket;
import com.pokitdok.utilities.eligibility.Deductible;
import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "out_of_pocket",
    "deductible"
})
public class PhysicianVisitOfficeWell {

    @JsonProperty("out_of_pocket")
    public OutOfPocket outOfPocket;
    @JsonProperty("deductible")
    public Deductible deductible;

}
