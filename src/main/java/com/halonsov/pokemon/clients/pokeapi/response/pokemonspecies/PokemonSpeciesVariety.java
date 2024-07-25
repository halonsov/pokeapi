package com.halonsov.pokemon.clients.pokeapi.response.pokemonspecies;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.pokemon.Pokemon;
import lombok.Data;

@Data
public class PokemonSpeciesVariety {
	private NamedApiResource<Pokemon> pokemon;

	@JsonProperty("is_default")
	private Boolean isDefault;
}
