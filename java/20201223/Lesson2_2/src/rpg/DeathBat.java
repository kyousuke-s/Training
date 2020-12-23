package rpg;

public class DeathBat extends Monster{
	String name;

	public DeathBat(String name) {
		super(name);
	}

	public String run(String name) {
		String s=getName()+"はバサバサと逃げだした";
		return s;
	}
}
