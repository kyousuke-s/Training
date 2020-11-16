import java.util.*;
public class Q2{
	public static void main(String[] args){
		int[][] elements={
			{15,34,12},
			{21,3,4,12},
			{12,34},
		};
		System.out.println(elements[1][2]);//4

		int[][] elements2=new int[3][];
		elements2[0]=new int[]{15,34,12};
		elements2[1]=new int[]{21,3,4,12};
		elements2[2]=new int[]{12,34};
		System.out.println(elements[2][1]);//34

		int[][] elements3=new int[3][];
		elements3[0]=new int[3];
		elements3[0][0]=15;
		elements3[0][1]=34;
		elements3[0][2]=12;
		elements3[1]=new int[4];
		elements3[2]=new int[2];
	}
}
