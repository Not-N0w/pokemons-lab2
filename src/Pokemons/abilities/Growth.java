package Pokemons.abilities;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Growth extends StatusMove {
    public Growth() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected String describe() {
        return "вырастает";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPECIAL_DEFENSE, 1);
        pokemon.setMod(Stat.ATTACK, 1);
    }

}

