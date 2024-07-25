package com.halonsov.pokemon.clients.pokeapi.response.nature;

import lombok.Data;

import java.util.List;

@Data
public class NaturePokeathlonStatAffectSets {
    private List<NaturePokeathlonStatAffect> increase;
    private List<NaturePokeathlonStatAffect> decrease;
}
