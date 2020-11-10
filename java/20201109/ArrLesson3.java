import java.util.Arrays;
//java.util関係のものはimport java.util.*;ですべて対応できる
public class ArrLesson3{
	public static void main(String[] args){
		//1行で書かなければいけない、こちらが主流
		//{}のなかに要素内の数値
		int[] dataA={3,5,10,};//この書き方はint宣言と同時でないとできない
		//2行で書くことができる
		int[] dataB=new int[] {4,6,10,};
		
		String[] strs={"hode","fuga","bar"};

		double[] doub={1.1,2.2,3.3};

		boolean[] bool={false,false,true,true};

		for(int i=0;i<dataA.length;i++){
			System.out.println(dataA[i]);
		}
		//拡張for文
		for(int n:dataB){	//未読の要素がなくなるまで取り出すを繰り返す
			System.out.println(n);
		}

		for(String s : strs){
			System.out.println(s);
		}

		System.out.println(Arrays.toString(dataA));
		//配列の中身を自動できれいに並べて表示してくれる

	}
}
