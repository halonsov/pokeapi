package com.halonsov.pokemon.clients.pokeapi.response.nature;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import lombok.Data;

@Data
public class NaturePokeathlonStatAffect {
    @JsonProperty("max_change")
    private Integer maxChange;

    private NamedApiResource<Nature>  nature;
}
