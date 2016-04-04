/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokitdok.utilities.eligibility;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.sf.ezmorph.Morpher;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 *
 * @author Randy
 */
public class Test_EligibilityResponse {
public static String eligibility_response;
public static void main(String [] args) throws IOException {
    eligibility_response = setEligibilityResponse();
    
    EligibilityResponse_New er = new EligibilityResponse_New(eligibility_response);
/*
    JSONObject data = JSONObject.fromObject(eligibility_response);
    System.out.println(data.getJSONObject("data").getJSONObject("coverage").get("active"));

    System.out.println("active: " + data.getJSONObject("data").getJSONObject("coverage").get("active"));
    System.out.println("insurance_type: " + data.getJSONObject("data").getJSONObject("coverage").get("insurance_type"));
    System.out.println("level: " + data.getJSONObject("data").getJSONObject("coverage").get("level"));
    System.out.println("group_number: " + data.getJSONObject("data").getJSONObject("coverage").get("group_number"));
    System.out.println("group_description: " + data.getJSONObject("data").getJSONObject("coverage").get("group_description"));
    System.out.println("plan_begin_date: " + data.getJSONObject("data").getJSONObject("coverage").get("eligibility_begin_date"));
    System.out.println("service_date: " + data.getJSONObject("data").getJSONObject("coverage").get("plan_begin_data"));

    JSONArray a=(JSONArray)data.getJSONObject("data").getJSONObject("coverage").get("coinsurance");
    for(int x=0;x<a.size();x++) {
        JSONObject coinsurance = (JSONObject)a.get(x);
        JSONArray service_types = (JSONArray)coinsurance.get("service_types");
        System.out.println("in_plan_network: " + coinsurance.get("in_plan_network"));
        System.out.println("coverage_level: " + coinsurance.get("coverage_level"));
        System.out.println("benefit_percent: " + coinsurance.get("benefit_percent"));
        for (Object service_type : service_types) {
            System.out.println(service_type);
        }
        JSONArray service_type_codes = (JSONArray)coinsurance.get("service_type_codes");
        for (Object service_type_code : service_type_codes) {
            System.out.println(service_type_code);
        }

        if(coinsurance.get("messages") != null) {
            JSONArray messages = (JSONArray)coinsurance.get("messages");
            for (Object message : messages) {
                JSONObject m = (JSONObject) message;
                System.out.println(m.get("message"));
            }
        }
    }
*/        
} 

public static String setEligibilityResponse() {
 return "{\"data\":{\"pharmacy\":{\"is_eligible\":false},\"summary\":{\"out_of_pocket\":{\"individual\":{\"in_network\":{\"limit\":{\"amount\":\"0\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"0\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"0.00\",\"currency\":\"USD\"}},\"out_of_network\":{\"limit\":{\"amount\":\"0\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"0\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"0.00\",\"currency\":\"USD\"}}}},\"deductible\":{\"individual\":{\"in_network\":{\"limit\":{\"amount\":\"0\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"0\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"0.00\",\"currency\":\"USD\"}},\"out_of_network\":{\"limit\":{\"amount\":\"0\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"0\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"0.00\",\"currency\":\"USD\"}}}}},\"dependent\":{\"relationship\":\"spouse\",\"first_name\":\"WILLIAM\",\"birth_date\":\"1964-03-22\",\"last_name\":\"COKELEY\",\"gender\":\"male\"},\"service_types\":[\"health_benefit_plan_coverage\"],\"provider\":{\"first_name\":\"Kenneth\",\"npi\":\"1669535381\",\"last_name\":\"Lester\"},\"correlation_id\":\"965caab7-7e5b-4234-9965-45eb05b0fc1e\",\"payer\":{\"id\":\"87726\",\"name\":\"UNITEDHEALTHCARE\"},\"coverage\":{\"service_types\":[\"health_benefit_plan_coverage\"],\"service_type_codes\":[\"30\"],\"active\":false,\"healthcare_facilities\":[{\"name\":\"Lester\",\"facility_type\":\"provider\"}]},\"trace_number\":\"d4d399d8f67f11e59bfb0242ac110003\",\"valid_request\":true,\"service_type_codes\":[\"30\"],\"trading_partner_id\":\"united_health_care\",\"client_id\":\"uLM1RVOYEOZ8q3ZGzKK9\",\"subscriber\":{\"id\":\"956474686\",\"first_name\":\"DAVID\",\"birth_date\":\"1964-01-02\",\"address\":{\"address_lines\":[\"4415 ACACIA STREET\"],\"zipcode\":\"77401\",\"state\":\"TX\",\"city\":\"BELLAIRE\"},\"middle_name\":\"D\",\"last_name\":\"TURNER\",\"gender\":\"male\"},\"originating_company_id\":\"POKITEDI00\"},\"meta\":{\"credits_billed\":1,\"activity_id\":\"56fbdc1ba308b606a17d2ecf\",\"rate_limit_reset\":1459349564,\"rate_limit_amount\":5,\"processing_time\":2542,\"credits_remaining\":-49,\"rate_limit_cap\":5000,\"application_mode\":\"production\"}}";
// "{\"data\":{\"pharmacy\":{\"is_eligible\":false},\"summary\":{\"out_of_pocket\":{\"individual\":{\"in_network\":{\"limit\":{\"amount\":\"3900\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"3770.02\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"129.98\",\"currency\":\"USD\"}},\"out_of_network\":{\"limit\":{\"amount\":\"0\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"0\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"0.00\",\"currency\":\"USD\"}}},\"family\":{\"in_network\":{\"limit\":{\"amount\":\"11700\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"11570.02\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"129.98\",\"currency\":\"USD\"}},\"out_of_network\":{\"limit\":{\"amount\":\"0\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"0\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"0.00\",\"currency\":\"USD\"}}}},\"deductible\":{\"individual\":{\"in_network\":{\"limit\":{\"amount\":\"1000\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"896.4\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"103.60\",\"currency\":\"USD\"}},\"out_of_network\":{\"limit\":{\"amount\":\"0\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"0\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"0.00\",\"currency\":\"USD\"}}},\"family\":{\"in_network\":{\"limit\":{\"amount\":\"3000\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"2896.4\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"103.60\",\"currency\":\"USD\"}},\"out_of_network\":{\"limit\":{\"amount\":\"0\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"0\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"0.00\",\"currency\":\"USD\"}}}}},\"service_types\":[\"health_benefit_plan_coverage\"],\"provider\":{\"first_name\":\"KENNETH\",\"npi\":\"1669535381\",\"last_name\":\"LESTER\"},\"correlation_id\":\"d4fd3553-0b5f-4104-9527-9ad10a7e676a\",\"payer\":{\"id\":\"G84980\",\"phone\":\"8008595299\",\"name\":\"AIM SPECIALTY HEALTH\"},\"coverage\":{\"coinsurance\":[{\"service_types\":[\"chiropractic\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"33\"],\"coverage_level\":\"individual\",\"benefit_percent\":0.2,\"messages\":[{\"message\":\"MUSCLE MANIPULATION - PROFESSIONAL\"}]},{\"service_types\":[\"chiropractic\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"33\"],\"coverage_level\":\"individual\",\"benefit_percent\":0.2,\"messages\":[{\"message\":\"MUSCLE MANIPULATION - PROFESSIONAL\"}]},{\"service_types\":[\"professional_physician_visit_office\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"98\"],\"coverage_level\":\"individual\",\"benefit_percent\":0.0,\"messages\":[{\"message\":\"OFFICE VISIT - PROFESSIONAL\"}]},{\"service_types\":[\"diagnostic_x_ray\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"4\"],\"coverage_level\":\"individual\",\"benefit_percent\":0.2,\"messages\":[{\"message\":\"XRAY - PROFESSIONAL\"},{\"message\":\"XRAY - PROFESSIONAL\"},{\"message\":\"PER ADMISSION PENALTY WILL BE $250.\"}]},{\"service_types\":[\"diagnostic_x_ray\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"4\"],\"coverage_level\":\"individual\",\"benefit_percent\":0.2,\"messages\":[{\"message\":\"XRAY - PROFESSIONAL\"}]},{\"service_types\":[\"diagnostic_x_ray\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"4\"],\"coverage_level\":\"individual\",\"benefit_percent\":0.0,\"messages\":[{\"message\":\"XRAY - PROFESSIONAL\"}]}],\"plan_end_date\":\"9999-12-31\",\"service_types\":[\"health_benefit_plan_coverage\"],\"limitations\":[{\"service_types\":[\"chiropractic\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"33\"],\"coverage_level\":\"individual\",\"benefit_amount\":{\"amount\":\"0\",\"currency\":\"USD\"},\"messages\":[{\"message\":\"MUSCLE MANIPULATION - PROFESSIONAL\"}]},{\"service_types\":[\"chiropractic\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"33\"],\"coverage_level\":\"individual\",\"benefit_amount\":{\"amount\":\"0\",\"currency\":\"USD\"},\"messages\":[{\"message\":\"MUSCLE MANIPULATION - PROFESSIONAL\"}]},{\"service_types\":[\"chiropractic\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"33\"],\"coverage_level\":\"individual\",\"benefit_amount\":{\"amount\":\"0\",\"currency\":\"USD\"},\"messages\":[{\"message\":\"MUSCLE MANIPULATION - PROFESSIONAL\"}]},{\"service_types\":[\"chiropractic\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"33\"],\"coverage_level\":\"individual\",\"benefit_amount\":{\"amount\":\"0\",\"currency\":\"USD\"},\"messages\":[{\"message\":\"MUSCLE MANIPULATION - PROFESSIONAL\"},{\"message\":\"UNLESS OTHERWISE REQUIRED BY STATE LAW, THIS NOTICE IS NOT A GUARANTEE OF PAYMENT. BENEFITS ARE SUBJECT TO ALL CONTRACT LIMITS AND THE MEMBER'S STATUS ON THE DATE OF SERVICE. ACCUMULATED AMOUNTS SUCH AS DEDUCTIBLE MAY CHANGE AS ADDITIONAL CLAIMS ARE PROCESSED.\"}]}],\"plan_description\":\"BlueChoice PPO\",\"contacts\":[{\"name\":\"AIM SPECIALTY HEALTH\",\"service_types\":[\"diagnostic_x_ray\"],\"service_type_codes\":[\"4\"],\"contact_type\":\"utilization_management_organization\"}],\"insurance_type\":\"ppo\",\"copay\":[{\"service_types\":[\"professional_physician_visit_office\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"98\"],\"coverage_level\":\"individual\",\"messages\":[{\"message\":\"OFFICE VISIT - PROFESSIONAL\"}],\"copayment\":{\"amount\":\"40\",\"currency\":\"USD\"}},{\"service_types\":[\"diagnostic_x_ray\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"4\"],\"coverage_level\":\"individual\",\"messages\":[{\"message\":\"XRAY - PROFESSIONAL\"}],\"copayment\":{\"amount\":\"40\",\"currency\":\"USD\"}}],\"plan_begin_date\":\"2015-11-01\",\"group_number\":\"045867\",\"out_of_pocket\":[{\"time_period\":\"calendar_year\",\"service_types\":[\"health_benefit_plan_coverage\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"30\"],\"coverage_level\":\"family\",\"benefit_amount\":{\"amount\":\"11700\",\"currency\":\"USD\"},\"messages\":[{\"message\":\"MUSCLE MANIPULATION - PROFESSIONAL;OFFICE VISIT - PROFESSIONAL;XRAY - PROFESSIONAL\"}]},{\"time_period\":\"calendar_year\",\"service_types\":[\"health_benefit_plan_coverage\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"30\"],\"coverage_level\":\"individual\",\"benefit_amount\":{\"amount\":\"3900\",\"currency\":\"USD\"},\"messages\":[{\"message\":\"MUSCLE MANIPULATION - PROFESSIONAL;OFFICE VISIT - PROFESSIONAL;XRAY - PROFESSIONAL\"}]},{\"time_period\":\"remaining\",\"service_types\":[\"health_benefit_plan_coverage\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"30\"],\"coverage_level\":\"family\",\"benefit_amount\":{\"amount\":\"11570.02\",\"currency\":\"USD\"},\"messages\":[{\"message\":\"MUSCLE MANIPULATION - PROFESSIONAL;OFFICE VISIT - PROFESSIONAL;XRAY - PROFESSIONAL\"}]},{\"time_period\":\"remaining\",\"service_types\":[\"health_benefit_plan_coverage\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"30\"],\"coverage_level\":\"individual\",\"benefit_amount\":{\"amount\":\"3770.02\",\"currency\":\"USD\"},\"messages\":[{\"message\":\"MUSCLE MANIPULATION - PROFESSIONAL;OFFICE VISIT - PROFESSIONAL;XRAY - PROFESSIONAL\"}]}],\"active\":true,\"service_type_codes\":[\"30\"],\"deductibles\":[{\"time_period\":\"calendar_year\",\"service_types\":[\"health_benefit_plan_coverage\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"30\"],\"coverage_level\":\"individual\",\"benefit_amount\":{\"amount\":\"1000\",\"currency\":\"USD\"},\"messages\":[{\"message\":\"MUSCLE MANIPULATION - PROFESSIONAL;XRAY - PROFESSIONAL\"}]},{\"time_period\":\"calendar_year\",\"service_types\":[\"health_benefit_plan_coverage\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"30\"],\"coverage_level\":\"family\",\"benefit_amount\":{\"amount\":\"3000\",\"currency\":\"USD\"},\"messages\":[{\"message\":\"MUSCLE MANIPULATION - PROFESSIONAL;XRAY - PROFESSIONAL\"}]},{\"time_period\":\"remaining\",\"service_types\":[\"health_benefit_plan_coverage\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"30\"],\"coverage_level\":\"individual\",\"benefit_amount\":{\"amount\":\"896.4\",\"currency\":\"USD\"},\"messages\":[{\"message\":\"MUSCLE MANIPULATION - PROFESSIONAL;XRAY - PROFESSIONAL\"}]},{\"time_period\":\"remaining\",\"service_types\":[\"health_benefit_plan_coverage\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"30\"],\"coverage_level\":\"family\",\"benefit_amount\":{\"amount\":\"2896.4\",\"currency\":\"USD\"},\"messages\":[{\"message\":\"MUSCLE MANIPULATION - PROFESSIONAL;XRAY - PROFESSIONAL\"}]}],\"group_description\":\"AMERICAN CONTRACT EXCAVATION (ACE) SERVI\"},\"trace_number\":\"3E023926F62D11E5A92E0242AC110003\",\"valid_request\":true,\"service_type_codes\":[\"30\"],\"client_id\":\"uLM1RVOYEOZ8q3ZGzKK9\",\"trading_partner_id\":\"blue_cross_blue_shield_tx\",\"subscriber\":{\"id\":\"ZGP842200537\",\"first_name\":\"NATHAN\",\"birth_date\":\"1982-07-07\",\"address\":{\"address_lines\":[\"8319 MAPLE ACRES\"],\"zipcode\":\"77095\",\"state\":\"TX\",\"city\":\"HOUSTON\"},\"middle_name\":\"G\",\"last_name\":\"WADE\",\"gender\":\"male\"},\"originating_company_id\":\"POKITEDI00\"},\"meta\":{\"credits_billed\":1,\"activity_id\":\"56fb518b65b80c020370ba25\",\"rate_limit_reset\":1459314587,\"rate_limit_amount\":1,\"processing_time\":2577,\"credits_remaining\":-38,\"rate_limit_cap\":5000,\"application_mode\":\"production\"}}";
// "{\"data\":{\"pharmacy\":{\"is_eligible\":false},\"summary\":{\"out_of_pocket\":{\"individual\":{\"in_network\":{\"limit\":{\"amount\":\"3700\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"1689.77\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"2010.23\",\"currency\":\"USD\"}},\"out_of_network\":{\"limit\":{\"amount\":\"3700\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"1689.77\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"2010.23\",\"currency\":\"USD\"}}}},\"deductible\":{\"individual\":{\"in_network\":{\"limit\":{\"amount\":\"300\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"0\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"300.00\",\"currency\":\"USD\"}},\"out_of_network\":{\"limit\":{\"amount\":\"300\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"0\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"300.00\",\"currency\":\"USD\"}}}}},\"service_types\":[\"hospital_outpatient\",\"chiropractic\",\"professional_physician_visit_office\",\"health_benefit_plan_coverage\",\"diagnostic_medical\"],\"provider\":{\"first_name\":\"Kenneth\",\"npi\":\"1669535381\",\"last_name\":\"Lester\"},\"correlation_id\":\"e97913f7-79f1-4be6-8d20-75f0adb1ef6c\",\"payer\":{\"id\":\"953402799\",\"name\":\"AETNA INC\"},\"coverage\":{\"coinsurance\":[{\"service_types\":[\"hospital_outpatient\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"50\"],\"coverage_level\":\"employee_only\",\"benefit_percent\":0.2,\"messages\":[{\"message\":\"In-Network Providers\"},{\"message\":\"COINS APPLIES TO OUT OF POCKET\"}]},{\"service_types\":[\"diagnostic_medical\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"73\"],\"coverage_level\":\"employee_only\",\"benefit_percent\":0.2,\"messages\":[{\"message\":\"In-Network Providers\"},{\"message\":\"Facility Complex Imaging,COINS APPLIES TO OUT OF POCKET\"},{\"message\":\"Xray and Lab by a Primary Care Physician,COINS APPLIES TO OUT OF POCKET\"},{\"message\":\"Xray and Lab by a Specialist,COINS APPLIES TO OUT OF POCKET\"},{\"message\":\"Inpatient Xray and Lab,COINS APPLIES TO OUT OF POCKET\"},{\"message\":\"Outpatient Xray and Lab,COINS APPLIES TO OUT OF POCKET\"}]},{\"service_types\":[\"diagnostic_medical\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"73\"],\"coverage_level\":\"employee_only\",\"benefit_percent\":0.0,\"messages\":[{\"message\":\"In-Network Providers\"},{\"message\":\"Xray and Lab by a Primary Care Physician in Office\"},{\"message\":\"Xray and Lab by a Specialist in Office\"}]},{\"service_types\":[\"professional_physician_visit_office\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"98\"],\"coverage_level\":\"employee_only\",\"benefit_percent\":0.0,\"messages\":[{\"message\":\"In-Network Providers\"},{\"message\":\"GYN Visit when Performed in an Office\"},{\"message\":\"Specialist Visit or Evaluation when Performed in an Office\"},{\"message\":\"Primary Care Visit or Evaluation in Office\"}]},{\"service_types\":[\"professional_physician_visit_office\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"98\"],\"coverage_level\":\"employee_only\",\"benefit_percent\":0.2,\"messages\":[{\"message\":\"In-Network Providers\"},{\"message\":\"GYN Visit,COINS APPLIES TO OUT OF POCKET\"},{\"message\":\"Specialist Visit or Evaluation,COINS APPLIES TO OUT OF POCKET\"},{\"message\":\"Primary Care Visit or Evaluation,COINS APPLIES TO OUT OF POCKET\"}]},{\"service_types\":[\"chiropractic\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"33\"],\"coverage_level\":\"employee_only\",\"benefit_percent\":0.0,\"messages\":[{\"message\":\"In-Network Providers\"},{\"message\":\"Chiropractor Visit or Evaluation\"},{\"message\":\"Lab Performed by Chiropractor\"},{\"message\":\"Xray by Chiropractor\"},{\"message\":\"Manipulation by Chiropractor\"},{\"message\":\"Occupational Therapy by Chiropractor\"},{\"message\":\"Physical Therapy by Chiropractor\"}]},{\"service_types\":[\"hospital_outpatient\",\"diagnostic_medical\"],\"in_plan_network\":\"no\",\"authorization_required\":\"yes\",\"service_type_codes\":[\"50\",\"73\"],\"coverage_level\":\"employee_only\",\"benefit_percent\":0.4,\"messages\":[{\"message\":\"COINS APPLIES TO OUT OF POCKET\"}]},{\"service_types\":[\"professional_physician_visit_office\"],\"in_plan_network\":\"no\",\"authorization_required\":\"yes\",\"service_type_codes\":[\"98\"],\"coverage_level\":\"employee_only\",\"benefit_percent\":0.4,\"messages\":[{\"message\":\"GYN Visit,COINS APPLIES TO OUT OF POCKET\"},{\"message\":\"Specialist Visit or Evaluation,COINS APPLIES TO OUT OF POCKET\"},{\"message\":\"Primary Care Visit or Evaluation,COINS APPLIES TO OUT OF POCKET\"}]},{\"service_types\":[\"chiropractic\"],\"in_plan_network\":\"no\",\"authorization_required\":\"yes\",\"service_type_codes\":[\"33\"],\"coverage_level\":\"employee_only\",\"benefit_percent\":0.4,\"messages\":[{\"message\":\"Chiropractor Visit or Evaluation,COINS APPLIES TO OUT OF POCKET\"},{\"message\":\"Lab Performed by Chiropractor,COINS APPLIES TO OUT OF POCKET\"},{\"message\":\"Xray by Chiropractor,COINS APPLIES TO OUT OF POCKET\"},{\"message\":\"Manipulation by Chiropractor,COINS APPLIES TO OUT OF POCKET\"},{\"message\":\"Occupational Therapy by Chiropractor,COINS APPLIES TO OUT OF POCKET\"},{\"message\":\"Physical Therapy by Chiropractor,COINS APPLIES TO OUT OF POCKET\"}]}],\"non_covered\":[{\"service_types\":[\"medical_care\"],\"service_type_codes\":[\"1\"],\"coverage_level\":\"employee_only\",\"benefit_amount\":{\"amount\":\"0\",\"currency\":\"USD\"}}],\"service_types\":[\"hospital_outpatient\",\"diagnostic_medical\",\"professional_physician_visit_office\",\"chiropractic\"],\"primary_care_provider\":{\"messages\":[{\"message\":\"PCP SELECTION NOT REQUIRED\"}]},\"limitations\":[{\"service_types\":[\"health_benefit_plan_coverage\"],\"service_type_codes\":[\"30\"],\"coverage_level\":\"employee_only\",\"messages\":[{\"message\":\"Unlimited Lifetime Benefits\"}],\"benefit_amount\":{\"amount\":\"0\",\"currency\":\"USD\"}},{\"service_types\":[\"diagnostic_medical\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"73\"],\"coverage_level\":\"employee_only\",\"benefit_amount\":{\"amount\":\"0\",\"currency\":\"USD\"},\"messages\":[{\"message\":\"In-Network Providers\"},{\"message\":\"Xray and Lab by a Primary Care Physician in Office\\/Plan Ded Waived\"},{\"message\":\"Xray and Lab by a Specialist in Office\\/Plan Ded Waived\"}]},{\"service_types\":[\"professional_physician_visit_office\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"98\"],\"coverage_level\":\"employee_only\",\"benefit_amount\":{\"amount\":\"0\",\"currency\":\"USD\"},\"messages\":[{\"message\":\"In-Network Providers\"},{\"message\":\"GYN Visit when Performed in an Office\\/Plan Ded Waived\"},{\"message\":\"Specialist Visit or Evaluation when Performed in an Office\\/Plan Ded Waived\"},{\"message\":\"Primary Care Visit or Evaluation in Office\\/Plan Ded Waived\"}]},{\"service_types\":[\"chiropractic\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"33\"],\"coverage_level\":\"employee_only\",\"benefit_amount\":{\"amount\":\"0\",\"currency\":\"USD\"},\"messages\":[{\"message\":\"In-Network Providers\"},{\"message\":\"Chiropractor Visit or Evaluation\\/Plan Ded Waived\"},{\"message\":\"Lab Performed by Chiropractor\\/Plan Ded Waived\"},{\"message\":\"Xray by Chiropractor\\/Plan Ded Waived\"},{\"message\":\"Manipulation by Chiropractor\\/Plan Ded Waived\"},{\"message\":\"Occupational Therapy by Chiropractor\\/Plan Ded Waived\"},{\"message\":\"Physical Therapy by Chiropractor\\/Plan Ded Waived\"}]},{\"service_types\":[\"chiropractic\"],\"in_plan_network\":\"not_applicable\",\"service_type_codes\":[\"33\"],\"coverage_level\":\"individual\",\"delivery\":[{\"time_period_qualifier\":\"years\",\"quantity_qualifier\":\"visits\",\"period_count\":\"1\",\"quantity\":20}],\"benefit_amount\":{\"amount\":\"0\",\"currency\":\"USD\"},\"messages\":[{\"message\":\"CHIROPRACTOR,Chiropractor Visit or Evaluation,Lab Performed by Chiropractor,Xray by Chiropractor,Manipulation by Chiropractor,Occupational Therapy by Chiropractor,Physical Therapy by Chiropractor\"}]},{\"service_types\":[\"chiropractic\"],\"in_plan_network\":\"not_applicable\",\"service_type_codes\":[\"33\"],\"coverage_level\":\"individual\",\"delivery\":[{\"time_period_qualifier\":\"remaining\",\"quantity_qualifier\":\"visits\",\"quantity\":15}],\"benefit_amount\":{\"amount\":\"0\",\"currency\":\"USD\"},\"messages\":[{\"message\":\"CHIROPRACTOR\"}]},{\"service_types\":[\"hospital_outpatient\"],\"in_plan_network\":\"not_applicable\",\"service_type_codes\":[\"50\"],\"coverage_level\":\"employee_only\",\"benefit_amount\":{\"amount\":\"0\",\"currency\":\"USD\"},\"messages\":[{\"message\":\"Plan Requires PreCert\"}]},{\"service_types\":[\"hospital_outpatient\"],\"service_type_codes\":[\"50\"],\"coverage_level\":\"employee_only\",\"messages\":[{\"message\":\"Self Funded\"}],\"benefit_amount\":{\"amount\":\"0\",\"currency\":\"USD\"}}],\"plan_description\":\"Aetna Choice POS II\",\"service_date\":\"2016-03-22\",\"contacts\":[{\"address\":{\"address_lines\":[\"PO Box 981106\"],\"zipcode\":\"79998\",\"state\":\"TX\",\"city\":\"El Paso\"},\"name\":\"Aetna\",\"contact_type\":\"payer\"}],\"insurance_type\":\"pos\",\"copay\":[{\"service_types\":[\"hospital_outpatient\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"50\"],\"coverage_level\":\"employee_only\",\"messages\":[{\"message\":\"In-Network Providers\"},{\"message\":\"Outpatient Surgery at Hospital\"},{\"message\":\"Outpatient Medical Ancillary\"}],\"copayment\":{\"amount\":\"0\",\"currency\":\"USD\"}},{\"service_types\":[\"diagnostic_medical\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"73\"],\"coverage_level\":\"employee_only\",\"messages\":[{\"message\":\"In-Network Providers\"},{\"message\":\"Xray and Lab by a Primary Care Physician in Office,COPAY INCLUDED IN OOP\"},{\"message\":\"Xray and Lab by a Specialist in Office,COPAY INCLUDED IN OOP\"}],\"copayment\":{\"amount\":\"25\",\"currency\":\"USD\"}},{\"service_types\":[\"professional_physician_visit_office\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"98\"],\"coverage_level\":\"employee_only\",\"messages\":[{\"message\":\"In-Network Providers\"},{\"message\":\"GYN Visit when Performed in an Office,COPAY INCLUDED IN OOP\"},{\"message\":\"Specialist Visit or Evaluation when Performed in an Office,COPAY INCLUDED IN OOP\"},{\"message\":\"Primary Care Visit or Evaluation in Office,COPAY INCLUDED IN OOP\"}],\"copayment\":{\"amount\":\"25\",\"currency\":\"USD\"}},{\"service_types\":[\"chiropractic\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"33\"],\"coverage_level\":\"employee_only\",\"messages\":[{\"message\":\"In-Network Providers\"},{\"message\":\"Chiropractor Visit or Evaluation,COPAY INCLUDED IN OOP\"},{\"message\":\"Lab Performed by Chiropractor,COPAY INCLUDED IN OOP\"},{\"message\":\"Xray by Chiropractor,COPAY INCLUDED IN OOP\"},{\"message\":\"Manipulation by Chiropractor,COPAY INCLUDED IN OOP\"},{\"message\":\"Occupational Therapy by Chiropractor,COPAY INCLUDED IN OOP\"},{\"message\":\"Physical Therapy by Chiropractor,COPAY INCLUDED IN OOP\"}],\"copayment\":{\"amount\":\"25\",\"currency\":\"USD\"}},{\"service_types\":[\"hospital_outpatient\"],\"in_plan_network\":\"not_applicable\",\"authorization_required\":\"yes\",\"service_type_codes\":[\"50\"],\"coverage_level\":\"employee_only\",\"messages\":[{\"message\":\"Outpatient Surgery Facility\"}],\"copayment\":{\"amount\":\"0\",\"currency\":\"USD\"}},{\"service_types\":[\"diagnostic_medical\"],\"in_plan_network\":\"not_applicable\",\"authorization_required\":\"yes\",\"service_type_codes\":[\"73\"],\"coverage_level\":\"employee_only\",\"messages\":[{\"message\":\"Facility Complex Imaging\"},{\"message\":\"Xray and Lab by a Primary Care Physician\"},{\"message\":\"Xray and Lab by a Specialist\"},{\"message\":\"Inpatient Xray and Lab\"},{\"message\":\"Outpatient Xray and Lab\"}],\"copayment\":{\"amount\":\"0\",\"currency\":\"USD\"}},{\"service_types\":[\"professional_physician_visit_office\"],\"in_plan_network\":\"not_applicable\",\"authorization_required\":\"yes\",\"service_type_codes\":[\"98\"],\"coverage_level\":\"employee_only\",\"messages\":[{\"message\":\"GYN Visit\"},{\"message\":\"Specialist Visit or Evaluation\"},{\"message\":\"Primary Care Visit or Evaluation\"}],\"copayment\":{\"amount\":\"0\",\"currency\":\"USD\"}},{\"service_types\":[\"hospital_outpatient\"],\"in_plan_network\":\"no\",\"authorization_required\":\"yes\",\"service_type_codes\":[\"50\"],\"coverage_level\":\"employee_only\",\"messages\":[{\"message\":\"Medical Ancillary\"}],\"copayment\":{\"amount\":\"0\",\"currency\":\"USD\"}},{\"service_types\":[\"chiropractic\"],\"in_plan_network\":\"no\",\"authorization_required\":\"yes\",\"service_type_codes\":[\"33\"],\"coverage_level\":\"employee_only\",\"messages\":[{\"message\":\"Chiropractor Visit or Evaluation\"},{\"message\":\"Lab Performed by Chiropractor\"},{\"message\":\"Xray by Chiropractor\"},{\"message\":\"Manipulation by Chiropractor\"},{\"message\":\"Occupational Therapy by Chiropractor\"},{\"message\":\"Physical Therapy by Chiropractor\"}],\"copayment\":{\"amount\":\"0\",\"currency\":\"USD\"}}],\"plan_begin_date\":\"2010-09-01\",\"level\":\"employee_only\",\"group_number\":\"089597803000100\",\"plan_number\":\"0895978\",\"out_of_pocket\":[{\"service_types\":[\"health_benefit_plan_coverage\"],\"service_type_codes\":[\"30\"],\"in_plan_network\":\"not_applicable\",\"coverage_level\":\"individual\",\"benefit_amount\":{\"amount\":\"3700\",\"currency\":\"USD\"}},{\"time_period\":\"remaining\",\"service_types\":[\"health_benefit_plan_coverage\"],\"in_plan_network\":\"not_applicable\",\"service_type_codes\":[\"30\"],\"coverage_level\":\"individual\",\"benefit_amount\":{\"amount\":\"1689.77\",\"currency\":\"USD\"}}],\"active\":true,\"service_type_codes\":[\"50\",\"73\",\"98\",\"33\"],\"deductibles\":[{\"time_period\":\"contract\",\"service_types\":[\"health_benefit_plan_coverage\"],\"in_plan_network\":\"not_applicable\",\"service_type_codes\":[\"30\"],\"coverage_level\":\"individual\",\"benefit_amount\":{\"amount\":\"300\",\"currency\":\"USD\"},\"messages\":[{\"message\":\"Med Dent,DED INCLUDED IN OOP,Outpatient Surgery at Hospital,Outpatient Surgery Facility,Outpatient Medical Ancillary,Medical Ancillary,Facility Complex Imaging,Xray and Lab by a Primary Care Physician,Xray and Lab by a Specialist,Inpatient Xray and Lab\"},{\"message\":\"Outpatient Xray and Lab,GYN Visit,Specialist Visit or Evaluation,Primary Care Visit or Evaluation,Chiropractor Visit or Evaluation,Lab Performed by Chiropractor,Xray by Chiropractor,Manipulation by Chiropractor,Occupational Therapy by Chiropractor\"},{\"message\":\"Physical Therapy by Chiropractor\"}]},{\"time_period\":\"remaining\",\"service_types\":[\"health_benefit_plan_coverage\"],\"in_plan_network\":\"not_applicable\",\"service_type_codes\":[\"30\"],\"coverage_level\":\"individual\",\"benefit_amount\":{\"amount\":\"0\",\"currency\":\"USD\"}}],\"group_description\":\"TEXAS PUBLIC SCHOOL EMPLOYEE GROUP\",\"eligibility_begin_date\":\"2007-08-01\"},\"trace_number\":\"76d2ba84f05e11e5aa4b0242ac110003\",\"valid_request\":true,\"service_type_codes\":[\"33\",\"98\",\"30\",\"73\",\"50\"],\"client_id\":\"uLM1RVOYEOZ8q3ZGzKK9\",\"trading_partner_id\":\"aetna_better_health_tx\",\"subscriber\":{\"id\":\"W156543615\",\"first_name\":\"DANIEL\",\"birth_date\":\"1955-01-23\",\"address\":{\"address_lines\":[\"415 E 16TH ST\"],\"zipcode\":\"77008\",\"state\":\"TX\",\"city\":\"HOUSTON\"},\"middle_name\":\"J\",\"last_name\":\"IMPASTATO\",\"gender\":\"male\"},\"originating_company_id\":\"POKITEDI00\"},\"meta\":{\"credits_billed\":1,\"activity_id\":\"56f19325a308b6030669fa51\",\"rate_limit_reset\":1458674780,\"rate_limit_amount\":2,\"processing_time\":2318,\"credits_remaining\":-14,\"rate_limit_cap\":5000,\"application_mode\":\"production\"}}";
// "{\"data\":{\"pharmacy\":{\"is_eligible\":true},\"summary\":{\"services\":{\"hospital_emergency_accident\":{\"out_of_pocket\":{\"individual\":{\"in_network\":{\"limit\":{\"amount\":\"0\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"0\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"0.00\",\"currency\":\"USD\"}},\"out_of_network\":{\"limit\":{\"amount\":\"0\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"0\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"0.00\",\"currency\":\"USD\"}}}},\"deductible\":{\"individual\":{\"in_network\":{\"limit\":{\"amount\":\"150\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"150\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"0.00\",\"currency\":\"USD\"}},\"out_of_network\":{\"limit\":{\"amount\":\"150\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"150\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"0.00\",\"currency\":\"USD\"}}}}},\"physician_visit_office_well\":{\"out_of_pocket\":{\"individual\":{\"in_network\":{\"limit\":{\"amount\":\"0\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"0\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"0.00\",\"currency\":\"USD\"}},\"out_of_network\":{\"limit\":{\"amount\":\"0\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"0\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"0.00\",\"currency\":\"USD\"}}}},\"deductible\":{\"individual\":{\"in_network\":{\"limit\":{\"amount\":\"0\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"0\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"0.00\",\"currency\":\"USD\"}},\"out_of_network\":{\"limit\":{\"amount\":\"0\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"0\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"0.00\",\"currency\":\"USD\"}}}}},\"emergency_services\":{\"out_of_pocket\":{\"individual\":{\"in_network\":{\"limit\":{\"amount\":\"0\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"0\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"0.00\",\"currency\":\"USD\"}},\"out_of_network\":{\"limit\":{\"amount\":\"0\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"0\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"0.00\",\"currency\":\"USD\"}}}},\"deductible\":{\"individual\":{\"in_network\":{\"limit\":{\"amount\":\"150\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"150\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"0.00\",\"currency\":\"USD\"}},\"out_of_network\":{\"limit\":{\"amount\":\"150\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"150\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"0.00\",\"currency\":\"USD\"}}}}},\"urgent_care\":{\"out_of_pocket\":{\"individual\":{\"in_network\":{\"limit\":{\"amount\":\"0\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"0\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"0.00\",\"currency\":\"USD\"}},\"out_of_network\":{\"limit\":{\"amount\":\"0\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"0\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"0.00\",\"currency\":\"USD\"}}}},\"deductible\":{\"individual\":{\"in_network\":{\"limit\":{\"amount\":\"0\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"0\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"0.00\",\"currency\":\"USD\"}},\"out_of_network\":{\"limit\":{\"amount\":\"0\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"0\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"0.00\",\"currency\":\"USD\"}}}}},\"hospital_emergency_medical\":{\"out_of_pocket\":{\"individual\":{\"in_network\":{\"limit\":{\"amount\":\"0\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"0\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"0.00\",\"currency\":\"USD\"}},\"out_of_network\":{\"limit\":{\"amount\":\"0\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"0\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"0.00\",\"currency\":\"USD\"}}}},\"deductible\":{\"individual\":{\"in_network\":{\"limit\":{\"amount\":\"150\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"150\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"0.00\",\"currency\":\"USD\"}},\"out_of_network\":{\"limit\":{\"amount\":\"150\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"150\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"0.00\",\"currency\":\"USD\"}}}}},\"professional_physician_visit_office\":{\"out_of_pocket\":{\"individual\":{\"in_network\":{\"limit\":{\"amount\":\"0\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"0\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"0.00\",\"currency\":\"USD\"}},\"out_of_network\":{\"limit\":{\"amount\":\"0\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"0\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"0.00\",\"currency\":\"USD\"}}}},\"deductible\":{\"individual\":{\"in_network\":{\"limit\":{\"amount\":\"0\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"0\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"0.00\",\"currency\":\"USD\"}},\"out_of_network\":{\"limit\":{\"amount\":\"0\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"0\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"0.00\",\"currency\":\"USD\"}}}}}},\"out_of_pocket\":{\"individual\":{\"in_network\":{\"limit\":{\"amount\":\"2000\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"2000\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"0.00\",\"currency\":\"USD\"}},\"out_of_network\":{\"limit\":{\"amount\":\"3000\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"3000\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"0.00\",\"currency\":\"USD\"}}},\"family\":{\"in_network\":{\"limit\":{\"amount\":\"4000\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"3790\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"210.00\",\"currency\":\"USD\"}},\"out_of_network\":{\"limit\":{\"amount\":\"6000\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"6000\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"0.00\",\"currency\":\"USD\"}}}},\"deductible\":{\"individual\":{\"in_network\":{\"limit\":{\"amount\":\"500\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"500\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"0.00\",\"currency\":\"USD\"}},\"out_of_network\":{\"limit\":{\"amount\":\"1000\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"1000\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"0.00\",\"currency\":\"USD\"}}},\"family\":{\"in_network\":{\"limit\":{\"amount\":\"1000\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"790\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"210.00\",\"currency\":\"USD\"}},\"out_of_network\":{\"limit\":{\"amount\":\"2000\",\"currency\":\"USD\"},\"remaining\":{\"amount\":\"2000\",\"currency\":\"USD\"},\"applied\":{\"amount\":\"0.00\",\"currency\":\"USD\"}}}}},\"service_types\":[\"mental_health\",\"chiropractic\",\"medical_care\",\"hospital_inpatient\",\"hospital\",\"urgent_care\",\"pharmacy\",\"hospital_outpatient\",\"professional_physician_visit_office\",\"health_benefit_plan_coverage\",\"hospital_emergency_medical\",\"hospital_emergency_accident\",\"emergency_services\",\"physician_visit_office_well\"],\"provider\":{\"first_name\":\"KENNETH\",\"npi\":\"1669535381\",\"last_name\":\"LESTER\"},\"correlation_id\":\"e68b03c8-c33c-4ac1-b252-329989b4ab8f\",\"payer\":{\"id\":\"47198\",\"phone\":\"8002747767\",\"name\":\"UTILIZATION MANAGEMENT\"},\"coverage\":{\"coinsurance\":[{\"service_types\":[\"physician_visit_office_well\",\"urgent_care\",\"chiropractic\",\"hospital_outpatient\",\"professional_physician_visit_office\"],\"in_plan_network\":\"no\",\"service_type_codes\":[\"BZ\",\"UC\",\"33\",\"50\",\"98\"],\"coverage_level\":\"individual\",\"benefit_percent\":0.3},{\"service_types\":[\"physician_visit_office_well\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"BZ\"],\"coverage_level\":\"individual\",\"benefit_percent\":0.0},{\"service_types\":[\"professional_physician_visit_office\"],\"in_plan_network\":\"no\",\"service_type_codes\":[\"98\"],\"coverage_level\":\"individual\",\"benefit_percent\":0.3,\"messages\":[{\"message\":\"SPECIALIST\"}]},{\"service_types\":[\"urgent_care\",\"hospital\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"UC\",\"47\"],\"coverage_level\":\"individual\",\"benefit_percent\":0.1},{\"service_types\":[\"chiropractic\",\"hospital_outpatient\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"33\",\"50\"],\"coverage_level\":\"individual\",\"benefit_percent\":0.1},{\"service_types\":[\"hospital\"],\"in_plan_network\":\"no\",\"service_type_codes\":[\"47\"],\"coverage_level\":\"individual\",\"benefit_percent\":0.3},{\"service_types\":[\"hospital\"],\"in_plan_network\":\"no\",\"authorization_required\":\"unknown\",\"service_type_codes\":[\"47\"],\"coverage_level\":\"individual\",\"benefit_percent\":0.3},{\"service_types\":[\"hospital\"],\"in_plan_network\":\"yes\",\"authorization_required\":\"unknown\",\"service_type_codes\":[\"47\"],\"coverage_level\":\"individual\",\"benefit_percent\":0.1},{\"service_types\":[\"hospital_inpatient\"],\"in_plan_network\":\"no\",\"authorization_required\":\"unknown\",\"service_type_codes\":[\"48\"],\"coverage_level\":\"individual\",\"benefit_percent\":0.3},{\"service_types\":[\"hospital_inpatient\"],\"in_plan_network\":\"yes\",\"authorization_required\":\"unknown\",\"service_type_codes\":[\"48\"],\"coverage_level\":\"individual\",\"benefit_percent\":0.1},{\"service_types\":[\"hospital_emergency_accident\",\"hospital_emergency_medical\"],\"in_plan_network\":\"not_applicable\",\"service_type_codes\":[\"51\",\"52\"],\"coverage_level\":\"individual\",\"benefit_percent\":0.1},{\"service_types\":[\"emergency_services\"],\"in_plan_network\":\"no\",\"service_type_codes\":[\"86\"],\"coverage_level\":\"individual\",\"benefit_percent\":0.1},{\"service_types\":[\"emergency_services\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"86\"],\"coverage_level\":\"individual\",\"benefit_percent\":0.1,\"messages\":[{\"message\":\"FACILITY BENEFIT\"}]}],\"plan_end_date\":\"2016-12-31\",\"service_types\":[\"professional_physician_visit_office\"],\"limitations\":[{\"service_types\":[\"chiropractic\"],\"service_type_codes\":[\"33\"],\"in_plan_network\":\"not_applicable\",\"benefit_amount\":{\"amount\":\"0\",\"currency\":\"USD\"}},{\"service_types\":[\"chiropractic\"],\"service_type_codes\":[\"33\"],\"in_plan_network\":\"not_applicable\",\"benefit_amount\":{\"amount\":\"0\",\"currency\":\"USD\"}}],\"plan_description\":\"PRUDENT BUYER CLASSIC\",\"insurance_type\":\"ppo\",\"copay\":[{\"service_types\":[\"professional_physician_visit_office\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"98\"],\"coverage_level\":\"individual\",\"messages\":[{\"message\":\"SPECIALIST\"}],\"copayment\":{\"amount\":\"25\",\"currency\":\"USD\"}},{\"service_types\":[\"urgent_care\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"UC\"],\"coverage_level\":\"individual\",\"copayment\":{\"amount\":\"25\",\"currency\":\"USD\"}},{\"service_types\":[\"professional_physician_visit_office\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"98\"],\"coverage_level\":\"individual\",\"messages\":[{\"message\":\"UNLESS OTHERWISE REQUIRED BY STATE LAW, THIS NOTICE IS NOT A GUARANTEE OF PAYMENT. BENEFITS ARE SUBJECT TO ALL CONTRACT LIMITATIONS AND THE MEMBERS ELIGIBILITY STATUS ON THE DATE OF SERVICE. FOR ANY QUESTIONS PLEASE CALL PHONE NUMBER ON BACK OF MEMBERS CARD.\"}],\"copayment\":{\"amount\":\"25\",\"currency\":\"USD\"}}],\"plan_begin_date\":\"2016-01-01\",\"group_number\":\"277652M019\",\"level\":\"family\",\"plan_number\":\"040\",\"out_of_pocket\":[{\"time_period\":\"calendar_year\",\"service_types\":[\"health_benefit_plan_coverage\"],\"in_plan_network\":\"no\",\"service_type_codes\":[\"30\"],\"coverage_level\":\"family\",\"benefit_amount\":{\"amount\":\"6000\",\"currency\":\"USD\"}},{\"time_period\":\"remaining\",\"service_types\":[\"health_benefit_plan_coverage\"],\"in_plan_network\":\"no\",\"service_type_codes\":[\"30\"],\"coverage_level\":\"family\",\"benefit_amount\":{\"amount\":\"6000\",\"currency\":\"USD\"}},{\"time_period\":\"calendar_year\",\"service_types\":[\"health_benefit_plan_coverage\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"30\"],\"coverage_level\":\"family\",\"benefit_amount\":{\"amount\":\"4000\",\"currency\":\"USD\"}},{\"time_period\":\"remaining\",\"service_types\":[\"health_benefit_plan_coverage\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"30\"],\"coverage_level\":\"family\",\"benefit_amount\":{\"amount\":\"3790\",\"currency\":\"USD\"}},{\"time_period\":\"calendar_year\",\"service_types\":[\"health_benefit_plan_coverage\"],\"in_plan_network\":\"no\",\"service_type_codes\":[\"30\"],\"coverage_level\":\"individual\",\"benefit_amount\":{\"amount\":\"3000\",\"currency\":\"USD\"}},{\"time_period\":\"remaining\",\"service_types\":[\"health_benefit_plan_coverage\"],\"in_plan_network\":\"no\",\"service_type_codes\":[\"30\"],\"coverage_level\":\"individual\",\"benefit_amount\":{\"amount\":\"3000\",\"currency\":\"USD\"}},{\"time_period\":\"calendar_year\",\"service_types\":[\"health_benefit_plan_coverage\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"30\"],\"coverage_level\":\"individual\",\"benefit_amount\":{\"amount\":\"2000\",\"currency\":\"USD\"}},{\"time_period\":\"remaining\",\"service_types\":[\"health_benefit_plan_coverage\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"30\"],\"coverage_level\":\"individual\",\"benefit_amount\":{\"amount\":\"2000\",\"currency\":\"USD\"},\"messages\":[{\"message\":\"THIS PATIENT FALLS UNDER THE DEPARTMENT OF MANAGED HEALTH CARE OVERSIGHT\"}]}],\"active\":true,\"service_type_codes\":[\"98\"],\"deductibles\":[{\"time_period\":\"calendar_year\",\"service_types\":[\"physician_visit_office_well\",\"professional_physician_visit_office\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"BZ\",\"98\"],\"coverage_level\":\"individual\",\"benefit_amount\":{\"amount\":\"0\",\"currency\":\"USD\"}},{\"time_period\":\"calendar_year\",\"service_types\":[\"professional_physician_visit_office\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"98\"],\"coverage_level\":\"individual\",\"benefit_amount\":{\"amount\":\"0\",\"currency\":\"USD\"},\"messages\":[{\"message\":\"SPECIALIST\"},{\"message\":\"SPECIALIST\"}]},{\"time_period\":\"calendar_year\",\"service_types\":[\"urgent_care\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"UC\"],\"coverage_level\":\"individual\",\"benefit_amount\":{\"amount\":\"0\",\"currency\":\"USD\"}},{\"time_period\":\"calendar_year\",\"service_types\":[\"health_benefit_plan_coverage\"],\"in_plan_network\":\"no\",\"service_type_codes\":[\"30\"],\"coverage_level\":\"family\",\"benefit_amount\":{\"amount\":\"2000\",\"currency\":\"USD\"}},{\"time_period\":\"remaining\",\"service_types\":[\"health_benefit_plan_coverage\"],\"in_plan_network\":\"no\",\"service_type_codes\":[\"30\"],\"coverage_level\":\"family\",\"benefit_amount\":{\"amount\":\"2000\",\"currency\":\"USD\"}},{\"time_period\":\"calendar_year\",\"service_types\":[\"health_benefit_plan_coverage\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"30\"],\"coverage_level\":\"family\",\"benefit_amount\":{\"amount\":\"1000\",\"currency\":\"USD\"}},{\"time_period\":\"remaining\",\"service_types\":[\"health_benefit_plan_coverage\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"30\"],\"coverage_level\":\"family\",\"benefit_amount\":{\"amount\":\"790\",\"currency\":\"USD\"}},{\"time_period\":\"calendar_year\",\"service_types\":[\"health_benefit_plan_coverage\"],\"in_plan_network\":\"no\",\"service_type_codes\":[\"30\"],\"coverage_level\":\"individual\",\"benefit_amount\":{\"amount\":\"1000\",\"currency\":\"USD\"}},{\"time_period\":\"remaining\",\"service_types\":[\"health_benefit_plan_coverage\"],\"in_plan_network\":\"no\",\"service_type_codes\":[\"30\"],\"coverage_level\":\"individual\",\"benefit_amount\":{\"amount\":\"1000\",\"currency\":\"USD\"}},{\"time_period\":\"calendar_year\",\"service_types\":[\"health_benefit_plan_coverage\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"30\"],\"coverage_level\":\"individual\",\"benefit_amount\":{\"amount\":\"500\",\"currency\":\"USD\"}},{\"time_period\":\"remaining\",\"service_types\":[\"health_benefit_plan_coverage\"],\"in_plan_network\":\"yes\",\"service_type_codes\":[\"30\"],\"coverage_level\":\"individual\",\"benefit_amount\":{\"amount\":\"500\",\"currency\":\"USD\"}},{\"time_period\":\"visit\",\"service_types\":[\"hospital_emergency_accident\",\"hospital_emergency_medical\"],\"in_plan_network\":\"not_applicable\",\"service_type_codes\":[\"51\",\"52\"],\"coverage_level\":\"individual\",\"benefit_amount\":{\"amount\":\"150\",\"currency\":\"USD\"}},{\"time_period\":\"visit\",\"service_types\":[\"emergency_services\"],\"in_plan_network\":\"not_applicable\",\"service_type_codes\":[\"86\"],\"coverage_level\":\"individual\",\"benefit_amount\":{\"amount\":\"150\",\"currency\":\"USD\"},\"messages\":[{\"message\":\"FACILITY BENEFIT\"}]}],\"group_description\":\"APPIRIO INC\"},\"trace_number\":\"FB3B4756F03F11E594770242AC110003\",\"valid_request\":true,\"service_type_codes\":[\"48\",\"33\",\"47\",\"30\",\"51\",\"MH\",\"50\",\"1\",\"98\",\"88\",\"UC\",\"52\",\"86\",\"BZ\"],\"client_id\":\"uLM1RVOYEOZ8q3ZGzKK9\",\"trading_partner_id\":\"anthem_blue_cross_ca\",\"subscriber\":{\"id\":\"AKX913A78136\",\"first_name\":\"RANDY\",\"birth_date\":\"1961-12-19\",\"address\":{\"address_lines\":[\"1232 WOODWARD AVENUE\"],\"zipcode\":\"17745\",\"state\":\"PA\",\"city\":\"LOCK HAVEN\"},\"middle_name\":\"K\",\"last_name\":\"WANDELL\",\"gender\":\"male\"},\"originating_company_id\":\"POKITEDI00\"},\"meta\":{\"credits_billed\":1,\"activity_id\":\"56f16001a308b60309acc8f0\",\"rate_limit_reset\":1458662929,\"rate_limit_amount\":1,\"processing_time\":2163,\"credits_remaining\":-10,\"rate_limit_cap\":5000,\"application_mode\":\"production\"}}";
         
         
/*
StringBuffer s = new StringBuffer();
s.append("{\n" +
"\"data\": {\n" +
"\"pharmacy\": {\n" +
"\"copay\": [\n" +
"{\n" +
"\"supply\": \"90 Day\",\n" +
"\"tier\": \"2\",\n" +
"\"type\": \"mail_order_prescription_drug\",\n" +
"\"notes\": [\n" +
"\"Preferred - Tier 2\",\n" +
"\"Benefit does not apply to member's out-of-pocket maximum\",\n" +
"\"Deductible applies after the copay has been paid\"\n" +
"],\n" +
"\"copayment\": {\n" +
"\"amount\": \"60.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"supply\": \"90 Day\",\n" +
"\"tier\": \"1\",\n" +
"\"type\": \"mail_order_prescription_drug\",\n" +
"\"notes\": [\n" +
"\"Generic - Tier 1\",\n" +
"\"Benefit does not apply to member's out-of-pocket maximum\",\n" +
"\"Deductible applies after the copay has been paid\"\n" +
"],\n" +
"\"copayment\": {\n" +
"\"amount\": \"20.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"supply\": \"90 Day\",\n" +
"\"tier\": \"3\",\n" +
"\"type\": \"mail_order_prescription_drug\",\n" +
"\"notes\": [\n" +
"\"Brand Non Preferred - Tier 3\",\n" +
"\"Benefit does not apply to member's out-of-pocket maximum\",\n" +
"\"Deductible applies after the copay has been paid\"\n" +
"],\n" +
"\"copayment\": {\n" +
"\"amount\": \"100.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"supply\": \"30 Day\",\n" +
"\"tier\": \"3\",\n" +
"\"type\": \"brand_name_prescription_drug\",\n" +
"\"notes\": [\n" +
"\"Brand Non Preferred - Tier 3\",\n" +
"\"Benefit does not apply to member's out-of-pocket maximum\",\n" +
"\"Deductible applies after the copay has been paid\"\n" +
"],\n" +
"\"copayment\": {\n" +
"\"amount\": \"50.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"supply\": \"30 Day\",\n" +
"\"tier\": \"2\",\n" +
"\"type\": \"brand_name_prescription_drug\",\n" +
"\"notes\": [\n" +
"\"Preferred - Tier 2\",\n" +
"\"Benefit does not apply to member's out-of-pocket maximum\",\n" +
"\"Deductible applies after the copay has been paid\"\n" +
"],\n" +
"\"copayment\": {\n" +
"\"amount\": \"30.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"supply\": \"30 Day\",\n" +
"\"type\": \"generic_prescription_drug\",\n" +
"\"notes\": [\n" +
"\"Benefit does not apply to member's out-of-pocket maximum\",\n" +
"\"Deductible applies after the copay has been paid\"\n" +
"],\n" +
"\"copayment\": {\n" +
"\"amount\": \"10.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"}\n" +
"],\n" +
"\"is_eligible\": true\n" +
"},\n" +
"\"service_types\": [\n" +
"\"prosthetic_device\",\n" +
"\"family_planning\",\n" +
"\"immunizations\",\n" +
"\"transplants\",\n" +
"\"routine_physical\",\n" +
"\"audiology_exam\",\n" +
"\"generic_prescription_drug\",\n" +
"\"brand_name_prescription_drug\",\n" +
"\"surgical\",\n" +
"\"neurology\",\n" +
"\"maternity\",\n" +
"\"professional_physician_visit_inpatient\",\n" +
"\"rehabilitation_inpatient\",\n" +
"\"gastrointestinal\",\n" +
"\"emergency_services\",\n" +
"\"anesthesia\",\n" +
"\"hospital_ambulatory_surgical\",\n" +
"\"medical_care\",\n" +
"\"pre_admission_testing\",\n" +
"\"surgical_assistance\",\n" +
"\"eye\",\n" +
"\"mental_health\",\n" +
"\"dialysis\",\n" +
"\"well_baby_care\",\n" +
"\"hospital_inpatient\",\n" +
"\"speech_therapy\",\n" +
"\"anesthesiologist\",\n" +
"\"smoking_cessation\",\n" +
"\"urgent_care\",\n" +
"\"pharmacy\",\n" +
"\"cognitive_therapy\",\n" +
"\"mail_order_prescription_drug\",\n" +
"\"allergy_testing\",\n" +
"\"diagnostic_lab\",\n" +
"\"professional_physician_visit_nursing_home\",\n" +
"\"other_medical\",\n" +
"\"consultation\",\n" +
"\"pneumonia_vaccine\",\n" +
"\"professional_physician\",\n" +
"\"dental_care\",\n" +
"\"medical_equipment_purchase\",\n" +
"\"health_benefit_plan_coverage\",\n" +
"\"chiropractic\",\n" +
"\"diagnostic_medical\",\n" +
"\"mri_cat_scan\",\n" +
"\"orthopedic\",\n" +
"\"professional_physician_visit_office\",\n" +
"\"diagnostic_x_ray\",\n" +
"\"chemotherapy\",\n" +
"\"cardiac\",\n" +
"\"ambulatory_service_facility\",\n" +
"\"medically_related_transportation\",\n" +
"\"cardiac_rehabilitation\",\n" +
"\"physical_medicine\",\n" +
"\"hospital_outpatient\",\n" +
"\"pulmonary_rehabilitation\",\n" +
"\"professional_physician_visit_outpatient\",\n" +
"\"abortion\",\n" +
"\"medical_equipment_rental\",\n" +
"\"professional_physician_visit_home\",\n" +
"\"radiation_therapy\",\n" +
"\"private_duty_nursing\",\n" +
"\"occupational_therapy\",\n" +
"\"pediatric\",\n" +
"\"rehabilitation\",\n" +
"\"hospital_emergency_medical\",\n" +
"\"hospital_emergency_accident\",\n" +
"\"hospital\",\n" +
"\"skilled_nursing_care\"\n" +
"],\n" +
"\"provider\": {\n" +
"\"first_name\": \"Misty\",\n" +
"\"npi\": \"1558377242\",\n" +
"\"last_name\": \"Hook\"\n" +
"},\n" +
"\"correlation_id\": \"80be8181-b774-41a0-a74f-55fcdf695f54\",\n" +
"\"payer\": {\n" +
"\"id\": \"06-0303370\",\n" +
"\"name\": \"CGLIC\"\n" +
"},\n" +
"\"coverage\": {\n" +
"\"coinsurance\": [\n" +
"{\n" +
"\"service_types\": [\n" +
"\"health_benefit_plan_coverage\"\n" +
"],\n" +
"\"in_plan_network\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"30\"\n" +
"],\n" +
"\"coverage_level\": \"family\",\n" +
"\"benefit_percent\": 0.4,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"This benefit does apply to member's out-of-pocket maximum\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"health_benefit_plan_coverage\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"30\"\n" +
"],\n" +
"\"coverage_level\": \"family\",\n" +
"\"benefit_percent\": 0.2,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"This benefit does apply to member's out-of-pocket maximum\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"health_benefit_plan_coverage\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"30\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0.2,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"This benefit does apply to member's out-of-pocket maximum\"\n" +
"}\n");
s.append("]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"health_benefit_plan_coverage\"\n" +
"],\n" +
"\"in_plan_network\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"30\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0.4,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"This benefit does apply to member's out-of-pocket maximum\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"routine_physical\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"81\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Specialist Hearing Screening\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Specialist\"\n" +
"},\n" +
"{\n" +
"\"message\": \"PCP Hearing Screening\"\n" +
"},\n" +
"{\n" +
"\"message\": \"PCP\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"immunizations\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"80\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Non-Preventive Immunizaiton - Specialist\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Non-Preventive Immunizaiton - PCP\"\n" +
"},\n" +
"{\n" +
"\"message\": \"PPACA Preventive Immunizations - PCP\"\n" +
"},\n" +
"{\n" +
"\"message\": \"PPACA Preventive Immunizations - Specialist\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Immunizations\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"immunizations\"\n" +
"],\n" +
"\"in_plan_network\": \"not_applicable\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"80\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"H1N1 A Vaccine Administration\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"emergency_services\"\n" +
"],\n" +
"\"in_plan_network\": \"not_applicable\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"86\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"family_planning\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"82\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Contraceptive Management Specialist\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Including Womens Specialist\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Hormone Patch - PCP\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Gynecological\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Contraceptive Management PCP\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Vasectomy\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Hormone Patch - Specialist\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Including Womens PCP\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Obstetrical\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Contraceptive injection Specialist\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"family_planning\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"82\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Contraceptive injection PCP\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Insertion Of IUD\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"family_planning\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"82\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Tubal Ligation\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"family_planning\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"82\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Insertion Of IUD - SPC\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Insertion Of IUD - PCP\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"cardiac_rehabilitation\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"BG\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Cardiac Specialist\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Therapist\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"cardiac_rehabilitation\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"BG\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Cardiac Rehabilitation\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"diagnostic_x_ray\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"4\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"X-Ray\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Specialist\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Chiropractic\"\n" +
"},\n" +
"{\n" +
"\"message\": \"PCP\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"diagnostic_x_ray\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"4\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"X-Ray\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Mammogram\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"diagnostic_x_ray\",\n" +
"\"diagnostic_lab\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"4\",\n" +
"\"5\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"gastrointestinal\",\n" +
"\"neurology\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"BN\",\n" +
"\"BQ\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Lab\"\n" +
"},\n" +
"{\n" +
"\"message\": \"X-Ray\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"gastrointestinal\",\n" +
"\"neurology\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"BN\",\n" +
"\"BQ\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Lab\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"gastrointestinal\",\n" +
"\"neurology\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"BN\",\n" +
"\"BQ\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Specialist Lab\"\n" +
"},\n" +
"{\n" +
"\"message\": \"PCP Lab\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Specialist X-Ray\"\n" +
"},\n" +
"{\n" +
"\"message\": \"PCP X-Ray\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"chemotherapy\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"78\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"well_baby_care\",\n" +
"\"pneumonia_vaccine\",\n" +
"\"audiology_exam\",\n" +
"\"cognitive_therapy\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"68\",\n" +
"\"19\",\n" +
"\"71\",\n" +
"\"BD\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"consultation\",\n" +
"\"surgical\",\n" +
"\"chiropractic\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"3\",\n" +
"\"2\",\n" +
"\"33\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Specialist\"\n" +
"},\n" +
"{\n" +
"\"message\": \"PCP\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"eye\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"BR\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Glaucoma Screening\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"diagnostic_medical\"\n" +
"],\n" +
"\"in_plan_network\": \"not_applicable\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"73\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"PET\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"diagnostic_medical\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"73\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Sleep Studies\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"diagnostic_medical\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"73\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"EKG\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"diagnostic_medical\"\n" +
"],\n" +
"\"in_plan_network\": \"not_applicable\",\n" +
"\"authorization_required\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"73\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"PET\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"diagnostic_medical\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"73\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"PCP\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Specialist\"\n" +
"},\n" +
"{\n" +
"\"message\": \"PET\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"transplants\"\n" +
"],\n" +
"\"in_plan_network\": \"not_applicable\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"70\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Lifesource Travel\\/Transportation\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"transplants\"\n" +
"],\n" +
"\"in_plan_network\": \"not_applicable\",\n" +
"\"authorization_required\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"70\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Lifesource Hospital\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Lifesource Surgical\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Lifesource Private Room\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"pediatric\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"BH\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Lab\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Immunizations\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Exam\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Hearing Screening\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"mri_cat_scan\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"62\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"CAT - Preventive Colonoscopy\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"mri_cat_scan\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"62\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"CAT - PCP Preventive Colonoscopy\"\n" +
"},\n" +
"{\n" +
"\"message\": \"CAT - Specialist Preventive Colonoscopy\"\n" +
"},\n" +
"{\n" +
"\"message\": \"CAT\"\n" +
"},\n" +
"{\n" +
"\"message\": \"MRI\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"mri_cat_scan\"\n" +
"],\n" +
"\"in_plan_network\": \"not_applicable\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"62\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"CAT\"\n" +
"},\n" +
"{\n" +
"\"message\": \"MRI\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"mri_cat_scan\"\n" +
"],\n" +
"\"in_plan_network\": \"not_applicable\",\n" +
"\"authorization_required\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"62\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"CAT\"\n" +
"},\n" +
"{\n" +
"\"message\": \"MRI\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"prosthetic_device\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"75\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0.2,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Including Wigs\"\n" +
"},\n" +
"{\n" +
"\"message\": \"This benefit does apply to member's out-of-pocket maximum\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Including Mastectomy Bras\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"prosthetic_device\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"75\"\n" +
"],\n" +
"\"coverage_level\": \"family\",\n" +
"\"benefit_percent\": 0.2,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Including Wigs\"\n" +
"},\n" +
"{\n" +
"\"message\": \"This benefit does apply to member's out-of-pocket maximum\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Including Mastectomy Bras\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"prosthetic_device\"\n" +
"],\n" +
"\"in_plan_network\": \"no\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"75\"\n" +
"],\n" +
"\"coverage_level\": \"family\",\n" +
"\"benefit_percent\": 0.4,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Including Wigs\"\n" +
"},\n" +
"{\n" +
"\"message\": \"This benefit does apply to member's out-of-pocket maximum\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Including Mastectomy Bras\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"prosthetic_device\"\n" +
"],\n" +
"\"in_plan_network\": \"no\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"75\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0.4,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Including Wigs\"\n" +
"},\n" +
"{\n" +
"\"message\": \"This benefit does apply to member's out-of-pocket maximum\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Including Mastectomy Bras\"\n" +
"}\n");
s.append("]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"medical_equipment_rental\",\n" +
"\"medical_equipment_purchase\",\n" +
"\"maternity\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"18\",\n" +
"\"12\",\n" +
"\"69\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Breast-Feeding Equipment and Supplies\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"diagnostic_lab\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"5\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Gynecological\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Obstetrical\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Specialist\"\n" +
"},\n" +
"{\n" +
"\"message\": \"PCP\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"diagnostic_lab\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"5\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"maternity\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"69\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Midwife\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"maternity\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"69\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Pre And Post Natal\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"pulmonary_rehabilitation\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"BF\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Pulmonary Rehabilitation\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"smoking_cessation\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"67\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Counseling\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"other_medical\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"9\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Medical Specialty Drugs PCP\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Medical Specialty Drugs Specialist\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"urgent_care\"\n" +
"],\n" +
"\"in_plan_network\": \"not_applicable\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"UC\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Illness\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Injury\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"professional_physician_visit_office\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"98\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Specialist\"\n" +
"},\n" +
"{\n" +
"\"message\": \"PCP\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"speech_therapy\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"AF\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Speech Therapy\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"medically_related_transportation\"\n" +
"],\n" +
"\"in_plan_network\": \"no\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"56\"\n" +
"],\n" +
"\"coverage_level\": \"family\",\n" +
"\"benefit_percent\": 0.2,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"This benefit does apply to member's out-of-pocket maximum\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"medically_related_transportation\"\n" +
"],\n" +
"\"in_plan_network\": \"no\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"56\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0.2,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"This benefit does apply to member's out-of-pocket maximum\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"allergy_testing\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"79\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Specialist\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Allergy\"\n" +
"},\n" +
"{\n" +
"\"message\": \"PCP\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"physical_medicine\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"AE\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Physical Therapy\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"occupational_therapy\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"AD\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_percent\": 0,\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Occupational Therapy\"\n" +
"}\n" +
"]\n" +
"}\n" +
"],\n" +
"\"service_types\": [\n" +
"\"dental_care\"\n" +
"],\n" +
"\"limitations\": [\n" +
"{\n" +
"\"service_types\": [\n" +
"\"cardiac_rehabilitation\"\n" +
"],\n" +
"\"in_plan_network\": \"not_applicable\",\n" +
"\"service_type_codes\": [\n" +
"\"BG\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Cardiac Specialist\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Combined Occupational Therapy and Physical Medicine and Speech Therapy and Cognitive Therapy and Pulmonary Rehabilitation and Cardiac Rehabilitation\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Therapist\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"cardiac_rehabilitation\"\n" +
"],\n" +
"\"in_plan_network\": \"not_applicable\",\n" +
"\"service_type_codes\": [\n" +
"\"BG\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Cardiac Rehabilitation\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Combined Occupational Therapy and Physical Medicine and Speech Therapy and Cognitive Therapy and Pulmonary Rehabilitation and Cardiac Rehabilitation\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"transplants\"\n" +
"],\n" +
"\"in_plan_network\": \"not_applicable\",\n" +
"\"service_type_codes\": [\n" +
"\"70\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"10000.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Lifesource Travel\\/Transportation\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Per Cause\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"transplants\"\n" +
"],\n" +
"\"in_plan_network\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"70\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"130000.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Semi Private Room- Stem Cell\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Private Room - Stem Cell\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Surgery - Stem Cell\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"prosthetic_device\"\n" +
"],\n" +
"\"in_plan_network\": \"not_applicable\",\n" +
"\"service_type_codes\": [\n" +
"\"75\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"delivery\": [\n" +
"{\n" +
"\"time_period_qualifier\": \"month\",\n" +
"\"period_count\": \"36\"\n" +
"}\n" +
"],\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Including Hearing Aid\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"mail_order_prescription_drug\"\n" +
"],\n" +
"\"service_type_codes\": [\n" +
"\"90\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"brand_name_prescription_drug\",\n" +
"\"generic_prescription_drug\"\n" +
"],\n" +
"\"service_type_codes\": [\n" +
"\"91\",\n" +
"\"92\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"audiology_exam\"\n" +
"],\n" +
"\"in_plan_network\": \"not_applicable\",\n" +
"\"service_type_codes\": [\n" +
"\"71\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"delivery\": [\n" +
"{\n" +
"\"time_period_qualifier\": \"month\",\n" +
"\"period_count\": \"36\"\n" +
"}\n" +
"],\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Hearing Aid\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"chiropractic\"\n" +
"],\n" +
"\"in_plan_network\": \"not_applicable\",\n" +
"\"service_type_codes\": [\n" +
"\"33\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Specialist\"\n" +
"},\n" +
"{\n" +
"\"message\": \"PCP\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"rehabilitation\"\n" +
"],\n" +
"\"in_plan_network\": \"not_applicable\",\n" +
"\"service_type_codes\": [\n" +
"\"A9\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Private Room\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Semi Private Room\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"private_duty_nursing\"\n" +
"],\n" +
"\"service_type_codes\": [\n" +
"\"74\"\n" +
"],\n" +
"\"in_plan_network\": \"not_applicable\",\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"pulmonary_rehabilitation\"\n" +
"],\n" +
"\"in_plan_network\": \"not_applicable\",\n" +
"\"service_type_codes\": [\n" +
"\"BF\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Pulmonary Rehabilitation\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Combined Occupational Therapy and Physical Medicine and Speech Therapy and Cognitive Therapy and Pulmonary Rehabilitation and Cardiac Rehabilitation\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"cognitive_therapy\"\n" +
"],\n" +
"\"in_plan_network\": \"not_applicable\",\n" +
"\"service_type_codes\": [\n" +
"\"BD\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Combined Occupational Therapy and Physical Medicine and Speech Therapy and Cognitive Therapy and Pulmonary Rehabilitation and Cardiac Rehabilitation\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"speech_therapy\"\n" +
"],\n" +
"\"in_plan_network\": \"not_applicable\",\n" +
"\"service_type_codes\": [\n" +
"\"AF\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Speech Therapy\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Combined Occupational Therapy and Physical Medicine and Speech Therapy and Cognitive Therapy and Pulmonary Rehabilitation and Cardiac Rehabilitation\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"physical_medicine\"\n" +
"],\n" +
"\"in_plan_network\": \"not_applicable\",\n" +
"\"service_type_codes\": [\n" +
"\"AE\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Physical Therapy\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Combined Occupational Therapy and Physical Medicine and Speech Therapy and Cognitive Therapy and Pulmonary Rehabilitation and Cardiac Rehabilitation\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"occupational_therapy\"\n" +
"],\n" +
"\"in_plan_network\": \"not_applicable\",\n" +
"\"service_type_codes\": [\n" +
"\"AD\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Occupational Therapy\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Combined Occupational Therapy and Physical Medicine and Speech Therapy and Cognitive Therapy and Pulmonary Rehabilitation and Cardiac Rehabilitation\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"cardiac_rehabilitation\"\n" +
"],\n" +
"\"in_plan_network\": \"not_applicable\",\n" +
"\"service_type_codes\": [\n" +
"\"BG\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Cardiac Specialist\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Combined Occupational Therapy and Physical Medicine and Speech Therapy and Cognitive Therapy and Pulmonary Rehabilitation and Cardiac Rehabilitation\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Therapist\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"cardiac_rehabilitation\"\n" +
"],\n" +
"\"in_plan_network\": \"not_applicable\",\n" +
"\"service_type_codes\": [\n" +
"\"BG\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Cardiac Rehabilitation\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Combined Occupational Therapy and Physical Medicine and Speech Therapy and Cognitive Therapy and Pulmonary Rehabilitation and Cardiac Rehabilitation\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"transplants\"\n" +
"],\n" +
"\"in_plan_network\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"70\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"130000.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Semi Private Room- Stem Cell\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Private Room - Stem Cell\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Surgery - Stem Cell\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"prosthetic_device\"\n" +
"],\n" +
"\"in_plan_network\": \"not_applicable\",\n" +
"\"service_type_codes\": [\n" +
"\"75\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"delivery\": [\n" +
"{\n" +
"\"time_period_qualifier\": \"month\",\n" +
"\"period_count\": \"36\"\n" +
"}\n" +
"],\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Including Hearing Aid\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"audiology_exam\"\n" +
"],\n" +
"\"in_plan_network\": \"not_applicable\",\n" +
"\"service_type_codes\": [\n" +
"\"71\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"delivery\": [\n" +
"{\n" +
"\"time_period_qualifier\": \"month\",\n" +
"\"period_count\": \"36\"\n" +
"}\n" +
"],\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Hearing Aid\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"chiropractic\"\n" +
"],\n" +
"\"in_plan_network\": \"not_applicable\",\n" +
"\"service_type_codes\": [\n" +
"\"33\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Specialist\"\n" +
"},\n" +
"{\n" +
"\"message\": \"PCP\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"rehabilitation\"\n" +
"],\n" +
"\"in_plan_network\": \"not_applicable\",\n" +
"\"service_type_codes\": [\n" +
"\"A9\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Private Room\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Semi Private Room\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"private_duty_nursing\"\n" +
"],\n" +
"\"service_type_codes\": [\n" +
"\"74\"\n" +
"],\n" +
"\"in_plan_network\": \"not_applicable\",\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"pulmonary_rehabilitation\"\n" +
"],\n" +
"\"in_plan_network\": \"not_applicable\",\n" +
"\"service_type_codes\": [\n" +
"\"BF\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Pulmonary Rehabilitation\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Combined Occupational Therapy and Physical Medicine and Speech Therapy and Cognitive Therapy and Pulmonary Rehabilitation and Cardiac Rehabilitation\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"cognitive_therapy\"\n" +
"],\n" +
"\"in_plan_network\": \"not_applicable\",\n" +
"\"service_type_codes\": [\n" +
"\"BD\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Combined Occupational Therapy and Physical Medicine and Speech Therapy and Cognitive Therapy and Pulmonary Rehabilitation and Cardiac Rehabilitation\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"speech_therapy\"\n" +
"],\n" +
"\"in_plan_network\": \"not_applicable\",\n" +
"\"service_type_codes\": [\n" +
"\"AF\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Speech Therapy\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Combined Occupational Therapy and Physical Medicine and Speech Therapy and Cognitive Therapy and Pulmonary Rehabilitation and Cardiac Rehabilitation\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"physical_medicine\"\n" +
"],\n" +
"\"in_plan_network\": \"not_applicable\",\n" +
"\"service_type_codes\": [\n" +
"\"AE\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Physical Therapy\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Combined Occupational Therapy and Physical Medicine and Speech Therapy and Cognitive Therapy and Pulmonary Rehabilitation and Cardiac Rehabilitation\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"occupational_therapy\"\n" +
"],\n" +
"\"in_plan_network\": \"not_applicable\",\n" +
"\"service_type_codes\": [\n" +
"\"AD\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Occupational Therapy\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Combined Occupational Therapy and Physical Medicine and Speech Therapy and Cognitive Therapy and Pulmonary Rehabilitation and Cardiac Rehabilitation\"\n" +
"}\n" +
"]\n" +
"}\n" +
"],\n" +
"\"plan_description\": \"Open Access Plus\",\n" +
"\"insurance_type\": \"ppo\",\n" +
"\"copay\": [\n" +
"{\n" +
"\"service_types\": [\n" +
"\"routine_physical\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"81\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Specialist Hearing Screening\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"},\n" +
"{\n" +
"\"message\": \"PCP Hearing Screening\"\n" +
"}\n" +
"],\n" +
"\"copayment\": {\n" +
"\"amount\": \"35.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"immunizations\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"80\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Non-Preventive Immunizaiton - Specialist\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"}\n" +
"],\n" +
"\"copayment\": {\n" +
"\"amount\": \"35.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"immunizations\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"80\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Non-Preventive Immunizaiton - PCP\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"}\n" +
"],\n" +
"\"copayment\": {\n" +
"\"amount\": \"25.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"emergency_services\"\n" +
"],\n" +
"\"in_plan_network\": \"not_applicable\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"86\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Deductible applies after the copay has been paid\"\n" +
"}\n" +
"],\n" +
"\"copayment\": {\n" +
"\"amount\": \"200.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"family_planning\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"82\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Gynecological\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Obstetrical\"\n" +
"}\n" +
"],\n" +
"\"copayment\": {\n" +
"\"amount\": \"25.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"family_planning\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"82\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Vasectomy\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"}\n" +
"],\n" +
"\"copayment\": {\n" +
"\"amount\": \"35.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"cardiac_rehabilitation\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"BG\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Cardiac Specialist\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Therapist\"\n" +
"}\n" +
"],\n" +
"\"copayment\": {\n" +
"\"amount\": \"35.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"cardiac_rehabilitation\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"BG\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Cardiac Rehabilitation\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"}\n" +
"],\n" +
"\"copayment\": {\n" +
"\"amount\": \"35.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"diagnostic_x_ray\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"4\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Chiropractic\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"}\n" +
"],\n" +
"\"copayment\": {\n" +
"\"amount\": \"35.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"chemotherapy\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"78\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"}\n" +
"],\n" +
"\"copayment\": {\n" +
"\"amount\": \"35.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"well_baby_care\",\n" +
"\"pediatric\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"68\",\n" +
"\"BH\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Hearing Screening\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"}\n" +
"],\n" +
"\"copayment\": {\n" +
"\"amount\": \"35.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"consultation\",\n" +
"\"surgical\",\n" +
"\"chiropractic\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"3\",\n" +
"\"2\",\n" +
"\"33\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Specialist\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"}\n" +
"],\n" +
"\"copayment\": {\n" +
"\"amount\": \"35.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"consultation\",\n" +
"\"surgical\",\n" +
"\"chiropractic\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"3\",\n" +
"\"2\",\n" +
"\"33\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"PCP\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"}\n" +
"],\n" +
"\"copayment\": {\n" +
"\"amount\": \"25.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"eye\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"BR\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Glaucoma Screening\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"}\n" +
"],\n" +
"\"copayment\": {\n" +
"\"amount\": \"35.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"mail_order_prescription_drug\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"90\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"delivery\": [\n" +
"{\n" +
"\"time_period_qualifier\": \"day\",\n" +
"\"period_count\": \"90\"\n" +
"}\n" +
"],\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Preferred - Tier 2\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Benefit does not apply to member's out-of-pocket maximum\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Deductible applies after the copay has been paid\"\n" +
"}\n" +
"],\n" +
"\"copayment\": {\n" +
"\"amount\": \"60.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"mail_order_prescription_drug\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"90\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"delivery\": [\n" +
"{\n" +
"\"time_period_qualifier\": \"day\",\n" +
"\"period_count\": \"90\"\n" +
"}\n" +
"],\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Generic - Tier 1\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Benefit does not apply to member's out-of-pocket maximum\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Deductible applies after the copay has been paid\"\n" +
"}\n" +
"],\n" +
"\"copayment\": {\n" +
"\"amount\": \"20.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"mail_order_prescription_drug\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"90\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"delivery\": [\n" +
"{\n" +
"\"time_period_qualifier\": \"day\",\n" +
"\"period_count\": \"90\"\n" +
"}\n" +
"],\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Brand Non Preferred - Tier 3\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Benefit does not apply to member's out-of-pocket maximum\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Deductible applies after the copay has been paid\"\n" +
"}\n" +
"],\n" +
"\"copayment\": {\n" +
"\"amount\": \"100.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"brand_name_prescription_drug\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"91\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"delivery\": [\n" +
"{\n" +
"\"time_period_qualifier\": \"day\",\n" +
"\"period_count\": \"30\"\n" +
"}\n" +
"],\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Brand Non Preferred - Tier 3\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Benefit does not apply to member's out-of-pocket maximum\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Deductible applies after the copay has been paid\"\n" +
"}\n" +
"],\n" +
"\"copayment\": {\n" +
"\"amount\": \"50.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"brand_name_prescription_drug\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"91\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"delivery\": [\n" +
"{\n" +
"\"time_period_qualifier\": \"day\",\n" +
"\"period_count\": \"30\"\n" +
"}\n" +
"],\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Preferred - Tier 2\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Benefit does not apply to member's out-of-pocket maximum\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Deductible applies after the copay has been paid\"\n" +
"}\n" +
"],\n" +
"\"copayment\": {\n" +
"\"amount\": \"30.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"generic_prescription_drug\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"92\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"delivery\": [\n" +
"{\n" +
"\"time_period_qualifier\": \"day\",\n" +
"\"period_count\": \"30\"\n" +
"}\n" +
"],\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Benefit does not apply to member's out-of-pocket maximum\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Deductible applies after the copay has been paid\"\n" +
"}\n" +
"],\n" +
"\"copayment\": {\n" +
"\"amount\": \"10.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"audiology_exam\",\n" +
"\"cognitive_therapy\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"71\",\n" +
"\"BD\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"}\n" +
"],\n" +
"\"copayment\": {\n" +
"\"amount\": \"35.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"maternity\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"69\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Midwife\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"}\n" +
"],\n" +
"\"copayment\": {\n" +
"\"amount\": \"35.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"maternity\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"69\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Pre And Post Natal\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"}\n" +
"],\n" +
"\"copayment\": {\n" +
"\"amount\": \"25.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"pulmonary_rehabilitation\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"BF\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Pulmonary Rehabilitation\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"}\n" +
"],\n" +
"\"copayment\": {\n" +
"\"amount\": \"35.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"other_medical\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"9\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Medical Specialty Drugs PCP\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"}\n" +
"],\n" +
"\"copayment\": {\n" +
"\"amount\": \"25.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"other_medical\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"9\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Medical Specialty Drugs Specialist\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"}\n" +
"],\n" +
"\"copayment\": {\n" +
"\"amount\": \"35.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"urgent_care\"\n" +
"],\n" +
"\"in_plan_network\": \"not_applicable\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"UC\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Illness\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Injury\"\n" +
"}\n" +
"],\n" +
"\"copayment\": {\n" +
"\"amount\": \"50.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"professional_physician_visit_office\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"98\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Specialist\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"}\n" +
"],\n" +
"\"copayment\": {\n" +
"\"amount\": \"35.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"professional_physician_visit_office\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"98\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"PCP\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"}\n" +
"],\n" +
"\"copayment\": {\n" +
"\"amount\": \"25.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"speech_therapy\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"AF\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Speech Therapy\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"}\n" +
"],\n" +
"\"copayment\": {\n" +
"\"amount\": \"35.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"allergy_testing\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"79\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Allergy\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"}\n" +
"],\n" +
"\"copayment\": {\n" +
"\"amount\": \"25.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"allergy_testing\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"79\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Allergy\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"}\n" +
"],\n" +
"\"copayment\": {\n" +
"\"amount\": \"35.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"physical_medicine\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"AE\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Physical Therapy\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"}\n" +
"],\n" +
"\"copayment\": {\n" +
"\"amount\": \"35.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"service_types\": [\n" +
"\"occupational_therapy\"\n" +
"],\n");
s.append("\"in_plan_network\": \"yes\",\n" +
"\"authorization_required\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"AD\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Occupational Therapy\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"}\n" +
"],\n" +
"\"copayment\": {\n" +
"\"amount\": \"35.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"}\n" +
"],\n" +
"\"plan_begin_date\": \"2016-01-01\",\n" +
"\"group_number\": \"3338495\",\n" +
"\"out_of_pocket\": [\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"health_benefit_plan_coverage\"\n" +
"],\n" +
"\"in_plan_network\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"30\"\n" +
"],\n" +
"\"coverage_level\": \"family\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"24000.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Out of network amounts apply to in-network\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Accumulators are shared between Medical AND Mental Health\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"health_benefit_plan_coverage\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"30\"\n" +
"],\n" +
"\"coverage_level\": \"family\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"12000.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Out of network amounts apply to in-network\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Accumulators are shared between Medical AND Mental Health\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"health_benefit_plan_coverage\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"30\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"4000.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Out of network amounts apply to in-network\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Accumulators are shared between Medical AND Mental Health\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"health_benefit_plan_coverage\"\n" +
"],\n" +
"\"in_plan_network\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"30\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"8000.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Out of network amounts apply to in-network\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Accumulators are shared between Medical AND Mental Health\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"remaining\",\n" +
"\"service_types\": [\n" +
"\"health_benefit_plan_coverage\"\n" +
"],\n" +
"\"in_plan_network\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"30\"\n" +
"],\n" +
"\"coverage_level\": \"family\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"24000.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Out of network amounts apply to in-network\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Accumulators are shared between Medical AND Mental Health\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"remaining\",\n" +
"\"service_types\": [\n" +
"\"health_benefit_plan_coverage\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"30\"\n" +
"],\n" +
"\"coverage_level\": \"family\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"11885.18\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Out of network amounts apply to in-network\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Accumulators are shared between Medical AND Mental Health\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"remaining\",\n" +
"\"service_types\": [\n" +
"\"health_benefit_plan_coverage\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"30\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"3885.18\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Out of network amounts apply to in-network\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Accumulators are shared between Medical AND Mental Health\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"remaining\",\n" +
"\"service_types\": [\n" +
"\"health_benefit_plan_coverage\"\n" +
"],\n" +
"\"in_plan_network\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"30\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"8000.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Out of network amounts apply to in-network\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Accumulators are shared between Medical AND Mental Health\"\n" +
"}\n" +
"]\n" +
"}\n" +
"],\n" +
"\"service_type_codes\": [\n" +
"\"35\"\n" +
"],\n" +
"\"deductibles\": [\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"health_benefit_plan_coverage\"\n" +
"],\n" +
"\"in_plan_network\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"30\"\n" +
"],\n" +
"\"coverage_level\": \"family\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"6000.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Out of network amounts apply to in-network\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Accumulators are shared between Medical AND Mental Health\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"health_benefit_plan_coverage\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"30\"\n" +
"],\n" +
"\"coverage_level\": \"family\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"3000.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Out of network amounts apply to in-network\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Accumulators are shared between Medical AND Mental Health\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"health_benefit_plan_coverage\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"30\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"1000.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Out of network amounts apply to in-network\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Accumulators are shared between Medical AND Mental Health\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"health_benefit_plan_coverage\"\n" +
"],\n" +
"\"in_plan_network\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"30\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"2000.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Out of network amounts apply to in-network\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Accumulators are shared between Medical AND Mental Health\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"routine_physical\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"81\"\n" +
"],\n" +
"\"coverage_level\": \"family\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"PCP Hearing Screening\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Specialist Hearing Screening\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"routine_physical\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"81\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Specialist\"\n" +
"},\n" +
"{\n" +
"\"message\": \"PCP\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"immunizations\"\n" +
"],\n" +
"\"in_plan_network\": \"not_applicable\",\n" +
"\"service_type_codes\": [\n" +
"\"80\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"H1N1 A Vaccine Administration\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"immunizations\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"80\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"PPACA Preventive Immunizations - PCP\"\n" +
"},\n" +
"{\n" +
"\"message\": \"PPACA Preventive Immunizations - Specialist\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Immunizations\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"immunizations\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"80\"\n" +
"],\n" +
"\"coverage_level\": \"family\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Non-Preventive Immunizaiton - Specialist\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Non-Preventive Immunizaiton - PCP\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"emergency_services\"\n" +
"],\n" +
"\"in_plan_network\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"86\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"1000.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Combined with In Network Plan Level\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"emergency_services\"\n" +
"],\n" +
"\"in_plan_network\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"86\"\n" +
"],\n" +
"\"coverage_level\": \"family\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"3000.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Combined with In Network Plan Level\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"family_planning\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"82\"\n" +
"],\n" +
"\"coverage_level\": \"family\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Gynecological\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Obstetrical\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Vasectomy\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"family_planning\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"82\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Contraceptive Management Specialist\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Including Womens Specialist\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Hormone Patch - PCP\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Contraceptive Management PCP\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Gynecological\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Hormone Patch - Specialist\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Including Womens PCP\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Contraceptive injection Specialist\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Insertion Of IUD\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Contraceptive injection PCP\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"family_planning\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"82\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Tubal Ligation\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"family_planning\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"82\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Insertion Of IUD - SPC\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Insertion Of IUD - PCP\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"cardiac_rehabilitation\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"BG\"\n" +
"],\n" +
"\"coverage_level\": \"family\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Cardiac Rehabilitation\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"cardiac_rehabilitation\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"BG\"\n" +
"],\n" +
"\"coverage_level\": \"family\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Cardiac Specialist\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Therapist\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"diagnostic_x_ray\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"4\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"X-Ray\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Specialist\"\n" +
"},\n" +
"{\n" +
"\"message\": \"PCP\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"diagnostic_x_ray\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"4\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"X-Ray\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Mammogram\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"diagnostic_x_ray\",\n" +
"\"diagnostic_lab\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"4\",\n" +
"\"5\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"diagnostic_x_ray\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"4\"\n" +
"],\n" +
"\"coverage_level\": \"family\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Chiropractic\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"gastrointestinal\",\n" +
"\"neurology\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"BN\",\n" +
"\"BQ\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Lab\"\n" +
"},\n" +
"{\n" +
"\"message\": \"X-Ray\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"gastrointestinal\",\n" +
"\"neurology\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"BN\",\n" +
"\"BQ\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Lab\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"gastrointestinal\",\n" +
"\"neurology\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"BN\",\n" +
"\"BQ\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Specialist Lab\"\n" +
"},\n" +
"{\n" +
"\"message\": \"PCP Lab\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Specialist X-Ray\"\n" +
"},\n" +
"{\n" +
"\"message\": \"PCP X-Ray\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"chemotherapy\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"78\"\n" +
"],\n" +
"\"coverage_level\": \"family\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"well_baby_care\",\n" +
"\"pneumonia_vaccine\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"68\",\n" +
"\"19\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"well_baby_care\",\n" +
"\"pediatric\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"68\",\n" +
"\"BH\"\n" +
"],\n" +
"\"coverage_level\": \"family\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Hearing Screening\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"consultation\",\n" +
"\"surgical\",\n" +
"\"chiropractic\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"3\",\n" +
"\"2\",\n" +
"\"33\"\n" +
"],\n" +
"\"coverage_level\": \"family\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Specialist\"\n" +
"},\n" +
"{\n" +
"\"message\": \"PCP\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"eye\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"BR\"\n" +
"],\n" +
"\"coverage_level\": \"family\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Glaucoma Screening\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"diagnostic_medical\"\n" +
"],\n" +
"\"in_plan_network\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"73\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"1000.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"PET\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Combined with In Network Plan Level\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"diagnostic_medical\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"73\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Sleep Studies\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"diagnostic_medical\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"73\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"EKG\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"diagnostic_medical\"\n" +
"],\n" +
"\"in_plan_network\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"73\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"1000.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"PET\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Combined with In Network Plan Level\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"diagnostic_medical\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"73\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"PCP\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Specialist\"\n" +
"},\n" +
"{\n" +
"\"message\": \"PET\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"diagnostic_medical\"\n" +
"],\n" +
"\"in_plan_network\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"73\"\n" +
"],\n" +
"\"coverage_level\": \"family\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"3000.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"PET\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Combined with In Network Plan Level\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"diagnostic_medical\"\n" +
"],\n" +
"\"in_plan_network\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"73\"\n" +
"],\n");
s.append("\"coverage_level\": \"family\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"3000.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"PET\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Combined with In Network Plan Level\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"transplants\"\n" +
"],\n" +
"\"in_plan_network\": \"not_applicable\",\n" +
"\"service_type_codes\": [\n" +
"\"70\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Lifesource Travel\\/Transportation\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"transplants\"\n" +
"],\n" +
"\"in_plan_network\": \"not_applicable\",\n" +
"\"service_type_codes\": [\n" +
"\"70\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Lifesource Hospital\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Lifesource Surgical\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Lifesource Private Room\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"pediatric\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"BH\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Lab\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Immunizations\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Exam\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"mri_cat_scan\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"62\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"CAT - Preventive Colonoscopy\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"mri_cat_scan\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"62\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"CAT - PCP Preventive Colonoscopy\"\n" +
"},\n" +
"{\n" +
"\"message\": \"CAT - Specialist Preventive Colonoscopy\"\n" +
"},\n" +
"{\n" +
"\"message\": \"CAT\"\n" +
"},\n" +
"{\n" +
"\"message\": \"MRI\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"mri_cat_scan\"\n" +
"],\n" +
"\"in_plan_network\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"62\"\n" +
"],\n" +
"\"coverage_level\": \"family\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"3000.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"MRI\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Combined with In Network Plan Level\"\n" +
"},\n" +
"{\n" +
"\"message\": \"CAT\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"mri_cat_scan\"\n" +
"],\n" +
"\"in_plan_network\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"62\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"1000.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"CAT\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Combined with In Network Plan Level\"\n" +
"},\n" +
"{\n" +
"\"message\": \"MRI\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"mri_cat_scan\"\n" +
"],\n" +
"\"in_plan_network\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"62\"\n" +
"],\n" +
"\"coverage_level\": \"family\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"3000.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"MRI\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Combined with In Network Plan Level\"\n" +
"},\n" +
"{\n" +
"\"message\": \"CAT\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"mri_cat_scan\"\n" +
"],\n" +
"\"in_plan_network\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"62\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"1000.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"MRI\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Combined with In Network Plan Level\"\n" +
"},\n" +
"{\n" +
"\"message\": \"CAT\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"medical_equipment_rental\",\n" +
"\"medical_equipment_purchase\",\n" +
"\"maternity\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"18\",\n" +
"\"12\",\n" +
"\"69\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Breast-Feeding Equipment and Supplies\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"audiology_exam\",\n" +
"\"cognitive_therapy\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"71\",\n" +
"\"BD\"\n" +
"],\n" +
"\"coverage_level\": \"family\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"diagnostic_lab\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"5\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Gynecological\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Obstetrical\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Specialist\"\n" +
"},\n" +
"{\n" +
"\"message\": \"PCP\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"diagnostic_lab\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"5\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"maternity\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"69\"\n" +
"],\n" +
"\"coverage_level\": \"family\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Midwife\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"maternity\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"69\"\n" +
"],\n" +
"\"coverage_level\": \"family\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Pre And Post Natal\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"pulmonary_rehabilitation\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"BF\"\n" +
"],\n" +
"\"coverage_level\": \"family\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Pulmonary Rehabilitation\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"smoking_cessation\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"67\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Counseling\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"other_medical\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"9\"\n" +
"],\n" +
"\"coverage_level\": \"family\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Medical Specialty Drugs PCP\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Medical Specialty Drugs Specialist\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"urgent_care\"\n" +
"],\n" +
"\"in_plan_network\": \"not_applicable\",\n" +
"\"service_type_codes\": [\n" +
"\"UC\"\n" +
"],\n" +
"\"coverage_level\": \"family\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"}\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"professional_physician_visit_office\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"98\"\n" +
"],\n" +
"\"coverage_level\": \"family\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"PCP\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Specialist\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"speech_therapy\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"AF\"\n" +
"],\n" +
"\"coverage_level\": \"family\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Speech Therapy\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"medically_related_transportation\"\n" +
"],\n" +
"\"in_plan_network\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"56\"\n" +
"],\n" +
"\"coverage_level\": \"family\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"3000.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Combined with In Network Plan Level\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"medically_related_transportation\"\n" +
"],\n" +
"\"in_plan_network\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"56\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"1000.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Combined with In Network Plan Level\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"allergy_testing\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"79\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Specialist\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Allergy\"\n" +
"},\n" +
"{\n" +
"\"message\": \"PCP\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"allergy_testing\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"79\"\n" +
"],\n" +
"\"coverage_level\": \"family\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Allergy\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"physical_medicine\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"AE\"\n" +
"],\n" +
"\"coverage_level\": \"family\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Physical Therapy\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"calendar_year\",\n" +
"\"service_types\": [\n" +
"\"occupational_therapy\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"AD\"\n" +
"],\n" +
"\"coverage_level\": \"family\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"0.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Occupational Therapy\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"remaining\",\n" +
"\"service_types\": [\n" +
"\"health_benefit_plan_coverage\"\n" +
"],\n" +
"\"in_plan_network\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"30\"\n" +
"],\n" +
"\"coverage_level\": \"family\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"6000.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Out of network amounts apply to in-network\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Accumulators are shared between Medical AND Mental Health\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"remaining\",\n" +
"\"service_types\": [\n" +
"\"health_benefit_plan_coverage\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"30\"\n" +
"],\n" +
"\"coverage_level\": \"family\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"3000.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Out of network amounts apply to in-network\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Accumulators are shared between Medical AND Mental Health\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"remaining\",\n" +
"\"service_types\": [\n" +
"\"health_benefit_plan_coverage\"\n" +
"],\n" +
"\"in_plan_network\": \"yes\",\n" +
"\"service_type_codes\": [\n" +
"\"30\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"1000.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Out of network amounts apply to in-network\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Accumulators are shared between Medical AND Mental Health\"\n" +
"}\n" +
"]\n" +
"},\n" +
"{\n" +
"\"time_period\": \"remaining\",\n" +
"\"service_types\": [\n" +
"\"health_benefit_plan_coverage\"\n" +
"],\n" +
"\"in_plan_network\": \"no\",\n" +
"\"service_type_codes\": [\n" +
"\"30\"\n" +
"],\n" +
"\"coverage_level\": \"individual\",\n" +
"\"benefit_amount\": {\n" +
"\"amount\": \"2000.00\",\n" +
"\"currency\": \"USD\"\n" +
"},\n" +
"\"messages\": [\n" +
"{\n" +
"\"message\": \"Benefit does apply to member's out-of-pocket maximum\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Out of network amounts apply to in-network\"\n" +
"},\n" +
"{\n" +
"\"message\": \"Accumulators are shared between Medical AND Mental Health\"\n" +
"}\n" +
"]\n" +
"}\n" +
"],\n" +
"\"active\": true,\n" +
"\"group_description\": \"LSNM CAPITAL PARTNERS, LLC\",\n" +
"\"eligibility_begin_date\": \"2015-01-01\"\n" +
"},\n" +
"\"trace_number\": \"0e690ee6f1f611e59b570242ac110003\",\n" +
"\"valid_request\": true,\n" +
"\"service_type_codes\": [\n" +
"\"UC\",\n" +
"\"50\"\n" +
"],\n" +
"}" +
"}");


return s.toString();
*/
}
}
