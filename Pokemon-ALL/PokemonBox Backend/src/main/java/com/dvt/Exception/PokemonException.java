package com.dvt.Exception;


/**
* This is a runtime exception that can be enhanced to handle the exceptions within Pokemonbox API 
*
* @author  Abdul Wajid
*/
public class PokemonException extends RuntimeException {

    public PokemonException(String message) {
        super(message);
    }
}

