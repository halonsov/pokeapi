package com.halonsov.pokemon.clients.pokeapi.response.itempocket;

import com.halonsov.pokemon.clients.pokeapi.response.Name;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.itemcategory.ItemCategory;
import lombok.Data;

import java.util.List;

@Data
public class ItemPocket {
	private Integer id;
	private String name;
	private List<NamedApiResource<ItemCategory>> categories;
	private List<Name> names;
}
