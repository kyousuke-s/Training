import java.util.*;
public class Jn1_2{
	public static void main(String[] args){
		int r=new Random().nextInt(10);
		System.out.printf("%dは%sです。%n",r,(r%2==0)?"偶数":"奇数");
	}
}
