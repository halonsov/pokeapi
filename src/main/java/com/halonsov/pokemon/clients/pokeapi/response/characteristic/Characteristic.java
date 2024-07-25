package com.halonsov.pokemon.clients.pokeapi.response.characteristic;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.Description;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.language.Language;
import com.halonsov.pokemon.clients.pokeapi.response.stat.Stat;
import lombok.Data;

import java.util.List;

@Data
public class Characteristic {
    private Integer id;
    private List<Description> descriptions;

    @JsonProperty("gene_modulo")
    private Integer geneModulo;

    @JsonProperty("possible_values")
    private List<Integer> possibleValues;

    @JsonProperty("highest_stat")
    private NamedApiResource<Stat> highestStat;
}
