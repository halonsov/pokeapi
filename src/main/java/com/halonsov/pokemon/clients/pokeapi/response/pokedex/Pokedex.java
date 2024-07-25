package com.halonsov.pokemon.clients.pokeapi.response.pokedex;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.Description;
import com.halonsov.pokemon.clients.pokeapi.response.Name;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.region.Region;
import com.halonsov.pokemon.clients.pokeapi.response.versiongroup.VersionGroup;
import lombok.Data;

import java.util.List;

@Data
public class Pokedex {
	private Integer id;
	private String name;
	private List<Description> descriptions;
	private List<Name> names;
	private NamedApiResource<Region> region;

	@JsonProperty("is_main_series")
	private Boolean isMainSeries;

	@JsonProperty("pokemon_entries")
	private List<PokemonEntry> pokemonEntries;

	@JsonProperty("version_groups")
	private List<NamedApiResource<VersionGroup>> versionGroups;
}
