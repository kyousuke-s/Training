import java.io.*;
import java.util.*;
public class Q5{
	public static void main(String[] args) throws Exception{
		FileInputStream fis=new FileInputStream("data.csv"); 
		InputStreamReader isr=new InputStreamReader(fis,"utf-8");
		BufferedReader br=new BufferedReader(isr);
		String line;
		while((line=br.readLine()) !=null){
			System.out.println(line);
		}
		br.close();
	}
}
