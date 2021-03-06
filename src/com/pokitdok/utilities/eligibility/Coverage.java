
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
    "coinsurance",
    "plan_end_date",
    "service_types",
    "primary_care_provider",
    "limitations",
    "plan_description",
    "service_date",
    "contacts",
    "insurance_type",
    "copay",
    "plan_begin_date",
    "level",
    "group_number",
    "plan_number",
    "non_covered",
    "out_of_pocket",
    "active",
    "service_type_codes",
    "deductibles",
    "group_description",
    "eligibility_begin_date"
})
public class Coverage {

    @JsonProperty("coinsurance")
    public List<Coinsurance> coinsurance = new ArrayList<Coinsurance>();
    @JsonProperty("plan_end_date")
    public String planEndDate;
    @JsonProperty("service_types")
    public List<String> serviceTypes = new ArrayList<String>();
    @JsonProperty("primary_care_provider")
    public PrimaryCareProvider primaryCareProvider;
    @JsonProperty("limitations")
    public List<Limitation> limitations = new ArrayList<Limitation>();
    @JsonProperty("plan_description")
    public String planDescription;
    @JsonProperty("service_date")
    public String serviceDate;
    @JsonProperty("contacts")
    public List<Contact> contacts = new ArrayList<Contact>();
    @JsonProperty("insurance_type")
    public String insuranceType;
    @JsonProperty("copay")
    public List<Copay> copay = new ArrayList<Copay>();
    @JsonProperty("plan_begin_date")
    public String planBeginDate;
    @JsonProperty("level")
    public String level;
    @JsonProperty("group_number")
    public String groupNumber;
    @JsonProperty("plan_number")
    public String planNumber;
    @JsonProperty("non_covered")
    public List<NonCovered> nonCovered = new ArrayList<NonCovered>();
    @JsonProperty("out_of_pocket")
    public List<CoverageOutOfPocket> outOfPocket = new ArrayList<CoverageOutOfPocket>();
    @JsonProperty("active")
    public Boolean active;
    @JsonProperty("service_type_codes")
    public List<String> serviceTypeCodes = new ArrayList<String>();
    @JsonProperty("deductibles")
    public List<CoverageDeductible> deductibles = new ArrayList<CoverageDeductible>();
    @JsonProperty("group_description")
    public String groupDescription;
    @JsonProperty("eligibility_begin_date")
    public String eligibilityBeginDate;

}
