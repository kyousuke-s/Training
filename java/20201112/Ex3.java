import java.util.*;
public class Ex3{
	public static void main(String[] args){
		String[] whens=new String[4];
		String[] whos=new String[4];
		String[] wheres=new String[4];
		String[] whats=new String[4];
		for(int i=0;i<whens.length;i++){
			String when=new Scanner(System.in).nextLine();
			whens[i]=when;
		}
		System.out.println(Arrays.toString(whens));

	}
}
