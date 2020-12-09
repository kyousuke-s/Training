public class Box{
	private String color;
	private String shape;
	private int num;
	private static int totalNumber;

	public Box(String color,String shape,int num){
		this.setColor(color);
		this.setShape(shape);
		this.setNum(num);
		totalNumber+=num;
	}

	public void insertBalls(int n){
		this.num+=n;
		totalNumber+=n;
		System.out.println(n+"個のボールを入れました。");
	}

	public void removeBalls(int n){
		int temp=this.num<n?this.num:n;
		this.num-=temp;
		totalNumber-=temp;
		System.out.println(temp+"個のボールを取り出しました。");
	}

	public void displayInfo(int n){
		System.out.println(n+"---色:"+this.color+",形:"+this.shape+",個数:"+this.num);
	}

	static void displayTotalNumber(){
		System.out.println("ボールの合計は"+totalNumber+"です。");
	}

	public String getColor(){
		return this.color;
	}
	public void setColor(String color){
		this.color=color;
	}

	public String getShape(){
		return this.shape;
	}
	public void setShape(String shape){
		this.shape=shape;
	}

	public int getNum(){
		return this.num;
	}
	public void setNum(int num){
		this.num=num;
	}
}
