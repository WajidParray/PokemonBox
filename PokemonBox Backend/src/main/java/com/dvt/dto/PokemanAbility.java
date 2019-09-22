package com.dvt.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
* This is the DTO or POJO to represent second level response for Ability while fetching abilities from Pokemon API 
*
* @author  Abdul Wajid
*/
@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemanAbility implements java.io.Serializable{


@JsonProperty("name")
private String name;

@JsonProperty("url")
private String url;



@JsonProperty("url")
public String getUrl() {
return url;
}

@JsonProperty("url")
public void setId(String url) {
this.url = url;
}


@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}



}
