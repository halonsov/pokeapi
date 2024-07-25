package com.halonsov.pokemon.clients.pokeapi.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.language.Language;
import com.halonsov.pokemon.clients.pokeapi.response.versiongroup.VersionGroup;
import lombok.Data;

@Data
public class VersionGroupFlavorText {
	private String text;
	private NamedApiResource<Language> language;

	@JsonProperty("version_group")
	private NamedApiResource<VersionGroup> versionGroup;
}
