import java.util.*;
public class MethodLesson2{
	//必ず最初は[main]をみる
	public static void main(String[] args){
		System.out.print("整数を入力>");
		int num=new Scanner(System.in).nextInt();
		evenOrOdd(num);
	}
	//(int n)の部分は型だけ見ているので名前が違っても問題ない
	//実際上の部分ではint=numで名前を付けているし
	//intの場合11などの数値が直接入っても問題ない
	static void evenOrOdd(int n){
		if(n%2==0){
			System.out.print(n+"は偶数です。");
		}else{
			System.out.println(n+"は奇数です。");
		}
		System.out.printf("%dは%sです。%n",n,n%2==0?"偶数":"奇数");
	}
}

