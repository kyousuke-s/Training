import java.util.*;
public class Q2{
	public static void main(String[] args){
		System.out.print("繰り返す文字>");
		String word=new Scanner(System.in).nextLine();
		System.out.print("繰り返す回数>");
		int num=new Scanner(System.in).nextInt();
		String allWord=repeatWord(word,num);
		System.out.println(allWord);
	}
	public static String repeatWord(String a,int b){
		String temp=a;
		for(int i=0;i<b-1;i++){
			temp+=a;
		}
		return temp;
	}
}
