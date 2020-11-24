public class Ex5_3{
	public static void main(String[] args){
		String address="xxx@google.com";
		String title="こんにちは";
		String text="ごきげんいかが";

		email(address,text);
	}
	static void email(String a,String b,String c){
		System.out.println(a+"に、以下のメールを送信しました");
		System.out.println("件名:"+b);
		System.out.println("本文:"+c);
	}
	static void email(String a,String c){
		System.out.println(a+"に、以下のメールを送信しました");
		System.out.println("件名:無題");
		System.out.println("本文:"+c);
	}
}
