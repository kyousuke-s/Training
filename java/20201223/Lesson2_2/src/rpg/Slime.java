package rpg;

public class Slime extends Monster{
	String name;

	public Slime(String name) {
		super(name);
	}

	@Override
	public String run(String name) {
		String s=getName()+"はさささっと逃げだした";
		return s;
	}
}
