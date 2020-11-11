import java.util.*;
public class Ex3{
	public static void main(String[] args){
		//配列を逆順にするアルゴリズム
		char[] chars={'H','E','L','L','O'};
		for(int i=0;i<chars.length/2;i++){
			char temp=chars[i];
			chars[i]=chars[chars.length-1-i];
			chars[chars.length-1-i]=temp;
		}
		System.out.println(Arrays.toString(chars));

		/*
		for(int i=chars.length-1;i>=0;i--){
			System.out.print(chars[i]);
		}
		*/
	}
}
