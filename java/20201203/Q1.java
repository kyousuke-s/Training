//作業途中です https://joytas.net/programming/java_basic_23
import java.util*;
public class Q1{
	public static void main(String[] args){
	}
}

class Pool{
	final double WATER=600.0;
	double water;

	public Pool(){
		this.water=0d;
	}
	public void feedWater(double water){
		Scanner sc=new Scanner(System.in);
		while(true){
			//System.out.print("給水する水量を入力して下さい>");
			//double waterIn=sc.nextDouble();
			if(waterIn<0){
				System.out.println("[給水量は正の値を入れて下さい。]")
			}else if(water==WATER){
				System.out.println("[満水です。]");
			}else{
				if(water+waterIn>WATER){
					waterIn=WATER-water;
					water=WATER;
				}else{
					water+=waterIn;
				}
				System.out.printf("%.1f立方メートル給水しました。%n",waterIn);
				return;
			}
		}
	}

	public void drainWater(double water){
		/*
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.print("給水する水量を入力して下さい>");
			double waterOut=sc.nextDouble();
			if(waterOut<0){
				System.out.println("[排水量は正の値を入れて下さい。]")
			}else if(water==0){
				System.out.println("[排水できません。]");
			}else{
			*/
		if(this.water-water<0){
			water=this.water;
			this.water=0;
		}else{
			this.water-=water;
		}
		System.out.printf("%.1f立方メートル給水しました。%n",waterOut);
		return;
	}

	public void displry(){
		Systen.out.printf("現在の水量は%.1f立方メートルです。");
	}
}
