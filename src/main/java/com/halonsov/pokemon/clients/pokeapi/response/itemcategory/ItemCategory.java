package com.halonsov.pokemon.clients.pokeapi.response.itemcategory;

import com.halonsov.pokemon.clients.pokeapi.response.Name;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.item.Item;
import com.halonsov.pokemon.clients.pokeapi.response.itempocket.ItemPocket;
import lombok.Data;

import java.util.List;

@Data
public class ItemCategory {
	private Integer id;
	private String name;
	private List<NamedApiResource<Item>> items;
	private List<Name> names;
	private NamedApiResource<ItemPocket> pocket;
}
