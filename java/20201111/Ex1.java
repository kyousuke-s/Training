import java.util.*;
public class Ex1{
	public static void main(String[] args){
		//配列の準備
		int[] num=new int[100];
		//求める数値
		int lnum=77;
		//最初に求める数値が出たindex番号
		int flnum=0;
		//配列に格納する乱数
		for(int i=0;i<num.length;i++){
			int r=new Random().nextInt(num.length);
			num[i]=r;
			System.out.printf("%d,",num[i]);
		}
		//初回のindex番号を求める
		//int i=0 をforの外で定義しておく
		int i=0;
		for(;i<num.length;i++){
			if(num[i]==lnum){
				flnum=i;
				break;
			}
		}
		System.out.println();
		//77が出ずiが最後まで回りきっていた場合
		if(i==num.length){
			System.out.printf("%dはありませんでした。%n",lnum);
		}else{
			System.out.printf("最初の%dのindexは%dです。%n",lnum,flnum);
		}
		
	}
}
