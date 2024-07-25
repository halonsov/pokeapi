package com.halonsov.pokemon.clients.pokeapi.response.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.VersionGameIndex;
import com.halonsov.pokemon.clients.pokeapi.response.pokemonform.PokemonForm;
import com.halonsov.pokemon.clients.pokeapi.response.pokemonspecies.PokemonSpecies;
import lombok.Data;

import java.util.List;

@Data
public class Pokemon {
    private Integer id;
    private String name;
    private Integer height;
    private Integer order;
    private Integer weight;
    private List<PokemonAbility> abilities;
    private List<NamedApiResource<PokemonForm>> forms;
    private List<PokemonMove> moves;
    private PokemonSprites sprites;
    private NamedApiResource<PokemonSpecies> species;
    private List<PokemonStat> stats;
    private List<PokemonType> types;
    private Object cries;

    @JsonProperty("past_abilities")
    private List<Object> pastAbilities;

    @JsonProperty("base_experience")
    private Integer baseExperience;

    @JsonProperty("is_default")
    private Boolean isDefault;

    @JsonProperty("game_indices")
    private List<VersionGameIndex> gameIndices;

    @JsonProperty("held_items")
    private List<PokemonHeldItem> heldItems;

    @JsonProperty("location_area_encounters")
    private String locationAreaEncounters;

    @JsonProperty("past_types")
    private List<PokemonTypePast> pastTypes;


}
