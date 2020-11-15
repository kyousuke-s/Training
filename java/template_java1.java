//基本の構成
//importで記述することでRandom、Scanner、Arraysなどのjava.util.を省略できる
import java.util.*;
//class名とファイル名は一致させる
public class template_java1{
	public static void main(String[] args){
		System.out.println("lnは改行");			//文章の記述は""で囲う
		System.out.println(20);							//数値はそのまま記述
		System.out.println(3+5);						//加算
		System.out.println(8-5);						//減算
		System.out.println(5*2);						//乗算
		//整数の計算は整数の答えになる(小数点を使用した式の場合は小数点まで表示)
		System.out.println(10/3);						//除算
		System.out.println(10%3);						//余りの計算
		

		//intの使い方
		//Integer(整数)の略 整数の変数を定義する
		int age;
		age=30;															//[=]は代入演算子
		System.out.println(age);						//定義した変数を出力
		age=31;															//新たな値を代入し書き換え
		System.out.println(age);						//新たに代入した変数を出力


		//doubleの使い方
		double height=175.3;								//doubleは小数の変数を定義
		System.out.println(height);					//定義した変数を出力


		//変数を使用した計算
		int banana=30;
		int apple=100;
		//[*](掛ける)演算子を使用している場合、掛け算が優先される(算数と一緒)
		int price=banana * 3 + apple *2;
		//文字列と変数(文字列も含めた全般)を表示するときは[+]を使って連結
		//[+]演算子は左から順番に処理されていく
		System.out.println("合計は" + price + "、身長は" + height);


		//charの使い方
		//1文字のみ格納できる
		//文字は[']シングルコーテーションで囲う
		char c1='a';

		//Stringの使い方
		//文字列を格納できる
		String name="名前";


		//Math.maxの使い方/Math.minも同じ
		//比較して大きいほうを出力する
		int a=5;
		int b=3;
		int m=Math.max(a,b);
		System.out.println("比較実験："+a+"と"+b+"とで大きいほうは…"+m);


		//文字列を数値に変換する
		String age1="32";
		int n=Integer.parseInt(age1);		//文字列age1をint型に変える
		System.out.println("あなたは来年、"+(n+1)+"歳になりますね");


		//ランダム
		int rnd=new java.util.Random().nextInt(90);
		System.out.println("あなたはたぶん、"+rnd+"歳ですね？");


		//ユーザーによる入力
		System.out.println("あなたの名前を入力してください。");
		String name2=new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください。");
		int age2=new java.util.Scanner(System.in).nextInt();
		System.out.println("ようこそ、"+age2+"歳の"+name2+"さん");


		//変数の変更が出来ないようにする
		//finalがついた変数は後から代入で変更できなくなる
		final double PI=3.14;
		double r=5.0;
		//
		double area=r*r*PI;
		//[/n]や[/"]はエスケープシーケンスといいます
		System.out.println("半径"+r+"の円の\n面積(\")は"+area+"です");


		//

	}
}
