public class Archer{
	private static int totalArcher;
	private int no;

	public Archer(int no){
		this.setNo(no);
	}

	public static int getTotalArcher(){
		return totalArcher;
	}
	public static void setTotalArcher(int num){
		totalArcher+=num;
	}
	public int getNo(){
		return this.no;
	}
	public void setNo(int no){
		this.no+=no;
	}
	public void shootArrow(){
		System.out.println("Archer"+this.no+"は矢を放った！");
	}
}

