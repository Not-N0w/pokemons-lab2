package abilities;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public final class DazzlingGleam extends SpecialMove {
    public DazzlingGleam() {
        super(Type.FAIRY, 80, 100);
    }

    @Override
    protected String describe() {
        return "ослепительным блеском наносит урон противнику";
    }
}
