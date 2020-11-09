public class Lottery{
	public static void main(String[] args){
		int sum=0;
		for(int i=0;i<3;i++){
			System.out.println((i+1)+"回目");
			int n=new java.util.Random().nextInt(100)+1;
			System.out.println(n);
			if(n==1){
				sum+=10000000;
				System.out.println("1000万円");
			}else if(n<=3){
				sum+=1000000;
				System.out.println("100万円");
			}else if(n<=6){
				sum+=100000;
				System.out.println("10万円");
			}else if(n<=10){
				sum+=10000;
				System.out.println("1万円");
			}else if(n<=20){
				sum+=1000;
				System.out.println("1000円");
			}else if(n<=40){
				sum+=100;
				System.out.println("100円");
			}else{
				System.out.println("ハズレ");
			}
		}
		System.out.println("獲得賞金は");
		System.out.printf("%,d円でした！%n",sum);
	}
}
