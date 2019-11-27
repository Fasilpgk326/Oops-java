package polymorphism;

public class Superkey{
	public static void main(String[] args)
	{
	 
	 Sale1 s=new Sale1();
	
	 s.mart();
	}

}
class Offer1
{
	void mart() {
		
	
	System.out.println("************BIG SALES**********");
	}	}
class Sale1 extends Offer1
{
	void mart()
	{
		super.mart();
		System.out.println("SHIRT: 50%OFF\n PANTS: 80%OFF\n KIDS WEAR: 65%OFF");
	}
}
	

