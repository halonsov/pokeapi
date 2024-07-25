package com.halonsov.pokemon.clients.pokeapi.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.version.Version;
import lombok.Data;

@Data
public class VersionGameIndex {
	private NamedApiResource<Version> version;

	@JsonProperty("game_index")
	private Integer gameIndex;

}
