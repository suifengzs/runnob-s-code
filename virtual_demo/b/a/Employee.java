package a;
/*
虚方法
我们将介绍在Java中，当设计类时，被重写的方法的行为怎样影响多态性。
我们已经讨论了方法的重写，也就是子类能够重写父类的方法。
当子类对象调用重写的方法时，调用的是子类的方法，而不是父类中被重写的方法。
要想调用父类中被重写的方法，则必须使用关键字super。

*/
public class Employee{
	private String name;
	private String address;
	private int number;
	public Employee(String name,String address,int number){
		System.out.println("Employee 构造函数");
		this.name =name ;
		this.address = address;
		this.number = number;
	}
	public void mailCheck(){
		System.out.println("邮寄支票给: "+this.name+" "+this.address);
	}
	public String toString(){
		return name+" "+address+" "+number;
	}
	public String getName(){
		return name;
	}

	public String getAddress(){
		return address;
	}
	public void setAddress(String newAddress){
		address=newAddress;
	}
	public int getNumber(){
		return number;
	}
}
