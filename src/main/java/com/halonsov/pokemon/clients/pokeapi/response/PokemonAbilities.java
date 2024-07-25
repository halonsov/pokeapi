package com.halonsov.pokemon.clients.pokeapi.response;

import com.halonsov.pokemon.clients.pokeapi.response.pokemon.PokemonAbility;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class PokemonAbilities {
    private Integer id;
    private String name;
    private List<PokemonAbility> abilities;
}
