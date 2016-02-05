
package com.pokitdok.utilities.claim;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "record_dt",
    "name",
    "title"
})
public class History {

    @JsonProperty("record_dt")
    public String recordDt;
    @JsonProperty("name")
    public String name;
    @JsonProperty("title")
    public String title;

}
