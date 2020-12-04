public class Notebook extends Book{
	String content="";
	public Notebook(int page,int price){
		super(page,price);
	}

	public void write(String str){
		this.content += str;
	}

	@Override
	public void showStatus(){
		super.showStatus();//親クラス(親インスタンス)から呼び出し
		System.out.println("内容:"+this.content);
	}

}
