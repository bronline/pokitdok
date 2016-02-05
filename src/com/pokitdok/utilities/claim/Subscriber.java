
package com.pokitdok.utilities.claim;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "member_id",
    "address",
    "gender",
    "birth_date",
    "last_name",
    "payer_responsibility",
    "first_name"
})
public class Subscriber {

    @JsonProperty("member_id")
    public String memberId;
    @JsonProperty("address")
    public Address address;
    @JsonProperty("gender")
    public String gender;
    @JsonProperty("birth_date")
    public String birthDate;
    @JsonProperty("last_name")
    public String lastName;
    @JsonProperty("payer_responsibility")
    public String payerResponsibility;
    @JsonProperty("first_name")
    public String firstName;

}
