package Pokemons;

import Pokemons.abilities.Haze;
import Pokemons.abilities.BulletSeed;
import Pokemons.abilities.Confide;
import Pokemons.abilities.Headbutt;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class Mantine extends Pokemon{
    public Mantine() {
        super("Mantine", 1);
        this.setStats(85,40,70,80,140,70);
        this.setType(Type.WATER, Type.FLYING);
        this.setMove(new Confide(), new Headbutt(), new Haze(), new BulletSeed());
    }
    public Mantine(String name, int level) {
        super(name, level);
        this.setStats(85,40,70,80,140,70);
        this.setType(Type.WATER, Type.FLYING);
        this.setMove(new Confide(), new Headbutt(), new Haze(), new BulletSeed());
    }
}
