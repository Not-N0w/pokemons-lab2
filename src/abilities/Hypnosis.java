package abilities;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public final class Hypnosis extends StatusMove {
    public Hypnosis() {
        super(Type.PSYCHIC, 0, 60);
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
