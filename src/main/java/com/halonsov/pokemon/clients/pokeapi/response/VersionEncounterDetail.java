package com.halonsov.pokemon.clients.pokeapi.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.version.Version;
import lombok.Data;

import java.util.List;


@Data
public class VersionEncounterDetail {
	private NamedApiResource<Version> version;


	@JsonProperty("max_chance")
	private Integer maxChance;

	@JsonProperty("encounter_details")
	private List<Encounter> encounterDetails;
}
