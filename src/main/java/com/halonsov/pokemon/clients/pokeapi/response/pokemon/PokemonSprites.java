package com.halonsov.pokemon.clients.pokeapi.response.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PokemonSprites {
	private Object other;
	private Object versions;

	@JsonProperty("front_default")
	private String frontDefault;

	@JsonProperty("front_shiny")
	private String frontShiny;

	@JsonProperty("front_female")
	private String frontFemale;

	@JsonProperty("front_shiny_female")
	private String frontShinyFemale;

	@JsonProperty("back_default")
	private String backDefault;

	@JsonProperty("back_shiny")
	private String backShiny;

	@JsonProperty("back_female")
	private String backFemale;

	@JsonProperty("back_shiny_female")
	private String backShinyFemale;
}
