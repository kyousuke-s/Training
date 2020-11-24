import java.util.*;
public class Test{
	public static void main(String[] args){
		System.out.println("--- 十干十二支検索 ---");
		System.out.print("あなたの生まれ年を西暦で入力>");
		int year=new Scanner(System.in).nextInt();
		String myOZodiac=orientalZodiac(year);
		System.out.println("あなたの干支は"+myOZodiac+"です");
	}

	public static String orientalZodiac(int a){
		String[][] oZodiac={{"庚(かのえ)","辛(かのと)","壬(みずのえ)","癸(みずのと)","甲(きのえ)","乙(きのと)","丙(ひのえ)","丁(ひのと)","戊（つちのえ）","己(つちのと)"},{"申","酉","戌","亥","子","丑","寅","卯","辰","巳","午","未"}};
		String ans="";
		for(int i=0;i<oZodiac.length;i++){
			for(int j=0;j<oZodiac[i].length;j++){
				if(a%oZodiac[i].length==j){
					ans+=oZodiac[i][j];
				}
			}
		}
		return ans;
	}
}
