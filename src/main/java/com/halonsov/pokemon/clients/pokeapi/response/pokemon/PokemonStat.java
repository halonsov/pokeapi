package com.halonsov.pokemon.clients.pokeapi.response.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.stat.Stat;
import lombok.Data;

@Data
public class PokemonStat {
	private NamedApiResource<Stat> stat;
	private Integer effort;

	@JsonProperty("base_stat")
	private Integer baseStat;
}
