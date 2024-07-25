package com.halonsov.pokemon.clients.pokeapi.response.type;

import java.util.List;

import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResource;
import lombok.Data;

@Data
public class TypeRelations {
	private List<NamedApiResource<Type>> noDamageTo;
	private List<NamedApiResource<Type>> halfDamageTo;
	private List<NamedApiResource<Type>> doubleDamageTo;
	private List<NamedApiResource<Type>> noDamageFrom;
	private List<NamedApiResource<Type>> halfDamageFrom;
	private List<NamedApiResource<Type>> doubleDamageFrom;
}
