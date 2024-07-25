package com.halonsov.pokemon.clients.pokeapi.response.contesttype;

import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.language.Language;
import lombok.Data;

@Data
public class ContestName {
    private String name;
    private String color;
    private NamedApiResource<Language> language;
}
