package com.halonsov.pokemon.clients.pokeapi.response.location;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.GenerationGameIndex;
import com.halonsov.pokemon.clients.pokeapi.response.Name;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.locationarea.LocationArea;
import com.halonsov.pokemon.clients.pokeapi.response.region.Region;
import lombok.Data;

import java.util.List;

@Data
public class Location {
    private Integer id;
    private String name;
    private NamedApiResource<Region> region;
    private List<Name> names;
    private List<NamedApiResource<LocationArea>> areas;

    @JsonProperty("game_indices")
    private List<GenerationGameIndex> gameIndices;
}
