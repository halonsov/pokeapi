package com.halonsov.pokemon.clients.pokeapi.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.language.Language;
import lombok.Data;

@Data
public class VerboseEffect {
    private String effect;
    private NamedApiResource<Language> language;

    @JsonProperty("short_effect")
    private String shortEffect;
}
