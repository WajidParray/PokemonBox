package com.dvt.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;



/**
* This is the DTO or POJO that represents a Pokemon=from Pokemon API with certain features 
*
* @author  Abdul Wajid
*/
@JsonIgnoreProperties(ignoreUnknown = true)
public class Pokemon implements java.io.Serializable {

	@JsonProperty("abilities")
	private List<PokemanAbilityObj> abilities;
	
	@JsonProperty("base_experience")
	private String base_experience;
	
	
	@JsonProperty("height")
	private String height;
	
	
	@JsonProperty("id")
	private int id;
	 
	@JsonProperty("name")
	private String name;
	
	
	@JsonProperty("weight")
	private String weight;
	
	
	
	

	
	public Pokemon() {
		
	}
	
	public Pokemon(int id, String name, String weight, String height, String base_experience, List<PokemanAbilityObj> abilities) {
		super();
		this.id = id;
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.base_experience = base_experience;
		this.abilities = abilities;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getBase_experience() {
		return base_experience;
	}

	public void setBase_experience(String base_experience) {
		this.base_experience = base_experience;
	}

	public List<PokemanAbilityObj> getAbilities() {
		return abilities;
	}

	public void setAbilities(List<PokemanAbilityObj> abilities) {
		this.abilities = abilities;
	}

	@Override
	public String toString() {
		return "Pokemon [id=" + id + ", name=" + name + ", weight=" + weight + ", height=" + height
				+ ", base_experience=" + base_experience + ", abilities=" + abilities + "]";
	}
	

	


	
}
