import ru.ifmo.se.pokemon.Battle;
import Pokemons.*;

public class App {
    public static void main(String[] args) {
        Battle battle = new Battle();
        Maractus maractus = new Maractus("Maractus1", 2);
        Maractus maractus1 = new Maractus("Maractus2", 4);

        battle.addFoe(maractus);
        battle.addAlly(maractus1);
        battle.go();
    }
}
