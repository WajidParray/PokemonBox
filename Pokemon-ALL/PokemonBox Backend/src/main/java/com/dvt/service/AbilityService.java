package com.dvt.service;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.dvt.dto.AbilityResponseObject;
import com.dvt.dto.AblePokeman;
import com.dvt.dto.IndividualAbilityResult;

/**
* This is the service class that
* sends REST calls to Pokemon API specific to Abilities and
* caches the response
*
* @author  Abdul Wajid
*/

@Service
public class AbilityService {
	
	private static final Logger log = LoggerFactory.getLogger(PokemonService.class);
	private static final String REST_URI = "https://pokeapi.co/api/v2/";
	
	private Client client = ClientBuilder.newClient();

	/**
	    * Method to fetch all the Abilities available on Pokemon API
	    * @return abilityResponseObjects - A representational Object for Abilities
	    */
	@Cacheable(value = "getAllAbilities")
	public AbilityResponseObject getAllJsonAbilities() {
		AbilityResponseObject abilityResponseObjects;
		AbilityResponseObject initialListOfAbilityResponseObjects = client
				.target(REST_URI) 
				.path("ability/")
				.request(MediaType.APPLICATION_JSON) 
				.get(AbilityResponseObject.class);
		
		log.info("AbilityResponseObject received successfully");
		System.out.println("Number of AbilityResponseObject recieved = "+initialListOfAbilityResponseObjects.getCount().toString());
		
		abilityResponseObjects = client
				.target(REST_URI) 
				.path("ability")
				.queryParam("offset", 0)
				.queryParam("limit", initialListOfAbilityResponseObjects.getCount())
				.request(MediaType.APPLICATION_JSON) 
				.get(AbilityResponseObject.class);
		
		
        
		return abilityResponseObjects;
        
	}
	
	
	/**
	    * Method to fetch all the Abilities available by Name on Pokemon API
	    * @param name - represents the name of an ability
	    * @return listOfPokemonsPerAbility - A list of Abilitiy names
	    */
	public List<String> getAbilityByName(String name) {
		List<String> listOfPokemonsPerAbility = new ArrayList<String>();
		
		IndividualAbilityResult individualAbilityResult = client
				.target(REST_URI) 
				.path("ability/"+name)
				.request(MediaType.APPLICATION_JSON) 
				.get(IndividualAbilityResult.class);
		
	
		System.out.println("Number of Pokemons in " + individualAbilityResult.getName() + " = "+individualAbilityResult.getPokemon().size());
		
		List<AblePokeman> listOfPokemons = individualAbilityResult.getPokemon();
		if(null != listOfPokemons && listOfPokemons.size()>0) {
			for(AblePokeman pkm : listOfPokemons) {
				listOfPokemonsPerAbility.add(pkm.getPokemon().getName());
				
			}
		}
		
		return listOfPokemonsPerAbility;
		
        
	}
	
	
	/**
	    * Method to fetch all the Abilities available by Name on Pokemon API
	    * @param name - represents the name of an ability
	    * @return listOfPokemonsPerAbility - A list of Abilitiy names
	    */
	public void processAbilityResponseObject() {
		AbilityResponseObject abilityResponseObjects = this.getAllJsonAbilities();
		List<IndividualAbilityResult> listOfAbilities = abilityResponseObjects.getResults();
		
		for(IndividualAbilityResult ability : listOfAbilities) {
			System.out.println("Ability Name = "+ability.getName());
			
		}
	}
	


}
