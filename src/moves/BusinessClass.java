package moves;
import ru.ifmo.se.pokemon.*;

public class BusinessClass extends StatusMove {
	public BusinessClass() {
		super(Type.WATER, 0, 100);
	}
	@Override
	protected void applySelfEffects(Pokemon p) {
		p.setMod(Stat.SPEED, +10);
		p.setMod(Stat.HP, -3);
	}
	@Override
	protected String describe() {
		return "вызывает такси бизнес класса";
	}

}
