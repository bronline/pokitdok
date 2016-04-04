/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pokitdok.utilities.eligibility;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"relationship",
"first_name",
"birth_date",
"address",
"middle_name",
"last_name",
"gender"
})
public class Dependent {

@JsonProperty("relationship")
public String relationship;
@JsonProperty("first_name")
public String firstName;
@JsonProperty("birth_date")
public String birthDate;
@JsonProperty("address")
public Address address;
@JsonProperty("middle_name")
public String middleName;
@JsonProperty("last_name")
public String lastName;
@JsonProperty("gender")
public String gender;

}
