package moves;
import ru.ifmo.se.pokemon.*;

public class LemmaOZmeye extends PhysicalMove {
	public LemmaOZmeye() {
		super(Type.PSYCHIC, 85, 100);
	}

	@Override
	protected void applyOppEffects(Pokemon p) {
		if (Math.random() <= 0.7) Effect.paralyze(p);
	}
	@Override
	protected String describe() {
		return "спрашивает лемму о змее";
	}
}