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
        PokitDok pd = new PokitDok("uLM1RVOYEOZ8q3ZGzKK9", "kCHQzp4auPOTtu98g5lGAeJJPINll46bFZHr5ksk");
        pd.connect();
        
        Eligibility e = new Eligibility();
        e.member.first_name = "RANDY";
        e.member.last_name = "WANDELL";
        e.member.birth_date = "1961-12-19";
        e.member.id = "AKX913A78136";
        
        e.provider.first_name = "PAUL";
        e.provider.last_name = "HORDES";
        e.provider.npi = "1497889620";
        
//        e.service_types.add("chiropractic");
//        e.service_types.add("health_benefit_plan_coverage");
//        e.service_types.add("general_benefits");
        e.service_types.add("chiropractic_office_visits");
        e.trading_partner_id = "anthem_blue_cross_ca";
        
        System.out.println(e.serialize());
        
        Map eligibilityQuery = (JSONObject) JSONValue.parse(e.serialize());

        Map<String, Object> response = pd.eligibility(eligibilityQuery);

        ObjectMapper mapper = new ObjectMapper();
        
//        EligibilityResponse er = mapper.readValue(response.toString(), EligibilityResponse.class);
        
        System.out.println(response.toString());
    }
}
