package controlstr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Amstrong {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Num:");
		int a=Integer.parseInt(br.readLine());
		int b=a,r;
		int c=a;
		double sum=0;
		int count=0;
		while(c!=0)
		{
			count=count+1;
			c=c/10;
		}
		while(a!=0)
		{
			r=a%10;
			sum=sum+Math.pow(r,count);
			a=a/10;
			
			
		}
		System.out.println(sum);
		if(sum==b)
		{
			System.out.println("Amstrong num");
		}
		else
		{
			System.out.println("Not Amstrong num ");
		}
				
	}

}
