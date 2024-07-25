package com.halonsov.pokemon.clients.pokeapi.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.machine.Machine;
import com.halonsov.pokemon.clients.pokeapi.response.versiongroup.VersionGroup;
import lombok.Data;

@Data
public class MachineVersionDetail {
	private ApiResource<Machine> machine;

	@JsonProperty("version_group")
	private NamedApiResource<VersionGroup> versionGroup;
}
