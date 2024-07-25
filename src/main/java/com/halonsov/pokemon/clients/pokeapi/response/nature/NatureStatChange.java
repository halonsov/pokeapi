package com.halonsov.pokemon.clients.pokeapi.response.nature;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.pokemon.PokeathlonStat;
import lombok.Data;

@Data
public class NatureStatChange {
    @JsonProperty("max_change")
    private Integer maxChange;

    @JsonProperty("pokeathlon_stat")
    private NamedApiResource<PokeathlonStat> pokeathlonStat;

}
