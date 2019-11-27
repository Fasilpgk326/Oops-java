package date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class current {
public static void main(String[] arg)
{
	
//	for getting today date
	System.out.println("Today date");
	LocalDate date=LocalDate.now();
	System.out.println(date);
	
//	for getting the current time
	System.out.println("current time");
	LocalTime time=LocalTime.now();
	System.out.println(time);
	
	
//	for getting both time and date
	System.out.println("****current Date and Time*****");
	LocalDateTime dt =LocalDateTime.now();
	System.out.println(dt);
}
}
