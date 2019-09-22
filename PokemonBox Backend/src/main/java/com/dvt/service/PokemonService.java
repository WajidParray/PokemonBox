package com.dvt.service;

import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.dvt.dto.IndividualPokemanResult;
import com.dvt.dto.PokemonResponseObject;

/**
* This is the service class that
* sends REST calls to Pokemon API specific to Pokemons and
* caches the response
*
* @author  Abdul Wajid
*/
@Service
public class PokemonService {
	
	private static final Logger log = LoggerFactory.getLogger(PokemonService.class);
	private static final String REST_URI = "https://pokeapi.co/api/v2/";
	
	private Client client = ClientBuilder.newClient();

	
	@Cacheable(value = "getAllJsonPokemons")
	public PokemonResponseObject getAllJsonPokemons() {
		PokemonResponseObject pkmResponseObjects;
		PokemonResponseObject initialListOfPokemons = client
				.target(REST_URI) 
				.path("pokemon/")
				.request(MediaType.APPLICATION_JSON) 
				.get(PokemonResponseObject.class);
		
		log.info("PokemonResponseObject received successfully");
		System.out.println("Number of Pokemons recieved = "+initialListOfPokemons.getCount().toString());
		
		pkmResponseObjects = client
				.target(REST_URI) 
				.path("pokemon")
				.queryParam("offset", 0)
				.queryParam("limit", initialListOfPokemons.getCount())
				.request(MediaType.APPLICATION_JSON) 
				.get(PokemonResponseObject.class);
		
		
        
		return pkmResponseObjects;
        
	}
	
	public void processPokemonResponseObject() {
		PokemonResponseObject pkmResponseObjects = this.getAllJsonPokemons();
		List<IndividualPokemanResult> listOfPokemons = pkmResponseObjects.getResults();
		
		for(IndividualPokemanResult pkm : listOfPokemons) {
			System.out.println("Pokemon Name = "+pkm.getName());
		}
	}
	
	
	


}
