package b;
/*
虚方法
我们将介绍在Java中，当设计类时，被重写的方法的行为怎样影响多态性。
我们已经讨论了方法的重写，也就是子类能够重写父类的方法。
当子类对象调用重写的方法时，调用的是子类的方法，而不是父类中被重写的方法。
要想调用父类中被重写的方法，则必须使用关键字super。

*/

import a.Employee;
public class Salary extends Employee{
	private double salary;
	public Salary(String name,String address,int number,double salary){
		super(name,address,number);
		System.out.println("Salary 构造函数");
		setSalary(salary);
	}
	public void mailCheck(){
		System.out.println("Salary 类的mailCheck 方法");
		System.out.println("邮寄支票给: "+getName()+", 工资为: "+salary);
	}
	public double getSalary(){
		return salary;
	}
	public void setSalary(double newSalary){
		if(newSalary >= 0.0){
			salary = newSalary;
		}
	}
	public double computerPay(){
		System.out.println("计算工资，付给："+getName());
		return salary/52;
	}
	
}
