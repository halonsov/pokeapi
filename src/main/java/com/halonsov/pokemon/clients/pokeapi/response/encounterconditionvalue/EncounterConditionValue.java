package com.halonsov.pokemon.clients.pokeapi.response.encounterconditionvalue;

import com.halonsov.pokemon.clients.pokeapi.response.Name;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.encountercondition.EncounterCondition;
import lombok.Data;
import java.util.List;

@Data
public class EncounterConditionValue {
    private Integer id;
    private String name;
    private NamedApiResource<EncounterCondition> condition;
    private List<Name> names;
}
