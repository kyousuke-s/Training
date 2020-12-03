import java.util.*;
public class ScannerTest{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("好きな数字は>");
		//末尾のsc.nextLineでエンターの改行コードを空読みして処理する
		int num=sc.nextInt();sc.nextLine();
		System.out.print("お名前>");
		//上でnextIntを使用しているとnextLineが改行コードに反応してしまうため
		String name=sc.nextLine();
		System.out.println(name+"さんの好きな数字は"+num+"ですね!");
	}
}
