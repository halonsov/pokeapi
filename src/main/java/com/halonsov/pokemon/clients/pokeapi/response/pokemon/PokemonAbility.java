package com.halonsov.pokemon.clients.pokeapi.response.pokemon;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.ability.Ability;
import lombok.Data;

@Data
public class PokemonAbility {
	private Integer slot;
	private NamedApiResource<Ability> ability;

	@JsonProperty("is_hidden")
	private Boolean isHidden;

}
