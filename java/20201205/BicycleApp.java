import java.util.*;
public class BicycleApp{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Bicycle b=new Bicycle(27);
		ElectricBicycle eb=new ElectricBicycle(24,10);
		while(true){
			System.out.println("自転車を選んでください");
			System.out.println("0・・・自転車/ホイールサイズ:"+b.wheelSize);
			System.out.println("1・・・電動自転車/ホイールサイズ:"+eb.wheelSize+" バッテリー:"+eb.battery);
			System.out.println("2・・・終了");
			System.out.print("番号を入力してください>");
			int bSelect=sc.nextInt();
			switch(bSelect){
				case 0:
					do{
						System.out.print("1/走る,2/降りる>");
						int select=sc.nextInt();
						switch(select){
							case 1:
								b.ride();
								break;
							default:
								b.getOff();
								break;
						}
						if(select==2){
							break;
						}
					}while(true);
					break;
				case 1:
					break;


				default:
					System.out.println("アプリケーションを終了します。");
					return;
					
			}
		}
	}
}
