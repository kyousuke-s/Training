import java.util.*;
public class MethodLesson6{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("一文字入れてください>");
		String oneWord=scan.next();
		System.out.print("幅を入れてください>");
		int width=scan.nextInt();
		printSquare(oneWord.charAt(0),width);
	}
	static void printSquare(char c,int width){
		for(int i=0;i<width;i++){
			for(int j=0;j<width;j++){
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
