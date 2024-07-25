package com.halonsov.pokemon.controllers;


import com.halonsov.pokemon.clients.pokeapi.PokeApiClient;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResourceList;
import com.halonsov.pokemon.clients.pokeapi.response.generation.Generation;
import com.halonsov.pokemon.clients.pokeapi.response.pokedex.Pokedex;
import com.halonsov.pokemon.clients.pokeapi.response.version.Version;
import com.halonsov.pokemon.clients.pokeapi.response.versiongroup.VersionGroup;
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
public class GamesController {
    @Autowired
    private PokeApiClient pokeApiClient;

    @GetMapping(value = "/generation/")
    public ResponseEntity<NamedApiResourceList> getGenerations(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getGenerations(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/generation/{idName}/")
    public ResponseEntity<Generation> getGeneration(
            @PathVariable("idName") String idName
    ) {
        return new ResponseEntity<>(pokeApiClient.getGeneration(idName), HttpStatus.OK);
    }

    @GetMapping(value = "/pokedex/")
    public ResponseEntity<NamedApiResourceList> getPokedexs(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getPokedexs(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/pokedex/{idName}/")
    public ResponseEntity<Pokedex> getPokedex(
            @PathVariable("idName") String idName
    ) {
        return new ResponseEntity<>(pokeApiClient.getPokedex(idName), HttpStatus.OK);
    }

    @GetMapping(value = "/version/")
    public ResponseEntity<NamedApiResourceList> getVersions(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getVersions(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/version/{idName}/")
    public ResponseEntity<Version> getVersion(
            @PathVariable("idName") String idName
    ) {
        return new ResponseEntity<>(pokeApiClient.getVersion(idName), HttpStatus.OK);
    }

    @GetMapping(value = "/version-group/")
    public ResponseEntity<NamedApiResourceList> getVersionsGroup(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getVersionsGroup(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/version-group/{idName}/")
    public ResponseEntity<VersionGroup> getVersionGroup(
            @PathVariable("idName") String idName
    ) {
        return new ResponseEntity<>(pokeApiClient.getVersionGroup(idName), HttpStatus.OK);
    }
}
