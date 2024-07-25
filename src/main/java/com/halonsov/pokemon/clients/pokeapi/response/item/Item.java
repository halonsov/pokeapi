package com.halonsov.pokemon.clients.pokeapi.response.item;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.ApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.GenerationGameIndex;
import com.halonsov.pokemon.clients.pokeapi.response.MachineVersionDetail;
import com.halonsov.pokemon.clients.pokeapi.response.Name;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.VerboseEffect;
import com.halonsov.pokemon.clients.pokeapi.response.VersionGroupFlavorText;
import com.halonsov.pokemon.clients.pokeapi.response.evolutionchain.EvolutionChain;
import com.halonsov.pokemon.clients.pokeapi.response.itemattribute.ItemAttribute;
import com.halonsov.pokemon.clients.pokeapi.response.itemcategory.ItemCategory;
import com.halonsov.pokemon.clients.pokeapi.response.itemflingeffect.ItemFlingEffect;
import lombok.Data;
import java.util.List;

@Data
public class Item {
    private Integer id;
    private String name;
    private Integer cost;
    private List<NamedApiResource<ItemAttribute>> attributes;
    private NamedApiResource<ItemCategory> category;
    private List<Name> names;
    private ItemSprites sprites;
    private List<MachineVersionDetail> machines;

    @JsonProperty("baby_trigger_for")
    private ApiResource<EvolutionChain> babyTriggerFor;

    @JsonProperty("effect_entries")
    private List<VerboseEffect> effectEntries;

    @JsonProperty("flavor_text_entries")
    private List<VersionGroupFlavorText> flavorTextEntries;

    @JsonProperty("fling_effect")
    private NamedApiResource<ItemFlingEffect> flingEffect;

    @JsonProperty("fling_power")
    private Integer flingPower;

    @JsonProperty("game_indices")
    private List<GenerationGameIndex> gameIndices;

    @JsonProperty("held_by_pokemon")
    private List<ItemHolderPokemon> heldByPokemon;

}
