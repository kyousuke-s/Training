import java.util.*;
public class ArcherApp2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Archer[] archers=new Archer[10];
		for(int i=0;i<archers.length;i++){
			archers[i]=new Archer(i+1);
			System.out.println("Archer"+(i+1)+"を生成しました。");
		}
		System.out.print("アーチャー番号を入力(1~10):");
		int select=sc.nextInt();
		archers[select-1].shootArrow();
	}
}
