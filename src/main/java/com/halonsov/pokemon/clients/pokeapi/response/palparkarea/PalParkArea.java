package com.halonsov.pokemon.clients.pokeapi.response.palparkarea;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.Name;
import lombok.Data;

import java.util.List;

@Data
public class PalParkArea {
    private Integer id;
    private String name;
    private List<Name> names;

    @JsonProperty("pokemon_encounters")
    private List<PalParkEncounterSpecies> pokemonEncounters;
}
