package com.halonsov.pokemon.clients.pokeapi.response;

import com.halonsov.pokemon.configuration.PokeApiConstants;
import lombok.Data;

@Data
public class NamedApiResource<A> {
    private String name;
    private String url;

    public String getUrl() {
         return this.url.replace(PokeApiConstants.POKEAPI_URL, PokeApiConstants.POKEAPI_LOCALHOST);
    }
}
