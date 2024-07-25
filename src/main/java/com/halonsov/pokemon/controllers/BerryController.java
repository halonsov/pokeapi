package com.halonsov.pokemon.controllers;

import com.halonsov.pokemon.clients.pokeapi.PokeApiClient;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResourceList;
import com.halonsov.pokemon.clients.pokeapi.response.berry.Berry;
import com.halonsov.pokemon.clients.pokeapi.response.berryfirmness.BerryFirmness;
import com.halonsov.pokemon.clients.pokeapi.response.berryflavor.BerryFlavor;
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
public class BerryController {

    @Autowired
    private PokeApiClient pokeApiClient;

    @GetMapping(value = "/berry/")
    public ResponseEntity<NamedApiResourceList> getBerries(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getBerries(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/berry/{idName}/")
    public ResponseEntity<Berry> getBerry(
            @PathVariable("idName") String idName
    ){
        return new ResponseEntity<>(pokeApiClient.getBerry(idName), HttpStatus.OK);
    }

    @GetMapping(value = "/berry-firmness/")
    public ResponseEntity<NamedApiResourceList> getBerriesFirmness(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getBerriesFirmness(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/berry-firmness/{idName}/")
    public ResponseEntity<BerryFirmness> getBerryFirmness(
            @PathVariable("idName") String idName
    ) {
        return new ResponseEntity<>(pokeApiClient.getBerryFirmness(idName), HttpStatus.OK);
    }

    @GetMapping(value = "/berry-flavor/")
    public ResponseEntity<NamedApiResourceList> getBerriesFlavor(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getBerriesFlavor(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/berry-flavor/{idName}/")
    public ResponseEntity<BerryFlavor> getBerryFlavor(
            @PathVariable("idName") String idName
    ) {
        return new ResponseEntity<>(pokeApiClient.getBerryFlavor(idName), HttpStatus.OK);
    }
}
