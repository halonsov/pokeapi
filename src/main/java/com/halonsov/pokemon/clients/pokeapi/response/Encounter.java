package com.halonsov.pokemon.clients.pokeapi.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.encounterconditionvalue.EncounterConditionValue;
import com.halonsov.pokemon.clients.pokeapi.response.encountermethod.EncounterMethod;
import lombok.Data;

import java.util.List;

@Data
public class Encounter {
	private Integer chance;
	private NamedApiResource<EncounterMethod> method;

	@JsonProperty("condition_values")
	private List<NamedApiResource<EncounterConditionValue>> conditionValues;

	@JsonProperty("max_level")
	private Integer maxLevel;

	@JsonProperty("min_level")
	private Integer minLevel;
}
