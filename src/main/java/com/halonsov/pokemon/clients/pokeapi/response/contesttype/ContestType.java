package com.halonsov.pokemon.clients.pokeapi.response.contesttype;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.berryflavor.BerryFlavor;
import lombok.Data;
import java.util.List;

@Data
public class ContestType {
    private Integer id;
    private String name;
    private List<ContestName> names;

    @JsonProperty("berry_flavor")
    private NamedApiResource<BerryFlavor> berryFlavor;
}
