package Pokemons.abilities;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Thunderbolt extends SpecialMove{
    public Thunderbolt() {
        super(Type.GRASS, 90, 100);
    }

    @Override
    protected String describe() {
        return "ударом молнии наносит урон противнику";
    }

    @Override 
    protected void applyOppEffects(Pokemon pokemon) {
        if(Math.random() <= 0.1) {
            Effect.paralyze(pokemon);
        }
    }
}
