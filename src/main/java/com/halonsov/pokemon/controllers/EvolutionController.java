package com.halonsov.pokemon.controllers;


import com.halonsov.pokemon.clients.pokeapi.PokeApiClient;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResourceList;
import com.halonsov.pokemon.clients.pokeapi.response.evolutionchain.EvolutionChain;
import com.halonsov.pokemon.clients.pokeapi.response.evolutiontrigger.EvolutionTrigger;
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
public class EvolutionController {
    @Autowired
    private PokeApiClient pokeApiClient;

    @GetMapping(value = "/evolution-chain/")
    public ResponseEntity<NamedApiResourceList> getEvolutionsChain(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getEvolutionsChain(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/evolution-chain/{id}/")
    public ResponseEntity<EvolutionChain> getEvolutionChain(
            @PathVariable("id") Integer id
    ) {
        return new ResponseEntity<>(pokeApiClient.getEvolutionChain(id), HttpStatus.OK);
    }

    @GetMapping(value = "/evolution-trigger/")
    public ResponseEntity<NamedApiResourceList> getEvolutionsTrigger(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getEvolutionsTrigger(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/evolution-trigger/{idName}/")
    public ResponseEntity<EvolutionTrigger> getEvolutionTrigger(
            @PathVariable("idName") String idName
    ) {
        return new ResponseEntity<>(pokeApiClient.getEvolutionTrigger(idName), HttpStatus.OK);
    }
}
