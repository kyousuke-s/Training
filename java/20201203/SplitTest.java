import java.util.*;
public class SplitTest{
	public static void main(String[] args){
		if(args.length>0){
			//コマンドライン引数(args)は実行時に指定する文字列
			String str=args[0];
			String[] data=str.split(",");
			System.out.println(Arrays.toString(data));
			int sum=0;
			for(String s:data){
				sum+=Integer.parseInt(s);
			}
			System.out.println("合計は"+sum+"です");
		}
	}
}
