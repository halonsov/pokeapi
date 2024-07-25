package com.halonsov.pokemon.clients.pokeapi.response.move;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.moveailment.MoveAilment;
import com.halonsov.pokemon.clients.pokeapi.response.movecategory.MoveCategory;
import lombok.Data;

@Data
public class MoveMetaData {
	private NamedApiResource<MoveAilment> ailment;
	private NamedApiResource<MoveCategory> category;
	private Integer drain;
	private Integer healing;

	@JsonProperty("ailment_chance")
	private Integer ailmentChance;

	@JsonProperty("crit_rate")
	private Integer critRate;


	@JsonProperty("flinch_chance")
	private Integer flinchChance;

	@JsonProperty("max_hits")
	private Integer maxHits;

	@JsonProperty("max_turns")
	private Integer maxTurns;

	@JsonProperty("min_hits")
	private Integer minHits;

	@JsonProperty("min_turns")
	private Integer minTurns;

	@JsonProperty("stat_chance")
	private Integer statChance;
}
