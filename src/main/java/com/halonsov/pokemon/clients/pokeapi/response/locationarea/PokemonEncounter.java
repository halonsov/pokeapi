package com.halonsov.pokemon.clients.pokeapi.response.locationarea;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.VersionEncounterDetail;
import com.halonsov.pokemon.clients.pokeapi.response.pokemon.Pokemon;
import lombok.Data;

import java.util.List;

@Data
public class PokemonEncounter {
	private NamedApiResource<Pokemon> pokemon;

	@JsonProperty("version_details")
	private List<VersionEncounterDetail> versionDetails;
}
