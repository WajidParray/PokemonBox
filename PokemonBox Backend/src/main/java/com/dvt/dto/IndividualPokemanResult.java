package com.dvt.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
* This is the DTO or POJO to represents the individual record =while fetching Pokemons from Pokemon API 
*
* @author  Abdul Wajid
*/

@JsonIgnoreProperties(ignoreUnknown = true)
public class IndividualPokemanResult implements java.io.Serializable{

    @JsonProperty("name")
    private String name;
    @JsonProperty("url")
    private String url;
    
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    

	public IndividualPokemanResult() {
		
	
		
		
	}
	public IndividualPokemanResult(String name, String url) {
		super();
		this.name = name;
		this.url = url;
	}

    
   

}
