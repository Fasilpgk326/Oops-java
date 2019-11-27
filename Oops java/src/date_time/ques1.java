package date_time;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ques1 {
public static void main(String[] arg)
{
	int b;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the name");
	String name=s.next();
	System.out.println("Enter the adress");
	String add=s.next();
	System.out.println("no. of rooms");
	int n=s.nextInt();
	System.out.println("enter the persons");
	int per=s.nextInt();
	System.out.println("AC or Non-AC(AC/N)");
	String ac=s.next();
	
	System.out.println("Booking Date");
	String start=s.next();
    LocalDate ds=LocalDate.parse(start);
	
	System.out.println("Checkout date(format 2019-11-25)");
	String end=s.next();
	LocalDate de=LocalDate.parse(end);
	long d=ChronoUnit.DAYS.between(ds,de);//find total days
	double amount=0,amount1=0;
	int n1=Math.round(per/2);
	if(n1==n)
	{
		if(ac.contentEquals("AC")&(per%2!=0))
		{                        //FOR 3PERSONS ARE WTH AC
			amount1=(1000+150)*d*n-1;
			amount=amount1+(250)*d;
		}
		else if(ac.contentEquals("AC")&(per%2==0))
			
				{                    //2PERSON WITHOUT AC
			amount=(1000+150)*d*n;
			    }
		else if(ac.contentEquals("Non AC")&(per%2!=0))
		{
			amount=(1000)*d*n;
		}
		else if(ac.contentEquals("N")&(per%2==0))
		{
			amount=(1000+2)*d*n;
		}
		System.out.println("Reg-Details......");
		System.out.println("Name :"+name);
		System.out.println("Adress :"+add);
		System.out.println("No of rooms :"+n);
		System.out.println("No of guests :"+per);
		System.out.println("AC/non AC :"+ac);
		System.out.println("No of days:"+d);
		System.out.println("Amount :"+amount);
	}
	else
	{
		System.out.println("Book another details");
		
	}
}
}
