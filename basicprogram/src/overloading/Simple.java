package overloading;

import java.util.Scanner;

public class Simple {
public static void main(String[] arg)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter three no's:");
	int n1=s.nextInt();
	int n2=s.nextInt();
	int n3=s.nextInt();
	Add a=new Add();
	a.add(n1);
	a.add(n1,n2);
	a.add(n1,n2,n3);
	
}
}
class Add
{

	public void add(int n1) {
		// TODO Auto-generated method stub
		System.out.println("1st Numer is:"+n1);
	}

	public void add(int n1, int n2, int n3) {
		// TODO Auto-generated method stub
		System.out.println("n1+n2+n3="+(n1+n2+n3));
	}

	public void add(int n1, int n2) {
		// TODO Auto-generated method stub
		System.out.println("n1+n2="+(n1+n2));
	}
	
}
