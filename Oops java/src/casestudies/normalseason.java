package casestudies;

public class normalseason extends Season {

	
	public void lean(int p, int t, double ta, int di) 
	{
     int total=(int) (p*t*ta);
	 int ts=total-(di*p*t);
	 System.out.printf("Total tarrif:%d",ts);
	}

	public void details(int p, int t, String r, int m, int di, double ta) {
		
			System.out.println("Booking");
			System.out.printf("enter the number of :%d\n",p);
			System.out.printf("enter the number of days:%d\n",t);
			System.out.printf("enter the roomtype:%s\n",r);
			System.out.printf("enter the month:%d\n",m);
			System.out.printf("enter the discount:%s\n",di);
			System.out.printf("enter the tarrif for single person:%s\n",ta);
			
		}
	
		
	}


