package polymorphism;

import java.util.Scanner;

public class poly3 {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		car c=new car();
		bike b=new bike();

		System.out.println("1)Car\n2)Bike");
		int op=s.nextInt();
		switch(op)
		{
		case 1:
	    System.out.println("Enter the details of car");
		System.out.println("Enter the color");
		String color=s.next();
		System.out.println("Enter the maximum speed");
		int speed=s.nextInt();
		System.out.println("Enter the maximum seat");
		int seat=s.nextInt();
		System.out.println("Enter the number of wheel");
		int wheel=s.nextInt();
		System.out.println("Enter the numberb of doors");
		int doors=s.nextInt();
		System.out.println("Enter the status of AC(ture/false)");
		String ac=s.next();
		c.details(color,speed,seat,wheel,doors,ac);
		break;
		
		case 2:
			 System.out.println("Enter the details of bike");
				System.out.println("Enter the color");
				String bcolor=s.next();
				System.out.println("Enter the maximum speed");
				int bspeed=s.nextInt();
				System.out.println("Enter the number of seat");
				int bseat=s.nextInt();
				System.out.println("Enter the numberb of wheel");
				int bwheel1=s.nextInt();
				System.out.println("Enter the status of diskbreak(ture/false)");
				String disk=s.next();
				b.details(bcolor,bspeed,bseat,bwheel1,disk);
				break;
			
		}
		
		
		
	}
}
class car
{
	
	
	public void details(String color2, int speed, int seat, int wheel, int doors, String ac)
	{
		System.out.println("CAR DETAILS");
		System.out.println("COLOR : "+color2);
		System.out.println("MAXIMUM SPEED : "+speed);
		System.out.println("NUMBER OF SEAT : "+seat);
		System.out.println("NUMBER OF WHEEL : "+wheel);
		System.out.println("doors : "+doors);
		System.out.println("AC : "+ac);
	
	}
}

class bike extends car
{

	public void details(String bcolor, int bspeed, int bseat, int bwheel1, String disk) {
		// TODO Auto-generated method stub
	
		System.out.println("BIKE DETAILS");
		System.out.println("COLOR : "+bcolor);
		System.out.println("MAXIMUM SPEED : "+bspeed);
		System.out.println("NUMBER OF SEAT : "+bseat);
		System.out.println("NUMBER OF WHEEL : "+bwheel1);
		
		System.out.println("disk : "+disk);
	
	}
	}

	
