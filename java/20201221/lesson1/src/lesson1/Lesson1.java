package lesson1;

public class Lesson1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Hello Eclipce");
		String str="Hello";
		if(str.equalsIgnoreCase("hello")) {
			System.out.println("ok");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		System.out.println("1秒たちました");
	}

}
