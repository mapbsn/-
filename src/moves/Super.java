package moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Super extends JavaMove {
    public Super() {
        super(Type.PSYCHIC, 40, 120);
    }

    @Override
    protected String describe() {
        return "спрашивает про super";
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() >= 0.3) {Effect.flinch(p);
        System.out.print(": а для чего?");}
        if (Math.random() >= 0.2) {Effect.paralyze(p);
        System.out.print(": а зачем?");}
    }
}
