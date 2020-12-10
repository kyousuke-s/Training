import java.util.*;
public class Wallet{
	private int money;

	public Wallet(int money){
		if(money<0){
			this.money=0;
		}else{
			this.money=money;
		}
	}

	public void insertMoney(int n){
		this.money+=n;
		System.out.println("財布に"+n+"円入れました。")
	}

	public void takeOutMoney(int n){
		int temp=this.money<money?this.money:money;
		this.money-=temp;
		System.out.println("財布から"+temp+"円取り出しました。");
	}

	public void display(){
		System.out.printlin("現在の財布の中身:"+this.money+"円";
	}
}
