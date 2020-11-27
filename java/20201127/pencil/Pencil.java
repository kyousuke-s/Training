public class Pencil{
	String color;
	int penLength=5;

	public Pencil(String color){
		this.color=color;
	}

	public void write(){
		this.penLength-=1;
		System.out.println(this.color+"で書いた!");
	}

	public void read(){
		System.out.println("色:"+this.color);
		String temp="";
		for(int i=0;i<penLength;i++){
			temp+="+";
			if(i==penLength-1){
				temp+=">";
			}
		}
		if(temp.length()>0){
			System.out.println(temp);
		}else{
			System.out.println("もう書けません!");
		}
	}
}
