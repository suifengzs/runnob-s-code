/*
final 修饰符
final 变量：
final 变量能被显式地初始化并且只能初始化一次。被声明为 final 的对象的引用不能指向不同的对象。但是 final 对象里的数据可以被改变。也就是说 final 对象的引用不能改变，但是里面的值可以改变。
final 修饰符通常和 static 修饰符一起使用来创建类常量

*/

public class Test{
	final int value =10;
	//下面是声明常量的实例
	public static final int BOXWIDTH=0;
	static final String TITLE="manager";

	public void changeValue(){

		value=12;//将输出一个错误
		}
	
}



