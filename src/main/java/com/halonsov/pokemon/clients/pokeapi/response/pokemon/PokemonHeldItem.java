package com.halonsov.pokemon.clients.pokeapi.response.pokemon;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.item.Item;
import lombok.Data;

@Data
public class PokemonHeldItem {
	private NamedApiResource<Item> item;

	@JsonProperty("version_details")
	private List<PokemonHeldItemVersion> versionDetails;
}
