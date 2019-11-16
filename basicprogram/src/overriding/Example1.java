package overriding;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		Demo obj=new Demo();
		obj.disp();
	}
}
class ABC{
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("Parent class");
	}
	
}
class Demo extends ABC {

	public void disp() {
		
		// TODO Auto-generated method stub
		System.out.println("Child class");
		
	}
	
}
