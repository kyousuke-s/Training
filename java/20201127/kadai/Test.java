import java.util.*;
public class Test{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("何色の花にしますか？>");
		String color=scan.nextLine();

		System.out.print("種をいくつ植えますか？>");
		int seedNum=scan.nextInt();

		Flower flo=new Flower(color,seedNum);

		while(true){
			System.out.print("何をしますか？1…水汲み2…水撒き3…花壇を見る4…終了>");
			int num=scan.nextInt();

			switch(num){
			case 1:
				flo.draw();
				break;
			case 2:
				flo.sprinkle();
				break;
			case 3:
				flo.flowerBed();
				break;
			default:
				System.out.println("アプリケーションを終了します。");
				scan.close();
				return;
			}
		}
	}
}
