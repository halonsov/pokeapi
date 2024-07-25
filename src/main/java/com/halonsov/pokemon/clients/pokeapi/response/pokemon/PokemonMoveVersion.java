package com.halonsov.pokemon.clients.pokeapi.response.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.movelearnmethod.MoveLearnMethod;
import com.halonsov.pokemon.clients.pokeapi.response.versiongroup.VersionGroup;
import lombok.Data;

@Data
public class PokemonMoveVersion {
	@JsonProperty("move_learn_method")
	private NamedApiResource<MoveLearnMethod> moveLearnMethod;

	@JsonProperty("version_group")
	private NamedApiResource<VersionGroup> versionGroup;

	@JsonProperty("level_learned_at")
	private Integer levelLearnedAt;
}
