package com.halonsov.pokemon.clients.pokeapi.response.encountercondition;

import com.halonsov.pokemon.clients.pokeapi.response.Name;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.encounterconditionvalue.EncounterConditionValue;
import lombok.Data;
import java.util.List;

@Data
public class EncounterCondition {
    private Integer id;
    private String name;
    private List<Name> names;
    private List<NamedApiResource<EncounterConditionValue>> values;
}
