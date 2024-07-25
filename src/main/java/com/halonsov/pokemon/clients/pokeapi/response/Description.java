package com.halonsov.pokemon.clients.pokeapi.response;


import com.halonsov.pokemon.clients.pokeapi.response.language.Language;
import lombok.Data;

@Data
public class Description {
	private String description;
	private NamedApiResource<Language> language;
}
