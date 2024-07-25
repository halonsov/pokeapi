package com.halonsov.pokemon.clients.pokeapi.response.gender;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.pokemonspecies.PokemonSpecies;
import lombok.Data;

@Data
public class PokemonSpeciesGender {
    private Integer rate;

    @JsonProperty("pokemon_species")
    private NamedApiResource<PokemonSpecies> pokemonSpecies;
}
