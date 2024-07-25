package com.halonsov.pokemon.clients.pokeapi.response.pokemonspecies;

import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.language.Language;
import lombok.Data;

@Data
public class Genus {
	private String genus;
	private NamedApiResource<Language> language;
}
