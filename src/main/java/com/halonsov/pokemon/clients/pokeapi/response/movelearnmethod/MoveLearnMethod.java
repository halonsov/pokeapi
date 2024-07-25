package com.halonsov.pokemon.clients.pokeapi.response.movelearnmethod;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.Description;
import com.halonsov.pokemon.clients.pokeapi.response.Name;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.versiongroup.VersionGroup;
import lombok.Data;

@Data
public class MoveLearnMethod {
	private Integer id;
	private String name;
	private List<Description> descriptions;
	private List<Name> names;

	@JsonProperty("version_groups")
	private List<NamedApiResource<VersionGroup>> versionGroups;
}
