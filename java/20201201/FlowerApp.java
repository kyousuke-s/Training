import java.util.*;
public class FlowerApp{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("何色の花にしますか？>");
		String color=sc.nextLine();
		System.out.print("種をいくつ植えますか？>");
		int seedNum=sc.nextInt();
		Flowerbed flo=new Flowerbed(color,seedNum);
		while(true){
			System.out.print("何をしますか？1…水汲み2…水撒き3…花壇を見る4…終了>");
			int num=sc.nextInt();
			switch(num){
				case 1:
					flo.drawWater();
					break;
				case 2:
					flo.waterFlower();
					break;
				case 3:
					flo.showStatus();
					break;
				default:
					System.out.print("アプリケーションを終了します。");
					sc.close();
					return;
			}
		}
	}
}
