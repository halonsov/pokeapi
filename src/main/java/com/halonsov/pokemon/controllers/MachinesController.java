package com.halonsov.pokemon.controllers;


import com.halonsov.pokemon.clients.pokeapi.PokeApiClient;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResourceList;
import com.halonsov.pokemon.clients.pokeapi.response.machine.Machine;
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
public class MachinesController {
    @Autowired
    private PokeApiClient pokeApiClient;

    @GetMapping(value = "/machine/")
    public ResponseEntity<NamedApiResourceList> getMachines(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getMachines(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/machine/{idName}/")
    public ResponseEntity<Machine> getMachine(
            @PathVariable("idName") String idName
    ) {
        return new ResponseEntity<>(pokeApiClient.getMachine(idName), HttpStatus.OK);
    }
}
