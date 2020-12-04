public class Weapon extends Item{//継承元に引数なしのコンストラクタがない
	public Weapon(){
		super("名無しの剣");//ここで引数なしの形だとコンパイルエラー
	}
}
