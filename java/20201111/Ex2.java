import java.util.*;
public class Ex2{
	public static void main(String[] args){
		//乱数用の配列、偶数・奇数用の配列
		int[] nums=new int[10];
		String[] ae=new String[10];
		//乱数の繰り返し、配列に格納、乱数の配列を出力
		for(int i=0;i<nums.length;i++){
			int r=new Random().nextInt(nums.length);
			nums[i]=r;
			ae[i] = r%2==0 ? "偶数":"奇数";
			System.out.print(nums[i]+",");
		}
		//偶数・奇数の判定を出力
		System.out.println();
		System.out.println(Arrays.toString(ae));
	}
}
