package moves;
import ru.ifmo.se.pokemon.*;

public class ZapCannon extends SpecialMove {
	public ZapCannon() {
		super(Type.ELECTRIC, 120, 50);
	}
	@Override
	protected void applyOppEffects(Pokemon p) {
		Effect.paralyze(p);
	}
	@Override
	protected String describe() {
		return "uses Zap Cannon";
	}
}
