import java.util.*;
public class Nums2{
	public static void main(String[] args){
		int[] nums1=new int[5];
		int[] nums2=new int[5];
		
		System.out.println("***nums1***");
		for(int i=0;i<nums1.length;i++){
			int rand=new Random().nextInt(100)+1;
			nums1[i]=rand;
			nums2[i]=nums1[i]*3;
			System.out.println(nums1[i]);
		}

		System.out.println("***nums2***");
		for(int i=0;i<nums1.length;i++){
			System.out.println(nums2[i]);
		}
	}
}
