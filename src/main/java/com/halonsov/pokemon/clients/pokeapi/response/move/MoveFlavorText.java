package com.halonsov.pokemon.clients.pokeapi.response.move;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.language.Language;
import com.halonsov.pokemon.clients.pokeapi.response.versiongroup.VersionGroup;
import lombok.Data;

@Data
public class MoveFlavorText {
	private NamedApiResource<Language> language;

	@JsonProperty("flavor_text")
	private String flavorText;

	@JsonProperty("version_group")
	private NamedApiResource<VersionGroup> versionGroup;
}
