package com.halonsov.pokemon.controllers;


import com.halonsov.pokemon.clients.pokeapi.PokeApiClient;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResourceList;
import com.halonsov.pokemon.clients.pokeapi.response.contesteffect.ContestEffect;
import com.halonsov.pokemon.clients.pokeapi.response.contesttype.ContestType;
import com.halonsov.pokemon.clients.pokeapi.response.supercontesteffect.SuperContestEffect;
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
public class ContestController {
    @Autowired
    private PokeApiClient pokeApiClient;

    @GetMapping(value = "/contest-type/")
    public ResponseEntity<NamedApiResourceList> getContestsType(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getContestsType(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/contest-type/{idName}/")
    public ResponseEntity<ContestType> getContestType(
            @PathVariable("idName") String idName
    ) {
        return new ResponseEntity<>(pokeApiClient.getContestType(idName), HttpStatus.OK);
    }

    @GetMapping(value = "/contest-effect/")
    public ResponseEntity<NamedApiResourceList> getContestsEffect(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getContestsEffect(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/contest-effect/{id}/")
    public ResponseEntity<ContestEffect> getContestEffect(
            @PathVariable("id") Integer id
    ) {
        return new ResponseEntity<>(pokeApiClient.getContestEffect(id), HttpStatus.OK);
    }

    @GetMapping(value = "/super-contest-effect/")
    public ResponseEntity<NamedApiResourceList> getSuperContestsEffect(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getSuperContestsEffect(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/super-contest-effect/{id}/")
    public ResponseEntity<SuperContestEffect> getSuperContestEffect(
            @PathVariable("id") Integer id
    ) {
        return new ResponseEntity<>(pokeApiClient.getSuperContestEffect(id), HttpStatus.OK);
    }
}
