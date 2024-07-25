package com.halonsov.pokemon.clients.pokeapi.response.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.Name;
import com.halonsov.pokemon.clients.pokeapi.response.nature.NaturePokeathlonStatAffectSets;
import lombok.Data;

import java.util.List;

@Data
public class PokeathlonStat {
    private Integer id;
    private String name;
    private List<Name> names;

    @JsonProperty("affecting_natures")
    private NaturePokeathlonStatAffectSets affectingNatures;
}
