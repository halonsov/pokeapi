package com.halonsov.pokemon.clients.pokeapi.response.locationarea;

import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import com.halonsov.pokemon.clients.pokeapi.response.version.Version;
import lombok.Data;

@Data
public class EncounterVersionDetails {
	private Integer rate;
	private NamedApiResource<Version> version;
}
