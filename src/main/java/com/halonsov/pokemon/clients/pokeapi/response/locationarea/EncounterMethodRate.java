package com.halonsov.pokemon.clients.pokeapi.response.locationarea;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.encountermethod.EncounterMethod;
import lombok.Data;

@Data
public class EncounterMethodRate {
	@JsonProperty("encounter_method")
	private NamedApiResource<EncounterMethod> encounterMethod;

	@JsonProperty("version_details")
	private List<EncounterVersionDetails> versionDetails;
}
