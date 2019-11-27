package encapsulation;

import java.util.Scanner;

public class stud {
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
		Student st=new Student();
		System.out.println("entere the name");
		
		st.setName(s.next());
		
	System.out.println("Enter the ID");
	
		st.setId(s.nextInt());
		System.out.println(st.getName());
		System.out.println(st.getId());
	}

}
