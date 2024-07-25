package com.halonsov.pokemon.clients.pokeapi.response.palparkarea;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.pokemonspecies.PokemonSpecies;
import lombok.Data;

@Data
public class PalParkEncounterSpecies {
    private Integer rate;

    @JsonProperty("base_score")
    private Integer baseScore;

    @JsonProperty("pokemon_species")
    private NamedApiResource<PokemonSpecies> pokemonSpecies;
}
