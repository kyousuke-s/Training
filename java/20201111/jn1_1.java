import java.util.*;
public class jn1_1{
	public static void main(String[] args){
		System.out.print("整数A:");
		int a=new Scanner(System.in).nextInt();
		System.out.print("整数B:");
		int b=new Scanner(System.in).nextInt();
		//三項演算子
		// int 変数名 = 条件式 ? 真 : 偽;
		/*
		int min= a < b ? a : b;
		System.out.println("小さいほうの値は"+min+"です");
		*/
		System.out.println("小さいほうの値は"+(a<b ? a:b)+"です");
	}
}
