package com.halonsov.pokemon.clients.pokeapi.response.pokemonspecies;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.ApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.Description;
import com.halonsov.pokemon.clients.pokeapi.response.FlavorText;
import com.halonsov.pokemon.clients.pokeapi.response.Name;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.egggroup.EggGroup;
import com.halonsov.pokemon.clients.pokeapi.response.evolutionchain.EvolutionChain;
import com.halonsov.pokemon.clients.pokeapi.response.generation.Generation;
import com.halonsov.pokemon.clients.pokeapi.response.growthrate.GrowthRate;
import com.halonsov.pokemon.clients.pokeapi.response.pokemoncolor.PokemonColor;
import com.halonsov.pokemon.clients.pokeapi.response.pokemonhabitat.PokemonHabitat;
import com.halonsov.pokemon.clients.pokeapi.response.pokemonshape.PokemonShape;
import lombok.Data;

import java.util.List;

@Data
public class PokemonSpecies {
    private Integer id;
    private String name;
    private Integer order;
    private NamedApiResource<PokemonColor> color;
    private NamedApiResource<PokemonShape> shape;
    private NamedApiResource<PokemonHabitat> habitat;
    private NamedApiResource<Generation> generation;
    private List<Name> names;
    private List<Genus> genera;
    private List<PokemonSpeciesVariety> varieties;

    @JsonProperty("gender_rate")
    private Integer genderRate;

    @JsonProperty("capture_rate")
    private Integer captureRate;

    @JsonProperty("base_happiness")
    private Integer baseHappiness;

    @JsonProperty("is_baby")
    private Boolean isBaby;

    @JsonProperty("is_legendary")
    private Boolean isLegendary;

    @JsonProperty("is_mythical")
    private Boolean isMythical;

    @JsonProperty("hatch_counter")
    private Integer hatchCounter;

    @JsonProperty("has_gender_differences")
    private Boolean hasGenderDifferences;

    @JsonProperty("forms_switchable")
    private Boolean formsSwitchable;

    @JsonProperty("growth_rate")
    private NamedApiResource<GrowthRate> growthRate;

    @JsonProperty("pokedex_numbers")
    private List<PokemonSpeciesDexEntry> pokedexNumbers;

    @JsonProperty("egg_groups")
    private List<EggGroup> eggGroups;

    @JsonProperty("evolves_from_species")
    private NamedApiResource<PokemonSpecies> evolvesFromSpecies;

    @JsonProperty("evolution_chain")
    private ApiResource<EvolutionChain> evolutionChain;

    @JsonProperty("flavor_text_entries")
    private List<FlavorText> flavorTextEntries;

    @JsonProperty("form_descriptions")
    private List<Description> formDescriptions;

}
