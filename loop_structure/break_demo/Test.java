public class Test{
	public static void main(String args[]){
		int [] numbers={10,20,30,40,50,60};
		for(int x:numbers){
			//x等于30时跳出循环
			if(x==30){
				break;
			}
			System.out.println(x);
			System.out.println("\n");
		}
	}
}
