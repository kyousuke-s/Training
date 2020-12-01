import java.util.*;
public class Flowerbed{
	final int MAXWATER=3;
	String color;
	int seedNum;
	int bloom;
	int water;

	public Flowerbed(String color,int seedNum){
		this.color=color;
		this.seedNum=seedNum;
	}

	public void drawWater(){
		if(this.water==this.MAXWATER){
			System.out.println("水は満杯です!");
		}else{
			System.out.printf("水を%d杯汲みました。%n",(this.MAXWATER-this.water));
			this.water=this.MAXWATER;
		}
	}

	public void waterFlower(){
		if(this.water==0){
			System.out.println("水が空っぽです。");
		}else if(this.bloom==this.seedNum){
			System.out.println("すべての花が咲いています!");
		}else{
			this.water--;
			this.bloom++;
			System.out.println("水を撒きました。");
		}
	}

	public void showStatus(){
		if(this.bloom!=0){
			System.out.printf("花の色は%sです%n",this.color);
		}
		System.out.print("#");
		for(int i=0;i<this.seedNum;i++){
			if(i<this.bloom){
				System.out.print("*");
			}else{
				System.out.print(".");
			}
		}
		System.out.println("#");
	}
}
