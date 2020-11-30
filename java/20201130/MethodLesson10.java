import java.util.*;
public class MethodLesson10{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("消費税は何%ですか>");
		int tax=scan.nextInt();
		int sumPrice=0;
		while(true){
			System.out.print("価格を入力(0でお会計)>");
			int price=scan.nextInt();
			if(price!=0){
				sumPrice+=price;
			}else{
				System.out.printf("お買い物合計金額は%d円(税込み)です。%n",consumptionTax(sumPrice,tax));
				break;
			}
		}
	}
	static int consumptionTax(int price,int tax){
		return (price*(100+tax))/100;
	}
}
