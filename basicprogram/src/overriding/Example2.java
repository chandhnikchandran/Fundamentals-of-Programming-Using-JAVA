package overriding;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		Demo1 obj=new Demo1();
		obj.disp();
	}
}
class ACD{
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("Parent class");
	}
	
}
class Demo1 extends ACD {

	public void disp() {
		super.disp();
		// TODO Auto-generated method stub
		System.out.println("Child class");
		//super.disp();
		
	}
}
	


