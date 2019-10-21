package operators;
import java.util.Scanner;
public class Swap {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("First Input:");
		int a=s.nextInt();
		System.out.println("Second Input:");
		int b=s.nextInt();
		int t=a;
		 a=b;
		b=t;
		System.out.printf("a=%d\n",a);
		System.out.printf("b=%d",b);
		
		
	}
}
