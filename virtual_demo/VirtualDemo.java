
/*
虚方法
我们将介绍在Java中，当设计类时，被重写的方法的行为怎样影响多态性。
我们已经讨论了方法的重写，也就是子类能够重写父类的方法。
当子类对象调用重写的方法时，调用的是子类的方法，而不是父类中被重写的方法。
要想调用父类中被重写的方法，则必须使用关键字super。

*/
import a.Employee;
import b.Salary;

public class VirtualDemo{
	public static void main(String[] args){
		Salary s = new Salary("员工 A","北京",3,3600.00);
		Employee e = new Salary("员工 B","上海",2,2400.00);
		System.out.println("使用 Salary 的引用调用 mailCheck -- ");
		s.mailCheck();
		System.out.println("\n使用 Employee 的引用调用 mailCheck --");
		e.mailCheck();
	}
	
}

/*
例子解析
实例中，实例化了两个 Salary 对象：一个使用 Salary 引用 s，另一个使用 Employee 引用 e。
当调用 s.mailCheck() 时，编译器在编译时会在 Salary 类中找到 mailCheck()，执行过程 JVM 就调用 Salary 类的 mailCheck()。
因为 e 是 Employee 的引用，所以调用 e 的 mailCheck() 方法时，编译器会去 Employee 类查找 mailCheck() 方法 。
在编译的时候，编译器使用 Employee 类中的 mailCheck() 方法验证该语句， 但是在运行的时候，Java虚拟机(JVM)调用的是 Salary 类中的 mailCheck() 方法。
以上整个过程被称为虚拟方法调用，该方法被称为虚拟方法。
Java中所有的方法都能以这种方式表现，因此，重写的方法能在运行时调用，不管编译的时候源代码中引用变量是什么数据类型。
*/

