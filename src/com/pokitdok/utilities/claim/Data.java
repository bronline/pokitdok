
package com.pokitdok.utilities.claim;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "remaining_transitions",
    "units_of_work",
    "transition_path",
    "_type",
    "name",
    "trading_partner_id",
    "_uuid",
    "state",
    "id",
    "history",
    "parameters"
})
public class Data {

    @JsonProperty("remaining_transitions")
    public List<String> remainingTransitions = new ArrayList<String>();
    @JsonProperty("units_of_work")
    public Integer unitsOfWork;
    @JsonProperty("transition_path")
    public List<String> transitionPath = new ArrayList<String>();
    @JsonProperty("_type")
    public String Type;
    @JsonProperty("name")
    public String name;
    @JsonProperty("trading_partner_id")
    public String tradingPartnerId;
    @JsonProperty("_uuid")
    public String Uuid;
    @JsonProperty("state")
    public State state;
    @JsonProperty("id")
    public String id;
    @JsonProperty("history")
    public List<History> history = new ArrayList<History>();
    @JsonProperty("parameters")
    public Parameters parameters;

}
