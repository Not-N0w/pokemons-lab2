package abilities;

import ru.ifmo.se.pokemon.PhysicalMove;

import ru.ifmo.se.pokemon.Type;

final public class BulletSeed extends PhysicalMove {
    public BulletSeed() {
        super(Type.GRASS, 25, 100, 0, 2 + (int)Math.round(Math.random()*3));
    }

    @Override
    protected String describe() {
        return "с силой выстреливает в цель от 2 до 5 семян в быстрой последовательности";
    }
}
