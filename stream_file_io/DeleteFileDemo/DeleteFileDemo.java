/*
下面是一个演示 InputStream 和 OutputStream 用法的例子：
*/
/*

删除目录或文件
删除文件可以使用 java.io.File.delete() 方法。
以下代码会删除目录 /tmp/java/，需要注意的是当删除某一目录时，必须保证该目录下没有其他文件才能正确删除，否则将删除失败。
测试目录结构：


*/
import java.io.*;
public class DeleteFileDemo{
	public static void main(String args[]) {
		File folder = new File("./test");
		deleteFolder(folder);
	
	
	}
	public static void deleteFolder(File folder){
	File[] files=  folder.listFiles();
	if(files != null){
		for(File f:files){
			if(f.isDirectory()){
				deleteFolder(f);
				}else{
					f.delete();
				}
			}
		}
		folder.delete();
	}
	
}
