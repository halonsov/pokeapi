package com.halonsov.pokemon.clients.pokeapi.response.locationarea;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import lombok.Data;

import java.util.List;

@Data
public class LocationAreaEncounter {
    @JsonProperty("location_area")
    private NamedApiResource<LocationArea> locationArea;

    @JsonProperty("version_details")
    private List<Object> versionDetails;
}
