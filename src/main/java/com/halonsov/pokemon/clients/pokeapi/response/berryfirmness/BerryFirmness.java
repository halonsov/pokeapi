package com.halonsov.pokemon.clients.pokeapi.response.berryfirmness;

import com.halonsov.pokemon.clients.pokeapi.response.Name;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.berry.Berry;
import lombok.Data;
import java.util.List;

@Data
public class BerryFirmness {
    private Integer id;
    private String name;
    private List<NamedApiResource<Berry>> berries;
    private List<Name> names;
}
