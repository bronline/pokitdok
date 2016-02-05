
package com.pokitdok.utilities.claim;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "address",
    "taxonomy_code",
    "npi",
    "last_name",
    "first_name",
    "tax_id"
})
public class BillingProvider {

    @JsonProperty("address")
    public Address address;
    @JsonProperty("taxonomy_code")
    public String taxonomyCode;
    @JsonProperty("npi")
    public String npi;
    @JsonProperty("last_name")
    public String lastName;
    @JsonProperty("first_name")
    public String firstName;
    @JsonProperty("tax_id")
    public String taxId;

}
