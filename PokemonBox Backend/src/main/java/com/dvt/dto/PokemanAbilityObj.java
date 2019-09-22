package com.dvt.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
* This is the DTO or POJO to represent second level response for Ability while fetching abilities from Pokemon API 
*
* @author  Abdul Wajid
*/

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemanAbilityObj implements java.io.Serializable {


	
@JsonProperty("ability")
private PokemanAbility ability;

	
@JsonProperty("is_hidden")
private boolean is_hidden;

@JsonProperty("slot")
private int slot;

public PokemanAbility getAbility() {
	return ability;
}

public void setAbility(PokemanAbility ability) {
	this.ability = ability;
}

public boolean getIs_hidden() {
	return is_hidden;
}

public void setIs_hidden(boolean is_hidden) {
	this.is_hidden = is_hidden;
}

public int getSlot() {
	return slot;
}

public void setSlot(int slot) {
	this.slot = slot;
}


}
