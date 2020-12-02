import java.util.*;
public class CopyMachineApp{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("最初に給紙する枚数を入力してください>");
		int sheet=sc.nextInt();
		CopyMachine cm=new CopyMachine(sheet);
		while(true){
			System.out.print("1.給紙/2.コピー/3.表示/4.終了>");
			int select=sc.nextInt();
			switch(select){
				case 1:
					System.out.print("給紙する枚数を入力してください>");
					int plusSheet=sc.nextInt();
					cm.feedPaper(plusSheet);
					break;
				case 2:
					System.out.print("コピーする枚数を入力してください>");
					int copyNum=sc.nextInt();
					cm.copy(copyNum);
					break;
				case 3:
					cm.display();
					break;
				default:
					System.out.println("アプリケーションを終了します。");
					return;
			}
		}
	}
}
