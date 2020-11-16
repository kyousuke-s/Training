import java.util.*;
public class Q3{
	public static void main(String[] args){
		//ジャグ配列
		System.out.print("何クラス>");
		int classNum=new Scanner(System.in).nextInt();
		int[][] scores=new int[classNum][];

		for(int i=0;i<classNum;i++){
			System.out.printf("クラス%dは何人>",i+1);
			int parNum=new Scanner(System.in).nextInt();
			scores[i]=new int[parNum];
			for(int j=0;j<parNum;j++){
				int num=new Random().nextInt(100)+1;
				scores[i][j]=num;
				System.out.printf("%d人目の点数>%d%n",j+1,num);
			}
		}
		System.out.println("---結果---");
		for(int i=0;i<scores.length;i++){
			for(int j=0;j<scores[i].length;j++){
				System.out.printf("%4d",scores[i][j]);
			}
		System.out.println();
		}
	}
}
