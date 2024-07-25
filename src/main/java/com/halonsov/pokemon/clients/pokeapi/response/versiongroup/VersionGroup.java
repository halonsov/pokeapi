package com.halonsov.pokemon.clients.pokeapi.response.versiongroup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.generation.Generation;
import com.halonsov.pokemon.clients.pokeapi.response.movelearnmethod.MoveLearnMethod;
import com.halonsov.pokemon.clients.pokeapi.response.pokedex.Pokedex;
import com.halonsov.pokemon.clients.pokeapi.response.region.Region;
import com.halonsov.pokemon.clients.pokeapi.response.version.Version;
import lombok.Data;

import java.util.List;

@Data
public class VersionGroup {
    private Integer id;
    private String name;
    private Integer order;
    private NamedApiResource<Generation> generation;
    private List<NamedApiResource<Pokedex>> pokedexes;
    private List<NamedApiResource<Region>> regions;
    private List<NamedApiResource<Version>> versions;

    @JsonProperty("move_learn_methods")
    private List<NamedApiResource<MoveLearnMethod>> moveLearnMethods;
}
