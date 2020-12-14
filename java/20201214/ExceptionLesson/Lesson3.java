import java.io.*;
import java.util.*;
public class Lesson3{
	public static void main(String[] args){
		//追記するときは第二引数にtrueをいれる(アペンドトゥルー)
		try(FileWriter fw=new FileWriter("data.txt",true);){
			fw.write("hello!");
		}catch(Exception e){
			System.out.println("何らかの例外が発生");
		}
	}
}
