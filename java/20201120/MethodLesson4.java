import java.util.*;
public class MethodLesson4{
	//必ず最初は[main]をみる
	public static void main(String[] args){
		//returnで帰ってきた結果が代入される
		int n=sum0f(3,5); //8
		System.out.println(n);

		System.out.print("言葉>");
		String w=new Scanner(System.in).next();
		String word=decoWord(w);
		System.out.println(word);
	}
	//戻り値のあるメソッド
	static int sum0f(int a,int b){
		//呼び出し元に返す
		return a+b;
	}
	static String decoWord(String w){
		return "***"+w+"***";
	}
}

