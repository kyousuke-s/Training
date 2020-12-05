public class ElectricBicycle extends Bicycle{
	static final int Max=10;
	//
	int battery;
	//
	public ElectricBicycle(int wheelSize,int battery){
		super(wheelSize);
		this.battery=battery;
	}
	//
	public void upHill(){
		System.out.println("坂道だってラクラクです。");
	}
	public void lowBattery(){
		System.out.println("バッテリーが切れるととても重いです。");
	}
	public void batteryCharge(){
		System.out.println("バッテリーを充電しました。");
		this.battery=Max;
	}


}
