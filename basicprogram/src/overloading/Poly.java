package overloading;

import java.util.Scanner;

public class Poly {
	
	
	  public static void main(String[] arg)
	  {
		  Scanner s =new Scanner(System.in);
	    System.out.println("1.Bread only");
	    System.out.println("2.Bread+jam");
	    System.out.println("3.Bread+jam+Butter");
	    System.out.println("Enter the choice");
	    int n=s.nextInt();
	    double kcal=4.1868;
	    int bread=74,butter=102,jam=26;
	    
	    Demo d=new Demo();
	    if(n==1)
	    {
	    d.show(n,bread);
	    }
	    else if(n==2)
	    {
	      d.show(n,bread,jam);
	    }
	    else
	    {
	      d.show(n,bread,jam,butter);
	    }
	  }
	}
	class Demo{
	  public void show(int n,int bread)
	  {
		  Scanner s =new Scanner(System.in);
	    System.out.println("Enter the number of bread");
	      int b=s.nextInt();
	    double x=b*bread;
	    double sum=x*4.1868;
	    System.out.printf("\n%.2fkj of generated from %.2f calories",sum,x);
	  }
	  public void show(int n, int bread, int jam, int butter) {
		// TODO Auto-generated method stub
		  Scanner s =new Scanner(System.in);
		  System.out.println("Enter the number of bread");
	      int b=s.nextInt();
	    System.out.println("Enter the number of teaspoon of jam");
	      int j=s.nextInt();
	    System.out.println("Enter the number of teaspoon of butter");
	      int bu=s.nextInt();
	    double x=b*bread;
	    double y=j*jam;
	    double z=bu*butter;
	    double t=x+y+z;
	    double sum=x*4.1868;
	    System.out.printf("\n%.2fkj of generated from %.2f calories",sum,y);
	}
	public void show(int n,int bread,int jam)
	  {
		Scanner s =new Scanner(System.in);
	    System.out.println("Enter the number of bread");
	      int b=s.nextInt();
	    System.out.println("Enter the number of teaspoon of jam");
	      int j=s.nextInt();
	      double x=b*bread;
		    double y=j*jam;
		    double t=x+y;
	    double sum=x*4.1868;
	    System.out.printf("\n%.2fkj of generated from %.2f calories",sum,t);
	  }
	  
	}

