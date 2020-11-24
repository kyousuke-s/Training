public class Ex5_1{
	public static void main(String[] args){
		introduceOneself();
	}
	static void introduceOneself(){
		String name="佐藤";
		int age=32;
		double height=168.5;
		char zodiac='辰';
		System.out.printf("%s(%d歳),身長:%.1f,十二支:%s%n",name,age,height,zodiac);
	}
}
