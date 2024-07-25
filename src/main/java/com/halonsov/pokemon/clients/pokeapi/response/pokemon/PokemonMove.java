package com.halonsov.pokemon.clients.pokeapi.response.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.move.Move;
import lombok.Data;

import java.util.List;

@Data
public class PokemonMove {
	private NamedApiResource<Move> move;

	@JsonProperty("version_group_details")
	private List<PokemonMoveVersion> versionGroupDetails;
}
