package com.halonsov.pokemon.clients.pokeapi.response;

import lombok.Data;

@Data
public class Name {
    private String name;
    private NamedApiResource language;
}
