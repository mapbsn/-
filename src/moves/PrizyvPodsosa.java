package moves;
import ru.ifmo.se.pokemon.*;

public class PrizyvPodsosa extends SpecialMove {
	public PrizyvPodsosa() {
		super(Type.NORMAL, 0, 100);
	}
	@Override
	protected void applySelfEffects(Pokemon p) {
		if (Math.random() <= 0.5) {
			class Alice {
				String name = "Алиса";

				public void bringVine() {
					p.setMod(Stat.HP, -10);
					System.out.printf("Приходит %s с вином. %s и %s пьют вино.", this.name, p.toString(), this.name);
				}
			}

			Alice alice = new Alice();
			alice.bringVine();
		} else {
			class Stas {
				String name = "Стас";

				public void discussProgramming() {
					p.setMod(Stat.ATTACK, +5);
					System.out.printf("%s и %s обсуждают прогу. %s воодушевляется.", this.name, p.toString(), p.toString());
				}
			}
			Stas stas = new Stas();
			stas.discussProgramming();
		}
	}
}

