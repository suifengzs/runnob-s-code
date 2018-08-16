/*
静态变量：
static 关键字用来声明独立于对象的静态变量，无论一个类实例化多少对象，它的静态变量只有一份拷贝。 静态变量也被称为类变量。局部变量不能被声明为 static 变量。
静态方法：
static 关键字用来声明独立于对象的静态方法。静态方法不能使用类的非静态变量。静态方法从参数列表得到数据，然后计算这些数据

对类变量和方法的访问可以直接使用 classname.variablename 和 classname.methodname 的方式访问。
如下例所示，static修饰符用来创建类方法和类变量

*/
public class InstanceCounter{
	private static int numInstance =0;
	protected static int getCount(){
		return numInstance;
		}
	private static void addInstance(){
		numInstance++;
		}
	InstanceCounter(){
		InstanceCounter.addInstance();
		}
	public static void main(String[] arguments){
		System.out.println("Starting with"+InstanceCounter.getCount()+"instance");
		for(int i=0;i<500;++i){
			new InstanceCounter();
		}
		System.out.println("Created"+InstanceCounter.getCount()+"instance");
	}
}
