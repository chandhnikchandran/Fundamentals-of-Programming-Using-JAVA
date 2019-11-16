package fibonacci;

import java.util.Scanner;

public class Duplicateno {
public static void main(String[] arg)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter limit");
	int n=s.nextInt();
	int a[]=new int[n];
	int t[]=new int[n];
	int i,j;
	
	for(i= 0;i<n;i++) {  
        for(j=i+1;j<n; j++) {  
            if(a[i] == a[j])  
              printf("%d ",a[j]);
        }
	}
	
}
}
