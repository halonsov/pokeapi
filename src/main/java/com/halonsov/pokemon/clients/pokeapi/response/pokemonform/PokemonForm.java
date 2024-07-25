package com.halonsov.pokemon.clients.pokeapi.response.pokemonform;

import java.util.List;

import com.halonsov.pokemon.clients.pokeapi.response.Name;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.pokemon.Pokemon;
import com.halonsov.pokemon.clients.pokeapi.response.versiongroup.VersionGroup;
import lombok.Data;

@Data
public class PokemonForm {
	private Integer id;
	private String name;
	private Integer order;
	private Integer formOrder;
	private Boolean isDefault;
	private Boolean isBattleOnly;
	private String formName;
	private NamedApiResource<Pokemon> pokemon;
	private PokemonFormSprites sprites;
	private NamedApiResource<VersionGroup> versionGroup;
	private List<Name> names;
	private List<Name> formNames;
}
