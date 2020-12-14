import java.io.*;
import java.util.*;
public class Lesson1{
	public static void main(String[] args) throws Exception{
		//追記するときは第二引数にtrueをいれる(アペンドトゥルー)
		FileWriter fw=new FileWriter("data.txt",true);
		fw.write("hello!");
		fw.close();
	}
}
