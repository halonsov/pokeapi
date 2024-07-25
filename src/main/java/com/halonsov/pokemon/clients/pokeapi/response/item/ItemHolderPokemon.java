package com.halonsov.pokemon.clients.pokeapi.response.item;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.pokemon.Pokemon;
import lombok.Data;

import java.util.List;

@Data
public class ItemHolderPokemon {
	private NamedApiResource<Pokemon> pokemon;

	@JsonProperty("version_details")
	private List<ItemHolderPokemonVersionDetail> versionDetails;
}
