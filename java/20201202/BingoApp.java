import java.util.*;
public class BingoApp{
	public static void main(String[] args){
		int[][] test=arrPut();
		System.out.println(Arrays.toString(test));
	}

	//番号入りの配列を返す
	static int[] numbers(){
		int[] nums=new int[99];
		for(int i=0;i<nums.length;i++){
			nums[i]=i+1;
		}
		return nums;
	}

	//配列をシャッフルする
	static int[] arrShuffle(){
		Random rand=new Random();
		int[] shufs=numbers();
		for(int i=0;i<shufs.length;i++){
			int index=rand.nextInt(shufs.length-i);
			int temp=shufs[index];
			shufs[index]=shufs[shufs.length-i-1];
			shufs[shufs.length-i-1]=temp;
		}
		return shufs;
	}

	//2次元配列にシャッフルした配列をいれていく
	static int[][] arrPut(){
		int[] shufs=arrShuffle();
		int[][] puts=new int[5][5];
		for(int i=0;i<puts.length;i++){
			for(int j=0;j<puts[i].length;j++){
				puts[i][j]=shufs[j+(puts.length*i)];
			}
		}
		return puts;
	}
	/*
	static int[][] makeCard(int width){
		Random rand=new Random();
		int[][] card=new int[width][width];
		for(int i=0;i<width;i++){
			for(int j=0;j<width;j++){
				card[i][j]=rand.nextInt(99)+1;
			}
		}
	}
*/
}
