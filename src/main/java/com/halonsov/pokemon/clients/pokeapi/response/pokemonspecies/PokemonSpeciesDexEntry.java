package com.halonsov.pokemon.clients.pokeapi.response.pokemonspecies;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.pokedex.Pokedex;
import lombok.Data;

@Data
public class PokemonSpeciesDexEntry {
	private NamedApiResource<Pokedex> pokedex;

	@JsonProperty("entry_number")
	private Integer entryNumber;

}
