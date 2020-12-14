import java.util.*;
public class Lesson5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] arr={10,20,30,40};
		while(true){
			System.out.print("indexを入力(q:終了)>");
			String str=sc.nextLine();
			if(str.equalsIgnoreCase("q")){
				System.out.println("終了");
				return;
			}
			try{
				int index=Integer.parseInt(str);
				System.out.println(arr[index]);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("error:数値は0~"+(arr.length-1));
			}catch(NumberFormatException e){
				System.out.println("error:1,2,..の様に数値で入力");
			}
		}
	}
}
