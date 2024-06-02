import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class BitvaMochiIGovna {
    public static void main(String[] args) {
        Battle b = new Battle();

        Vyrodok martin = new Vyrodok(25);
        Huesos antoshka = new Huesos(25);

        b.addAlly(martin);
        b.addFoe(antoshka);

        b.go();

    }
}