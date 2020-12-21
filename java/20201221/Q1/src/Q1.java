/*
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("数値(1~10000)>");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
//		char[] userNum=new char[input.length()];
		String ans = "";
		for(int i=0;i<input.length();i++) {
//			userNum[i]=input.charAt(input.length()-i-1);
			ans+=input.charAt(input.length()-i-1);
		}
		System.out.println("逆順にしました->"+ans);
	}

}
*/

import java.util.Scanner;
public class Q1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("数値(1~10000)>");
		/*
		int input=sc.nextInt();
		System.out.print("逆順にしました->");
		while(input > 0) {
			int n=input%10;
			System.out.print(n);
			input /=10;
		}
		System.out.println();
		sc.close();
		*/
		String str=sc.next();
		System.out.print("逆順にしました->");
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}
}