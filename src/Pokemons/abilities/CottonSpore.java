package Pokemons.abilities;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class CottonSpore extends StatusMove{
    public CottonSpore() {
        super(Type.GRASS, 0, 100);
    }

    @Override
    protected String describe() {
        return "выпускает хлопковые споры, которые липнут к цели, резко понижая её Скорость";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPEED, -2);
    }
}
