package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

import java.awt.*;

public class AnonymousClass extends JavaMove {

    public AnonymousClass() {
        super(Type.NORMAL, 60, 100);
    }

    @Override
    protected String describe() {
        return "использует супер-удар анонимным классом!";
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() >= 0.2) {
            p.setMod(Stat.SPEED, -10);
            System.out.print("задает доп вопрос про лямбда-выражения :(");
        }
    }
}
