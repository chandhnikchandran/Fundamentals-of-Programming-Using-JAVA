package overloading;

import java.util.Scanner;

public class Example {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Name:");
		String name=s.next();
		System.out.println("Enter Roll.no:");
		String rollno=s.next();
		System.out.println("Dep:");
		String dep=s.next();
		System.out.println("Year:");
		int y=s.nextInt();
		System.out.println("Enter Marks:");
		System.out.println("Maths:");
		int m=s.nextInt();
		System.out.println("Physics:");
		int p=s.nextInt();
		System.out.println("Chemistry:");
		int c=s.nextInt();
		System.out.println("Biology:");
		int b=s.nextInt();
		System.out.println("English:");
		int e=s.nextInt();
		System.out.println("Malayalam:");
		int ma=s.nextInt();
		int total=0;
		double avg=0.0;
		
		Details ds=new Details();
		ds.display(name,rollno,dep,y);
		ds.display(m,p,c,b,e,ma);
		ds.display(m,p,c,b,e,ma,total,avg);
		
	}

}
class Details{

	public void display(String name, String rollno, String dep, int y) {
		// TODO Auto-generated method stub
		
		System.out.println("*************");
		System.out.println("Details :");
		System.out.println("---------------");
		System.out.println("Name: "+name);
		System.out.println("Rollno: "+rollno);
		System.out.println("Dep: "+dep);
		System.out.println("Year: "+y);
		
	}

	public void display(int m, int p, int c, int b, int e, int ma, int total, double avg) {
		// TODO Auto-generated method stub
		System.out.println("-----------");
		 total=m+p+c+b+e+ma;
		 avg=total/6;
		 System.out.println("Total Mark="+total);
		 System.out.println("Average Mark="+avg);
		 if(total>450)
		 {
			 System.out.println("1st Rank");
		 }
		 else if(total>350&&total<450)
		 {
			 System.out.println("2nd Rank");
		 }
		 else if(total>250&&total<350)
		 {
			 System.out.println("3rd Rank");
		 }
		 else if(total>150&&total<250)
		 {
			 System.out.println("4th Rank");
		 }
		 else
		 {
			 System.out.println("Faild");
		 }
		 
	}

	public void display(int m, int p, int c, int b, int e, int ma) {
		// TODO Auto-generated method stub
		System.out.println("***********");
		System.out.println("Marks :");
		System.out.println("-----------");
		System.out.println("Maths: "+m);
		System.out.println("Physics: "+p);
		System.out.println("Chemistry: "+c);
		System.out.println("Biology: "+b);
		System.out.println("English: "+e);
		System.out.println("Malayalam: "+ma);
		
	}
	
}
