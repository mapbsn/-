package moves;
import ru.ifmo.se.pokemon.*;

public class Alesya extends StatusMove {
	public Alesya() {
		super(Type.PSYCHIC, 0, 100);
	}
	@Override
	protected void applySelfEffects(Pokemon p) {
		p.setMod(Stat.HP, +10);
		p.setMod(Stat.DEFENSE, -10);
	}
	@Override
	protected String describe() {
		return "Алеся приходит сдавать лабу";
	}

}
