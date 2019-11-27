package casestudies;


	import java.util.Scanner;

	public class bookinhert {
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);

	System.out.println("enter the number of persone");
	int a=s.nextInt();
	System.out.println("enter the number of days");
	int b =s.nextInt();
	System.out.println("enter the room");
	String AC=s.next();
	System.out.println("enter the tarriff for a single person");
	int c=s.nextInt();
	Seasonbooking st=new Seasonbooking();

	st.setperson(a);
	st.getdays(b);
	st.gettariff(c);
	a=st.setPerson();
	b=st.setDays();
	c=st.settariff();
	bookingsup sk=new bookingsup();

	sk.show(a,b,c);
	}

	}



