package Pokemons;

import abilities.DazzlingGleam;
import abilities.DreamEater;
import abilities.Hypnosis;
import ru.ifmo.se.pokemon.Type;

public class Kirlia extends Ralts {
    public Kirlia() {
        super("Kirlia", 1);

        this.setStats(38,35,35,65,55,50);
        this.setType(Type.PSYCHIC, Type.FAIRY);
        this.setMove(new DazzlingGleam(), new DreamEater(), new Hypnosis());
    }
    public Kirlia(String name, int level) {
        super(name, level);
        
        this.setStats(38,35,35,65,55,50);
        this.setType(Type.PSYCHIC, Type.FAIRY);
        this.setMove(new DazzlingGleam(), new DreamEater(), new Hypnosis());
    }
}
