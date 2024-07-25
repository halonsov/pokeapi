package com.halonsov.pokemon.clients.pokeapi.response;

import com.halonsov.pokemon.clients.pokeapi.response.language.Language;
import lombok.Data;

@Data
public class Effect {
    private String effect;
    private NamedApiResource<Language> language;
}
