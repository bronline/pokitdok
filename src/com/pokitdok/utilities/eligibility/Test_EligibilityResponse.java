/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokitdok.utilities.eligibility;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;


/**
 *
 * @author Randy
 */
public class Test_EligibilityResponse {
    public static String eligibility_response;
    public static void main(String [] args) throws IOException {
        eligibility_response = setEligibilityResponse();
        ObjectMapper mapper = new ObjectMapper();
        EligibilityResponse er = mapper.readValue(eligibility_response, EligibilityResponse.class);
        
        System.out.println("active: " + er.data.coverage.active);
        System.out.println("insurance_type: " + er.data.coverage.insuranceType);
        System.out.println("level: " + er.data.coverage.level);
        System.out.println("group_number: " + er.data.coverage.groupNumber);
        System.out.println("group_description: " + er.data.coverage.groupDescription);
        System.out.println("plan_begin_date: " + er.data.coverage.eligibilityBeginDate);
        System.out.println("service_date: " + er.data.coverage.serviceDate);
        
        System.out.println("coverageoutofpocket");
        for(CoverageOutOfPocket cop : er.data.coverage.outOfPocket) {
            System.out.println("  coverage_level: " + cop.coverageLevel);
            System.out.println("  benefit_amount: " +cop.benefitAmount.amount);
            System.out.println("  service_type_codes");
            for(String s : cop.serviceTypeCodes) {
                System.out.println("    " + s);
            }
            System.out.println("  service_types");
            for(String s : cop.serviceTypes) {
                System.out.println("    " + s);
            }
        }
        
        System.out.println("");
        System.out.println("coinsurance");
        for(Coinsurance c : er.data.coverage.coinsurance) {
            System.out.println("  service_type_codes");
            for(String s : c.serviceTypeCodes) {
                System.out.println("    " + s);
            } 
            System.out.println("  coverage_level: " + c.coverageLevel);
            System.out.println("  benefit_percent: " + c.benefitPercent);
            System.out.println("  in_plan_network: " + c.inPlanNetwork);
            System.out.println("  service_types:");
            for(String s : c.serviceTypes) {
                System.out.println("    " + s);
            }
            for(Message m : c.messages) {
                System.out.println("    " + m.message);
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("deductibles");
        for(CoverageDeductible d : er.data.coverage.deductibles) {
            System.out.println("  eligibility_date: " + d.eligibilityDate);
            System.out.println("  in_plan_network: " + d.inPlanNetwork);
            System.out.println("  coverage_level: " + d.coverageLevel);
            System.out.println("  time_period " + d.timePeriod);
            System.out.println("  benefit_amount: " + d.benefitAmount.amount);
            for(Message m : d.messages) {
                System.out.println("  : " + m.message);
            }
            System.out.println("");
        }
    } 
    
    public static String setEligibilityResponse() {
        return "{\n" +
"  \"data\": {\n" +
"    \"summary\": {\n" +
"      \"out_of_pocket\": {\n" +
"        \"individual\": {\n" +
"          \"out_of_network\": {\n" +
"            \"applied\": {\n" +
"              \"amount\": \"16.43\",\n" +
"              \"currency\": \"USD\"\n" +
"            },\n" +
"            \"limit\": {\n" +
"              \"amount\": \"12500\",\n" +
"              \"currency\": \"USD\"\n" +
"            },\n" +
"            \"remaining\": {\n" +
"              \"amount\": \"12483.57\",\n" +
"              \"currency\": \"USD\"\n" +
"            }\n" +
"          },\n" +
"          \"in_network\": {\n" +
"            \"applied\": {\n" +
"              \"amount\": \"16.43\",\n" +
"              \"currency\": \"USD\"\n" +
"            },\n" +
"            \"limit\": {\n" +
"              \"amount\": \"3000\",\n" +
"              \"currency\": \"USD\"\n" +
"            },\n" +
"            \"remaining\": {\n" +
"              \"amount\": \"2983.57\",\n" +
"              \"currency\": \"USD\"\n" +
"            }\n" +
"          }\n" +
"        },\n" +
"        \"family\": {\n" +
"          \"out_of_network\": {\n" +
"            \"applied\": {\n" +
"              \"amount\": \"43.91\",\n" +
"              \"currency\": \"USD\"\n" +
"            },\n" +
"            \"limit\": {\n" +
"              \"amount\": \"25000\",\n" +
"              \"currency\": \"USD\"\n" +
"            },\n" +
"            \"remaining\": {\n" +
"              \"amount\": \"24956.09\",\n" +
"              \"currency\": \"USD\"\n" +
"            }\n" +
"          },\n" +
"          \"in_network\": {\n" +
"            \"applied\": {\n" +
"              \"amount\": \"43.91\",\n" +
"              \"currency\": \"USD\"\n" +
"            },\n" +
"            \"limit\": {\n" +
"              \"amount\": \"6000\",\n" +
"              \"currency\": \"USD\"\n" +
"            },\n" +
"            \"remaining\": {\n" +
"              \"amount\": \"5956.09\",\n" +
"              \"currency\": \"USD\"\n" +
"            }\n" +
"          }\n" +
"        }\n" +
"      },\n" +
"      \"deductible\": {\n" +
"        \"individual\": {\n" +
"          \"out_of_network\": {\n" +
"            \"applied\": {\n" +
"              \"amount\": \"16.43\",\n" +
"              \"currency\": \"USD\"\n" +
"            },\n" +
"            \"limit\": {\n" +
"              \"amount\": \"6000\",\n" +
"              \"currency\": \"USD\"\n" +
"            },\n" +
"            \"remaining\": {\n" +
"              \"amount\": \"5983.57\",\n" +
"              \"currency\": \"USD\"\n" +
"            }\n" +
"          },\n" +
"          \"in_network\": {\n" +
"            \"applied\": {\n" +
"              \"amount\": \"16.43\",\n" +
"              \"currency\": \"USD\"\n" +
"            },\n" +
"            \"limit\": {\n" +
"              \"amount\": \"3000\",\n" +
"              \"currency\": \"USD\"\n" +
"            },\n" +
"            \"remaining\": {\n" +
"              \"amount\": \"2983.57\",\n" +
"              \"currency\": \"USD\"\n" +
"            }\n" +
"          }\n" +
"        },\n" +
"        \"family\": {\n" +
"          \"out_of_network\": {\n" +
"            \"applied\": {\n" +
"              \"amount\": \"43.91\",\n" +
"              \"currency\": \"USD\"\n" +
"            },\n" +
"            \"limit\": {\n" +
"              \"amount\": \"12000\",\n" +
"              \"currency\": \"USD\"\n" +
"            },\n" +
"            \"remaining\": {\n" +
"              \"amount\": \"11956.09\",\n" +
"              \"currency\": \"USD\"\n" +
"            }\n" +
"          },\n" +
"          \"in_network\": {\n" +
"            \"applied\": {\n" +
"              \"amount\": \"43.91\",\n" +
"              \"currency\": \"USD\"\n" +
"            },\n" +
"            \"limit\": {\n" +
"              \"amount\": \"6000\",\n" +
"              \"currency\": \"USD\"\n" +
"            },\n" +
"            \"remaining\": {\n" +
"              \"amount\": \"5956.09\",\n" +
"              \"currency\": \"USD\"\n" +
"            }\n" +
"          }\n" +
"        }\n" +
"      }\n" +
"    },\n" +
"    \"coverage\": {\n" +
"      \"level\": \"employee_and_spouse\",\n" +
"      \"active\": true,\n" +
"      \"coinsurance\": [\n" +
"        {\n" +
"          \"service_type_codes\": [\n" +
"            \"98\"\n" +
"          ],\n" +
"          \"benefit_percent\": 0,\n" +
"          \"in_plan_network\": \"yes\",\n" +
"          \"service_types\": [\n" +
"            \"professional_physician_visit_office\"\n" +
"          ],\n" +
"          \"messages\": [\n" +
"            {\n" +
"              \"message\": \"GYN OFFICE VS\"\n" +
"            },\n" +
"            {\n" +
"              \"message\": \"GYN VISIT\"\n" +
"            },\n" +
"            {\n" +
"              \"message\": \"SPEC OFFICE\"\n" +
"            },\n" +
"            {\n" +
"              \"message\": \"SPEC VISIT\"\n" +
"            },\n" +
"            {\n" +
"              \"message\": \"PRIMARY OFFICE\"\n" +
"            },\n" +
"            {\n" +
"              \"message\": \"PRIME CARE VST\"\n" +
"            }\n" +
"          ],\n" +
"          \"coverage_level\": \"employee_and_spouse\"\n" +
"        },\n" +
"        {\n" +
"          \"service_type_codes\": [\n" +
"            \"98\"\n" +
"          ],\n" +
"          \"benefit_percent\": 0.5,\n" +
"          \"in_plan_network\": \"no\",\n" +
"          \"service_types\": [\n" +
"            \"professional_physician_visit_office\"\n" +
"          ],\n" +
"          \"messages\": [\n" +
"            {\n" +
"              \"message\": \"GYN OFFICE VS,COINS APPLIES TO OUT OF POCKET\"\n" +
"            },\n" +
"            {\n" +
"              \"message\": \"GYN VISIT,COINS APPLIES TO OUT OF POCKET\"\n" +
"            },\n" +
"            {\n" +
"              \"message\": \"SPEC OFFICE,COINS APPLIES TO OUT OF POCKET\"\n" +
"            },\n" +
"            {\n" +
"              \"message\": \"SPEC VISIT,COINS APPLIES TO OUT OF POCKET\"\n" +
"            },\n" +
"            {\n" +
"              \"message\": \"PRIME CARE VST,COINS APPLIES TO OUT OF POCKET\"\n" +
"            }\n" +
"          ],\n" +
"          \"coverage_level\": \"employee_and_spouse\"\n" +
"        }\n" +
"      ],\n" +
"      \"insurance_type\": \"ppo\",\n" +
"      \"plan_begin_date\": \"2013-02-15\",\n" +
"      \"out_of_pocket\": [\n" +
"        {\n" +
"          \"service_type_codes\": [\n" +
"            \"30\"\n" +
"          ],\n" +
"          \"in_plan_network\": \"yes\",\n" +
"          \"service_types\": [\n" +
"            \"health_benefit_plan_coverage\"\n" +
"          ],\n" +
"          \"coverage_level\": \"individual\",\n" +
"          \"benefit_amount\": {\n" +
"            \"amount\": \"3000\",\n" +
"            \"currency\": \"USD\"\n" +
"          }\n" +
"        },\n" +
"        {\n" +
"          \"service_type_codes\": [\n" +
"            \"30\"\n" +
"          ],\n" +
"          \"in_plan_network\": \"yes\",\n" +
"          \"service_types\": [\n" +
"            \"health_benefit_plan_coverage\"\n" +
"          ],\n" +
"          \"coverage_level\": \"individual\",\n" +
"          \"time_period\": \"remaining\",\n" +
"          \"benefit_amount\": {\n" +
"            \"amount\": \"2983.57\",\n" +
"            \"currency\": \"USD\"\n" +
"          }\n" +
"        },\n" +
"        {\n" +
"          \"service_type_codes\": [\n" +
"            \"30\"\n" +
"          ],\n" +
"          \"in_plan_network\": \"yes\",\n" +
"          \"service_types\": [\n" +
"            \"health_benefit_plan_coverage\"\n" +
"          ],\n" +
"          \"coverage_level\": \"family\",\n" +
"          \"benefit_amount\": {\n" +
"            \"amount\": \"6000\",\n" +
"            \"currency\": \"USD\"\n" +
"          }\n" +
"        },\n" +
"        {\n" +
"          \"service_type_codes\": [\n" +
"            \"30\"\n" +
"          ],\n" +
"          \"in_plan_network\": \"yes\",\n" +
"          \"service_types\": [\n" +
"            \"health_benefit_plan_coverage\"\n" +
"          ],\n" +
"          \"coverage_level\": \"family\",\n" +
"          \"time_period\": \"remaining\",\n" +
"          \"benefit_amount\": {\n" +
"            \"amount\": \"5956.09\",\n" +
"            \"currency\": \"USD\"\n" +
"          }\n" +
"        },\n" +
"        {\n" +
"          \"service_type_codes\": [\n" +
"            \"30\"\n" +
"          ],\n" +
"          \"in_plan_network\": \"no\",\n" +
"          \"service_types\": [\n" +
"            \"health_benefit_plan_coverage\"\n" +
"          ],\n" +
"          \"coverage_level\": \"individual\",\n" +
"          \"benefit_amount\": {\n" +
"            \"amount\": \"12500\",\n" +
"            \"currency\": \"USD\"\n" +
"          }\n" +
"        },\n" +
"        {\n" +
"          \"service_type_codes\": [\n" +
"            \"30\"\n" +
"          ],\n" +
"          \"in_plan_network\": \"no\",\n" +
"          \"service_types\": [\n" +
"            \"health_benefit_plan_coverage\"\n" +
"          ],\n" +
"          \"coverage_level\": \"individual\",\n" +
"          \"time_period\": \"remaining\",\n" +
"          \"benefit_amount\": {\n" +
"            \"amount\": \"12483.57\",\n" +
"            \"currency\": \"USD\"\n" +
"          }\n" +
"        },\n" +
"        {\n" +
"          \"service_type_codes\": [\n" +
"            \"30\"\n" +
"          ],\n" +
"          \"in_plan_network\": \"no\",\n" +
"          \"service_types\": [\n" +
"            \"health_benefit_plan_coverage\"\n" +
"          ],\n" +
"          \"coverage_level\": \"family\",\n" +
"          \"benefit_amount\": {\n" +
"            \"amount\": \"25000\",\n" +
"            \"currency\": \"USD\"\n" +
"          }\n" +
"        },\n" +
"        {\n" +
"          \"service_type_codes\": [\n" +
"            \"30\"\n" +
"          ],\n" +
"          \"in_plan_network\": \"no\",\n" +
"          \"service_types\": [\n" +
"            \"health_benefit_plan_coverage\"\n" +
"          ],\n" +
"          \"coverage_level\": \"family\",\n" +
"          \"time_period\": \"remaining\",\n" +
"          \"benefit_amount\": {\n" +
"            \"amount\": \"24956.09\",\n" +
"            \"currency\": \"USD\"\n" +
"          }\n" +
"        }\n" +
"      ],\n" +
"      \"service_type_codes\": [\n" +
"        \"98\"\n" +
"      ],\n" +
"      \"group_number\": \"088818801000013\",\n" +
"      \"service_date\": \"2013-08-10\",\n" +
"      \"service_types\": [\n" +
"        \"professional_physician_visit_office\"\n" +
"      ],\n" +
"      \"copay\": [\n" +
"        {\n" +
"          \"service_type_codes\": [\n" +
"            \"98\"\n" +
"          ],\n" +
"          \"in_plan_network\": \"yes\",\n" +
"          \"service_types\": [\n" +
"            \"professional_physician_visit_office\"\n" +
"          ],\n" +
"          \"messages\": [\n" +
"            {\n" +
"              \"message\": \"PRIMARY OFFICE\"\n" +
"            }\n" +
"          ],\n" +
"          \"coverage_level\": \"employee_and_spouse\",\n" +
"          \"copayment\": {\n" +
"            \"amount\": \"0\",\n" +
"            \"currency\": \"USD\"\n" +
"          }\n" +
"        },\n" +
"        {\n" +
"          \"service_type_codes\": [\n" +
"            \"98\"\n" +
"          ],\n" +
"          \"in_plan_network\": \"not_applicable\",\n" +
"          \"service_types\": [\n" +
"            \"professional_physician_visit_office\"\n" +
"          ],\n" +
"          \"messages\": [\n" +
"            {\n" +
"              \"message\": \"GYN OFFICE VS\"\n" +
"            },\n" +
"            {\n" +
"              \"message\": \"GYN VISIT\"\n" +
"            },\n" +
"            {\n" +
"              \"message\": \"SPEC OFFICE\"\n" +
"            },\n" +
"            {\n" +
"              \"message\": \"SPEC VISIT\"\n" +
"            },\n" +
"            {\n" +
"              \"message\": \"PRIME CARE VST\"\n" +
"            }\n" +
"          ],\n" +
"          \"coverage_level\": \"employee_and_spouse\",\n" +
"          \"copayment\": {\n" +
"            \"amount\": \"0\",\n" +
"            \"currency\": \"USD\"\n" +
"          }\n" +
"        }\n" +
"      ],\n" +
"      \"deductibles\": [\n" +
"        {\n" +
"          \"service_type_codes\": [\n" +
"            \"30\"\n" +
"          ],\n" +
"          \"eligibility_date\": \"2013-01-01\",\n" +
"          \"in_plan_network\": \"yes\",\n" +
"          \"service_types\": [\n" +
"            \"health_benefit_plan_coverage\"\n" +
"          ],\n" +
"          \"messages\": [\n" +
"            {\n" +
"              \"message\": \"INT MED AND RX,GYN OFFICE VS,DED INCLUDED IN OOP,GYN VISIT,SPEC OFFICE,SPEC VISIT,PRIMARY OFFICE,PRIME CARE VST\"\n" +
"            }\n" +
"          ],\n" +
"          \"coverage_level\": \"family\",\n" +
"          \"time_period\": \"calendar_year\",\n" +
"          \"benefit_amount\": {\n" +
"            \"amount\": \"6000\",\n" +
"            \"currency\": \"USD\"\n" +
"          }\n" +
"        },\n" +
"        {\n" +
"          \"service_type_codes\": [\n" +
"            \"30\"\n" +
"          ],\n" +
"          \"in_plan_network\": \"yes\",\n" +
"          \"service_types\": [\n" +
"            \"health_benefit_plan_coverage\"\n" +
"          ],\n" +
"          \"messages\": [\n" +
"            {\n" +
"              \"message\": \"INT MED AND RX\"\n" +
"            }\n" +
"          ],\n" +
"          \"coverage_level\": \"family\",\n" +
"          \"time_period\": \"remaining\",\n" +
"          \"benefit_amount\": {\n" +
"            \"amount\": \"5956.09\",\n" +
"            \"currency\": \"USD\"\n" +
"          }\n" +
"        },\n" +
"        {\n" +
"          \"service_type_codes\": [\n" +
"            \"30\"\n" +
"          ],\n" +
"          \"eligibility_date\": \"2013-01-01\",\n" +
"          \"in_plan_network\": \"yes\",\n" +
"          \"service_types\": [\n" +
"            \"health_benefit_plan_coverage\"\n" +
"          ],\n" +
"          \"messages\": [\n" +
"            {\n" +
"              \"message\": \"INT MED AND RX,GYN OFFICE VS,DED INCLUDED IN OOP,GYN VISIT,SPEC OFFICE,SPEC VISIT,PRIMARY OFFICE,PRIME CARE VST\"\n" +
"            }\n" +
"          ],\n" +
"          \"coverage_level\": \"individual\",\n" +
"          \"time_period\": \"calendar_year\",\n" +
"          \"benefit_amount\": {\n" +
"            \"amount\": \"3000\",\n" +
"            \"currency\": \"USD\"\n" +
"          }\n" +
"        },\n" +
"        {\n" +
"          \"service_type_codes\": [\n" +
"            \"30\"\n" +
"          ],\n" +
"          \"in_plan_network\": \"yes\",\n" +
"          \"service_types\": [\n" +
"            \"health_benefit_plan_coverage\"\n" +
"          ],\n" +
"          \"messages\": [\n" +
"            {\n" +
"              \"message\": \"INT MED AND RX\"\n" +
"            }\n" +
"          ],\n" +
"          \"coverage_level\": \"individual\",\n" +
"          \"time_period\": \"remaining\",\n" +
"          \"benefit_amount\": {\n" +
"            \"amount\": \"2983.57\",\n" +
"            \"currency\": \"USD\"\n" +
"          }\n" +
"        },\n" +
"        {\n" +
"          \"service_type_codes\": [\n" +
"            \"30\"\n" +
"          ],\n" +
"          \"eligibility_date\": \"2013-01-01\",\n" +
"          \"in_plan_network\": \"no\",\n" +
"          \"service_types\": [\n" +
"            \"health_benefit_plan_coverage\"\n" +
"          ],\n" +
"          \"messages\": [\n" +
"            {\n" +
"              \"message\": \"INT MED AND RX,GYN OFFICE VS,DED INCLUDED IN OOP,GYN VISIT,SPEC OFFICE,SPEC VISIT,PRIME CARE VST\"\n" +
"            }\n" +
"          ],\n" +
"          \"coverage_level\": \"family\",\n" +
"          \"time_period\": \"calendar_year\",\n" +
"          \"benefit_amount\": {\n" +
"            \"amount\": \"12000\",\n" +
"            \"currency\": \"USD\"\n" +
"          }\n" +
"        },\n" +
"        {\n" +
"          \"service_type_codes\": [\n" +
"            \"30\"\n" +
"          ],\n" +
"          \"in_plan_network\": \"no\",\n" +
"          \"service_types\": [\n" +
"            \"health_benefit_plan_coverage\"\n" +
"          ],\n" +
"          \"messages\": [\n" +
"            {\n" +
"              \"message\": \"INT MED AND RX\"\n" +
"            }\n" +
"          ],\n" +
"          \"coverage_level\": \"family\",\n" +
"          \"time_period\": \"remaining\",\n" +
"          \"benefit_amount\": {\n" +
"            \"amount\": \"11956.09\",\n" +
"            \"currency\": \"USD\"\n" +
"          }\n" +
"        },\n" +
"        {\n" +
"          \"service_type_codes\": [\n" +
"            \"30\"\n" +
"          ],\n" +
"          \"eligibility_date\": \"2013-01-01\",\n" +
"          \"in_plan_network\": \"no\",\n" +
"          \"service_types\": [\n" +
"            \"health_benefit_plan_coverage\"\n" +
"          ],\n" +
"          \"messages\": [\n" +
"            {\n" +
"              \"message\": \"INT MED AND RX,GYN OFFICE VS,DED INCLUDED IN OOP,GYN VISIT,SPEC OFFICE,SPEC VISIT,PRIME CARE VST\"\n" +
"            }\n" +
"          ],\n" +
"          \"coverage_level\": \"individual\",\n" +
"          \"time_period\": \"calendar_year\",\n" +
"          \"benefit_amount\": {\n" +
"            \"amount\": \"6000\",\n" +
"            \"currency\": \"USD\"\n" +
"          }\n" +
"        },\n" +
"        {\n" +
"          \"service_type_codes\": [\n" +
"            \"30\"\n" +
"          ],\n" +
"          \"in_plan_network\": \"no\",\n" +
"          \"service_types\": [\n" +
"            \"health_benefit_plan_coverage\"\n" +
"          ],\n" +
"          \"messages\": [\n" +
"            {\n" +
"              \"message\": \"INT MED AND RX\"\n" +
"            }\n" +
"          ],\n" +
"          \"coverage_level\": \"individual\",\n" +
"          \"time_period\": \"remaining\",\n" +
"          \"benefit_amount\": {\n" +
"            \"amount\": \"5983.57\",\n" +
"            \"currency\": \"USD\"\n" +
"          }\n" +
"        }\n" +
"      ],\n" +
"      \"plan_number\": \"0888188\",\n" +
"      \"contacts\": [\n" +
"        {\n" +
"          \"contact_type\": \"payer\",\n" +
"          \"address\": {\n" +
"            \"zipcode\": \"40512\",\n" +
"            \"address_lines\": [\n" +
"              \"PO Box 14079\"\n" +
"            ],\n" +
"            \"city\": \"Lexington\",\n" +
"            \"state\": \"KY\"\n" +
"          },\n" +
"          \"name\": \"Aetna\"\n" +
"        }\n" +
"      ],\n" +
"      \"group_description\": \"MOCK INDIVIDUAL ADVANTAGE PLAN\",\n" +
"      \"limitations\": [\n" +
"        {\n" +
"          \"service_type_codes\": [\n" +
"            \"30\"\n" +
"          ],\n" +
"          \"messages\": [\n" +
"            {\n" +
"              \"message\": \"Unlimited Lifetime Benefits\"\n" +
"            }\n" +
"          ],\n" +
"          \"service_types\": [\n" +
"            \"health_benefit_plan_coverage\"\n" +
"          ],\n" +
"          \"coverage_level\": \"employee_and_spouse\",\n" +
"          \"benefit_amount\": {\n" +
"            \"amount\": \"0\",\n" +
"            \"currency\": \"USD\"\n" +
"          }\n" +
"        },\n" +
"        {\n" +
"          \"service_type_codes\": [\n" +
"            \"98\"\n" +
"          ],\n" +
"          \"in_plan_network\": \"not_applicable\",\n" +
"          \"service_types\": [\n" +
"            \"professional_physician_visit_office\"\n" +
"          ],\n" +
"          \"messages\": [\n" +
"            {\n" +
"              \"message\": \"Plan Requires PreCert\"\n" +
"            }\n" +
"          ],\n" +
"          \"coverage_level\": \"employee_and_spouse\",\n" +
"          \"benefit_amount\": {\n" +
"            \"amount\": \"0\",\n" +
"            \"currency\": \"USD\"\n" +
"          }\n" +
"        },\n" +
"        {\n" +
"          \"service_type_codes\": [\n" +
"            \"98\"\n" +
"          ],\n" +
"          \"messages\": [\n" +
"            {\n" +
"              \"message\": \"Commercial\"\n" +
"            },\n" +
"            {\n" +
"              \"message\": \"Plan includes NAP\"\n" +
"            },\n" +
"            {\n" +
"              \"message\": \"Pre-Existing may apply\"\n" +
"            }\n" +
"          ],\n" +
"          \"service_types\": [\n" +
"            \"professional_physician_visit_office\"\n" +
"          ],\n" +
"          \"coverage_level\": \"employee_and_spouse\",\n" +
"          \"benefit_amount\": {\n" +
"            \"amount\": \"0\",\n" +
"            \"currency\": \"USD\"\n" +
"          }\n" +
"        }\n" +
"      ],\n" +
"      \"plan_description\": \"Open Choice\",\n" +
"      \"eligibility_begin_date\": \"2012-02-01\"\n" +
"    },\n" +
"    \"service_type_codes\": [\n" +
"      \"98\"\n" +
"    ],\n" +
"    \"subscriber\": {\n" +
"      \"address\": {\n" +
"        \"zipcode\": \"29307\",\n" +
"        \"address_lines\": [\n" +
"          \"123 MAIN ST\"\n" +
"        ],\n" +
"        \"city\": \"SPARTANBURG\",\n" +
"        \"state\": \"SC\"\n" +
"      },\n" +
"      \"gender\": \"male\",\n" +
"      \"birth_date\": \"1998-06-05\",\n" +
"      \"last_name\": \"ALLEN\",\n" +
"      \"id\": \"945801841\",\n" +
"      \"first_name\": \"ASHER\"\n" +
"    },\n" +
"    \"provider\": {\n" +
"      \"npi\": \"1124369947\",\n" +
"      \"last_name\": \"Rion Marcus\",\n" +
"      \"first_name\": \"Rion\"\n" +
"    },\n" +
"    \"valid_request\": true,\n" +
"    \"trading_partner_id\": \"MOCKPAYER\",\n" +
"    \"pharmacy\": {\n" +
"      \"is_eligible\": false\n" +
"    },\n" +
"    \"service_types\": [\n" +
"      \"professional_physician_visit_office\"\n" +
"    ],\n" +
"    \"correlation_id\": \"ac4a4edc-d939-40d6-8612-c1b8ff26b4b4\",\n" +
"    \"payer\": {\n" +
"      \"name\": \"MOCK PAYER INC\",\n" +
"      \"id\": \"MOCKPAYER\"\n" +
"    },\n" +
"    \"client_id\": \"UYOjfVWTJ0y3o1idROXd\"\n" +
"  },\n" +
"  \"meta\": {\n" +
"    \"processing_time\": 235,\n" +
"    \"credits_billed\": 0,\n" +
"    \"rate_limit_amount\": 3,\n" +
"    \"rate_limit_reset\": 1454976263,\n" +
"    \"activity_id\": \"56b91f5b3fe8fa013b65a80b\",\n" +
"    \"application_mode\": \"test\",\n" +
"    \"credits_remaining\": 0,\n" +
"    \"rate_limit_cap\": 1000\n" +
"  }\n" +
"}";
    }
}
