package com.halonsov.pokemon.clients.pokeapi.response.move;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.ApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.MachineVersionDetail;
import com.halonsov.pokemon.clients.pokeapi.response.Name;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.VerboseEffect;
import com.halonsov.pokemon.clients.pokeapi.response.ability.AbilityEffectChange;
import com.halonsov.pokemon.clients.pokeapi.response.contesteffect.ContestEffect;
import com.halonsov.pokemon.clients.pokeapi.response.contesttype.ContestType;
import com.halonsov.pokemon.clients.pokeapi.response.generation.Generation;
import com.halonsov.pokemon.clients.pokeapi.response.movedamageclass.MoveDamageClass;
import com.halonsov.pokemon.clients.pokeapi.response.movetarget.MoveTarget;
import com.halonsov.pokemon.clients.pokeapi.response.supercontesteffect.SuperContestEffect;
import com.halonsov.pokemon.clients.pokeapi.response.type.Type;
import lombok.Data;

import java.util.List;

@Data
public class Move {
    private Integer id;
    private String name;
    private Integer accuracy;
    private Integer pp;
    private Integer priority;
    private Integer power;
    private NamedApiResource<Generation> generation;
    private List<MachineVersionDetail> machines;
    private MoveMetaData meta;
    private List<Name> names;
    private NamedApiResource<MoveTarget> target;
    private NamedApiResource<Type> type;

    @JsonProperty("effect_chance")
    private Integer effectChance;

    @JsonProperty("contest_combos")
    private ContestComboSets contestCombos;

    @JsonProperty("contest_type")
    private NamedApiResource<ContestType> contestType;

    @JsonProperty("contest_effect")
    private ApiResource<ContestEffect> contestEffect;

    @JsonProperty("damage_class")
    private NamedApiResource<MoveDamageClass> damageClass;

    @JsonProperty("effect_entries")
    private List<VerboseEffect> effectEntries;

    @JsonProperty("effect_chances")
    private List<AbilityEffectChange> effectChanges;

    @JsonProperty("flavor_text_entries")
    private List<MoveFlavorText> flavorTextEntries;

    @JsonProperty("learned_by_pokemon")
    private List<NamedApiResource<Object>> learnedByPokemon;

    @JsonProperty("past_values")
    private List<PastMoveStatValues> pastValues;

    @JsonProperty("stat_changes")
    private List<MoveStatChange> statChanges;

    @JsonProperty("super_contest_effect")
    private ApiResource<SuperContestEffect> superContestEffect;

}
