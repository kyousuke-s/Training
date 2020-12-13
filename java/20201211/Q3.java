import java.util.*;
public class Q3{
	public static void main(String[] args){
		Random rand=new Random();
		Map<Integer,Integer> nums=new TreeMap<>();
		for(int i=1;i<=100;i++){
			nums.put(i,0);
		}
		System.out.println("1~100の乱数を100回発生させたよ");
		for(int i=0;i<100;i++){
			int num=rand.nextInt(100)+1;
			if(nums.containsKey(num)){

			}
			nums.put(num,nums.get(num)+1);
		}
		for(Integer key:nums.keySet()){
			if(nums.isEmpty()){
				nums.remove(key);
			}
		}
		System.out.println("***result***");
		System.out.println(nums.size()+"種類の数値が出ました。");
		for(Integer key:nums.keySet()){
			int value=nums.get(key);
			System.out.println(key+"..."+value);
		}
	}
}

//Anser
/*
import java.util.*;
public class MapLesson3{
	public static void main(String[] args){
		Map<Integer,Integer> map=new TreeMap<>();
		Random rand=new Random();
		for(int i=0;i<100;i++){
			int num=rand.nextInt(100)+1;
			if(map.containsKey(num)){
				map.put(num,map.get(num)+1);
			}else{
				map.put(num,1);
			}
		}
		System.out.println("***result***");
		System.out.println(map.size()+"種類の数値がでました");
		for(int key : map.keySet()){
			System.out.printf("%d...%d%n",key,map.get(key));
		}
	}
}
*/
