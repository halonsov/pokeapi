package com.halonsov.pokemon.clients.pokeapi.response.ability;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.Effect;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.versiongroup.VersionGroup;
import lombok.Data;

import java.util.List;

@Data
public class AbilityEffectChange {
    @JsonProperty("effect_entries")
    private List<Effect> effectEntries;

    @JsonProperty("version_group")
    private NamedApiResource<VersionGroup> versionGroup;
}
