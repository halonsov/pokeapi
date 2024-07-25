package com.halonsov.pokemon.clients.pokeapi.response.berry;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.berryfirmness.BerryFirmness;
import com.halonsov.pokemon.clients.pokeapi.response.item.Item;
import com.halonsov.pokemon.clients.pokeapi.response.type.Type;
import lombok.Data;

import java.util.List;

@Data
public class Berry {
    private Integer id;
    private String name;

    @JsonProperty("growth_time")
    private Integer growthTime;

    @JsonProperty("max_harvest")
    private Integer maxHarvest;

    @JsonProperty("natural_gift_power")
    private Integer naturalGiftPower;
    private Integer size;
    private Integer smoothness;

    @JsonProperty("soil_dryness")
    private Integer soilDryness;

    private NamedApiResource<BerryFirmness> firmness;
    private List<BerryFlavorMap> flavors;
    private NamedApiResource<Item> item;

    @JsonProperty("natural_gift_type")
    private NamedApiResource<Type> naturalGiftType;
}
