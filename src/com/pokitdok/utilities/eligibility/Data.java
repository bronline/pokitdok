
package com.pokitdok.utilities.eligibility;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "pharmacy",
    "summary",
    "coverage",
    "payer",
    "service_types",
    "valid_request",
    "service_type_codes",
    "provider",
    "trading_partner_id",
    "client_id",
    "subscriber",
    "correlation_id"
})
public class Data {

    @JsonProperty("pharmacy")
    public Pharmacy pharmacy;
    @JsonProperty("summary")
    public Summary summary;
    @JsonProperty("coverage")
    public Coverage coverage;
    @JsonProperty("payer")
    public Payer payer;
    @JsonProperty("service_types")
    public List<String> serviceTypes = new ArrayList<String>();
    @JsonProperty("valid_request")
    public Boolean validRequest;
    @JsonProperty("service_type_codes")
    public List<String> serviceTypeCodes = new ArrayList<String>();
    @JsonProperty("provider")
    public Provider provider;
    @JsonProperty("trading_partner_id")
    public String tradingPartnerId;
    @JsonProperty("client_id")
    public String clientId;
    @JsonProperty("subscriber")
    public Subscriber subscriber;
    @JsonProperty("correlation_id")
    public String correlationId;

}
