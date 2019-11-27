package date_time;

import java.util.Calendar;

public class calendar {


public static void main(String[] arg)
{
	Calendar cl=Calendar.getInstance();
	System.out.println("At  present calendar years:"+cl.get(Calendar.YEAR));
	System.out.println("At present calendar day:"+cl.get(Calendar.DATE));
	System.out.println("Current time is :"+cl.getTime());
	cl.add(Calendar.DATE,-7);
	System.out.println("7 days ago:" +cl.getTime());
	cl.add(Calendar.MONTH,10);
	System.out.println("10 month later:"+cl.getTime());
	
	cl.add(Calendar.YEAR,10);
	System.out.println("10 years later:"+cl.getTime());
	
	
}
}
