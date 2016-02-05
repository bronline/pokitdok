
package com.pokitdok.utilities.claim;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "organization_name",
    "id",
    "email"
})
public class Submitter {

    @JsonProperty("organization_name")
    public String organizationName;
    @JsonProperty("id")
    public String id;
    @JsonProperty("email")
    public String email;

}
