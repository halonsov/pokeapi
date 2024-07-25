package com.halonsov.pokemon.clients.pokeapi.response.berry;

import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.berryflavor.BerryFlavor;
import lombok.Data;

@Data
public class BerryFlavorMap {
    private Integer potency;
    private NamedApiResource<BerryFlavor> flavor;
}
