package com.halonsov.pokemon.controllers;


import com.halonsov.pokemon.clients.pokeapi.PokeApiClient;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResourceList;
import com.halonsov.pokemon.clients.pokeapi.response.PokemonAbilities;
import com.halonsov.pokemon.clients.pokeapi.response.language.Language;
import com.halonsov.pokemon.clients.pokeapi.response.pokemon.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/pokeapi")
public class UtilController {
    @Autowired
    private PokeApiClient pokeApiClient;


    @GetMapping(value = "/language/")
    public ResponseEntity<NamedApiResourceList> getLanguages(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getLanguages(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/language/{idName}/")
    public ResponseEntity<Language> getLanguage(
            @PathVariable("idName") String idName
    ) {
        return new ResponseEntity<>(pokeApiClient.getLanguage(idName), HttpStatus.OK);
    }

    @GetMapping(value = "/pokemon/{idName}/abilities")
    public ResponseEntity<PokemonAbilities> getPokemonAbilities(
            @PathVariable("idName") String idName
    ) {
        Pokemon pokemon = pokeApiClient.getPokemon(idName);
        return new ResponseEntity<>(new PokemonAbilities(
                pokemon.getId(),
                pokemon.getName(),
                pokemon.getAbilities()
        ), HttpStatus.OK);
    }
}
