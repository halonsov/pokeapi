package com.halonsov.pokemon.clients.pokeapi.response.stat;

import java.util.List;

import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.nature.Nature;
import lombok.Data;

@Data
public class NatureStatAffectSets {
	private List<NamedApiResource<Nature>> increase;
	private List<NamedApiResource<Nature>> decrease;
}
