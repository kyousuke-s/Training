import java.util.*;
public class Q1{
	public static void main(String[] args){
		//ジャグ配列もできる
		//{0,0,0}{0,0,0,0,}{0,0,0,}等
		int[][] elements=new int[3][4];
		for(int i=0;i<elements.length;i++){
			for(int j=0;j<elements[i].length;j++){
				int num=new Random().nextInt(100)+1;
				elements[i][j]=num;
				System.out.printf("%4d",elements[i][j]);
			}
			System.out.println();
		}
	}
}
