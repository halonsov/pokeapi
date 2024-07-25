package com.halonsov.pokemon.clients.pokeapi.response.generation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.Name;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.ability.Ability;
import com.halonsov.pokemon.clients.pokeapi.response.move.Move;
import com.halonsov.pokemon.clients.pokeapi.response.pokemonspecies.PokemonSpecies;
import com.halonsov.pokemon.clients.pokeapi.response.type.Type;
import com.halonsov.pokemon.clients.pokeapi.response.versiongroup.VersionGroup;
import lombok.Data;

import java.util.List;

@Data
public class Generation {
    private Integer id;
    private String name;
    private List<NamedApiResource<Ability>> abilities;
    private List<Name> names;
    private List<NamedApiResource<Move>> moves;

    @JsonProperty("pokemon_species")
    private List<NamedApiResource<Object>> pokemonSpecies;

    private List<NamedApiResource<Object>> types;

    @JsonProperty("version_groups")
    private List<NamedApiResource<Object>> versionGroups;
}
