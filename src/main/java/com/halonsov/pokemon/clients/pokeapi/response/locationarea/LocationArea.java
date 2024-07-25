package com.halonsov.pokemon.clients.pokeapi.response.locationarea;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.Name;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.location.Location;
import lombok.Data;

import java.util.List;

@Data
public class LocationArea {
	private Integer id;
	private String name;
	private NamedApiResource<Location> location;
	private List<Name> names;

	@JsonProperty("encounter_method_rates")
	private List<EncounterMethodRate> encounterMethodRates;

	@JsonProperty("game_index")
	private Integer gameIndex;

	@JsonProperty("pokemon_encounters")
	private List<PokemonEncounter> pokemonEncounters;
}
