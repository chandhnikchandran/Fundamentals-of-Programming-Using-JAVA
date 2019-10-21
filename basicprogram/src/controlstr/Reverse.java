package controlstr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int sum=0;
		System.out.println("Enter num");
		int a=Integer.parseInt(br.readLine());
		do
		{
			System.out.println("Enter num");
			a=Integer.parseInt(br.readLine());
			if(a>0)
			{
				sum=sum+a;
			}
			
		}while(a>0);
			System.out.println(sum);
	
	}

}
