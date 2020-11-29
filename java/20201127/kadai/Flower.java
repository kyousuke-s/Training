public class Flower{
	String color;
	int seedNum;
	int water;
	int bloom;

	public Flower(String color,int seedNum){
		this.color=color;
		this.seedNum=seedNum;
	}

	public void draw(){
		this.water=3;
		System.out.println("水を3杯汲みました。");
	}

	public void sprinkle(){
		if(this.water==0){
			System.out.println("水がからっぽです。");
		}else if(this.bloom==this.seedNum){
			System.out.println("すべての花が咲いています!");
		}else{
			this.water--;
			this.bloom++;
			System.out.println("水を撒きました。");
		}
	}

	public void flowerBed(){
		if(this.bloom!=0){
			System.out.println("花の色は"+this.color);
		}
		for(int i=0;i<this.seedNum;i++){
			if(i==0){
				System.out.print("#");
			}
			if(i+1<=this.bloom){
				System.out.print("*");
			}else{
				System.out.print(".");
			}
			if(i+1==this.seedNum){
				System.out.print("#");
			}
		}
		System.out.println();
	}
}
