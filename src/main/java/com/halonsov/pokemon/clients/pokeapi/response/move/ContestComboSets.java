package com.halonsov.pokemon.clients.pokeapi.response.move;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ContestComboSets {
	private ContestComboDetail normal;

	@JsonProperty("super")
	private ContestComboDetail superb;
}
