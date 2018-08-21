/*从控制台读取字符串
从标准输入读取一个字符串需要使用 BufferedReader 的 readLine() 方法。
它的一般格式是：
String readLine( ) throws IOException
下面的程序读取和显示字符行直到你输入了单词"end"。

*/
import java.io.*;
public class BRReadLines{
	public static void main(String args[])throws IOException{
		char c;
		// 使用 System.in 创建 BufferedReader
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("输入字符，按下 'q' 键退出");
		String str;
		System.out.println("Enter lines of text");
		System.out.println("Enter 'end' to quit");

		
		//读取字符
		do{
			str=br.readLine();
			System.out.println(str);
		}while(!str.equals("end"));
		
	}
	
}
