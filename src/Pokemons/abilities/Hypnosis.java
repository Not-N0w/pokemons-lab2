package Pokemons.abilities;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Hypnosis extends StatusMove {
    public Hypnosis() {
        super(Type.FLYING, 0, 60);
    }

    @Override
    protected String describe() {
        return "заставляет противника уснуть";
    }

    @Override 
    protected void applyOppEffects(Pokemon pokemon) {
        Effect.sleep(pokemon);
    }
}
