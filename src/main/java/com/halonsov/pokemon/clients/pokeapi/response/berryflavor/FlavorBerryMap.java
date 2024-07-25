package com.halonsov.pokemon.clients.pokeapi.response.berryflavor;

import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.berry.Berry;
import lombok.Data;

@Data
public class FlavorBerryMap {
    private Integer potency;
    private NamedApiResource<Berry> berry;
}
