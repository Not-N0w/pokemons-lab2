import ru.ifmo.se.pokemon.Battle;
import Pokemons.*;

public class App {
    public static void main(String[] args) {
        Battle battle = new Battle();
        Ralts ralts = new Ralts("Ralts1", 6);
        Maractus maractus1 = new Maractus("Maractus2", 4);

        battle.addFoe(ralts);
        battle.addAlly(maractus1);
        battle.go();
    }
}
