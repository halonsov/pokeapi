package com.halonsov.pokemon.clients.pokeapi.response.machine;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.item.Item;
import com.halonsov.pokemon.clients.pokeapi.response.move.Move;
import com.halonsov.pokemon.clients.pokeapi.response.versiongroup.VersionGroup;
import lombok.Data;

@Data
public class Machine {
	private Integer id;
	private NamedApiResource<Item> item;
	private NamedApiResource<Move> move;

	@JsonProperty("version_group")
	private NamedApiResource<VersionGroup> versionGroup;
}
