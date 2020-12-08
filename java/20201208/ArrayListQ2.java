import java.util.*;
public class ArrayListQ2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("ArraysListを使ってみよう!");
		System.out.println("Listにslimeをを追加していってみよう。");
		ArrayList<String> list=new ArrayList<>();
		while(true){
			System.out.print("要素追加するよ数字を入れてね(0で終了):");
			int n=sc.nextInt();
			if(n!=0){
				nums.add(n);
			}else{
				System.out.println("ーー結果ーー");
				break;
			}
		}
		System.out.println("要素数:"+nums.size());
		System.out.print("要素:");
		for(int i:nums){
			System.out.print(i+",");
		}
		System.out.println();
	}
}

class Slime{
	String name;
	int damage=5;

	public Slime(String name){
		this.name=name;
	}

	static void attack(Slime m){
		System.out.println(this.name+"の攻撃:"+this.damage+"ポイントのダメージを与えた!");
	}
}
