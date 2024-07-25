package com.halonsov.pokemon.clients.pokeapi.response.movedamageclass;

import com.halonsov.pokemon.clients.pokeapi.response.Description;
import com.halonsov.pokemon.clients.pokeapi.response.Name;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.move.Move;
import lombok.Data;

import java.util.List;

@Data
public class MoveDamageClass {
	private Integer id;
	private String name;
	private List<Description> descriptions;
	private List<NamedApiResource<Move>> moves;
	private List<Name> names;
}
