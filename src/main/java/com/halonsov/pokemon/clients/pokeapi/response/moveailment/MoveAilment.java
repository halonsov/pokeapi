package com.halonsov.pokemon.clients.pokeapi.response.moveailment;

import com.halonsov.pokemon.clients.pokeapi.response.Name;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.move.Move;
import lombok.Data;

import java.util.List;

@Data
public class MoveAilment {
	private Integer id;
	private String name;
	private List<NamedApiResource<Move>> moves;
	private List<Name> names;
}
