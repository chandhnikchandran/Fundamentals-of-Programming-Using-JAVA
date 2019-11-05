package casestudy1;

import java.util.Scanner;

public class Student {
	Scanner s=new Scanner(System.in);
	int i,j,k;
	String name;
	String rollno;
	String course;
	int age;
	void mark() {
		// TODO Auto-generated method stub
		System.out.println("mark1 "+i);
		System.out.println("mark2 "+j);
		System.out.println("mark3 "+k);
		System.out.printf("\nTotal=%d ",i+j+k);

		
	}
	
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Name:"+name);
		System.out.println("Rollno:"+rollno);
		System.out.println("Cource:"+course);
		System.out.println("Age:"+age);
		
		
		
		
	}
	void details() {
		// TODO Auto-generated method stub
		
		
	
	System.out.println("Enter Name:");
	name=s.next();
	System.out.println("Enter Roll.No:");
rollno=s.next();
	System.out.println("Course:");
	course=s.next();
	System.out.println("Age:");
	age=s.nextInt();
	System.out.println("Enter mark1");
	 i=s.nextInt();
	System.out.println("Enter mark2");
	 j=s.nextInt();
	System.out.println("Enter mark3");
	 k=s.nextInt();
	
	}
}

