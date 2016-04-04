
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
"dependent",
"service_types",
"provider",
"correlation_id",
"payer",
"coverage",
"trace_number",
"valid_request",
"service_type_codes",
"client_id",
"follow_up_action",
"trading_partner_id",
"subscriber",
"originating_company_id"
})
public class Data {

@JsonProperty("pharmacy")
public Pharmacy pharmacy;
@JsonProperty("summary")
public Summary summary;
@JsonProperty("dependent")
public Dependent dependent;
@JsonProperty("service_types")
public List<String> serviceTypes = new ArrayList<String>();
@JsonProperty("provider")
public Provider provider;
@JsonProperty("correlation_id")
public String correlationId;
@JsonProperty("payer")
public Payer payer;
@JsonProperty("coverage")
public Coverage coverage;
@JsonProperty("trace_number")
public String traceNumber;
@JsonProperty("valid_request")
public Boolean validRequest;
@JsonProperty("service_type_codes")
public List<String> serviceTypeCodes = new ArrayList<String>();
@JsonProperty("client_id")
public String clientId;
@JsonProperty("follow_up_action")
public String followUpAction;
@JsonProperty("trading_partner_id")
public String tradingPartnerId;
@JsonProperty("subscriber")
public Subscriber subscriber;
@JsonProperty("originating_company_id")
public String originatingCompanyId;

}
