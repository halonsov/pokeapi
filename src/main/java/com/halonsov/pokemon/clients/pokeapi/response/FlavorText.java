package com.halonsov.pokemon.clients.pokeapi.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.language.Language;
import com.halonsov.pokemon.clients.pokeapi.response.version.Version;
import lombok.Data;

@Data
public class FlavorText {
    @JsonProperty("flavor_text")
    private String flavorText;

    private Language language;
    private Version version;
}
