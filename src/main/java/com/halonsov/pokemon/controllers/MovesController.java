package com.halonsov.pokemon.controllers;


import com.halonsov.pokemon.clients.pokeapi.PokeApiClient;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResourceList;
import com.halonsov.pokemon.clients.pokeapi.response.move.Move;
import com.halonsov.pokemon.clients.pokeapi.response.move.MoveBattleStyle;
import com.halonsov.pokemon.clients.pokeapi.response.moveailment.MoveAilment;
import com.halonsov.pokemon.clients.pokeapi.response.movecategory.MoveCategory;
import com.halonsov.pokemon.clients.pokeapi.response.movedamageclass.MoveDamageClass;
import com.halonsov.pokemon.clients.pokeapi.response.movelearnmethod.MoveLearnMethod;
import com.halonsov.pokemon.clients.pokeapi.response.movetarget.MoveTarget;
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
public class MovesController {
    @Autowired
    private PokeApiClient pokeApiClient;

    @GetMapping(value = "/move/")
    public ResponseEntity<NamedApiResourceList> getMoves(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getMoves(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/move/{idName}/")
    public ResponseEntity<Move> getMove(
            @PathVariable("idName") String idName
    ) {
        return new ResponseEntity<>(pokeApiClient.getMove(idName), HttpStatus.OK);
    }

    @GetMapping(value = "/move-ailment/")
    public ResponseEntity<NamedApiResourceList> getMovesAilment(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getMovesAilment(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/move-ailment/{idName}/")
    public ResponseEntity<MoveAilment> getMoveAilment(
            @PathVariable("idName") String idName
    ) {
        return new ResponseEntity<>(pokeApiClient.getMoveAilment(idName), HttpStatus.OK);
    }

    @GetMapping(value = "/move-battle-style/")
    public ResponseEntity<NamedApiResourceList> getMovesBattleStyle(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getMovesBattleStyle(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/move-battle-style/{idName}/")
    public ResponseEntity<MoveBattleStyle> getMoveBattleStyle(
            @PathVariable("idName") String idName
    ) {
        return new ResponseEntity<>(pokeApiClient.getMoveBattleStyle(idName), HttpStatus.OK);
    }

    @GetMapping(value = "/move-category/")
    public ResponseEntity<NamedApiResourceList> getMovesCategory(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getMovesCategory(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/move-category/{idName}/")
    public ResponseEntity<MoveCategory> getMoveCategory(
            @PathVariable("idName") String idName
    ) {
        return new ResponseEntity<>(pokeApiClient.getMoveCategory(idName), HttpStatus.OK);
    }

    @GetMapping(value = "/move-damage-class/")
    public ResponseEntity<NamedApiResourceList> getMovesDamageClass(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getMovesDamageClass(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/move-damage-class/{idName}/")
    public ResponseEntity<MoveDamageClass> getMoveDamageClass(
            @PathVariable("idName") String idName
    ) {
        return new ResponseEntity<>(pokeApiClient.getMoveDamageClass(idName), HttpStatus.OK);
    }

    @GetMapping(value = "/move-learn-method/")
    public ResponseEntity<NamedApiResourceList> getMovesLearnMethod(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getMovesLearnMethod(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/move-learn-method/{idName}/")
    public ResponseEntity<MoveLearnMethod> getMoveLearnMethod(
            @PathVariable("idName") String idName
    ) {
        return new ResponseEntity<>(pokeApiClient.getMoveLearnMethod(idName), HttpStatus.OK);
    }

    @GetMapping(value = "/move-target/")
    public ResponseEntity<NamedApiResourceList> getMovesTarget(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getMovesTarget(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/move-target/{idName}/")
    public ResponseEntity<MoveTarget> getMoveTarget(
            @PathVariable("idName") String idName
    ) {
        return new ResponseEntity<>(pokeApiClient.getMoveTarget(idName), HttpStatus.OK);
    }
}
