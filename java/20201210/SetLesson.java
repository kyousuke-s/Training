import java.util.*;
public class SetLesson{
	public static void main(String[] args){
		Set<String> colors=new HashSet<>();
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		colors.add("赤");
		System.out.println("色は"+colors.size()+"種類");
		for(String s:colors){
			System.out.println(s);
		}
		Set<String> words=new TreeSet<>();
		words.add("dog");
		words.add("cat");
		words.add("wolf");
		words.add("panda");
		for(String s:words){
			System.out.println(s);
		}
		Set<Integer> nums=new LinkedHashSet<>();
		nums.add(1);
		nums.add(3);
		nums.add(2);
		nums.add(11);
		nums.add(6);
		for(int n:nums){
			System.out.println(n);
		}

	}
}
