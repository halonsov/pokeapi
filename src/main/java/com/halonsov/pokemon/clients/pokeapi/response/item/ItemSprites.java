package com.halonsov.pokemon.clients.pokeapi.response.item;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ItemSprites {
	@JsonProperty("default")
	private String imageUrl;
}
