import java.util.*;
public class Q4{
	public static void main(String[] args){
		System.out.println("****TriangleCalculator****");
		while(true){
			System.out.print("どうする？1…三角形の面積を求める 0…やめる>");
			int yOrN=new Scanner(System.in).nextInt();
			if(yOrN==1){
				System.out.print("底辺を入力してください>");
				double triBottom=new Scanner(System.in).nextDouble();
				System.out.print("高さを入力してください>");
				double triHeight=new Scanner(System.in).nextDouble();
				double ans=triArea(triBottom,triHeight);
				System.out.printf("底辺:%.2f,高さ:%.2fの三角形の面積は%.2fです。%n",triBottom,triHeight,ans);
			}else{
				System.out.println("アプリケーションを終了します。");
				return;
			}
		}
	
	}
	public static double triArea(double a,double b){
		return (a*b)/2;
	}
}
