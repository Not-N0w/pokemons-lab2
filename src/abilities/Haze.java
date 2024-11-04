package abilities;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Haze extends StatusMove {
    public Haze() {
        super(Type.ICE, 0, 100);
    }

    @Override
    protected String describe() {
        return "создает дымку, которая устраняет каждое изменение характеристик покемонов";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.restore();
    }
    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.restore();
    }
}
