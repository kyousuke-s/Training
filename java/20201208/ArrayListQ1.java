import java.util.*;
public class ArrayListQ1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("ArraysListを使ってみよう!");
		System.out.println("Listに数字をどんどん追加していってみよう。");
		ArrayList<Integer> nums=new ArrayList<>();
		while(true){
			System.out.print("要素追加するよ数字を入れてね(0で終了):");
			int n=sc.nextInt();
			if(n!=0){
				nums.add(n);
			}else{
				System.out.println("ーー結果ーー");
				break;
			}
		}
		System.out.println("要素数:"+nums.size());
		System.out.print("要素:");
		for(int i:nums){
			System.out.print(i+",");
		}
		System.out.println();
	}
}
