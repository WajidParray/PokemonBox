package com.dvt.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
* This is the DTO or POJO that represents the first level response of a Pokemon from Pokemon API 
*
* @author  Abdul Wajid
*/

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonResponseObject implements java.io.Serializable{

    @JsonProperty("count")
    private Integer count;
    @JsonProperty("next")
    private String next;
    @JsonProperty("previous")
    private String previous;
    @JsonProperty("results")
    private List<IndividualPokemanResult> results = null;
    

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
    public String getPrevious() {
        return previous;
    }

    @JsonProperty("previous")
    public void setPrevious(String previous) {
        this.previous = previous;
    }

    @JsonProperty("results")
    public List<IndividualPokemanResult> getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(List<IndividualPokemanResult> results) {
        this.results = results;
    }

    
    public PokemonResponseObject() {
    }
		
	public PokemonResponseObject(Integer count, String next, String previous, List<IndividualPokemanResult> results) {
		super();
		this.count = count;
		this.next = next;
		this.previous = previous;
		this.results = results;
	}

    

}
