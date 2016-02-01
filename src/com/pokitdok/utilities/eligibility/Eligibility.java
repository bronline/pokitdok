/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokitdok.utilities.eligibility;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Randy
 */
public class Eligibility {

    public class Member {
        public String birth_date;
        public String first_name;
        public String last_name;
        public String id;
    }
    
    public class Provider {
        public String first_name;
        public String last_name;
        public String npi;
    }
    
    public Member member = new Member();
    public Provider provider = new Provider();
    public ArrayList<String> service_types = new ArrayList<String>();
    public String trading_partner_id;

    public Eligibility(){
        
    }
    
    public String serialize() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
//            mapper.writeValue(System.out, this);
//        System.out.print("----------------->" + mapper.writeValueAsString(this));
//        } catch (IOException ex) {
//            Logger.getLogger(Eligibility.class.getName()).log(Level.SEVERE, null, ex);
//        }
        return mapper.writeValueAsString(this);
    }    
}
