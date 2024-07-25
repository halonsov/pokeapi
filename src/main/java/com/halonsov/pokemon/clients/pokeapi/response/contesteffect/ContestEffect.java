package com.halonsov.pokemon.clients.pokeapi.response.contesteffect;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.Effect;
import com.halonsov.pokemon.clients.pokeapi.response.FlavorText;
import lombok.Data;
import java.util.List;

@Data
public class ContestEffect {
    private Integer id;
    private Integer appeal;
    private Integer jam;

    @JsonProperty("effect_entries")
    private List<Effect> effectEntries;

    @JsonProperty("flavor_text_entries")
    private List<FlavorText> flavorTextEntries;
}
