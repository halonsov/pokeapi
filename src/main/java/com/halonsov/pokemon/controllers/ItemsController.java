package com.halonsov.pokemon.controllers;


import com.halonsov.pokemon.clients.pokeapi.PokeApiClient;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResourceList;
import com.halonsov.pokemon.clients.pokeapi.response.item.Item;
import com.halonsov.pokemon.clients.pokeapi.response.itemattribute.ItemAttribute;
import com.halonsov.pokemon.clients.pokeapi.response.itemcategory.ItemCategory;
import com.halonsov.pokemon.clients.pokeapi.response.itemflingeffect.ItemFlingEffect;
import com.halonsov.pokemon.clients.pokeapi.response.itempocket.ItemPocket;
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
public class ItemsController {
    @Autowired
    private PokeApiClient pokeApiClient;

    @GetMapping(value = "/item/")
    public ResponseEntity<NamedApiResourceList> getItems(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getItems(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/item/{idName}/")
    public ResponseEntity<Item> getItem(
            @PathVariable("idName") String idName
    ) {
        return new ResponseEntity<>(pokeApiClient.getItem(idName), HttpStatus.OK);
    }

    @GetMapping(value = "/item-attribute/")
    public ResponseEntity<NamedApiResourceList> getItemsAttribute(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getItemsAttribute(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/item-attribute/{idName}/")
    public ResponseEntity<ItemAttribute> getItemAttribute(
            @PathVariable("idName") String idName
    ) {
        return new ResponseEntity<>(pokeApiClient.getItemAttribute(idName), HttpStatus.OK);
    }

    @GetMapping(value = "/item-category/")
    public ResponseEntity<NamedApiResourceList> getItemsCategory(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getItemsCategory(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/item-category/{idName}/")
    public ResponseEntity<ItemCategory> getItemCategory(
            @PathVariable("idName") String idName
    ) {
        return new ResponseEntity<>(pokeApiClient.getItemCategory(idName), HttpStatus.OK);
    }

    @GetMapping(value = "/item-fling-effect/")
    public ResponseEntity<NamedApiResourceList> getItemsFlingEffect(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getItemsFlingEffect(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/item-fling-effect/{idName}/")
    public ResponseEntity<ItemFlingEffect> getItemFlingEffect(
            @PathVariable("idName") String idName
    ) {
        return new ResponseEntity<>(pokeApiClient.getItemFlingEffect(idName), HttpStatus.OK);
    }

    @GetMapping(value = "/item-pocket/")
    public ResponseEntity<NamedApiResourceList> getItemsPocket(
            @RequestParam(name = "offset", defaultValue = "0") Optional<Integer> offset,
            @RequestParam(name = "limit", defaultValue = "20") Optional<Integer> limit
    ) {
        return new ResponseEntity<>(pokeApiClient.getItemsPocket(offset, limit), HttpStatus.OK);
    }

    @GetMapping(value = "/item-pocket/{idName}/")
    public ResponseEntity<ItemPocket> getItemPocket(
            @PathVariable("idName") String idName
    ) {
        return new ResponseEntity<>(pokeApiClient.getItemPocket(idName), HttpStatus.OK);
    }
}
