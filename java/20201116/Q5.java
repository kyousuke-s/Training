import java.util.*;
public class Q5{
	public static void main(String[] args){
		int[][] steps=new int[9][9];
		for(int i=0;i<steps.length;i++){
			for(int j=0;j<steps[i].length;j++){
				steps[i][j]=(i+1)*(j+1);
			}
		}
		System.out.print("n(1~9)?>");
		int num=new Scanner(System.in).nextInt();
		for(int i=0;i<num;i++){
			for(int j=0;j<steps.length;j++){
				System.out.printf("%2d",steps[i][j]);
				if(j<steps.length-1){
					System.out.print("|");
				}
			}
			System.out.println();
		}
	}
}
