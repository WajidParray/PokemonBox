package com.dvt.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
* This is the DTO or POJO to represent second level response for Pokemon while fetching abilities from Pokemon API 
*
* @author  Abdul Wajid
*/
@JsonIgnoreProperties(ignoreUnknown = true)
public class AblePokeman implements java.io.Serializable {
	
	@JsonProperty("pokemon")
	private PokemonRef pokemon;
	
	
	@JsonProperty("pokemon")
	public PokemonRef getPokemon() {
	return pokemon;
	}
	
	@JsonProperty("pokemon")
	public void setPokemon(PokemonRef pokemon) {
	this.pokemon = pokemon;
	}
	
	
}
