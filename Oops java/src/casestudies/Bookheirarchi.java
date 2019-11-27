package casestudies;
import java.util.Scanner;
public class Bookheirarchi {

	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Number of persons");
	int p=s.nextInt();
	System.out.println("Enter Total number of days");
	int t=s.nextInt();
	System.out.println("Enter Tarrif per day");
	double ta=s.nextDouble();
	System.out.println("Enter the Room type");
	String r=s.next();
	System.out.println("Enter the month");
	int m=s.nextInt();
	int peakc=2;
	int di=25;
	Peakseason ps=new Peakseason();
	normalseason ls=new normalseason();
	switch(m)
	{
	case 1:
	case 2:
	case 3:
	case 7:
	case 8:
	case 9:
	case 10:
	 ls.details(p,t,r,m,di,ta);
	 ls.lean(p,t,ta,di);
	break;
	case 4:
	case 5:
	case 6:
	case 11:
	case 12:
	  ps.abc(p,t,r,m,peakc,ta);
	  ps.peak(p,t,ta,peakc);
	break;
	}
	}
	}
	class Season
	{
		public void abc(int p, int t, String r, int m, int peakc, double ta) 
		{
						System.out.println("Booking");
			System.out.printf("enter the number of persons:%d\n",p);
			System.out.printf("enter the number of days:%d\n",t);
			System.out.printf("enter the roomtype:%s\n",r);
			System.out.printf("enter the month:%d\n",m);
			System.out.printf("enter the peakcharge:%s\n",peakc);
			System.out.printf("enter the tarrif for single person:%s\n",ta);
          }
		
		

		

			
		}
		
