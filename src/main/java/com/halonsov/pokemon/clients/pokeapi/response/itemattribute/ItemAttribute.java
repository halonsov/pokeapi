package com.halonsov.pokemon.clients.pokeapi.response.itemattribute;

import com.halonsov.pokemon.clients.pokeapi.response.Description;
import com.halonsov.pokemon.clients.pokeapi.response.Name;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.item.Item;
import lombok.Data;
import java.util.List;

@Data
public class ItemAttribute{
	private Integer id;
	private String name;
	private List<NamedApiResource<Item>> items;
	private List<Name> names;
	private List<Description> descriptions;
}
