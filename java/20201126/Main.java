import my.util.*;
import java.util.*;
public class Main{
	public static void main(String[] args){
		int minNum=-10,maxNum=10;
		System.out.print("配列の要素数を入力してください>");
		int element=new Scanner(System.in).nextInt();
		int[] arr=Common.arrRandomRange(minNum,maxNum,element);
		System.out.println("配列を生成しました。");
		System.out.println(Arrays.toString(arr));
		while(true){
			System.out.print("1…元の配列を表示,2…配列を昇順ソート,3…配列を降順ソート,4…終了>");
			int choice=new Scanner(System.in).nextInt();
			if(choice==1){
				System.out.println(Arrays.toString(arr));
			}else if(choice==2){
				int[] clone=Common.arrClone(arr);
				Common.arrSort(clone);
				System.out.println(Arrays.toString(clone));
			}else if(choice==3){
				int[] clone=Common.arrClone(arr);
				boolean isDesc=true;
				Common.arrSort(clone,isDesc);
				System.out.println(Arrays.toString(clone));
			}else{
				break;
			}
		}
		System.out.println("アプリケーションを終了します");
	}
}
