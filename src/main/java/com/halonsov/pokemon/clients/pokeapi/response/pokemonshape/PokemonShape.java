package com.halonsov.pokemon.clients.pokeapi.response.pokemonshape;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.Name;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.pokemonspecies.PokemonSpecies;
import lombok.Data;

@Data
public class PokemonShape {
	private Integer id;
	private String name;
	private List<Name> names;

	@JsonProperty("awesome_names")
	private List<AwesomeName> awesomeNames;

	@JsonProperty("pokemon_species")
	private List<NamedApiResource<PokemonSpecies>> pokemonSpecies;
}
