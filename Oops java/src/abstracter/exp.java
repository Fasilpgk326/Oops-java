package abstracter;

import java.util.Scanner;

public class exp {
public static void main(String[] arg)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the name");
	String name=s.next();
	System.out.println("Enter the Id");
	int id =s.nextInt();
	System.out.println("enter the 5 mark");
	int m1=s.nextInt();
	int m2=s.nextInt();
	int m3=s.nextInt();
	int m4=s.nextInt();
	int m5=s.nextInt();
	float avra=0;
	int total;
	total=m1+m2+m3+m4+m5;
	avra=total/5;
	teachers st=new teachers();
	st.total(total);
	st.avr(avra);
	st.stud(name, id);
	
	
}
	
}
 abstract class details{
	 
	abstract void total(int total);
	abstract void avr(float avra);
	public void stud(String name, int id)
	{
					 System.out.println("NAME : "+name);
				System.out.println("ID :"+id);
		
	}
	
 }
 class teachers extends details{

	public void total(int total)
	{
       
		System.out.println("TOTAL :"+total);
		if(total>450&&total<500)
			
			System.out.println("RANK :"+1);

		if(total>400&&total<=449)
			System.out.println("RANK :"+2);
		if(total>300&&total<=339)
			System.out.println("RANK :"+3);
		if(total>200&&total<=229)
			System.out.println("RANL :"+4);
	}
	void avr(float avra) {
		// TODO Auto-generated method stub
		System.out.println("AVR :"+avra);
		
	}
	
}