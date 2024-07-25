package com.halonsov.pokemon.clients.pokeapi.response.berryflavor;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.Name;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.contesttype.ContestType;
import lombok.Data;
import java.util.List;

@Data
public class BerryFlavor {
    private Integer id;
    private String name;
    private List<FlavorBerryMap> berries;
    private List<Name> names;

    @JsonProperty("contest_type")
    private NamedApiResource<ContestType> contestType;
}
