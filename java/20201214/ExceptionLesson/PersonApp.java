import java.util.*;
public class PersonApp{
	public static void main(String[] args){
		Person p=new Person();
		p.setAge(-128);
	}
}
class Person{
	int age;
	public void setAge(int age){
		if(age<0){
			throw new IllegalArgumentException("年齢は正の値を指定すべきですi。指定値="+age);
		}
		this.age=age;
	}
}
