/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pokitdok.utilities.claim;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pokitdok.utilities.eligibility.Address;
import java.util.ArrayList;

/**
 *
 * @author Randy
 */
public class Claim {
    public String transaction_code;
    public String trading_partner_id;
    public BillingProvider billing_provider = new BillingProvider();
    public Subscriber subscriber = new Subscriber();
    public PatientClaim claim = new PatientClaim();
    
    public class BillingProvider {
        public String taxonomy_code;
        public String first_name;
        public String last_name;
        public String npi;
        public Address address = new Address();
        public String tax_id;
    }
    
    public class Subscriber {
        public String first_name;
        public String last_name;
        public String member_id;
        public Address address = new Address();
        public String birth_date;
        public String gender;
    }
    
    public class PatientClaim {
        public double total_charge_amount;
        public ArrayList<ServiceLine> service_lines = new ArrayList<>();
    }
    
    public String serialize() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(this);
    }
}
