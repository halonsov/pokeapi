package com.halonsov.pokemon.clients.pokeapi.response.pokemonshape;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.language.Language;
import lombok.Data;

@Data
public class AwesomeName {
	private NamedApiResource<Language> language;

	@JsonProperty("awesome_name")
	private String awesomeName;
}
