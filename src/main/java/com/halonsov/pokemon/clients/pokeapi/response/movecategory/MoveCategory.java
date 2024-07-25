package com.halonsov.pokemon.clients.pokeapi.response.movecategory;

import java.util.List;

import com.halonsov.pokemon.clients.pokeapi.response.Description;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.move.Move;
import lombok.Data;

@Data
public class MoveCategory {
	private Integer id;
	private String name;
	private List<NamedApiResource<Move>> moves;
	private List<Description> descriptions;
}
