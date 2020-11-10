/*
import java.util.*;
public class Ball1{
	public static void main(String[] args){
		int[] balls={1,2,3,4,5};
		boolean[] isPicked={false,false,false,false,false};
		int[] old=new int[5];
		for(int i=0;i<balls.length;i++){
			while(true){
				int index=new Random().nextInt(balls.length);
				if(isPicked[index]){
					continue;
				}
				System.out.println(balls[index]);
				isPicked[index]=true;
				break;
			}
		}
	}
}
*/


import java.util.*;
public class Ball1{
	public static void main(String[] args){
		//ボールを配列に入れる
		int[] balls={1,2,3,4,5};
		//配列の要素数分まわす
		for(int i=0;i<balls.length;i++){
			//インデックスの値にランダムの数値を代入
			int index=new Random().nextInt(balls.length-i);
			//ランダムで選出した番号のボールを表示
			System.out.println(balls[index]);
			//選出したボールを除外する準備
			//tempに直前に選出したボールを代入
			int temp=balls[index];
			//選出したボールに配列の最後の要素を代入
			balls[index]=balls[balls.length-1-i];
			balls[balls.length-1-i]=temp;
		}
	}
}
