package polymorphism;

public class Student {
	int total;
	public void display(String name, String r,String dpt)
	{
		System.out.println("NAME OF STUDENT : "+name);
		System.out.println("ROLL NUMBER : "+r);
		
		
		System.out.println("DEPARTMENT : "+dpt);

	}
	public void display(int a,int b,int c,int d,int e)
	{
		total=a+b+c+d+e;
		if(total>450&&total<500)
		
			System.out.println("RANK :"+1);

		if(total>400&&total<=449)
			System.out.println("RANK :"+2);
		if(total>300&&total<=339)
			System.out.println("RANK :"+3);
	}
	public void display() {
		float avg =(float)total/5;
		System.out.println("AVERAGE MARK OF THE STUDENT IS  "+avg);


	}
}
