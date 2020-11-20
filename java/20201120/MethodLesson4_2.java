import java.util.*;
public class MethodLesson4_2{
	//必ず最初は[main]をみる
	public static void main(String[] args){
		System.out.print("整数a>");
		int a=new Scanner(System.in).nextInt();
		System.out.print("整数b>");
		int b=new Scanner(System.in).nextInt();
		int max=maxNum(a,b);
		System.out.println("大きいほうは"+max);
	}
	static int maxNum(int a,int b){
		return a>b ? a : b;
	}
}

