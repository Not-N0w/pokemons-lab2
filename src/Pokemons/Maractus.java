package pokemons;

import abilities.AerialAce;
import abilities.CottonSpore;
import abilities.EnergyBall;
import abilities.Growth;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

final public class Maractus extends Pokemon {
    public Maractus() {
        super("Maractus", 1);
        this.setStats(75, 86, 67, 106, 67, 60);
        this.setType(Type.GRASS);
        this.setMove(new AerialAce(), new EnergyBall(), new CottonSpore(), new Growth());
    }
    public Maractus(String name, int level) {
        super(name, level);
        this.setStats(75, 86, 67, 106, 67, 60);
        this.setType(Type.GRASS);
        this.setMove(new AerialAce(), new EnergyBall(), new CottonSpore(), new Growth());
    }
}
