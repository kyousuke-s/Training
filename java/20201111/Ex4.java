import java.util.*;
public class Ex4{
	public static void main(String[] args){
		int[] nums=new int[10];
		for(int i=0;i<nums.length;i++){
			int n=new Random().nextInt(nums.length);
			nums[i]=n;
		}
		System.out.println(Arrays.toString(nums));

		//最後の要素は比較対象がないので-1しておく
		for(int i=0;i<nums.length-1;i++){
			//iの隣の要素を見たいのでi+1する
			for(int j=i+1;j<nums.length;j++){
				//iとj（i+1になる）を比較
				if(nums[i]>nums[j]){
					int temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
	}
}
