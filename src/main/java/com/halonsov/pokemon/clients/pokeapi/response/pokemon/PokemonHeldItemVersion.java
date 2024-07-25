package com.halonsov.pokemon.clients.pokeapi.response.pokemon;

import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.version.Version;
import lombok.Data;

@Data
public class PokemonHeldItemVersion {
	private NamedApiResource<Version> version;
	private Integer rarity;
}
