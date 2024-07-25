package com.halonsov.pokemon.clients.pokeapi.response.item;

import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.version.Version;
import lombok.Data;

@Data
public class ItemHolderPokemonVersionDetail {
	private Integer rarity;
	private NamedApiResource<Version> version;
}
