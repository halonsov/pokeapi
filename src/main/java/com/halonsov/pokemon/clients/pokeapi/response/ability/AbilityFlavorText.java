package com.halonsov.pokemon.clients.pokeapi.response.ability;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.language.Language;
import com.halonsov.pokemon.clients.pokeapi.response.versiongroup.VersionGroup;
import lombok.Data;

@Data
public class AbilityFlavorText {
    private NamedApiResource<Language> language;

    @JsonProperty("version_group")
    private NamedApiResource<VersionGroup> versionGroup;

    @JsonProperty("flavor_text")
    private String flavorText;
}
