/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pokitdok.utilities.eligibility;

import java.util.ArrayList;
import java.util.HashMap;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 *
 * @author Randy
 */
public class EligibilityResponse_New {
    
    public class Copay {
        public String coverageLevel;
        public String inPlanNetwork;
        public String amount;
        public ArrayList service_type = new ArrayList();
        public ArrayList messages = new ArrayList();
    }
    
    public class Coverage {
        public boolean active;
        public String insurance_type;
        public String level;
        public String group_number;
        public String group_description;
        public String plan_begin_date;
        public String plan_end_date;
        public String plan_description;
    }
    
    public class CoinsuranceDetail {
        public String coverageLevel;
        public String inPlanNetwork;
        public double benefit_percent;
        public ArrayList serviceTypes = new ArrayList();
        public ArrayList messages = new ArrayList();
    }
    
    public class LimitationDetail {
        public String coverageLevel;
        public String inPlanNetwork;
        public double benefit_amount;
        public ArrayList serviceTypes = new ArrayList();
        public ArrayList messages = new ArrayList();
        public ArrayList delivery = new ArrayList();
    }
    
    public class Delivery {
        public String time_period;
        public String quantity_qualifier;
        public int period_count;
        public int quantity;
    }
    
    public class Errors {
        public String query;
    }
    
    public class DeductibleSummary {
        public double limit;
        public double remaining;
        public double applied;
    }
    
    public class Deductible {
        public class Network {
            public String inPlanNetwork;
            public DeductibleSummary deductible = new DeductibleSummary();
        }
        public Network inNetwork = new Network();
        public Network outOfNetwork = new Network();
    }
    
    public class Deductibles {
        public Deductible individual = new Deductible();
        public Deductible family = new Deductible();
        public OutOfPocket out_of_pocket = new OutOfPocket();
        
        public class OutOfPocket {
            public Deductible individual = new Deductible();
            public Deductible family = new Deductible();
        }
        
    }
    
    public HashMap<String, CoinsuranceDetail> serviceMap = new HashMap<>();
    public HashMap<String, LimitationDetail> limitationMap = new HashMap<>();
    public HashMap<String, Copay> copayMap = new HashMap<>();
    public Deductibles deductibles = new Deductibles();
    public Coverage coverage = new Coverage();
    public Errors errors;
    
    public EligibilityResponse_New(String eligibility_response) {
        JSONObject data = JSONObject.fromObject(eligibility_response);
        
        JSONObject deductibleObject = ((JSONObject)data.getJSONObject("data")).getJSONObject("summary");
        if(deductibleObject.containsKey("deductible")) {
            JSONObject individual = ((JSONObject)deductibleObject.get("deductible")).getJSONObject("individual");
            deductibles.individual.inNetwork.deductible.limit = Double.parseDouble(((String)((JSONObject)((JSONObject)individual.get("in_network")).getJSONObject("limit")).get("amount")));
            deductibles.individual.inNetwork.deductible.remaining = Double.parseDouble(((String)((JSONObject)((JSONObject)individual.get("in_network")).getJSONObject("remaining")).get("amount")));
            deductibles.individual.inNetwork.deductible.applied = Double.parseDouble(((String)((JSONObject)((JSONObject)individual.get("in_network")).getJSONObject("applied")).get("amount")));

            deductibles.individual.outOfNetwork.deductible.limit = Double.parseDouble(((String)((JSONObject)((JSONObject)individual.get("out_of_network")).getJSONObject("limit")).get("amount")));
            deductibles.individual.outOfNetwork.deductible.remaining = Double.parseDouble(((String)((JSONObject)((JSONObject)individual.get("out_of_network")).getJSONObject("remaining")).get("amount")));
            deductibles.individual.outOfNetwork.deductible.applied = Double.parseDouble(((String)((JSONObject)((JSONObject)individual.get("out_of_network")).getJSONObject("applied")).get("amount")));
            
            JSONObject family = ((JSONObject)deductibleObject.get("deductible")).getJSONObject("family");
            deductibles.family.inNetwork.deductible.limit = Double.parseDouble(((String)((JSONObject)((JSONObject)individual.get("in_network")).getJSONObject("limit")).get("amount")));
            deductibles.family.inNetwork.deductible.remaining = Double.parseDouble(((String)((JSONObject)((JSONObject)individual.get("in_network")).getJSONObject("remaining")).get("amount")));
            deductibles.family.inNetwork.deductible.applied = Double.parseDouble(((String)((JSONObject)((JSONObject)individual.get("in_network")).getJSONObject("applied")).get("amount")));

            deductibles.family.outOfNetwork.deductible.limit = Double.parseDouble(((String)((JSONObject)((JSONObject)individual.get("out_of_network")).getJSONObject("limit")).get("amount")));
            deductibles.family.outOfNetwork.deductible.remaining = Double.parseDouble(((String)((JSONObject)((JSONObject)individual.get("out_of_network")).getJSONObject("remaining")).get("amount")));
            deductibles.family.outOfNetwork.deductible.applied = Double.parseDouble(((String)((JSONObject)((JSONObject)individual.get("out_of_network")).getJSONObject("applied")).get("amount")));

            JSONObject outOfPocketIndividual = ((JSONObject)(JSONObject)deductibleObject.getJSONObject("out_of_pocket")).getJSONObject("individual");
            deductibles.out_of_pocket.individual.inNetwork.deductible.limit = ((JSONObject)((JSONObject)outOfPocketIndividual).getJSONObject("in_network")).getJSONObject("limit").getDouble("amount");
            deductibles.out_of_pocket.individual.inNetwork.deductible.applied = ((JSONObject)((JSONObject)outOfPocketIndividual).getJSONObject("in_network")).getJSONObject("applied").getDouble("amount");
            deductibles.out_of_pocket.individual.inNetwork.deductible.remaining = ((JSONObject)((JSONObject)outOfPocketIndividual).getJSONObject("in_network")).getJSONObject("remaining").getDouble("amount");
            
            deductibles.out_of_pocket.individual.outOfNetwork.deductible.limit = ((JSONObject)((JSONObject)outOfPocketIndividual).getJSONObject("out_of_network")).getJSONObject("limit").getDouble("amount");
            deductibles.out_of_pocket.individual.outOfNetwork.deductible.applied = ((JSONObject)((JSONObject)outOfPocketIndividual).getJSONObject("out_of_network")).getJSONObject("applied").getDouble("amount");
            deductibles.out_of_pocket.individual.outOfNetwork.deductible.remaining = ((JSONObject)((JSONObject)outOfPocketIndividual).getJSONObject("out_of_network")).getJSONObject("remaining").getDouble("amount");

            JSONObject outOfPocketFamily = ((JSONObject)(JSONObject)deductibleObject.getJSONObject("out_of_pocket")).getJSONObject("family");
            deductibles.out_of_pocket.family.inNetwork.deductible.limit = ((JSONObject)((JSONObject)outOfPocketIndividual).getJSONObject("in_network")).getJSONObject("limit").getDouble("amount");
            deductibles.out_of_pocket.family.inNetwork.deductible.applied = ((JSONObject)((JSONObject)outOfPocketIndividual).getJSONObject("in_network")).getJSONObject("applied").getDouble("amount");
            deductibles.out_of_pocket.family.inNetwork.deductible.remaining = ((JSONObject)((JSONObject)outOfPocketIndividual).getJSONObject("in_network")).getJSONObject("remaining").getDouble("amount");
            
            deductibles.out_of_pocket.family.outOfNetwork.deductible.limit = ((JSONObject)((JSONObject)outOfPocketIndividual).getJSONObject("out_of_network")).getJSONObject("limit").getDouble("amount");
            deductibles.out_of_pocket.family.outOfNetwork.deductible.applied = ((JSONObject)((JSONObject)outOfPocketIndividual).getJSONObject("out_of_network")).getJSONObject("applied").getDouble("amount");
            deductibles.out_of_pocket.family.outOfNetwork.deductible.remaining = ((JSONObject)((JSONObject)outOfPocketIndividual).getJSONObject("out_of_network")).getJSONObject("remaining").getDouble("amount");


        }
        
        if(data.getJSONObject("data").containsKey("errors")) {
            errors=new Errors();
            errors.query = ((JSONObject)data.getJSONObject("data").get("errors")).getString("query") ;
        } else {
        
            JSONArray cp = (JSONArray)data.getJSONObject("data").getJSONObject("coverage").get("copay");
            if(cp != null) {
                for (Object cp1 : cp) {
                    JSONObject c = (JSONObject)cp1;
                    String key = (String)((JSONObject)c.get("copayment")).getString("amount");
                    if(c.get("coverage_level") != null) { key += c.get("coverage_level"); }
                    if(c.get("in_plan_network") != null) { key += c.getString("in_plan_network"); }
                    Copay copay;

                    if(!copayMap.containsKey(key)) {
                        copay = new Copay();
                        copay.coverageLevel = (String)c.get("coverage_level");
                        if(((String)c.get("in_plan_network")).toLowerCase().equals("yes")) {
                            copay.inPlanNetwork = "In Network";
                        } else {
                            copay.inPlanNetwork = "Out of Network";
                        }

                        copay.amount=(String)((JSONObject)c.get("copayment")).getString("amount");
                        copayMap.put(key, copay);

                    } else {
                        copay=copayMap.get(key);
                    } 

                    JSONArray service_types = (JSONArray)c.getJSONArray("service_types");
                    for(Object service_type : service_types) {
                        copay.service_type.add(service_type);

                    }

                    if(c.get("messages") != null) {
                        JSONArray messages = (JSONArray)c.getJSONArray("messages");
                        for(Object message : messages) {
                            JSONObject m = (JSONObject)message;
                            copay.messages.add(m.get("message"));
                        }
                    }

                }
            }

            coverage.active=(boolean)data.getJSONObject("data").getJSONObject("coverage").get("active");
            coverage.insurance_type=(String)data.getJSONObject("data").getJSONObject("coverage").get("insurance_type");
            coverage.level=(String)data.getJSONObject("data").getJSONObject("coverage").get("level");
            coverage.group_number=(String)data.getJSONObject("data").getJSONObject("coverage").get("group_number");
            coverage.group_description=(String)data.getJSONObject("data").getJSONObject("coverage").get("group_description");
            coverage.plan_begin_date=(String)data.getJSONObject("data").getJSONObject("coverage").get("plan_begin_date");
            coverage.plan_end_date=(String)data.getJSONObject("data").getJSONObject("coverage").get("plan_end_date");
            coverage.plan_description=(String)data.getJSONObject("data").getJSONObject("coverage").get("plan_description");

            JSONArray c=(JSONArray)data.getJSONObject("data").getJSONObject("coverage").get("coinsurance");
            for(int x=0;x<c.size();x++) {
                JSONObject coinsurance = (JSONObject)c.get(x);
                String key = coinsurance.getString("coverage_level") + "-" + coinsurance.get("in_plan_network") + "-" + coinsurance.get("benefit_percent");
                JSONArray service_types = (JSONArray)coinsurance.get("service_types");

                CoinsuranceDetail cd;
                if(!serviceMap.containsKey(key)) { 
                    cd = new CoinsuranceDetail();
                    cd.coverageLevel = ((String)coinsurance.getString("coverage_level")).replaceAll("_", " ");
                    cd.inPlanNetwork = ((String)coinsurance.get("in_plan_network")).replaceAll("_", " ");
                    try {
                        cd.benefit_percent = (Double)coinsurance.get("benefit_percent");
                    } catch (Exception e) {
                        cd.benefit_percent = 0.0;
                    }
                    serviceMap.put(key, cd); 
                } else {
                    cd = serviceMap.get(key);
                }

                for (Object service_type : service_types) {
                    if(!cd.serviceTypes.contains((String)service_type)) {
                        cd.serviceTypes.add(((String)service_type).replaceAll("_", " "));
                    }
                }

                if(coinsurance.get("messages") != null) {
                    JSONArray messages = (JSONArray)coinsurance.get("messages");
                    for (Object message : messages) {
                        JSONObject m = (JSONObject) message;
                        if(!cd.messages.contains((String)m.get("message"))) {
                            cd.messages.add(((String)m.get("message")));
                        }
                    }
                }
            }

            JSONArray limitations=(JSONArray)data.getJSONObject("data").getJSONObject("coverage").get("limitations");        
            for(Object limitation : limitations) {
    //            System.out.println(limitation);
                JSONObject l = (JSONObject)limitation;
                String key = "";
                if(l.get("coverage_level") != null) { key += l.get("coverage_level") + "-"; }
                if(l.get("in_plan_network") != null) {key += l.get("in_plan_network") + "-"; }
                JSONObject amount = (JSONObject)l.get("benefit_amount");
                key += amount.get("amount");
                LimitationDetail ld;

                if(!limitationMap.containsKey(key)) {
                    ld=new LimitationDetail();
                    if(l.get("coverage_level") != null) { ld.coverageLevel = ((String)l.get("coverage_level")).replaceAll("_", " "); }
                    try { ld.benefit_amount = (Double)amount.get("amount"); } catch (Exception e) {}
                    if(l.get("in_plan_network") != null) { ld.inPlanNetwork = ((String)l.get("in_plan_network")).replaceAll("_", " "); }
                    limitationMap.put(key, ld);
                } else {
                    ld=limitationMap.get(key);
                }

                JSONArray service_types = (JSONArray)l.get("service_types");
                for(Object service_type : service_types) {
                    String stKey = (String)service_type;
                    stKey = stKey.replaceAll("_", " ");
                    if(!ld.serviceTypes.contains(stKey)) {
                        ld.serviceTypes.add(stKey);
                    }
                }

                if(l.get("messages") != null) {
                    JSONArray messages = (JSONArray)l.get("messages");
                    for(Object m : messages) {
                        JSONObject message = (JSONObject)m;
                        if(!ld.messages.contains((String)message.get("message"))) {
                            ld.messages.add((String)message.get("message"));
                        }
                    }
                }
                
                if(l.containsKey("delivery")) {
                    for(Object delivery : (JSONArray)l.get("delivery")) {
                        Delivery d = new Delivery();
                        d.time_period = ((JSONObject)delivery).getString("time_period_qualifier");
                        d.quantity_qualifier = ((JSONObject)delivery).getString("quantity_qualifier");
                        if(((JSONObject)delivery).containsKey("period_count")) { d.period_count = ((JSONObject)delivery).getInt("period_count"); }
                        if(((JSONObject)delivery).containsKey("quantity")) { d.quantity = ((JSONObject)delivery).getInt("quantity"); }
                        ld.delivery.add(d);
                    }
                }
            }
        }
    }
}

