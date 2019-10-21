package controlstr;

import java.util.Scanner;

public class Patterneg1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i,j;
		for(i=0;i<4;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.printf("*");
			}
			System.out.printf("\n");	
		}
	}

}
