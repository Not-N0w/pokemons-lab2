package pokemons;

import abilities.DazzlingGleam;
import abilities.DreamEater;
import abilities.Hypnosis;
import abilities.Thunderbolt;
import ru.ifmo.se.pokemon.Type;

final public class Gallade extends Kirlia {
    public Gallade() {
        super("Gallade", 1);

        this.setStats(68, 125, 65, 65, 115, 80);
        this.setType(Type.PSYCHIC, Type.FIGHTING);
        this.setMove(new DazzlingGleam(), new DreamEater(), new Hypnosis(), new Thunderbolt());
    }
    public Gallade(String name, int level) {
        super(name, level);
        
        this.setStats(68, 125, 65, 65, 115, 80);
        this.setType(Type.PSYCHIC, Type.FIGHTING);
        this.setMove(new DazzlingGleam(), new DreamEater(), new Hypnosis(), new Thunderbolt());
    }
}
