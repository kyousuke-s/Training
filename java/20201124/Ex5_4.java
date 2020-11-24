public class Ex5_4{
	public static void main(String[] args){
		double bottom=10.0;
		double height=5.0;
		final double pi=3.14;
		double radius=5.0;
		double triangleArea=calcTriangleArea(bottom,height);
		System.out.printf("三角形の底辺の長さが%.1fcm、高さが%.1fcmの場合、面積は%.1f平方cm%n",bottom,height,triangleArea);
		double circleArea=calcCircleArea(radius,pi);
		System.out.printf("円の半径の長さが%.1fcmの場合、面積は%.1f平方cm%n",radius,circleArea);

	}
	static double calcTriangleArea(double a, double b){
		double area=a*b/2;
		return area;
	}
	static double calcCircleArea(double a,double b){
		double area=a*a*b;
		return area;
	}
}
