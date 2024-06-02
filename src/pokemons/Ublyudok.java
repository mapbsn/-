package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Ublyudok extends Pokemon {
    public Ublyudok(int level) {
        super("Danil", 27);

        setType(Type.POISON);
        setStats(20, 20, 20, 20, 20, 20);
        setMove();
    }

}
