package com.halonsov.pokemon.clients.pokeapi.response.evolutiontrigger;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.Name;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import lombok.Data;

import java.util.List;

@Data
public class EvolutionTrigger {
    private Integer id;
    private String name;
    private List<Name> names;

    @JsonProperty("pokemon_species")
    private List<NamedApiResource<Object>> pokemonSpecies;
}
