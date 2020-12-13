import java.util.*;
public class BoxApp{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Box[] boxs=new Box[2];
		boxs[0]=new Box("赤","円形",1);
		boxs[1]=new Box("青","四角",2);

		while(true){
			System.out.print("1.ボール投入/2.ボール取出/3.ボール総数表示/4.終了>");
			int select=sc.nextInt();
			if(select<=2){
				for(int i=0;i<boxs.length;i++){
					boxs[i].displayInfo(i);
				}
			}
			switch(select){
				case 1:
					System.out.print("ボールを投入する箱の番号を入力して下さい>");
					int boxNum=sc.nextInt();
					if(boxNum>=boxs.length || boxNum<0){
						System.out.println("箱の番号の入力が誤っています。");
						break;
					}
					System.out.print("投入するボールの個数を入力して下さい>");
					int ballNum=sc.nextInt();
					boxs[boxNum].insertBalls(ballNum);
					break;
				case 2:
					System.out.print("ボールを取り出す箱の番号を入力して下さい>");
					int boxNum1=sc.nextInt();
					if(boxNum1>=boxs.length || boxNum1<0){
						System.out.println("箱の番号の入力が誤っています。");
						break;
					}
					System.out.print("取り出すボールの個数を入力して下さい>");
					int ballNum1=sc.nextInt();
					boxs[boxNum1].removeBalls(ballNum1);
					break;
				case 3:
					Box.displayTotalNumber();
					break;
				default:
					System.out.println("アプリケーションを終了します。");
					return;
			}
		}
	}
}
