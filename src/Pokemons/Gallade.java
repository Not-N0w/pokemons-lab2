package Pokemons;

import Pokemons.abilities.DazzlingGleam;
import Pokemons.abilities.DreamEater;
import Pokemons.abilities.Hypnosis;
import Pokemons.abilities.Thunderbolt;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Gallade extends Pokemon {
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
