package abilities;


import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;

public final class Headbutt extends PhysicalMove{
    public Headbutt() {
        super(Type.NORMAL, 70,100);
    }

    @Override
    protected String describe() {
        return "ударяет противника головой";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if(Math.random() <= 0.3) {
            Effect.flinch(pokemon);
        }
    }
}
