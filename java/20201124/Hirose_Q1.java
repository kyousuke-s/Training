import java.util.*;
public class Hirose_Q1{
	public static void main(String[] args){
		//何回ふるか
		System.out.print("何回ふる？>");
		int dice=new Scanner(System.in).nextInt();
		//メンバーの配列
		char[] menbers={'A','B','C'};
		//各メンバーの合計点の配列
		int [] sums=new int[menbers.length];
		//ダイスの値の多重配列
		int[][] allNums=diceNum(menbers.length,dice);
		//各メンバーの合計点を出す
		for(int i=0;i<allNums.length;i++){
			for(int j=0;j<allNums[i].length;j++){
				sums[i] += allNums[i][j];
			}
			//結果の出力
			System.out.println(menbers[i]+"さん:"+Arrays.toString(allNums[i])+"合計:"+sums[i]);
		}
		//勝者の判定
		String win="";
		for(int i=0;i<sums.length-1;i++){
			if(sums[i]==sums[i+1]){
				win="引き分け";
			}else if(sums[i]>sums[i+1]){
				win=menbers[i]+"さんの勝ち";
			}else{
				win=menbers[i+1]+"さんの勝ち";
			}
		}
		System.out.println(win);
	}
	//ダイスの出目を配列で返す
	static int[][] diceNum(int a,int b){
		int[][] nums=new int[a][b];
		for(int i=0;i<nums.length;i++){
			for(int j=0;j<nums[i].length;j++){
				int rand=new Random().nextInt(6)+1;
				nums[i][j]=rand;
			}
		}
		return nums;
	}
}
