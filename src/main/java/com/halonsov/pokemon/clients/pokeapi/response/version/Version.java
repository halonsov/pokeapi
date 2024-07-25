package com.halonsov.pokemon.clients.pokeapi.response.version;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.Name;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.versiongroup.VersionGroup;
import lombok.Data;

import java.util.List;

@Data
public class Version {
	private Integer id;
	private String name;
	private List<Name> names;

	@JsonProperty("version_group")
	private NamedApiResource<Object> versionGroup;
}
