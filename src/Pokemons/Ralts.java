package pokemons;

import abilities.DazzlingGleam;
import abilities.DreamEater;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Ralts extends Pokemon{
    public Ralts() {
        super("Ralts", 1);

        this.setStats(28,25,25,45,35,40);
        this.setType(Type.PSYCHIC, Type.FAIRY);
        this.setMove(new DazzlingGleam(), new DreamEater());
    }
    public Ralts(String name, int level) {
        super(name, level);
        
        this.setStats(28,25,25,45,35,40);
        this.setType(Type.PSYCHIC, Type.FAIRY);
        this.setMove(new DazzlingGleam(), new DreamEater());
    }
}
