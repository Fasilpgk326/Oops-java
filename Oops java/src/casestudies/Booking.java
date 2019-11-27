package casestudies;

import java.util.Scanner;

public class Booking {
public static int booked[]=new int[25];
static void book() {
String ac,proceed;
String cot;
String cable;
String wifi;
String laundry;
Scanner s=new Scanner(System.in);
int total,b=0,c,d,e,f,i=1;
do {


System.out.println("Booking");
System.out.println("Please choose the service request");
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
if(b==1500)
{
System.out.println("AC");
}
else
{
System.out.println("non-AC");
}
if(c==0)
{
System.out.println("Single cot");
}
else
{
System.out.println("Double cot");
}
if(d!=0)
{
System.out.println("cable");
}
else
{
System.out.println("No cable");
}
if(e!=0)
{
System.out.println("wifi");
}
else
{
System.out.println("no wifi");
}
if(f!=0)
{
System.out.println("laundry");
}
else
{
System.out.println("no laundry");
}

System.out.println("Do you want to proceed");
proceed=s.next();
}while(proceed.equals(""));
if(proceed.equals("yes")==true)
{
booked[i]=1;
System.out.println("Thank you your room number is "+booked[i]);
i=i+1;
}
}

	


	
	}
	

