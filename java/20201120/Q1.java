import java.util.*;
public class Q1{
	public static void main(String[] args){
		System.out.print("月を入力してください>");
		int d=new Scanner(System.in).nextInt();
		monthD(d);
	}
	public static void monthD(int d){
		int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.printf("%d月の日数は%d日です。%n",d,days[d-1]);
	}
}

