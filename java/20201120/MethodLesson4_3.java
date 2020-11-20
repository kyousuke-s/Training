import java.util.*;
public class MethodLesson4_3{
	//必ず最初は[main]をみる
	public static void main(String[] args){
	/*
		System.out.print("整数a>");
		int a=new Scanner(System.in).nextInt();
		System.out.print("整数b>");
		int b=new Scanner(System.in).nextInt();
		int max=maxNum(a,b);
		System.out.println("大きいほうは"+max);
	*/	
	System.out.println(decoratedStr("Hello",2));
	System.out.println(decoratedStr("Hello",1));
	}
	/*
	static int maxNum(int a,int b){
		return a>b ? a : b;
	}
	*/
	static String decoratedStr(String str,int num){
		//returnはif文だと返さない可能性があるのでコンパイルエラー
		//if else文なら必ずどちらかを返すのでOK
		if(num%2==0){
			return "***"+str+"***";
		}else{
			return "---"+str+"---";
		}
	}
	static void methodA(int a){
		if(a<0){
			//returnでメソッドを抜ける（メソッドを終了）
			return;
		}
		System.out.println(a);
	}
}

