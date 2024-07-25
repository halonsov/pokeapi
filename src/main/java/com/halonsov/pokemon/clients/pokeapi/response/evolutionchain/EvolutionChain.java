package com.halonsov.pokemon.clients.pokeapi.response.evolutionchain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.item.Item;
import lombok.Data;

@Data
public class EvolutionChain {
    private Integer id;
    private ChainLink chain;

    @JsonProperty("baby_trigger_item")
    private NamedApiResource<Item> item;
}
