package date_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class formatter {
	public static void main(String[] arg)
	{
		LocalDateTime dt=LocalDateTime.now();
		System.out.println("Befor formatting :"+dt);
		DateTimeFormatter format=DateTimeFormatter.ofPattern("E, dd/MMM/yyyy");
		String formatDate=dt.format(format);
	    System.out.println("After formatting :"+formatDate);
	}

}
