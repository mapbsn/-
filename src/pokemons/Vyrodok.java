package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Vyrodok extends Pokemon {

    public Vyrodok(int level) {
        super("Martin", 25);
        setType(Type.ICE);
        setStats(100, 10, 10, 30, 20, -100);
        setMove(new AnonymousClass(), new Super(), new PrizyvPodsosa(), new Alesya(), new BusinessClass(), new DrinkCoffee());
    }

}
