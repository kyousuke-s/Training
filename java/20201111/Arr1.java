import java.util.*;
public class Arr1{
	public static void main(String[] args){
		//配列を準備
		int[] nums=new int[5];
		//乱数の繰り返し,配列への代入
		for(int i=0;i<nums.length;i++){
			int n=new Random().nextInt(101);
			nums[i]=n;
		}
		//配列の要素を５回出力
		for(int i=0;i<nums.length;i++){
			System.out.printf("nums[%d]:%d%n",i,nums[i]);
		}
	}
}
