/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pokitdok.utilities.claim;

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
public class Test_ClaimStatus {
    public static void main(String [] srgs) throws IOException, ParseException, UnauthorizedException {
        PokitDok pd = new PokitDok("UYOjfVWTJ0y3o1idROXd", "WYoYu4rDhjkAGskBtTUwUC26e3Tvi9yxylCEX9vW");
        pd.connect();
        
        String claim_status_request = "{\n" +
"    \"patient\": {\n" +
"        \"birth_date\": \"1998-06-05\",\n" +
"        \"first_name\": \"ASHER\",\n" +
"        \"last_name\": \"ALLEN\",\n" +
"        \"id\": \"945801841\"\n" +
"    },\n" +
"    \"provider\": {\n" +
"        \"first_name\": \"Rion\",\n" +
"        \"last_name\": \"Marcus\",\n" +
"        \"npi\": \"1124369947\"\n" +
"    },\n" +
"    \"service_date\": \"2016-01-29\",\n" +
"    \"trading_partner_id\": \"MOCKPAYER\"\n" +
"}";
        
        Map claimQuery = (JSONObject) JSONValue.parse(claim_status_request);
      
        Map<String, Object> response = pd.claimStatus(claimQuery);
        System.out.println(response.toString());
    }
}
