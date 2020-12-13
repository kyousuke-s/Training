import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Wallet wallet=new Wallet(1000);
		VendingMachine vend=new VendingMachine(3);
		vend.display();
		while(true){
			System.out.print("1.硬貨投入/2.商品購入/3.硬貨取出/4.商品投入/5.所持金表示/6.終了>");
			int select=sc.nextInt();
			switch(select){
				case 1:
					System.out.print("投入する金額を入力して下さい>");
					int price=sc.nextInt();
					wallet.takeOutMoney(price);
					vend.insertCoin(price);
					break;
				case 2:
					
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				default:
					return;
			}
		}
	}
}
