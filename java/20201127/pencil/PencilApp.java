import java.util.*;
public class PencilApp{
	public static void main(String[] args){
		System.out.print("何色の鉛筆を作りますか>:");
		String color=new Scanner(System.in).next();
		Pencil pen=new Pencil(color);
		while(true){
			System.out.print("操作を入力してください 1…書く,2…情報を見る,3…終了 >");
			int num=new Scanner(System.in).nextInt();
			if(num==1){
				pen.write();
			}else if(num==2){
				pen.read();
			}else{
				break;
			}
		}
		System.out.println("アプリケーションを終了します。");
	}
}
