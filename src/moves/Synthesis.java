package moves;
import ru.ifmo.se.pokemon.*;

public class Synthesis extends StatusMove {
	public Synthesis() {
		super(Type.GRASS, 0, 100);
	}
	@Override
	protected void applySelfEffects(Pokemon p) {
		p.setMod(Stat.HP, +2);
	}
	@Override
	protected String describe() {
		return "uses Synthesis";
	}

}
