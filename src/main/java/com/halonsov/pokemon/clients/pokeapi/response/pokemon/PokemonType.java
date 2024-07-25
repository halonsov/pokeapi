package com.halonsov.pokemon.clients.pokeapi.response.pokemon;

import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.type.Type;
import lombok.Data;

@Data
public class PokemonType {
	private Integer slot;
	private NamedApiResource<Type> type;
}
