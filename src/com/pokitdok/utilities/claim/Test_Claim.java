/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pokitdok.utilities.claim;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pokitdok.PokitDok;
import com.pokitdok.UnauthorizedException;
import com.pokitdok.utilities.eligibility.Eligibility;
import com.pokitdok.utilities.eligibility.EligibilityResponse;
import java.io.IOException;
import java.util.Map;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Randy
 */
public class Test_Claim {
    public static void main(String [] srgs) throws IOException, ParseException, UnauthorizedException {
        PokitDok pd = new PokitDok("UYOjfVWTJ0y3o1idROXd", "WYoYu4rDhjkAGskBtTUwUC26e3Tvi9yxylCEX9vW");
        pd.connect();
        
        Claim c = new Claim();
        c.transaction_code = "chargeable";
        c.trading_partner_id = "MOCKPAYER";
        
        c.billing_provider.taxonomy_code = "207Q00000X";
        c.billing_provider.first_name = "Rion";
        c.billing_provider.last_name = "Marcus";
        c.billing_provider.npi = "1124369947";
        c.billing_provider.tax_id = "202344885";
        c.billing_provider.address.city = "Albuquerqe";
        c.billing_provider.address.state = "NM";
        c.billing_provider.address.zipcode = "87111";
        c.billing_provider.address.addressLines.add("10555 Montgomery NE");
        c.billing_provider.address.addressLines.add("Bldg 1 #30");
        
        c.subscriber.first_name = "ASHER";
        c.subscriber.last_name = "ALLEN";
        c.subscriber.birth_date = "1998-06-05";
        c.subscriber.gender = "male";
        c.subscriber.member_id = "945801841";
        c.subscriber.address.city = "Albuquerqe";
        c.subscriber.address.state = "NM";;
        c.subscriber.address.zipcode = "87110";
        c.subscriber.address.addressLines.add("5603 Indian School RD NE");
        
        c.claim.total_charge_amount = 50.00;
        
        ServiceLine s = new ServiceLine();
        s.charge_amount = 50.00;
        s.diagnosis_codes.add("719.47");
        s.diagnosis_codes.add("728.4");
        s.procedure_code = "98940";
        s.unit_count = 1.0;
        s.service_date = "2016-01-29";
        c.claim.service_lines.add(s);

        System.out.println(c.serialize());
        Map claimQuery = (JSONObject) JSONValue.parse(c.serialize());
      
        Map<String, Object> response = pd.claims(claimQuery);
        System.out.println(response);
//      ObjectMapper mapper = new ObjectMapper();
//      EligibilityResponse er = mapper.readValue(response.toString(), EligibilityResponse.class);
      
//      System.out.println(mapper.writeValueAsString(er));
    }
}
