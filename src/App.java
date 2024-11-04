import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
import Pokemons.*;

public class App {
    public static void main(String[] args) {
        Battle battle = new Battle();
        Pokemon ralts = new Ralts("ralts", 6);
        Pokemon mantine = new Mantine("mantine", 3);
        Pokemon gallade = new Gallade("gallade", 3);

        battle.addFoe(ralts);
        battle.addFoe(mantine);
        battle.addFoe(gallade);

        Pokemon maractus = new Maractus("maractus", 4);
        Pokemon mantyke = new Mantyke("mantyke", 2);
        Pokemon kirlia = new Kirlia("kirlia", 5);

        battle.addAlly(maractus);
        battle.addAlly(mantyke);
        battle.addAlly(kirlia);

        battle.go();
    }
}
