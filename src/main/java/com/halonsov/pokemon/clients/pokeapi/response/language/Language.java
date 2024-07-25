package com.halonsov.pokemon.clients.pokeapi.response.language;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.halonsov.pokemon.clients.pokeapi.response.Name;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Language {
    private Integer id;
    private String name;
    private Boolean official;
    private String iso639;
    private String iso3166;
    private List<Name> names;
}
