package com.halonsov.pokemon.clients.pokeapi.response;

import java.util.List;

import com.halonsov.pokemon.configuration.PokeApiConstants;
import lombok.Data;

@Data
public class NamedApiResourceList {
	private Integer count;
	private String next;
	private String previous;
	private List<NamedApiResource<Object>> results;

	public String getNext() {
		if (this.next != null) {
			return this.next.replace(PokeApiConstants.POKEAPI_URL, PokeApiConstants.POKEAPI_LOCALHOST);
		}
		return null;
	}

	public String getPrevious() {
		if (this.previous != null) {
			return this.previous.replace(PokeApiConstants.POKEAPI_URL, PokeApiConstants.POKEAPI_LOCALHOST);
		}
		return null;
	}
}
