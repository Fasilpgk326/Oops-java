package polymorphism;

import java.util.Scanner;

public class stud {
public static void main(String[] arg)
{ 
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the name");
	String n=s.nextLine();
	System.out.println("Enter the rollno");
	String r=s.nextLine();
	System.out.println("Enter the dep");
	String dep=s.nextLine();
	System.out.println("Enter the 5 marks");
	int a=s.nextInt();
	int b=s.nextInt();
	int c=s.nextInt();
	int d=s.nextInt();
	int e=s.nextInt();
	Student st=new Student();
	st.display(n, r, dep);
	st.display(a, b, c, d, e);
	st.display();
}
}
