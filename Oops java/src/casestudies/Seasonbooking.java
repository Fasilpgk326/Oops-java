package casestudies;

import java.util.Scanner;

public class Seasonbooking extends bookingsup {
	int person;
	int days;
	int tariff;
	Scanner sc =new Scanner(System.in);
	void setperson(int psn)
	{
		this.person=psn;
		
	}
	void getdays(int dys)
	{
	this.days=dys;
	
	}
void gettariff(int tar)
{
	this.tariff=tar;
}
int setPerson()
{
	return this.person;
	
}
int setDays()
{
	return this.days;
}
int settariff()
{
	return this.tariff;
}
}
