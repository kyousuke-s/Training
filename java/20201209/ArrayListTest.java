import java.util.*;
public class ArrayListTest{
	public static void main(String[] args){
		ArrayList<Integer> points=new ArrayList<Integer>();
		points.add(10);
		points.add(80);
		points.add(75);
		points.add(90);
		points.add(0,25);
		//元からあった数値(75)が戻り値になってremovedにはいっている
		int removed=points.set(3,50);//25,10,80,50,90
		System.out.println(points.get(1));//10
		System.out.println(removed);//75
		for(int i:points){
			System.out.println(i);
		}
		for(int i=0;i<points.size();i++){
			System.out.println(points.get(i));
		}

		if(points.size() > 2){
		}
		if(points.size() > 0){
		}
		if(points.isEmpty()){
		}
		if(points.contains(90)){
		}
		//指定要素がArrayList内の何番目にあるかをint型で返す
		System.out.println(points.indexOf(10));//2
		//指定要素がArrayList内に無い場合
		//戻り値を必ずint型で受け取らなければいけないため負の値で返ってくる
		//(Javaの場合)
		System.out.println(points.indexOf(1000));//-1

		//削除された値を戻り値として受け取る場合
		removed=points.remove(2);//削除されるとひとつ前に詰められる
		System.out.println("削除された値"+removed);
		points.clear();

		Integer i1=Integer.valueOf(16);
		int i2=i1.intValue();

		String s1=String.valueOf(16);
		int i3=Integer.parseInt(s1);
	}
}
