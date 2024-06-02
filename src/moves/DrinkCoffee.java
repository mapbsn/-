package moves;
import ru.ifmo.se.pokemon.*;

public class DrinkCoffee extends StatusMove {
	public DrinkCoffee() {
		super(Type.WATER, 0, 100);
	}
	@Override
	protected void applySelfEffects(Pokemon p) {
		p.setMod(Stat.SPEED, +5);
		p.setMod(Stat.HP, -5);
	}
	@Override
	protected String describe() {
		return "пьет кофе";
	}

}
