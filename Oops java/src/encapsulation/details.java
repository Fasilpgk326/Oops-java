package encapsulation;

import java.util.Scanner;

public class details {
	public static void main(String[] args)
	{
		Scanner s =new Scanner(System.in);
		employe em=new employe();
		display d=new display();
		System.out.println("*******REGISTERATION********");
		System.out.println("Entre your name");
		em.setName(s.next());
		System.out.println("Enter your Address");
		em.setAddress(s.next());
		System.out.println("Contact Number");
		em.setContact(s.nextInt());
		System.out.println("E-MAIL ID");
		em.setEmail(s.next());
		System.out.println("Enter your proof type");
		em.setProof(s.next());
		System.out.println("Proof ID");
		em.setId(s.next());
		//em.show();
		d.show(em.getName(),em.getAddress(),em.getContact(),em.getEmail(),em.getProof(),em.getId());
		
	} 

}
