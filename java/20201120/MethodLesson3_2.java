import java.util.*;
public class MethodLesson3_2{
	//必ず最初は[main]をみる
	public static void main(String[] args){
		System.out.print("言葉1>");
		String w1=new Scanner(System.in).next();
		System.out.print("言葉2>");
		String w2=new Scanner(System.in).next();
		compareLength(w1,w2);
	}

	static void compareLength(String word1,String word2){
		if(word1.length() == word2.length()){
			System.out.println("引き分け");
		}else if(word1.length() > word2.length()){
			System.out.println(word1+"の勝ち");
		}else{
			System.out.println(word2+"の勝ち");
		}
	}
}

