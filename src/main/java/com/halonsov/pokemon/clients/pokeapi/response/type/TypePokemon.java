package com.halonsov.pokemon.clients.pokeapi.response.type;

import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.pokemon.Pokemon;
import lombok.Data;

@Data
public class TypePokemon {
	private Integer slot;
	private NamedApiResource<Pokemon> pokemon;
}
