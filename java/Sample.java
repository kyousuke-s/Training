import java.util.*;
public class Sample{
	public static void main(String[] args){
		System.out.print("1つ目の整数xの値を入力してください>");
		int x=new Scanner(System.in).nextInt();
		System.out.print("2つ目の整数yの値を入力してください>");
		int y=new Scanner(System.in).nextInt();
		System.out.print("演算子(+,-,*,/,%)を半角記号で入力してください>");
		String ope=new java.util.Scanner(System.in).nextLine();

		switch (ope){
			case "+":
				System.out.println("x+y="+(x+y));
				break;
			case "-":
				System.out.println("x-y="+(x-y));
				break;
			case "*":
				System.out.println("x*y="+(x*y));
				break;
			case "/":
				System.out.println("x/y="+(x/y));
				break;
			default:
				System.out.println("x%y="+(x%y));
				break;
		}
	}
}
