public class MethodLesson1{
	static void eat(){
		System.out.println("モグモグ");
		System.out.println("ゴクゴク");
	}
	//必ず最初は[main]をみる
	public static void main(String[] args){
		/*
		hello("田中");
		hello("佐藤");
		eat();
		bye();
　　*/
		System.out.print("あなたの名前を入れてください>");
		String name=new java.util.Scanner(System.in).nextLine();
		hello(name);
	}
	static void hello(String name){
		System.out.println(name+"さん、Hello");
	}
	static void bye(){
		System.out.println("Bye");
	}
}

