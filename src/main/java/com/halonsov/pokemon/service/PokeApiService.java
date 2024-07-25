package com.halonsov.pokemon.service;

import com.halonsov.pokemon.clients.pokeapi.PokeApiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokeApiService {
    @Autowired
    private PokeApiClient pokeApiClient;


}
