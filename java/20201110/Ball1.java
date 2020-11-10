/*
import java.util.*;
public class Ball1{
	public static void main(String[] args){
		int[] balls={1,2,3,4,5};
		boolean[] isPicked={false,false,false,false,false};
		int[] old=new int[5];
		for(int i=0;i<balls.length;i++){
			while(true){
				int index=new Random().nextInt(balls.length);
				if(isPicked[index]){
					continue;
				}
				System.out.println(balls[index]);
				isPicked[index]=true;
				break;
			}
		}
	}
}
*/


import java.util.*;
public class Ball1{
	public static void main(String[] args){
		int[] balls={1,2,3,4,5};
		for(int i=0;i<balls.length;i++){
			int index=new Random().nextInt(balls.length-i);
			System.out.println(balls[index]);
			int temp=balls[index];
			balls[index]=balls[balls.length-1-i];
			balls[balls.length-1-i]=temp;
		}
	}
}
