#カプセル化

##アクセス制御

アクセス修飾子(private,package private,protected,public)

private:自分自身のクラスのみ  
package private:自分と同じパッケージに属するクラス  
protected:自分と同じパッケージに属するか、自分を継承した子クラス  
public:すべてのクラス

例:フィールド

```
	private String name;
	private int age;
	private double weight;
```

例:コンストラクタ
```
  public Dog(String name){
    this.setName(name);
  }
  public Dog(String name,int age){
    this(name);
    this.setAge(age);
  }
```

例:メソッド
```
  public String getName(){
    return this.name;
  }
  public int getAge(){
    return this.age;
  }
  public double getWeight(){
    return this.weight;
  }

```

例:
```
  public void setName(String name){
    this.name=name;
  }
  public void setAge(int age){
    if(age<0){
      this.age=0;
    }else{
      this.age=age;
    }
  }
  public void setWeight(double weight){
    if(weight<500d){
      throw new IllegalArgumentException("不正な値");
    }
    this.weight=weight;
  }
}

```

例:
```
```

```
public class Dog{
	private String name;
	private int age;
	private double weight;

	public Dog(String name){
		this.setName(name);
	}
	public Dog(String name,int age){
		this(name);
		this.setAge(age);
	}
	public Dog(String name,int age,double weight){
		this(name,age);
		this.setWeight(weight);
	}

	public void agePlus(){
		this.setAge(this.getAge()+1);
	}
	public void bow(){
		System.out.println(this.name+"は吠えた");
	}
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	public double getWeight(){
		return this.weight;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		if(age<0){
			this.age=0;
		}else{
			this.age=age;
		}
	}
	public void setWeight(double weight){
		if(weight<500d){
			throw new IllegalArgumentException("不正な値");
		}
		this.weight=weight;
	}
}
```
