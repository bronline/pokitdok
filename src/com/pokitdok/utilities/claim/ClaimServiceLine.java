
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
    "service_date",
    "procedure_code",
    "diagnosis_codes",
    "unit_type",
    "unit_count",
    "charge_amount"
})
public class ClaimServiceLine {

    @JsonProperty("service_date")
    public String serviceDate;
    @JsonProperty("procedure_code")
    public String procedureCode;
    @JsonProperty("diagnosis_codes")
    public List<String> diagnosisCodes = new ArrayList<String>();
    @JsonProperty("unit_type")
    public String unitType;
    @JsonProperty("unit_count")
    public String unitCount;
    @JsonProperty("charge_amount")
    public String chargeAmount;

}
