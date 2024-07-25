package com.halonsov.pokemon.controllers;

import com.halonsov.pokemon.clients.pokeapi.PokeApiClient;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResourceList;
import com.halonsov.pokemon.clients.pokeapi.response.encountercondition.EncounterCondition;
import com.halonsov.pokemon.clients.pokeapi.response.encounterconditionvalue.EncounterConditionValue;
import com.halonsov.pokemon.clients.pokeapi.response.encountermethod.EncounterMethod;
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
public class EncountersController {
    @Autowired
    private PokeApiClient pokeApiClient;

    @GetMapping(value = "/encounter-method/")
    public ResponseEntity<NamedApiResourceList> getEncountersMethod(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getEncountersMethod(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/encounter-method/{idName}/")
    public ResponseEntity<EncounterMethod> getEncounterMethod(
            @PathVariable("idName") String idName
    ) {
        return new ResponseEntity<>(pokeApiClient.getEncounterMethod(idName), HttpStatus.OK);
    }

    @GetMapping(value = "/encounter-condition/")
    public ResponseEntity<NamedApiResourceList> getEncountersCondition(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getEncountersCondition(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/encounter-condition/{idName}/")
    public ResponseEntity<EncounterCondition> getEncounterCondition(
            @PathVariable("idName") String idName
    ) {
        return new ResponseEntity<>(pokeApiClient.getEncounterCondition(idName), HttpStatus.OK);
    }

    @GetMapping(value = "/encounter-condition-value/")
    public ResponseEntity<NamedApiResourceList> getEncountersConditionValue(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getEncountersConditionValue(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/encounter-condition-value/{idName}/")
    public ResponseEntity<EncounterConditionValue> getEncounterConditionValue(
            @PathVariable("idName") String idName
    ) {
        return new ResponseEntity<>(pokeApiClient.getEncounterConditionValue(idName), HttpStatus.OK);
    }
}
