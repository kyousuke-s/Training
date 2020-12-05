import java.util.*;
public class Main{
	public static void main(String[] args){
		Animal[] animals=new Animal[3];
		//Animal[] animals={new Dog(john),new Cat(mike),new};
		animals[0]=new Dog("ジョン");
		animals[1]=new Cat("ミケ");
		animals[2]=new Pig("サム");
		
		for(Animal animal:animals){
			animal.makeNoize();
			//もしanimalの中身がCatインスタンスならば(ループ時には必須)
			if(animal instanceof Cat){
				//Catにダウンキャストしてsleepメソッドを呼び出す
				((Cat)animal).sleep();
			}
		}
		/*
		Cat cat=(Cat)animals[1];
		cat.sleep();
		((Cat)animals[1]).sleep();
		*/
	}
}
