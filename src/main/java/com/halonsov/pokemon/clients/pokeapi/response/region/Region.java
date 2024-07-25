package com.halonsov.pokemon.clients.pokeapi.response.region;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.Name;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.generation.Generation;
import com.halonsov.pokemon.clients.pokeapi.response.location.Location;
import com.halonsov.pokemon.clients.pokeapi.response.pokedex.Pokedex;
import com.halonsov.pokemon.clients.pokeapi.response.versiongroup.VersionGroup;
import lombok.Data;

import java.util.List;

@Data
public class Region {
	private Integer id;
	private List<NamedApiResource<Location>> locations;
	private String name;
	private List<Name> names;
	private List<NamedApiResource<Pokedex>> pokedexes;

	@JsonProperty("main_generation")
	private NamedApiResource<Generation> mainGeneration;

	@JsonProperty("version_groups")
	private List<NamedApiResource<VersionGroup>> versionGroups;
}
