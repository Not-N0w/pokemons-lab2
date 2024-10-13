package Pokemons;

import Pokemons.abilities.AerialAce;
import Pokemons.abilities.Confide;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Mantyke extends Pokemon {
    public Mantyke() {
        super("Mantyke", 1);
        this.setStats(45,20,50,60,120,50);
        this.setType(Type.WATER, Type.FLYING);
        this.setMove(new AerialAce());
    }
    public Mantyke(String var1, int var2) {
        super(var1, var2);
        this.setStats(45,20,50,60,120,50);
        this.setType(Type.WATER, Type.FLYING);
        this.setMove(new AerialAce(), new Confide());
    }
}
