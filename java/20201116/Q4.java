import java.util.*;
public class Q4{
	public static void main(String[] args){
		String[] w={"いつ","誰が","どこで","何をした",};
		String[][] box=new String[w.length][];
		for(int i=0;i<box.length;i++){
			System.out.printf("%sはいくつ>",w[i]);
			int Num=new Scanner(System.in).nextInt();
			box[i]=new String[Num]; 
			for(int j=0;j<box[i].length;j++){
				System.out.printf("%sをいれて>",w[i]);
				String Word=new Scanner(System.in).nextLine();
				box[i][j]=Word;
			}
		}
		String[] seps={"","が","で",""};
		for(int i=0;i<box.length;i++){
			int index=new Random().nextInt(box[i].length);
			System.out.print(box[i][index]+seps[i]);
		}
		System.out.println();
	}
}
