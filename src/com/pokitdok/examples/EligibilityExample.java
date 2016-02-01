package com.pokitdok.examples;

import java.util.Map;
import com.pokitdok.PokitDok;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class EligibilityExample {
  public static void main(String argv[]) {
    try {
      PokitDok pd = new PokitDok("UYOjfVWTJ0y3o1idROXd", "WYoYu4rDhjkAGskBtTUwUC26e3Tvi9yxylCEX9vW");
      pd.connect();
      
      StringBuffer eligibilityRequest = new StringBuffer();
      eligibilityRequest.append("{");
      eligibilityRequest.append("\"member\": {");
      eligibilityRequest.append("\"birth_date\": \"1998-06-05\",");
      eligibilityRequest.append("\"first_name\": \"ASHER\",");
      eligibilityRequest.append("\"last_name\": \"ALLEN\",");
      eligibilityRequest.append("\"id\": \"945801841\"");
      eligibilityRequest.append("},");
      eligibilityRequest.append("\"provider\": {");
      eligibilityRequest.append("\"first_name\": \"Rion\",");
      eligibilityRequest.append("\"last_name\": \"Marcus\",");
      eligibilityRequest.append("\"npi\": \"1124369947\"");
      eligibilityRequest.append("},");
      eligibilityRequest.append("\"service_types\": [\"health_benefit_plan_coverage\"],");
      eligibilityRequest.append("\"trading_partner_id\": \"united_health_care\"");
      eligibilityRequest.append("}");
      
      Map eligibilityQuery = (JSONObject) JSONValue.parse(eligibilityRequest.toString());
      
      System.out.print(eligibilityRequest.toString());
      
      Map<String, Object> response = pd.eligibility(eligibilityQuery);
      System.out.println(response);
    }
    catch (Exception e) {
      System.out.println("An exception occurred: " + e.toString());
    }
  }
}
