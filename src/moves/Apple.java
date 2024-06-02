package moves;
import ru.ifmo.se.pokemon.*;

public class Apple extends StatusMove {
	public Apple() {
		super(Type.GRASS, 0, 100);
	}
	@Override
	protected void applySelfEffects(Pokemon p) {
		p.setMod(Stat.HP, -5);
	}
	@Override
	protected String describe() {
		return "ест яблоко";
	}
}
