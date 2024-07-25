package com.halonsov.pokemon.clients.pokeapi.response.stat;

import lombok.Data;

import java.util.List;

@Data
public class MoveStatAffectSets {
	private List<MoveStatAffect> increase;
	private List<MoveStatAffect> decrease;
}
