package Pokemons;

import Pokemons.abilities.Confide;
import Pokemons.abilities.Headbutt;
import Pokemons.abilities.Haze;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Mantyke extends Pokemon {
    public Mantyke() {
        super("Mantyke", 1);
        this.setStats(45,20,50,60,120,50);
        this.setType(Type.WATER, Type.FLYING);
        this.setMove(new Confide(), new Headbutt(), new Haze());
    }
    public Mantyke(String name, int level) {
        super(name, level);
        this.setStats(45,20,50,60,120,50);
        this.setType(Type.WATER, Type.FLYING);
        this.setMove(new Confide(), new Headbutt(), new Haze());
    }
}
