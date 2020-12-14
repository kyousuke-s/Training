import java.io.*;
import java.util.*;
public class Lesson4{
	public static void main(String[] args){
		try{
			showMessage();
		}catch(InterruptedException e){
			;
		}
	}
	static void showMessage() throws InterruptedException{
		System.out.println("表示します");
		Thread.sleep(2000);
		System.out.println("表示終了");
	}
}
