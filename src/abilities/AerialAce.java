package abilities;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public final class AerialAce extends PhysicalMove {
    public AerialAce() {
        super(Type.FLYING, 60, 100);
    }

    @Override
    protected String describe() {
        return "запутывает цель большой скоростью, а затем атакует";
    }
}