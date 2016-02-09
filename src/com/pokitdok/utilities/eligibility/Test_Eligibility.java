/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokitdok.utilities.eligibility;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pokitdok.PokitDok;
import com.pokitdok.UnauthorizedException;
import java.io.IOException;
import java.util.Map;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Randy
 */
public class Test_Eligibility {
    public static void main(String[] args) throws JsonProcessingException, ParseException, IOException, UnauthorizedException {
        PokitDok pd = new PokitDok("UYOjfVWTJ0y3o1idROXd", "WYoYu4rDhjkAGskBtTUwUC26e3Tvi9yxylCEX9vW");
        pd.connect();
        
        Eligibility e = new Eligibility();
        e.member.first_name = "ASHER";
        e.member.last_name = "ALLEN";
        e.member.birth_date = "1998-06-05";
        e.member.id = "945801841";
        
        e.provider.first_name = "Rion";
        e.provider.last_name = "Marcus";
        e.provider.npi = "1124369947";
        
        e.service_types.add("health_benefit_plan_coverage");
        e.trading_partner_id = "united_health_care";
        
        Map eligibilityQuery = (JSONObject) JSONValue.parse(e.serialize());

        Map<String, Object> response = pd.eligibility(eligibilityQuery);

        ObjectMapper mapper = new ObjectMapper();
        
        EligibilityResponse er = mapper.readValue(response.toString(), EligibilityResponse.class);
        
        System.out.println(response.toString());
    }
}
