package com.halonsov.pokemon.clients.pokeapi.response.move;

import com.halonsov.pokemon.clients.pokeapi.response.Name;
import lombok.Data;

import java.util.List;

@Data
public class MoveBattleStyle {
    private Integer id;
    private String name;
    private List<Name> names;
}
