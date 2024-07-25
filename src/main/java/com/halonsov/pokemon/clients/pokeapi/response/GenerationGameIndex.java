package com.halonsov.pokemon.clients.pokeapi.response;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.generation.Generation;
import lombok.Data;

@Data
public class GenerationGameIndex {
	@JsonProperty("game_index")
	private Integer gameIndex;

	private NamedApiResource<Generation> generation;
}
