public class CopyMachine{
	int paper;

	public CopyMachine(int sheet){
		/*
		if(sheet<0){
			this.paper=0;
		}else{
			this.paper=sheet;
		}
		*/
		this.paper=(sheet<0 ? 0 : sheet);
	}

	public void feedPaper(int sheet){
		if(sheet<0){
			sheet=0;
		}
		this.paper+=sheet;
		System.out.printf("%d枚給紙しました。%n",sheet);
	}

	public void copy(int sheet){
		if(paper==0){
			System.out.println("コピー用紙がありません。");
			return;
		}
		int temp=this.paper;
		this.paper-=sheet;
		if(this.paper<0){
			this.paper=0;
			System.out.printf("%d枚コピーしました。%n",temp);
		}else{
			System.out.printf("%d枚コピーしました。%n",sheet);
		}
	}

	public void display(){
		System.out.printf("コピー可能な枚数は%d枚です%n",paper);
	}
}
/*
//Ans
public class CopyMachine {
        int paper;
	public CopyMachine(int sheet){
		this.paper=sheet > 0 ? sheet : 0;
	}
	public void feedPaper(int sheet){
		this.paper+=sheet;
		System.out.printf("%d枚給紙しました。%n",sheet);
	}
	public void copy(int sheet){
		int num=this.paper > sheet ? sheet : this.paper;
		this.paper-=num;
		System.out.printf("%d枚コピーしました。 %n",num);
	}
	public void display(){
		System.out.printf("コピー可能な枚数は%d枚です。%n",this.paper);
	}
}
*/