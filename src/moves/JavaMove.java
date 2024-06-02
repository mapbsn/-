package moves;
import ru.ifmo.se.pokemon.*;

public abstract class JavaMove extends PhysicalMove {
	public JavaMove(Type type, double v, double v1) {
	}
    @Override
    protected void applySelfEffects(Pokemon p) {
    	p.setMod(Stat.ATTACK, +2);
    }
    protected abstract String describe();
}
