import java.util.*;
public class Saku{
	public static void main(String[] args){
		System.out.print("何人>");
		int peoples=new Scanner(System.in).nextInt();
		//５人分の点数を格納する配列
		int[] num=new int[peoples];
		//それぞれの点数を入力し、numに格納
		for(int i=0;i<num.length;i++){
			System.out.printf("%d人目の点数>",i+1);
			int score=new Scanner(System.in).nextInt();
			num[i]=score;
		}
		System.out.println(Arrays.toString(num));
	}
}
