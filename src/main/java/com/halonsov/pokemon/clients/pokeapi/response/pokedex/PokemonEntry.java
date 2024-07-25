package com.halonsov.pokemon.clients.pokeapi.response.pokedex;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.pokemonspecies.PokemonSpecies;
import lombok.Data;

@Data
public class PokemonEntry {
	@JsonProperty("entry_number")
	private Integer entryNumber;

	@JsonProperty("pokemon_species")
	private NamedApiResource<Object> pokemonSpecies;
}
