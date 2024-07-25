package com.halonsov.pokemon.clients.pokeapi.response.move;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import lombok.Data;

@Data
public class MoveBattleStylePreference {
    @JsonProperty("low_hp_preference")
    private Integer lowHpPreference;

    @JsonProperty("high_hp_preference")
    private Integer highHpPreference;

    @JsonProperty("move_battle_style")
    private NamedApiResource<MoveBattleStyle> moveBattleStyle;
}
