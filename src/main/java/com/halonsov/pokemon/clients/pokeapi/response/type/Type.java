package com.halonsov.pokemon.clients.pokeapi.response.type;

import com.halonsov.pokemon.clients.pokeapi.response.GenerationGameIndex;
import com.halonsov.pokemon.clients.pokeapi.response.Name;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.generation.Generation;
import com.halonsov.pokemon.clients.pokeapi.response.move.Move;
import com.halonsov.pokemon.clients.pokeapi.response.movedamageclass.MoveDamageClass;
import lombok.Data;

import java.util.List;

@Data
public class Type {
    private Integer id;
    private String name;
    private TypeRelations damageRelations;
    private List<TypeRelationsPast> pastDamageRelations;
    private List<GenerationGameIndex> gameIndices;
    private NamedApiResource<Generation> generation;
    private NamedApiResource<MoveDamageClass> moveDamageClass;
    private List<Name> names;
    private List<TypePokemon> pokemon;
    private List<NamedApiResource<Move>> moves;
}
