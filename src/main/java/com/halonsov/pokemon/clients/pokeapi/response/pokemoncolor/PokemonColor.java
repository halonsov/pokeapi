package com.halonsov.pokemon.clients.pokeapi.response.pokemoncolor;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.Name;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.pokemonspecies.PokemonSpecies;
import lombok.Data;

import java.util.List;

@Data
public class PokemonColor {
	private Integer id;
	private String name;
	private List<Name> names;

	@JsonProperty("pokemon_species")
	private List<NamedApiResource<PokemonSpecies>> pokemonSpecies;
}
