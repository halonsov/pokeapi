package com.halonsov.pokemon.clients.pokeapi.response.ability;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.Name;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.VerboseEffect;
import com.halonsov.pokemon.clients.pokeapi.response.generation.Generation;
import lombok.Data;
import java.util.List;

@Data
public class Ability {
    private Integer id;
    private String name;
    private NamedApiResource<Generation> generation;
    private List<Name> names;
    private List<AbilityPokemon> pokemon;

    @JsonProperty("is_main_series")
    private Boolean isMainSeries;

    @JsonProperty("effect_entries")
    private List<VerboseEffect> effectEntries;

    @JsonProperty("effect_changes")
    private List<AbilityEffectChange> effectChanges;

    @JsonProperty("flavor_text_entries")
    private List<AbilityFlavorText> flavorTextEntries;

}
