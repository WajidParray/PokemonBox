package com.dvt;
import org.jsondoc.spring.boot.starter.EnableJSONDoc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dvt.service.AbilityService;
import com.dvt.service.PokemonService;


/**
* This is the starting class for the PokemonBox API.
* It bootstraps various methods on startup, calls Pokemon API and caches the important calls.
*
* @author  Abdul Wajid
*/
@SpringBootApplication
@EnableJSONDoc
public class PokemonBoxApplication implements CommandLineRunner{
	
	private static final Logger log = LoggerFactory.getLogger(PokemonBoxApplication.class);
	
	@Autowired
    private PokemonService pokemonService;
	
	@Autowired
    private AbilityService abilityService;
	
	
	/**
	    * Main Method to bootstrap the application in Spring Boot
	    */
	    
	public static void main(String[] args) {
		SpringApplication.run(PokemonBoxApplication.class, args);
	}

	
	/**
	    * Method to start-off various services within the Pokemonbox application
	    */
	    
	@Override
	public void run(String... args) throws Exception {
		

		log.info("****** Initializing the App *******");
		
		pokemonService.processPokemonResponseObject();
		abilityService.processAbilityResponseObject();
		
		log.info("****** App Initialized *******");
		
	
	}
	
	

}
