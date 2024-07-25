package com.halonsov.pokemon.controllers;


import com.halonsov.pokemon.clients.pokeapi.PokeApiClient;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResourceList;
import com.halonsov.pokemon.clients.pokeapi.response.location.Location;
import com.halonsov.pokemon.clients.pokeapi.response.locationarea.LocationArea;
import com.halonsov.pokemon.clients.pokeapi.response.palparkarea.PalParkArea;
import com.halonsov.pokemon.clients.pokeapi.response.region.Region;
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
public class LocationsController {
    @Autowired
    private PokeApiClient pokeApiClient;

    @GetMapping(value = "/location/")
    public ResponseEntity<NamedApiResourceList> getLocations(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getLocations(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/location/{idName}/")
    public ResponseEntity<Location> getLocation(
            @PathVariable("idName") String idName
    ) {
        return new ResponseEntity<>(pokeApiClient.getLocation(idName), HttpStatus.OK);
    }

    @GetMapping(value = "/location-area/")
    public ResponseEntity<NamedApiResourceList> getLocationsArea(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getLocationsArea(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/location-area/{idName}/")
    public ResponseEntity<LocationArea> getLocationArea(
            @PathVariable("idName") String idName
    ) {
        return new ResponseEntity<>(pokeApiClient.getLocationArea(idName), HttpStatus.OK);
    }

    @GetMapping(value = "/pal-park-area/")
    public ResponseEntity<NamedApiResourceList> getPalsParkArea(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getPalsParkArea(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/pal-park-area/{idName}/")
    public ResponseEntity<PalParkArea> getPalparkArea(
            @PathVariable("idName") String idName
    ) {
        return new ResponseEntity<>(pokeApiClient.getPalParkArea(idName), HttpStatus.OK);
    }

    @GetMapping(value = "/region/")
    public ResponseEntity<NamedApiResourceList> getRegions(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getRegions(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/region/{idName}/")
    public ResponseEntity<Region> getRegion(
            @PathVariable("idName") String idName
    ) {
        return new ResponseEntity<>(pokeApiClient.getRegion(idName), HttpStatus.OK);
    }
}
