package polymorphism;

import java.util.Scanner;

public class polcase {
	public static void main(String[] args)
	{

	Scanner s=new Scanner(System.in);


	System.out.println("Enter the Telephone Bill Number :");
	int a=s.nextInt();
	System.out.println("Enter the Customer Name :");
	String b=s.nextLine();s.nextLine();
	   System.out.println("Enter the Number of Calls made :");
	   int c=s.nextInt();
	   System.out.println("Enter the Cost per Call :");
	   int d=s.nextInt();
	 
	   System.out.println("Enter the Current Bill Number :");
	   int g=s.nextInt();
	System.out.println("Enter the Customer Name :");
	String h=s.nextLine();s.nextLine();
	   System.out.println("Enter the Number of units used :");
	   int i=s.nextInt();
	   System.out.println("Enter the Cost per units :");
	   int j=s.nextInt();
	   TelephoneBill tb=new TelephoneBill(a, b, c, d);
	   CurrentBill cb=new CurrentBill(g,h,i,j);
	   Bill bi=new Bill(a,b);
	   bi.generateBill();
	   tb.generateBill();
	   Bill bil=new Bill(g,h);
	   bil.generateBill();
	   cb.generateBill();
	   
	 
	}

	}
	class Bill
	{
	private int billno;
	private String name;

	Bill(int billNumber,String name)
	{
	this.billno=billNumber;
	this.name=name;
	}
	public void generateBill()
	{
	System.out.println("BillNumber is :"+billno);
	System.out.println("Name :"+name);

	}
	}
	class TelephoneBill extends Bill
	{
	private int numberOfCallsMade;
	private double costPerCall;
	double total1;

	TelephoneBill(int a, String b,int c,int d)
	{

	super(a, b);
	numberOfCallsMade=c;
	costPerCall=d;

	}
	public void generateBill()
	{
	total1=numberOfCallsMade*costPerCall;
	System.out.println("Telephone Bill Amount "+total1);
	}

	}
	class CurrentBill extends Bill
	{
	private int numberOfUnitsConsumedof;
	private double costPerUnit;
	double total=0;

	CurrentBill(int a, String b,int c,double d)
	{

	super(a, b);
	numberOfUnitsConsumedof=c;
	costPerUnit=d;

	}
	public void generateBill()
	{
	total=numberOfUnitsConsumedof*costPerUnit;
	System.out.println("Current Bill amount "+total);

	}


	}
	


