
package com.pokitdok.utilities.claim;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "submitter",
    "async",
    "billing_provider",
    "transaction_code",
    "subscriber",
    "receiver",
    "trading_partner_id",
    "claim",
    "correlation_id",
    "generate_pdf",
    "payer",
    "client_id"
})
public class Parameters {

    @JsonProperty("submitter")
    public Submitter submitter;
    @JsonProperty("async")
    public Boolean async;
    @JsonProperty("billing_provider")
    public BillingProvider billingProvider;
    @JsonProperty("transaction_code")
    public String transactionCode;
    @JsonProperty("subscriber")
    public Subscriber subscriber;
    @JsonProperty("receiver")
    public Receiver receiver;
    @JsonProperty("trading_partner_id")
    public String tradingPartnerId;
    @JsonProperty("claim")
    public Claim claim;
    @JsonProperty("correlation_id")
    public String correlationId;
    @JsonProperty("generate_pdf")
    public Boolean generatePdf;
    @JsonProperty("payer")
    public Payer payer;
    @JsonProperty("client_id")
    public String clientId;

}
