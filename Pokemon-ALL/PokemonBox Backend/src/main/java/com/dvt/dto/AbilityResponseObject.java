package com.dvt.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
* This is the DTO or POJO to represent first level response while fetching abilities from Pokemon API 
*
* @author  Abdul Wajid
*/

@JsonIgnoreProperties(ignoreUnknown = true)
public class AbilityResponseObject implements java.io.Serializable {

@JsonProperty("count")
private Integer count;
@JsonProperty("next")
private String next;
@JsonProperty("previous")
private Object previous;
@JsonProperty("results")
private List<IndividualAbilityResult> results = null;

@JsonProperty("count")
public Integer getCount() {
return count;
}

@JsonProperty("count")
public void setCount(Integer count) {
this.count = count;
}

@JsonProperty("next")
public String getNext() {
return next;
}

@JsonProperty("next")
public void setNext(String next) {
this.next = next;
}

@JsonProperty("previous")
public Object getPrevious() {
return previous;
}

@JsonProperty("previous")
public void setPrevious(Object previous) {
this.previous = previous;
}

@JsonProperty("results")
public List<IndividualAbilityResult> getResults() {
return results;
}

@JsonProperty("results")
public void setResults(List<IndividualAbilityResult> results) {
this.results = results;
}

}