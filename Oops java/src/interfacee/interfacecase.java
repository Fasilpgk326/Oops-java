package interfacee;

import java.util.Scanner;

public class interfacecase {
	public static void main(String[] args)
	{  
	int[] one=new int[25];
	   int i=1;
	Scanner s=new Scanner(System.in);
	newclass n1=new newclass();
	String co="",up="";
	int contact;
	String name,address,mail,type,proofid;
	do
	{
	System.out.println("Registration");
	System.out.println("Enter your name");
	name=s.next();
	System.out.println("Enter your address");
	address=s.next();
	System.out.println("Enter your contact number");
	contact=s.nextInt();
	System.out.println("Enter your email id");
	mail=s.next();
	System.out.println("Enter your proof type");
	type=s.next();
	System.out.println("Enter your proof id");
	proofid=s.next();
	            System.out.println("Thank you for registering..your id is "+i);
	            i++;
	            System.out.println("do you want to continue");
	            co=s.next();
	}while(co.equals("yes"));
	if(co.equals("no"))
	{
	System.out.println("do you want to update the email");
	   up=s.next();
	   if(up.equals("yes"))
	   {
	   System.out.println("Update email");
	System.out.println("enter new email id");
	   String email=s.next();;
	   n1.update();
	   }
	   
	   n1.show(name,address,contact,mail,type,proofid);
	}

	         


	}

	}
	interface abc
	{
	public void show(String name,String address,int contact,String mail,String type,String proofid);
	}
	interface bcd
	{
	public void update();
	}
	class newclass implements abc,bcd
	{

	public void show(String name,String address,int contact,String mail,String type,String proofid)
	{
	System.out.println("Your details are as follows");
	System.out.println("name:"+name);
	System.out.println("adsress:"+address);
	System.out.println("contact number:"+contact);
	System.out.println("email id:"+mail);
	System.out.println("proof type:"+type);
	System.out.println("proof id:"+proofid);


	}

	public void update()
	{



	System.out.println("Email updated");

	}
	}


