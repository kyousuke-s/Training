import java.util.*;
public class Nums{
	public static void main(String[] args){
		int[] nums=new int[5];
		for(int i=0;i<nums.length;i++){
			int rand=new Random().nextInt(101);
			nums[i]=rand;
			System.out.printf("nums[%d]:%d%n",i,nums[i]);
		}
	}
}
