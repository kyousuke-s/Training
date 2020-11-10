import java.util.*;
public class Janken{
	public static void main(String[] args){
		String[] hand={"グー","チョキ","パー"};
		System.out.print("手を入力o.グー1.チョキ2.パー>");
		int n=new Scanner(System.in).nextInt();
		int r=new Random().nextInt(hand.length);
		System.out.printf("PCは%s%n",hand[r]);
		if(n==r){
			System.out.println("あいこです。");
		}else if(n<r || n-(hand.length-1)==r ){
			System.out.println("あなたの勝ちです！");
		}else{
			System.out.println("あなたの負けです。");
		}
	} 
}

/*
じゃんけんの場合は以下の式が使える
int diff = (n + 3 - r) & 3
if(diff == 0){
	System.out.println(あいこです);
}else if(diff == 1){
	System.out.println(あなたの負けです);
}else{
	System.out.println(あなたの勝ちです！);
}

