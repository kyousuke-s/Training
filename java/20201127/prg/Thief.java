public class Thief{
	String name;
	int hp;
	int mp;

	/*
	//通常の書き方
	public Thief(String name,int hp,int mp){
		this(name,hp);
		this.mp=mp;
	}
	public Thief(String name,int hp){
		this(name);
		this.hp=hp;
	}
	public Thief(String name){
		this.name=name;
	}
	*/
	
	//今回はHPやMPに指定があるため
	public Thief(String name,int hp,int mp){
		this.name=name;
		this.hp=hp;
		this.mp=mp;
	}
	public Thief(String name,int hp){
		this(name,hp,5);
	}
	public Thief(String name){
		this(name,40);
	}
}
