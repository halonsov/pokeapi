package com.halonsov.pokemon.clients.pokeapi.response.gender;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.pokemonspecies.PokemonSpecies;
import lombok.Data;

import java.util.List;

@Data
public class Gender {
    private Integer id;
    private String name;

    @JsonProperty("pokemon_species_details")
    private List<PokemonSpeciesGender> pokemonSpeciesDetails;

    @JsonProperty("required_for_evolution")
    private List<NamedApiResource<PokemonSpecies>> requiredForEvolution;
}
