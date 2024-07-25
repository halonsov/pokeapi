package com.halonsov.pokemon.clients.pokeapi.response.encountermethod;

import com.halonsov.pokemon.clients.pokeapi.response.Name;
import lombok.Data;
import java.util.List;

@Data
public class EncounterMethod {
    private Integer id;
    private String name;
    private Integer order;
    private List<Name> names;
}
