public class SuperHero extends Hero{

	boolean flying;
	
	public SuperHero(){
		System.out.println("SuperHeroコンストラクタ");
	}

	public void fly(){
		this.flying=true;
		System.out.println("飛び上がった!");
	}

	public void land(){
		this.flying=false;
		System.out.println("着地した!");
	}

	//記述ミスなどがあってもオーバーライドのためのメソッドだと判別してくれる
	//コンパイラのエラーの際にオーバーライドできてないと教えてくれる
	@Override
	public void run(){
		System.out.println("撤退した");
	}

	@Override
	public void attack(Matango m){
		super.attack(m);
		if(this.flying){
			super.attack(m);
		}
	}
}
