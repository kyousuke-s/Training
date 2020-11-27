import java.util.*;
public class MonkeyApp{
	public static void main(String[] args){
		System.out.print("おさるの名前を決めてください:>");
		//Scanner scan=new Scanner();
		String name=new Scanner(System.in).nextLine();
		System.out.print("おさるの歳を決めてください:>");
		int age=new Scanner(System.in).nextInt();
		Monkey mon=new Monkey(name,age);
		while(true){
			System.out.print("おさるに何をさせますか? 1…挨拶、2…竹馬、3…逆立ち、4…終了>");
				int num=new Scanner(System.in).nextInt();
			if(num==1){
				mon.greet();
			}else if(num==2){
				mon.takeuma();
			}else if(num==3){
				mon.sakadachi();
			}else{
				break;
			}
		}
		System.out.println("アプリケーションを終了します。");
	}
}
