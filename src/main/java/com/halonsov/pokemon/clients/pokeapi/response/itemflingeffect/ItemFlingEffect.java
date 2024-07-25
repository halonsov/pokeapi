package com.halonsov.pokemon.clients.pokeapi.response.itemflingeffect;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.Effect;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.item.Item;
import lombok.Data;

import java.util.List;

@Data
public class ItemFlingEffect {
	private Integer id;
	private String name;
	private List<NamedApiResource<Item>> items;

	@JsonProperty("effect_entries")
	private List<Effect> effectEntries;
}
