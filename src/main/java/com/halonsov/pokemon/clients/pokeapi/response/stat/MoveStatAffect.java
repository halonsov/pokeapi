package com.halonsov.pokemon.clients.pokeapi.response.stat;

import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.move.Move;
import lombok.Data;

@Data
public class MoveStatAffect {
	private Integer change;
	private NamedApiResource<Move> move;
}
