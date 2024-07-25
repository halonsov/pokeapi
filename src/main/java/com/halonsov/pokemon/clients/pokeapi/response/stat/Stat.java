package com.halonsov.pokemon.clients.pokeapi.response.stat;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.ApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.Name;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.characteristic.Characteristic;
import com.halonsov.pokemon.clients.pokeapi.response.movedamageclass.MoveDamageClass;
import lombok.Data;

import java.util.List;

@Data
public class Stat {
	private Integer id;
	private String name;
	private List<Name> names;
	private List<ApiResource<Characteristic>> characteristics;

	@JsonProperty("game_index")
	private Integer gameIndex;

	@JsonProperty("is_battle_only")
	private Boolean isBattleOnly;

	@JsonProperty("affecting_moves")
	private MoveStatAffectSets affectingMoves;

	@JsonProperty("affecting_natures")
	private NatureStatAffectSets affectingNatures;

	@JsonProperty("move_damage_class")
	private NamedApiResource<MoveDamageClass> moveDamageClass;
}
