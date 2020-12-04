public class Main{
	public static void main(String[] args){
		//SuperHero sh=new SuperHero();
		//sh.run();
		//Weapon w=new Weapon();
		/*
		Hero h=new Hero();
		Sword sword=new Sword();
		sword.name="はがねの剣";
		sword.damage=10;
		h.setSword(sword);

		//Matango型の配列をつくっている
		//has-aの関係
		Matango[] ms=new PoisonMatango[3];//親クラス型に子クラス型を入れられる
		//通常のインスタンス作成と同様に作成されている
		//Matango ms0=new PoisonMatango と意味は同じ
		ms[0]=new PoisonMatango('A');
		ms[1]=new PoisonMatango('B');
		ms[2]=new PoisonMatango('C');

		for(Matango m:ms){
			m.attack(h);
		}
		System.out.println(h.name+"のHP:"+h.hp);
		h.attack(ms[0]);
		*/
		Goblin goblin=new Goblin();
		Werewolf werewolf=new Werewolf();
		DeathBat deathbat=new DeathBat();
		goblin.attack();
		goblin.run();
		werewolf.attack();
		werewolf.run();
		deathbat.attack();
		deathbat.run();
			
	}
}
