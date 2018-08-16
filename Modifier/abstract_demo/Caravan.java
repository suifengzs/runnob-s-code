/*
抽象类：
抽象类不能用来实例化对象，声明抽象类的唯一目的是为了将来对该类进行扩充。
一个类不能同时被 abstract 和 final 修饰。如果一个类包含抽象方法，那么该类一定要声明为抽象类，否则将出现编译错误。
抽象类可以包含抽象方法和非抽象方法

*/
abstract class Caravan{
	private double price;
	private String model;
	private String year;
	public abstract void goFast();//抽象方法
	public abstract void changeColor();
}
