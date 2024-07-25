package com.halonsov.pokemon.clients.pokeapi.response.evolutionchain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.evolutiontrigger.EvolutionTrigger;
import com.halonsov.pokemon.clients.pokeapi.response.item.Item;
import com.halonsov.pokemon.clients.pokeapi.response.location.Location;
import com.halonsov.pokemon.clients.pokeapi.response.move.Move;
import com.halonsov.pokemon.clients.pokeapi.response.pokemonspecies.PokemonSpecies;
import com.halonsov.pokemon.clients.pokeapi.response.type.Type;
import lombok.Data;

@Data
public class EvolutionDetail {
    private NamedApiResource<Item> item;
    private NamedApiResource<EvolutionTrigger> trigger;
    private Integer gender;
    private NamedApiResource<Location> location;

    @JsonProperty("held_item")
    private NamedApiResource<Item> heldItem;

    @JsonProperty("known_move")
    private NamedApiResource<Move> knownMove;

    @JsonProperty("known_move_type")
    private NamedApiResource<Type> knownMoveType;

    @JsonProperty("min_level")
    private Integer minLevel;

    @JsonProperty("min_happiness")
    private Integer minHappiness;

    @JsonProperty("min_beauty")
    private Integer minBeauty;

    @JsonProperty("min_affection")
    private Integer minAffection;

    @JsonProperty("needs_overworld_rain")
    private Boolean needsOverworldRain;

    @JsonProperty("party_species")
    private NamedApiResource<PokemonSpecies> partySpecies;

    @JsonProperty("party_type")
    private NamedApiResource<Type> partyType;

    @JsonProperty("relative_physical_stats")
    private Integer relativePhysicalStats;

    @JsonProperty("time_of_day")
    private String timeOfDay;

    @JsonProperty("trade_species")
    private NamedApiResource<PokemonSpecies> tradeSpecies;

    @JsonProperty("turn_upside_down")
    private Boolean turnUpsideDown;
}
