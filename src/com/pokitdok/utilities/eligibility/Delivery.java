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
"time_period_qualifier",
"quantity_qualifier",
"period_count",
"quantity"
})
public class Delivery {

@JsonProperty("time_period_qualifier")
public String timePeriodQualifier;
@JsonProperty("quantity_qualifier")
public String quantityQualifier;
@JsonProperty("period_count")
public Integer period_count;
@JsonProperty("quantity")
public Integer quantity;

}
