package decisionmaking;

import java.util.Scanner;

public class Falleg1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a num b/w 1-100:");
		int n=s.nextInt();
		int t=0;
		int r=n%10;
		int c=n/10;
		if(c!=0)
		{
			switch(r)
			{
			case 1:
			case 2:
			case 6:
				t=t+3;
				break;
			case 4:
			case 5:
			case 9:
				t=t+4;
				break;
			case 3:
			case 8:
			case 7:
				t=t+5;
				break;
			}
			switch(c)
			{
			case 2:
			case 3:
				t=t+6;
				break;
				
				
			}
		}
		else
		{
			switch(r)
			{
			case 1:
			case 2:
			case 3:
				t=t+6;
				break;
			}
		}
		
		System.out.println(t);	
	}
	

}
