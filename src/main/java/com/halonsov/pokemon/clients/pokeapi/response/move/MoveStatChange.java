package com.halonsov.pokemon.clients.pokeapi.response.move;

import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.stat.Stat;
import lombok.Data;

@Data
public class MoveStatChange {
	private Integer change;
	private NamedApiResource<Stat> stat;
}
