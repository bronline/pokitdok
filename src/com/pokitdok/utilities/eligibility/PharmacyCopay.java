/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pokitdok.utilities.eligibility;

/**
 *
 * @author Randy
 */
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"supply",
"tier",
"type",
"notes",
"copayment"
})
public class PharmacyCopay {

@JsonProperty("supply")
public String supply;
@JsonProperty("tier")
public String tier;
@JsonProperty("type")
public String type;
@JsonProperty("notes")
public List<String> notes = new ArrayList<String>();
@JsonProperty("copayment")
public Copayment copayment;

}
