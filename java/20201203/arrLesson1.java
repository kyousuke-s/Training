import java.util.*;
public class arrLesson1{
	public static void main(String[] args){
		int[] randArr=createRandomArr(1,9,3);
		System.out.println(Arrays.toString(randArr));
		int[][] randArr2=createRandomArr(1,9,3,3);
		for(int[] arr:randArr2){
			System.out.println(Arrays.toString(arr));
		}
		System.out.println(Arrays.deepToString(randArr2));
		showArr(randArr);
		showArr(randArr2);
	}

	//配列の範囲ランダム生成
	static int[] createRandomArr(int min,int max,int len){
		Random rand=new Random();
		int[] arr=new int[len];
		for(int i=0;i<arr.length;i++){
			arr[i]=rand.nextInt(max-min+1)+min;
		}
		return arr;
	}

	//既存のメソッドを使用し二次元配列の範囲ランダム生成(オーバーロード)
	static int[][] createRandomArr(int min,int max,int len,int childLen){
		Random rand=new Random();
		int[][] arr=new int[len][childLen];
		for(int i=0;i<arr.length;i++){
			arr[i]=createRandomArr(min,max,childLen);
		}
		return arr;
	}

	//配列の要素を表示
	static void showArr(int[] arr){
		System.out.print("{");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
		System.out.println("}");
	}

	//既存のメソッドを使用し二次元配列の要素を表示(オーバーロード)
	static void showArr(int[][] arr){
		System.out.println("{");
		for(int i=0;i<arr.length;i++){
			System.out.print(" ");
			showArr(arr[i]);
		}
		System.out.println("}");
	}

}
