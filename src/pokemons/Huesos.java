package pokemons;
import ru.ifmo.se.pokemon.*;
import moves.*;

public class Huesos extends Pokemon {
	public Huesos(int level) {
		super("Antoshka", level);
		setType(Type.FIRE);
		setStats(20, 20, 20, 20, 20, 20);
		setMove(new Apple(), new LemmaOZmeye(), new Scream());
	}
}