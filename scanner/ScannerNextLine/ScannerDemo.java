

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String args[])
    {
       Scanner scan= new Scanner(System.in);
	   // 从键盘接收数据

		// next方式接收字符串
		System.out.println("nextline 方式接收: ");

		//判断是否还有输入

		if(scan.hasNextLine()){
			String str2 = scan.next();
			System.out.println("输入的数据为："+str2);
			
		}
	   
    }
}
