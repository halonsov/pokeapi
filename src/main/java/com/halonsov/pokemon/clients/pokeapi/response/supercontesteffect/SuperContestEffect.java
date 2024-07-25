package com.halonsov.pokemon.clients.pokeapi.response.supercontesteffect;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.FlavorText;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.move.Move;
import lombok.Data;


@Data
public class SuperContestEffect {
	private Integer id;
	private Integer appeal;
	private List<NamedApiResource<Move>> moves;

	@JsonProperty("flavor_text_entries")
	private List<FlavorText> flavorTextEntries;
}
