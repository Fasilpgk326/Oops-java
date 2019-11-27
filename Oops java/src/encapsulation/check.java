package encapsulation;

import java.util.Scanner;

public class check { 
	public static void main(String[] arg)
	{Scanner s=new Scanner(System.in);
	emp1 e=new emp1();	
		do
		{
		
		System.out.println("****EMPLOYEE*****");
		System.out.println("enter the number");
		e.setN(s.nextInt());
	    System.out.println("enter the name" );
		e.setName(s.next());
		System.out.println("Enter your Address");
		e.setAdd(s.next());
		System.out.println("Contact Number");
		e.setCont(s.next());
		System.out.println("E-MAIL ID");
		e.setEmail(s.next());
		System.out.println("Enter your proof type");
		e.setProof(s.next());
		System.out.println("Proof ID");
		e.setId(s.next());
		
		}
		while(e.getName()==null||e.getAdd()==null||e.getEmail()==null);
		e.show();
	}
}