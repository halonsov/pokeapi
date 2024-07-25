package com.halonsov.pokemon.clients.pokeapi.response.type;

import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.generation.Generation;
import lombok.Data;

@Data
public class TypeRelationsPast {
    private NamedApiResource<Generation> generation;
    private TypeRelations damageRelations;
}
