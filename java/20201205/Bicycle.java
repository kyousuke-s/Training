public class Bicycle{
	//フィールド
	int wheelSize;
	//コンストラクト
	public Bicycle(int wheelSize){
		this.wheelSize=wheelSize;
	}
	//メソッド
	public void ride(){
		System.out.println("風をきって走ります。");
	}
	public void getOff(){
		System.out.println("自転車を降りました。");
	}
}
