package casestudies;

import java.util.Scanner;

public class case2 
{
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		Booking b=new Booking();
		b.book();
	}
}
class Booking2
{
	public static int booked[]=new int[25];
	static void book()	
	{
	String ac,pr=null;
	String cot;
	String cable;
	String wifi;
	String laundry;
	Scanner s=new Scanner(System.in);
	int total=0,b=0,c,d,e,f,i=1,sta=0;
			
	do 
	{
	System.out.println("1.Book\n2.check status\n3.exit");
	System.out.println("Enter your choice");
	int n=s.nextInt();
	switch(n)
	{
  case 1:
	  System.out.println("Booking");
	  System.out.println("please choose the service required");
	System.out.println("AC/non-AC/(AC/nAC)");
	ac=s.next();
	if(ac.contentEquals("AC")==true)
	{
	b=1500 ;
	}
	else
	{
	b=700 ;
	}
	System.out.println("cot(Single/Double)");
	cot=s.next();
	if(cot.equals("Single")==true)
	{
	c=0;
	}
	else
	{
	c=350;
	}
	System.out.println("cable(C/nC)");
	cable=s.next();
	if(cable.equals("C")==true)
	{
	d=50;
	}
	else
	{
	d=0;
	}
	System.out.println("wifi(W/nW)");
	wifi=s.next();
	if(wifi.equals("W")==true)
	{
	e=200;
	}
	else
	{
	e=0;
	}
	System.out.println("laundry(L/nL)");
	laundry=s.next();
	if(laundry.equals("L")==true)
	{
	f=100;
	}
	else
	{
	f=0;
	}
	total=b+c+d+e+f;
	System.out.println("The total carge is Rs."+total);
	System.out.println("The sevices choosen are");
	System.out.println(ac);
	System.out.println(cot);
	System.out.println(cable);
	System.out.println(wifi);
	System.out.println(laundry);
	System.out.println("Do you want to proceed");
	pr=s.next();
	if(pr.equals("yes")==true)
	{
	booked[i]=1;
	System.out.println("Thank you your room number is "+i);
	i=i+1;
	}
	break;
	
  case 2:
      System.out.println("Check status");
      System.out.println("Enter your room number");
      int room=s.nextInt();
      if(booked[i]==0)
      {
    	  sta=1;
    	  System.out.println("Sorry this room is  not available");
      }
      else
      {
    	  sta=1;
    	  booked[i]=1;
    	  System.out.println("Room number %d is booked");
      }
      break;
	
  case 3:
  System.out.println("Successfully exited");
  return;
	}
	}
	while(pr.contentEquals("yes")||pr.contentEquals("no"));
}
}
