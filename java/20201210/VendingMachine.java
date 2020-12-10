import java.util.*;
public class VendingMachine{
	private int money;
	private int num;

	public VendingMachine(int n){
		this.num=n;
		this.money=0;
	}

	public int getMoney(){
		return this.money;
	}

	public void display(){
		System.out.println("現在の入金額:"+this.money+"円");
	}

	public void insertCoins(int n){
		this.money+=n;
	}

	public int cancel(){
		temp=this.money;
		this.money=0;
		return temp;
	}

	public void purchase(){
		if(this.money<100){
			System.out.println("投入金額が足りません");
			return;
		}else if(this.num<1){
			System.out.println("品切れです");
			return;
		}
		this.money-=100;
		this.num-=1;
	}

	public void insertGoods(int n){
		this.num+=n;
		System.out.println(n+"個の商品を投入しました");
	}
}
