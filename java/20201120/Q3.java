import java.util.*;
public class Q3{
	public static void main(String[] args){
		System.out.print("体重を入力してください(kg)>");
		double weight=new Scanner(System.in).nextDouble();
		System.out.print("身長を入力してください(cm)>");
		double height=new Scanner(System.in).nextDouble();
		double bmi=calcBMI(weight,height);
		System.out.printf("体重:%.1fkg,身長:%.1fcmのBMIは%.1fです。%n",weight,height,bmi);
	}
	public static double calcBMI(double a,double b){
		return a/((b/100)*(b/100));
	}
}
