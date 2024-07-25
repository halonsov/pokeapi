package com.halonsov.pokemon.clients.pokeapi.response.nature;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.Name;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.berryflavor.BerryFlavor;
import com.halonsov.pokemon.clients.pokeapi.response.move.MoveBattleStylePreference;
import com.halonsov.pokemon.clients.pokeapi.response.stat.Stat;
import lombok.Data;

import java.util.List;

@Data
public class Nature {
	private Integer id;
	private String name;
	private List<Name> names;

	@JsonProperty("decreased_stat")
	private NamedApiResource<Stat> decreasedStat;

	@JsonProperty("increased_stat")
	private NamedApiResource<Stat> increasedStat;

	@JsonProperty("hates_flavor")
	private NamedApiResource<BerryFlavor> hatesFlavor;

	@JsonProperty("likes_flavor")
	private NamedApiResource<BerryFlavor> likesFlavor;

	@JsonProperty("pokeathlon_stat_changes")
	private List<NatureStatChange> pokeathlonStatChanges;

	@JsonProperty("move_battle_style_preferences")
	private List<MoveBattleStylePreference> moveBattleStylePreferences;
}
