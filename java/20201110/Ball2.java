import java.util.*;
public class Ball2{
	public static void main(String[] args){
		//ABのスコアの配列
		int[] Ascore=new int[5];
		int[] Bscore=new int[5];
		//配列で要素を99用意する
		int[] num=new int[99];
		//勝ったほうの名前
		String win="winer";
		//勝ち数
		int Awin=0;
		int Bwin=0;
		//配列の要素に1-99の数値をいれる
		for(int i=0;i<99;i++){
			num[i]=i+1;
		}
		//5試合繰り返す
		for(int i=0;i<5;i++){
			System.out.println((i+1)+"回戦");
			//2回分ひく
			for(int j=0;j<2;j++){
				int index=new Random().nextInt(num.length-j-(i*2));
				//ABの判断
				if(j==0){
					Ascore[i]=num[index];
				}else{
					Bscore[i]=num[index];
				}
				//選出したボールを除外する準備
				int temp=num[index];
				num[index]=num[num.length-1-j-(i*2)];
				num[num.length-1-j-(i*2)]=temp;
			}
				//ABの比較
			if(Ascore[i]>Bscore[i]){
				win="A";
				Awin++;
			}else{
				win="B";
				Bwin++;
			}
			System.out.printf("A:%d,B:%d…%sの勝ち%n",Ascore[i],Bscore[i],win);
		}
		//最終結果の比較
		if(Awin>Bwin){
			win="A";
		}else{
			win="B";
		}
		System.out.printf("%d対%dで%sの勝ち",Awin,Bwin,win);
	}
}
