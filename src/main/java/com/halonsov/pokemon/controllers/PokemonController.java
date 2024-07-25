package com.halonsov.pokemon.controllers;


import com.halonsov.pokemon.clients.pokeapi.PokeApiClient;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResourceList;
import com.halonsov.pokemon.clients.pokeapi.response.ability.Ability;
import com.halonsov.pokemon.clients.pokeapi.response.characteristic.Characteristic;
import com.halonsov.pokemon.clients.pokeapi.response.egggroup.EggGroup;
import com.halonsov.pokemon.clients.pokeapi.response.gender.Gender;
import com.halonsov.pokemon.clients.pokeapi.response.growthrate.GrowthRate;
import com.halonsov.pokemon.clients.pokeapi.response.nature.Nature;
import com.halonsov.pokemon.clients.pokeapi.response.pokemon.PokeathlonStat;
import com.halonsov.pokemon.clients.pokeapi.response.pokemon.Pokemon;
import com.halonsov.pokemon.clients.pokeapi.response.pokemoncolor.PokemonColor;
import com.halonsov.pokemon.clients.pokeapi.response.pokemonform.PokemonForm;
import com.halonsov.pokemon.clients.pokeapi.response.pokemonhabitat.PokemonHabitat;
import com.halonsov.pokemon.clients.pokeapi.response.pokemonshape.PokemonShape;
import com.halonsov.pokemon.clients.pokeapi.response.pokemonspecies.PokemonSpecies;
import com.halonsov.pokemon.clients.pokeapi.response.stat.Stat;
import com.halonsov.pokemon.clients.pokeapi.response.type.Type;
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
public class PokemonController {
    @Autowired
    private PokeApiClient pokeApiClient;

    @GetMapping(value = "/ability/")
    public ResponseEntity<NamedApiResourceList> getAbilitys(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getAbilitys(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/ability/{idName}/")
    public ResponseEntity<Ability> getAbility(
            @PathVariable("idName") String idName
    ) {
        return new ResponseEntity<>(pokeApiClient.getAbility(idName), HttpStatus.OK);
    }

    @GetMapping(value = "/characteristic/")
    public ResponseEntity<NamedApiResourceList> getCharacteristics(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getCharacteristics(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/characteristic/{id}/")
    public ResponseEntity<Characteristic> getCharacteristic(
            @PathVariable("id") Integer id
    ) {
        return new ResponseEntity<>(pokeApiClient.getCharacteristic(id), HttpStatus.OK);
    }

    @GetMapping(value = "/egg-group/")
    public ResponseEntity<NamedApiResourceList> getEggsGroup(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getEggsGroup(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/egg-group/{idName}/")
    public ResponseEntity<EggGroup> getEggGroup(
            @PathVariable("idName") String idName
    ) {
        return new ResponseEntity<>(pokeApiClient.getEggGroup(idName), HttpStatus.OK);
    }

    @GetMapping(value = "/gender/")
    public ResponseEntity<NamedApiResourceList> getGenders(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getGenders(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/gender/{idName}/")
    public ResponseEntity<Gender> getGender(
            @PathVariable("idName") String idName
    ) {
        return new ResponseEntity<>(pokeApiClient.getGender(idName), HttpStatus.OK);
    }

    @GetMapping(value = "/growth-rate/")
    public ResponseEntity<NamedApiResourceList> getGrowthsRate(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getGrowthsRate(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/growth-rate/{idName}/")
    public ResponseEntity<GrowthRate> getGrowthRate(
            @PathVariable("idName") String idName
    ) {
        return new ResponseEntity<>(pokeApiClient.getGrowthRate(idName), HttpStatus.OK);
    }

    @GetMapping(value = "/nature/")
    public ResponseEntity<NamedApiResourceList> getNatures(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getNatures(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/nature/{idName}/")
    public ResponseEntity<Nature> getNature(
            @PathVariable("idName") String idName
    ) {
        return new ResponseEntity<>(pokeApiClient.getNature(idName), HttpStatus.OK);
    }

    @GetMapping(value = "/pokeathlon-stat/")
    public ResponseEntity<NamedApiResourceList> getPokeathlonsStat(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getPokeathlonsStat(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/pokeathlon-stat/{idName}/")
    public ResponseEntity<PokeathlonStat> getPokeathlonStat(
            @PathVariable("idName") String idName
    ) {
        return new ResponseEntity<>(pokeApiClient.getPokeathlonStat(idName), HttpStatus.OK);
    }

    @GetMapping(value = "/pokemon/")
    public ResponseEntity<NamedApiResourceList> getPokemons(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getPokemons(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/pokemon/{idName}/")
    public ResponseEntity<Pokemon> getPokemon(
            @PathVariable("idName") String idName
    ) {
        return new ResponseEntity<>(pokeApiClient.getPokemon(idName), HttpStatus.OK);
    }

    @GetMapping(value = "/pokemon/{idName}/encounters")
    public ResponseEntity<Object> getPokemonEncounters(
            @PathVariable("idName") String idName
    ) {
        return new ResponseEntity<>(pokeApiClient.getPokemonEncounters(idName), HttpStatus.OK);
    }

    @GetMapping(value = "/pokemon-color/")
    public ResponseEntity<NamedApiResourceList> getPokemonsColor(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getPokemonsColor(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/pokemon-color/{idName}/")
    public ResponseEntity<PokemonColor> getPokemonColor(
            @PathVariable("idName") String idName
    ) {
        return new ResponseEntity<>(pokeApiClient.getPokemonColor(idName), HttpStatus.OK);
    }

    @GetMapping(value = "/pokemon-form/")
    public ResponseEntity<NamedApiResourceList> getPokemonsForm(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getPokemonsForm(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/pokemon-form/{idName}/")
    public ResponseEntity<PokemonForm> getPokemonForm(
            @PathVariable("idName") String idName
    ) {
        return new ResponseEntity<>(pokeApiClient.getPokemonForm(idName), HttpStatus.OK);
    }

    @GetMapping(value = "/pokemon-habitat/")
    public ResponseEntity<NamedApiResourceList> getPokemonsHabitat(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getPokemonsHabitat(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/pokemon-habitat/{idName}/")
    public ResponseEntity<PokemonHabitat> getPokemonHabitat(
            @PathVariable("idName") String idName
    ) {
        return new ResponseEntity<>(pokeApiClient.getPokemonHabitat(idName), HttpStatus.OK);
    }

    @GetMapping(value = "/pokemon-shape/")
    public ResponseEntity<NamedApiResourceList> getPokemonsShape(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getPokemonsShape(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/pokemon-shape/{idName}/")
    public ResponseEntity<PokemonShape> getPokemonShape(
            @PathVariable("idName") String idName
    ) {
        return new ResponseEntity<>(pokeApiClient.getPokemonShape(idName), HttpStatus.OK);
    }

    @GetMapping(value = "/pokemon-species/")
    public ResponseEntity<NamedApiResourceList> getPokemonsSpecies(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getPokemonsSpecies(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/pokemon-species/{idName}/")
    public ResponseEntity<PokemonSpecies> getPokemonSpecies(
            @PathVariable("idName") String idName
    ) {
        return new ResponseEntity<>(pokeApiClient.getPokemonSpecies(idName), HttpStatus.OK);
    }

    @GetMapping(value = "/stat/")
    public ResponseEntity<NamedApiResourceList> getStats(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getStats(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/stat/{idName}/")
    public ResponseEntity<Stat> getStat(
            @PathVariable("idName") String idName
    ) {
        return new ResponseEntity<>(pokeApiClient.getStat(idName), HttpStatus.OK);
    }

    @GetMapping(value = "/type/")
    public ResponseEntity<NamedApiResourceList> getTypes(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getTypes(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/type/{idName}/")
    public ResponseEntity<Type> getType(
            @PathVariable("idName") String idName
    ) {
        return new ResponseEntity<>(pokeApiClient.getType(idName), HttpStatus.OK);
    }
}
