package com.pokitdok.utilities.eligibility;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.ObjectMapper;
import static com.pokitdok.utilities.eligibility.Test_EligibilityResponse.eligibility_response;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "data",
    "meta"
})
public class EligibilityResponse {

    @JsonProperty("data")
    public Data data;
    @JsonProperty("meta")
    public Meta meta;
   
    public static EligibilityResponse parse(String eligibility_response) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            EligibilityResponse er = mapper.readValue(eligibility_response, EligibilityResponse.class);
            return er;
        } catch (IOException ex) {
            Logger.getLogger(EligibilityResponse.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
}