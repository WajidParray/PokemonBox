package com.dvt.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
* This is the DTO or POJO to represents the individual record  while fetching abilities from Pokemon API 
*
* @author  Abdul Wajid
*/

@JsonIgnoreProperties(ignoreUnknown = true)
public class IndividualAbilityResult implements java.io.Serializable {

@JsonProperty("id")
private Integer id;
@JsonProperty("name")
private String name;

@JsonProperty("pokemon")
private List<AblePokeman> pokemon = null;


@JsonProperty("id")
public Integer getId() {
return id;
}

@JsonProperty("id")
public void setId(Integer id) {
this.id = id;
}


@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}


@JsonProperty("pokemon")
public List<AblePokeman> getPokemon() {
return pokemon;
}

@JsonProperty("pokemon")
public void setPokemon(List<AblePokeman> pokemon) {
this.pokemon = pokemon;
}

}
