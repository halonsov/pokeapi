package com.halonsov.pokemon.clients.pokeapi.response.evolutionchain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.pokemonspecies.PokemonSpecies;
import lombok.Data;
import java.util.List;

@Data
public class ChainLink {
    @JsonProperty("is_baby")
    private Boolean isBaby;

    private NamedApiResource<PokemonSpecies> species;

    @JsonProperty("evolution_details")
    private List<EvolutionDetail> evolutionDetails;

    @JsonProperty("evolves_to")
    private List<ChainLink> evolvesTo;

}
