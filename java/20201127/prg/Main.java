import java.util.*;
public class Main{
	public static void main(String[] args){
		//2つの内容は結果は同じ
		//1度だけ使用するなら直下の記述ほうが短く記述できる
		int n=new Random().nextInt(10);
		//しかしfor文などの繰り返しで上記を使うと
		//そのたびに新しいインスタンスを生成してしまう(メモリを食う)
		//下記の記述だとインスタンスの生成は一度ですむ
		Random rand=new Random();
		for(int i=0;i<10;i++){
			int n=rand.nextInt(10);
		}

		//newで新しくメモリの番地を確保しインスタンスをロードする
		//インスタンスをロードしたメモリの番地を参照するので参照型
		Hero h=new Hero();
		h.name="ロト";
		h.sleep();
		System.out.println(h.hp);

		Hero h2=new Hero();
		h2.name="ジェシカ";
		h2.sleep();
		h2.hp -= 10;

		Hero h3=new Hero();
		h3.name="ククール";
		h3.hp=200;

		h.sit(10);
		h2.slip();

		Matango m1=new Matango();
		m1.hp=50;
		m1.suffix='A';
		Matango m2=new Matango();
		m2.hp=48;
		m2.suffix='B';
		m1.run();
		m2.run();

		h3.run();
	}
}
