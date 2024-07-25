package com.halonsov.pokemon.clients.pokeapi.response.move;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.VerboseEffect;
import com.halonsov.pokemon.clients.pokeapi.response.type.Type;
import com.halonsov.pokemon.clients.pokeapi.response.versiongroup.VersionGroup;
import lombok.Data;

import java.util.List;

@Data
public class PastMoveStatValues {
	private Integer accuracy;
	private Integer power;
	private Integer pp;
	private NamedApiResource<Type> type;

	@JsonProperty("effect_chance")
	private Integer effectChance;

	@JsonProperty("effect_entries")
	private List<VerboseEffect> effectEntries;

	@JsonProperty("version_group")
	private NamedApiResource<VersionGroup> versionGroup;
}
