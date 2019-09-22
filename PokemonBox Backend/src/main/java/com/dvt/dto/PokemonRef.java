package com.dvt.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
* This is the DTO or POJO that represents a Pokemon with name and URL to individual REST calls 
*
* @author  Abdul Wajid
*/

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonRef implements java.io.Serializable {
	
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
	
	
}
