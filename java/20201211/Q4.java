import java.util.*;
public class Q4{
	public static void main(String[] args){
		Random rand=new Random();
		int[] count=new int[500];
		//Map<Integer,Integer> comp=new TreeMap<>();
		for(int i=0;i<500;i++){
			Set<Integer> dices=new HashSet<>();
			while(true){
				dices.add(rand.nextInt(6)+1);
				count[i]++;
				if(dices.size()==6){
					break;
				}
			}
		}
		//System.out.println(Arrays.toString(count));
	}
}
