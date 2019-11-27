package polymorphism;

public class overriding {
	public static void main(String[] args)
	{
	 Offer off=new Offer();
	 Sale s=new Sale();
	 off.mart();
	 s.mart();
	}

}
class Offer
{
	void mart() {
		
	
	System.out.println("************BIG SALES**********");
	}	}
class Sale extends Offer
{
	void mart()
	{
		System.out.println("SHIRT: 50%OFF\n PANTS: 80%OFF\n KIDS WEAR: 65%OFF");
	}
}
	

