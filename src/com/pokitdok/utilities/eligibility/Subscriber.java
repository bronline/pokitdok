
package com.pokitdok.utilities.eligibility;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "first_name",
    "birth_date",
    "address",
    "last_name",
    "gender"
})
public class Subscriber {

    @JsonProperty("id")
    public String id;
    @JsonProperty("first_name")
    public String firstName;
    @JsonProperty("birth_date")
    public String birthDate;
    @JsonProperty("address")
    public Address_ address;
    @JsonProperty("last_name")
    public String lastName;
    @JsonProperty("gender")
    public String gender;

}
