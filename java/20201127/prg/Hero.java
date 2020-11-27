public class Hero{
	//属性宣言
	//クラスブロック内のステータス(属性宣言)はフィールドという
	String name;
	int hp=100;
	//コンストラクタ
	//名前はクラス名と一緒
	//生成の仕方と初期値を指定できる
	//コンストラクタの指定がない場合下記のようなデフォルトコンストラクタが
	//自動的に自動的に
	public Hero(){}	//指定なし

	public Hero(String name){	//名前を入力するように指定する
		this.name=name;
	}

	public Hero(String name,int hp){
		//下記のthis();は一つのコンストラクタのなかで
		//一番上に一度しか記述できない
		//()内にカンマ区切りで連続して記述はできる
		this(name);	//このクラス内の既に存在するコンストラクタを呼び出す
		this.hp=hp;
	}

	//"this"は呼び出されたそれぞれのインスタンスのこと
	public void sleep(){
		this.hp=100;
		System.out.println(this.name+"は、眠って回復した！");
	}
	public void sit(int sec){
		this.hp+=sec;
		System.out.println(this.name+"は、"+sec+"秒座った！");
		System.out.println("HPが"+sec+"ポイント回復した");
	}
	public void slip(){
		this.hp-=5;
		System.out.println(this.name+"は、転んだ！");
		System.out.println("5のダメージ");
	}
	public void run(){
		System.out.println(this.name+"は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは"+this.hp+"でした");
	}
}
