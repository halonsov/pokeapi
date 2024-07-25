package com.halonsov.pokemon.clients.pokeapi.response.pokemon;

import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.generation.Generation;
import lombok.Data;

import java.util.List;

@Data
public class PokemonTypePast {
    private NamedApiResource<Generation> generation;
    private List<PokemonType> types;
}
