
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
    "address",
    "name",
    "service_types",
    "service_type_codes",    
    "contact_type"
})
public class Contact {

    @JsonProperty("address")
    public Address address;
    @JsonProperty("name")
    public String name;
    @JsonProperty("service_types")
    public List<String> serviceTypes = new ArrayList<String>();
    @JsonProperty("service_type_codes")
    public List<String> serviceTypeCodes = new ArrayList<String>();    
    @JsonProperty("contact_type")
    public String contactType;

}
