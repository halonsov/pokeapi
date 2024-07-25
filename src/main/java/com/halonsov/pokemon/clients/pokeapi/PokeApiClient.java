package com.halonsov.pokemon.clients.pokeapi;

import com.halonsov.pokemon.clients.pokeapi.response.NamedApiResourceList;
import com.halonsov.pokemon.clients.pokeapi.response.ability.Ability;
import com.halonsov.pokemon.clients.pokeapi.response.berry.Berry;
import com.halonsov.pokemon.clients.pokeapi.response.berryfirmness.BerryFirmness;
import com.halonsov.pokemon.clients.pokeapi.response.berryflavor.BerryFlavor;
import com.halonsov.pokemon.clients.pokeapi.response.characteristic.Characteristic;
import com.halonsov.pokemon.clients.pokeapi.response.contesteffect.ContestEffect;
import com.halonsov.pokemon.clients.pokeapi.response.contesttype.ContestType;
import com.halonsov.pokemon.clients.pokeapi.response.egggroup.EggGroup;
import com.halonsov.pokemon.clients.pokeapi.response.encountercondition.EncounterCondition;
import com.halonsov.pokemon.clients.pokeapi.response.encounterconditionvalue.EncounterConditionValue;
import com.halonsov.pokemon.clients.pokeapi.response.encountermethod.EncounterMethod;
import com.halonsov.pokemon.clients.pokeapi.response.evolutionchain.EvolutionChain;
import com.halonsov.pokemon.clients.pokeapi.response.evolutiontrigger.EvolutionTrigger;
import com.halonsov.pokemon.clients.pokeapi.response.gender.Gender;
import com.halonsov.pokemon.clients.pokeapi.response.generation.Generation;
import com.halonsov.pokemon.clients.pokeapi.response.growthrate.GrowthRate;
import com.halonsov.pokemon.clients.pokeapi.response.item.Item;
import com.halonsov.pokemon.clients.pokeapi.response.itemattribute.ItemAttribute;
import com.halonsov.pokemon.clients.pokeapi.response.itemcategory.ItemCategory;
import com.halonsov.pokemon.clients.pokeapi.response.itemflingeffect.ItemFlingEffect;
import com.halonsov.pokemon.clients.pokeapi.response.itempocket.ItemPocket;
import com.halonsov.pokemon.clients.pokeapi.response.language.Language;
import com.halonsov.pokemon.clients.pokeapi.response.location.Location;
import com.halonsov.pokemon.clients.pokeapi.response.locationarea.LocationArea;
import com.halonsov.pokemon.clients.pokeapi.response.locationarea.LocationAreaEncounter;
import com.halonsov.pokemon.clients.pokeapi.response.machine.Machine;
import com.halonsov.pokemon.clients.pokeapi.response.move.Move;
import com.halonsov.pokemon.clients.pokeapi.response.move.MoveBattleStyle;
import com.halonsov.pokemon.clients.pokeapi.response.moveailment.MoveAilment;
import com.halonsov.pokemon.clients.pokeapi.response.movecategory.MoveCategory;
import com.halonsov.pokemon.clients.pokeapi.response.movedamageclass.MoveDamageClass;
import com.halonsov.pokemon.clients.pokeapi.response.movelearnmethod.MoveLearnMethod;
import com.halonsov.pokemon.clients.pokeapi.response.movetarget.MoveTarget;
import com.halonsov.pokemon.clients.pokeapi.response.nature.Nature;
import com.halonsov.pokemon.clients.pokeapi.response.palparkarea.PalParkArea;
import com.halonsov.pokemon.clients.pokeapi.response.pokedex.Pokedex;
import com.halonsov.pokemon.clients.pokeapi.response.pokemon.PokeathlonStat;
import com.halonsov.pokemon.clients.pokeapi.response.pokemon.Pokemon;
import com.halonsov.pokemon.clients.pokeapi.response.pokemoncolor.PokemonColor;
import com.halonsov.pokemon.clients.pokeapi.response.pokemonform.PokemonForm;
import com.halonsov.pokemon.clients.pokeapi.response.pokemonhabitat.PokemonHabitat;
import com.halonsov.pokemon.clients.pokeapi.response.pokemonshape.PokemonShape;
import com.halonsov.pokemon.clients.pokeapi.response.pokemonspecies.PokemonSpecies;
import com.halonsov.pokemon.clients.pokeapi.response.region.Region;
import com.halonsov.pokemon.clients.pokeapi.response.stat.Stat;
import com.halonsov.pokemon.clients.pokeapi.response.supercontesteffect.SuperContestEffect;
import com.halonsov.pokemon.clients.pokeapi.response.type.Type;
import com.halonsov.pokemon.clients.pokeapi.response.version.Version;
import com.halonsov.pokemon.clients.pokeapi.response.versiongroup.VersionGroup;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@FeignClient(name = "${pokeapi.name}", url = "${pokeapi.url}")
public interface PokeApiClient {
    @GetMapping("/berry/")
    NamedApiResourceList getBerries(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/berry/{idName}/")
    Berry getBerry(@PathVariable("idName") String idName);

    @GetMapping("/berry-firmness/")
    NamedApiResourceList getBerriesFirmness(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/berry-firmness/{idName}/")
    BerryFirmness getBerryFirmness(@PathVariable("idName") String idName);

    @GetMapping("/berry-flavor/")
    NamedApiResourceList getBerriesFlavor(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/berry-flavor/{idName}/")
    BerryFlavor getBerryFlavor(@PathVariable("idName") String idName);

    @GetMapping("/contest-type/")
    NamedApiResourceList getContestsType(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/contest-type/{idName}/")
    ContestType getContestType(@PathVariable("idName") String idName);

    @GetMapping("/contest-effect/")
    NamedApiResourceList getContestsEffect(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/contest-effect/{id}/")
    ContestEffect getContestEffect(@PathVariable("id") Integer id);

    @GetMapping("/super-contest-effect/")
    NamedApiResourceList getSuperContestsEffect(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/super-contest-effect/{id}/")
    SuperContestEffect getSuperContestEffect(@PathVariable("id") Integer id);

    @GetMapping("/encounter-method/")
    NamedApiResourceList getEncountersMethod(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/encounter-method/{idName}/")
    EncounterMethod getEncounterMethod(@PathVariable("idName") String idName);

    @GetMapping("/encounter-condition/")
    NamedApiResourceList getEncountersCondition(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/encounter-condition/{idName}/")
    EncounterCondition getEncounterCondition(@PathVariable("idName") String idName);

    @GetMapping("/encounter-condition-value/")
    NamedApiResourceList getEncountersConditionValue(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/encounter-condition-value/{idName}/")
    EncounterConditionValue getEncounterConditionValue(@PathVariable("idName") String idName);

    @GetMapping("/evolution-chain/")
    NamedApiResourceList getEvolutionsChain(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/evolution-chain/{id}/")
    EvolutionChain getEvolutionChain(@PathVariable("id") Integer id);

    @GetMapping("/evolution-trigger/")
    NamedApiResourceList getEvolutionsTrigger(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/evolution-trigger/{idName}/")
    EvolutionTrigger getEvolutionTrigger(@PathVariable("idName") String idName);

    @GetMapping("/generation/")
    NamedApiResourceList getGenerations(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/generation/{idName}/")
    Generation getGeneration(@PathVariable("idName") String idName);

    @GetMapping("/pokedex/")
    NamedApiResourceList getPokedexs(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/pokedex/{idName}/")
    Pokedex getPokedex(@PathVariable("idName") String idName);

    @GetMapping("/version/")
    NamedApiResourceList getVersions(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/version/{idName}/")
    Version getVersion(@PathVariable("idName") String idName);

    @GetMapping("/version-group/")
    NamedApiResourceList getVersionsGroup(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/version-group/{idName}/")
    VersionGroup getVersionGroup(@PathVariable("idName") String idName);

    @GetMapping("/item/")
    NamedApiResourceList getItems(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/item/{idName}/")
    Item getItem(@PathVariable("idName") String idName);

    @GetMapping("/item-attribute/")
    NamedApiResourceList getItemsAttribute(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/item-attribute/{idName}/")
    ItemAttribute getItemAttribute(@PathVariable("idName") String idName);

    @GetMapping("/item-category/")
    NamedApiResourceList getItemsCategory(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/item-category/{idName}/")
    ItemCategory getItemCategory(@PathVariable("idName") String idName);

    @GetMapping("/item-fling-effect/")
    NamedApiResourceList getItemsFlingEffect(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/item-fling-effect/{idName}/")
    ItemFlingEffect getItemFlingEffect(@PathVariable("idName") String idName);

    @GetMapping("/item-pocket/")
    NamedApiResourceList getItemsPocket(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/item-pocket/{idName}/")
    ItemPocket getItemPocket(@PathVariable("idName") String idName);

    @GetMapping("/location/")
    NamedApiResourceList getLocations(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/location/{idName}/")
    Location getLocation(@PathVariable("idName") String idName);

    @GetMapping("/location-area/")
    NamedApiResourceList getLocationsArea(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/location-area/{idName}/")
    LocationArea getLocationArea(@PathVariable("idName") String idName);

    @GetMapping("/pal-park-area/")
    NamedApiResourceList getPalsParkArea(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/pal-park-area/{idName}/")
    PalParkArea getPalParkArea(@PathVariable("idName") String idName);

    @GetMapping("/region/")
    NamedApiResourceList getRegions(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/region/{idName}/")
    Region getRegion(@PathVariable("idName") String idName);

    @GetMapping("/machine/")
    NamedApiResourceList getMachines(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/machine/{idName}/")
    Machine getMachine(@PathVariable("idName") String idName);

    @GetMapping("/move/")
    NamedApiResourceList getMoves(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/move/{idName}/")
    Move getMove(@PathVariable("idName") String idName);

    @GetMapping("/move-ailment/")
    NamedApiResourceList getMovesAilment(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/move-ailment/{idName}/")
    MoveAilment getMoveAilment(@PathVariable("idName") String idName);

    @GetMapping("/move-battle-style/")
    NamedApiResourceList getMovesBattleStyle(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/move-battle-style/{idName}/")
    MoveBattleStyle getMoveBattleStyle(@PathVariable("idName") String idName);

    @GetMapping("/move-category/")
    NamedApiResourceList getMovesCategory(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/move-category/{idName}/")
    MoveCategory getMoveCategory(@PathVariable("idName") String idName);

    @GetMapping("/move-damage-class/")
    NamedApiResourceList getMovesDamageClass(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/move-damage-class/{idName}/")
    MoveDamageClass getMoveDamageClass(@PathVariable("idName") String idName);

    @GetMapping("/move-learn-method/")
    NamedApiResourceList getMovesLearnMethod(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/move-learn-method/{idName}/")
    MoveLearnMethod getMoveLearnMethod(@PathVariable("idName") String idName);

    @GetMapping("/move-target/")
    NamedApiResourceList getMovesTarget(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/move-target/{idName}/")
    MoveTarget getMoveTarget(@PathVariable("idName") String idName);

    @GetMapping("/ability/")
    NamedApiResourceList getAbilitys(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/ability/{idName}/")
    Ability getAbility(@PathVariable("idName") String idName);

    @GetMapping("/characteristic/")
    NamedApiResourceList getCharacteristics(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/characteristic/{id}/")
    Characteristic getCharacteristic(@PathVariable("id") Integer id);

    @GetMapping("/egg-group/")
    NamedApiResourceList getEggsGroup(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/egg-group/{idName}/")
    EggGroup getEggGroup(@PathVariable("idName") String idName);

    @GetMapping("/gender/")
    NamedApiResourceList getGenders(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/gender/{idName}/")
    Gender getGender(@PathVariable("idName") String idName);

    @GetMapping("/growth-rate/")
    NamedApiResourceList getGrowthsRate(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/growth-rate/{idName}/")
    GrowthRate getGrowthRate(@PathVariable("idName") String idName);

    @GetMapping("/nature/")
    NamedApiResourceList getNatures(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/nature/{idName}/")
    Nature getNature(@PathVariable("idName") String idName);

    @GetMapping("/pokeathlon-stat/")
    NamedApiResourceList getPokeathlonsStat(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/pokeathlon-stat/{idName}/")
    PokeathlonStat getPokeathlonStat(@PathVariable("idName") String idName);

    @GetMapping("/pokemon/")
    NamedApiResourceList getPokemons(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/pokemon/{idName}/")
    Pokemon getPokemon(@PathVariable("idName") String idName);

    @GetMapping("/pokemon/{idName}/encounters")
    Object getPokemonEncounters(@PathVariable("idName") String idName);

    @GetMapping("/pokemon-color/")
    NamedApiResourceList getPokemonsColor(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/pokemon-color/{idName}/")
    PokemonColor getPokemonColor(@PathVariable("idName") String idName);

    @GetMapping("/pokemon-form/")
    NamedApiResourceList getPokemonsForm(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/pokemon-form/{idName}/")
    PokemonForm getPokemonForm(@PathVariable("idName") String idName);

    @GetMapping("/pokemon-habitat/")
    NamedApiResourceList getPokemonsHabitat(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/pokemon-habitat/{idName}/")
    PokemonHabitat getPokemonHabitat(@PathVariable("idName") String idName);

    @GetMapping("/pokemon-shape/")
    NamedApiResourceList getPokemonsShape(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/pokemon-shape/{idName}/")
    PokemonShape getPokemonShape(@PathVariable("idName") String idName);

    @GetMapping("/pokemon-species/")
    NamedApiResourceList getPokemonsSpecies(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/pokemon-species/{idName}/")
    PokemonSpecies getPokemonSpecies(@PathVariable("idName") String idName);

    @GetMapping("/stat/")
    NamedApiResourceList getStats(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/stat/{idName}/")
    Stat getStat(@PathVariable("idName") String idName);

    @GetMapping("/type/")
    NamedApiResourceList getTypes(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/type/{idName}/")
    Type getType(@PathVariable("idName") String idName);

    @GetMapping("/language/")
    NamedApiResourceList getLanguages(
            @RequestParam("offset") Optional<Integer> offset,
            @RequestParam("limit") Optional<Integer> limit
    );

    @GetMapping("/language/{idName}/")
    Language getLanguage(@PathVariable("idName") String idName);

}
