package Pokemons.abilities;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class DreamEater extends SpecialMove {
    private int stolen_hp = 0;

    public DreamEater() {
        super(Type.PSYCHIC, 100, 100);
    }

    @Override
    protected String describe() {
        return "пытается украсть сон у противника";
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage) {
        if(pokemon.getCondition() == Status.SLEEP) {
            int result_damage = (int)Math.round(damage);
            pokemon.setMod(Stat.HP, result_damage);
            stolen_hp = (int)Math.ceil(result_damage/2.0);
        }
        else {
            stolen_hp = 0;
        }
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.HP, -stolen_hp);
    }
}
