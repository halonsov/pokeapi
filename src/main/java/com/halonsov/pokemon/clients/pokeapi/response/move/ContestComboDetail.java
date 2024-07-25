package com.halonsov.pokemon.clients.pokeapi.response.move;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import lombok.Data;

@Data
public class ContestComboDetail {
	@JsonProperty("use_before")
	private List<NamedApiResource<Move>> userBefore;

	@JsonProperty("use_after")
	private List<NamedApiResource<Move>> userAfter;
}
