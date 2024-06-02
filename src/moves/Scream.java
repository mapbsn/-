package moves;
import ru.ifmo.se.pokemon.*;

public class Scream extends SpecialMove {
	public Scream() {
		super(Type.PSYCHIC, 60, 80);
	}
	@Override
	protected void applyOppEffects(Pokemon p) {
		p.setMod(Stat.SPEED, -10);
	}
	@Override
	protected String describe() {
		return "кричит";
	}

}
