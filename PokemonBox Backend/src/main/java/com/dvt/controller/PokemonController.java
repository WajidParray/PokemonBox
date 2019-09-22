package com.dvt.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Produces;

import org.jsondoc.core.annotation.Api;
import org.jsondoc.core.annotation.ApiMethod;
import org.jsondoc.core.annotation.ApiPathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dvt.dto.AbilityResponseObject;
import com.dvt.dto.IndividualAbilityResult;
import com.dvt.dto.IndividualPokemanResult;
import com.dvt.dto.PokemonResponseObject;
import com.dvt.service.AbilityService;
import com.dvt.service.PokemonService;

/**
* This is the controller that
* sends REST calls to Pokemon API
* to process Pokemons and their abilities.
*
* @author  Abdul Wajid
*/

@RestController
@RequestMapping("/pokemonbox")
@Api(name ="Pokemon API" , description ="This is a RESt API for pokemon")
public class PokemonController {

	@Autowired
    private PokemonService pokemonService;
	
	@Autowired
    private AbilityService abilityService;
	
	
	/**
    * Method to fetch all the Pokemons available on Pokemon API
    * @return listOfAllPokemonsNames- A list of Strings is returned that has all the Pokemon names
    */
    
	@ApiMethod(description = "This is used to get names of all Pokemons")
	@CrossOrigin
	@RequestMapping(value = "/pokemons" , method = RequestMethod.GET)
	 public List<String> getAllPokemonsNames() { 
		List<String> listOfAllPokemonsNames = new ArrayList<String>();
		
		PokemonResponseObject pkmResponseObjects = pokemonService.getAllJsonPokemons();
		List<IndividualPokemanResult> listOfPokemons = pkmResponseObjects.getResults();
		
		for(IndividualPokemanResult pkm : listOfPokemons) {
			listOfAllPokemonsNames.add(pkm.getName());
		}
	
		
		return listOfAllPokemonsNames; 
		 }
	 
	
	/**
	    * Method to fetch all the Abilities available on the Pokemon API
	    * @return listOfAllAbilityNames- A list of Strings is returned that has all the Ability names
	    */
	@ApiMethod(description = "This is used to get names of all Abilities")
	@CrossOrigin
	@RequestMapping(value = "/abilities" , method = RequestMethod.GET)
	 public List<String> getAllAbilityNames() { 
		List<String> listOfAllAbilityNames = new ArrayList<String>();
		
		AbilityResponseObject abilityResponseObject = abilityService.getAllJsonAbilities();
		
		List<IndividualAbilityResult> listOfAbilities = abilityResponseObject.getResults();
		
		for(IndividualAbilityResult ability : listOfAbilities) {
			listOfAllAbilityNames.add(ability.getName());
			
		}
	
		
		return listOfAllAbilityNames; 
		 }
	 
	

	/**
    * Method to fetch all the Pokemons available on Pokemon API
    * @param name - represents the name of the activity
    * @return listOfPokemonsPerAbility- A list of Strings is returned that has all the Pokemon names
    */
	 @ApiMethod(description = "This is used to get names of all Pokemons who have the given ability")
	 @CrossOrigin
	 @RequestMapping(value = "/abilities/{name}" , method = RequestMethod.GET)
	 public  List<String> getAllPokemons(@ApiPathParam(name="name") @PathVariable String name) { 
		 List<String> listOfPokemonsPerAbility = new ArrayList<String>();
		 listOfPokemonsPerAbility =  abilityService.getAbilityByName(name);
		 return listOfPokemonsPerAbility; 
		 
	 }
	 
}
