import java.util.*;
public class Ex2_2{
	public static void main(String[] args){
		//要素数の入力、配列の作成
		System.out.print("要素数を入力>");
		int youso=new Scanner(System.in).nextInt();
		int[] nums=new int[youso];
		//カウントする値、カウント数
		int[] target={1,7,17};
		int[] count={0,0,0};
		//乱数作成の繰り返し
		for(int i=0;i<nums.length;i++){
			int num=new Random().nextInt(nums.length);
			//目的の値であるかどうか
			if(num==target[0]){
				//配列に格納
				nums[i]=num;
				//それぞれ何回出たかカウント
				count[0]++;
			}else if(num==target[1]){
				nums[i]=num;
				count[1]++;
			}else if(num==target[2]){
				nums[i]=num;
				count[2]++;
			//それ以外は０にする
			}else{
				nums[i]=0;
			}
		}
		System.out.println(Arrays.toString(nums));
		for(int i=0;i<nums.length-1;i++){
			//求める値が出なかった場合
			if(count[i]==0){
				System.out.printf("%dは出ませんでした。%n",target[i]);
			//求める値が出ていたら
			}else{
				System.out.printf("%dは%d回出ました。%n",target[i],count[i]);
			}
		}
	}
}
