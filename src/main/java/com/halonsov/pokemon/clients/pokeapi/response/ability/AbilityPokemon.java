package com.halonsov.pokemon.clients.pokeapi.response.ability;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.pokemon.Pokemon;
import lombok.Data;

@Data
public class AbilityPokemon {
    private Integer slot;
    private NamedApiResource<Pokemon> pokemon;

    @JsonProperty("is_hidden")
    private Boolean isHidden;

}
