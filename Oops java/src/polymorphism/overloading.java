package polymorphism;

import java.util.Scanner;

public class overloading {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		employe e=new employe();
		System.out.println("********SAFA TRAVELS******");
		System.out.println("FROM:");
		
		String n1=s.next();
		System.out.println("TO");
		String n2=s.next();
		System.out.println("RATE:");
	    int n3=s.nextInt();
	    System.out.println("GST:25%");
	    int j = 0;
	    System.out.println(n1 +" to "+ n2 );
		e.travel1(n1);
		
		e.travel1(n2,j);
		String w = null;
		String v = null;
		
		e.travel1(n3,w,v);
	
		
	}
	


}
