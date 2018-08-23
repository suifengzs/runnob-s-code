import java.util.Scanner;
//import .Employee;
public class Salary extends Employee{
	private double salary;
	private Scanner scan=new Scanner(System.in);
	public Salary(String name,String address,int number,double salary){
		super(name,address,number);
		setSalary(salary);
	}
	
	public void maileCheck(){
		System.out.println("Within mailCheck of Salary class ");
		System.out.println("Mailing check to"+getName());
	}
	public double getSalary(){
		return salary;
	}
	public void setSalary(double newSalary){
		if(newSalary >= 0.0){
			salary=newSalary;
		}
	}
	public double computerPay(){
		System.out.println("Computing salary pay for"+getName());
		return salary/52;
	}
	 boolean printinfo(){

	 	String str =null;
		System.out.println("Tell me loudly ,dog dog means ");
		if(scan.hasNextLine()){
			str = scan.nextLine();
		}
		if(str.equals("smh==dog")){
			System.out.println("I think you are right");
			return true;
		}else {
			return false;
		}
	}
}
