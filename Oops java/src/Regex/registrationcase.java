package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class registrationcase {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		String reg="^[0-9]*$";
		String d="[A-Z][.][a-z]*";
		String firstName = "[A-Z][a-z]*";
		String lastName  =  "[A-Z]+([ '-][a-zA-Z]+)*";
		String regex= "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
	    Pattern f=Pattern.compile(firstName);
	    Pattern l=Pattern.compile(lastName);
		Pattern p = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
	    Pattern R=Pattern.compile(reg);
		Pattern emi=Pattern.compile(regex);
		Pattern dp=Pattern.compile(d);		
	    System.out.println("Enter first name");
		String fname=s.next();
	    Matcher fn=f.matcher(fname); //fn
	    System.out.println("Enter the last name");
	    String Lname=s.next();
	    Matcher ln=l.matcher(Lname);//ln
	    System.out.println("Email id");
		String email=s.next();
		Matcher em=emi.matcher(email);//em
		System.out.println("Reg.no:");
        String regi=s.next();
        Matcher regist=R.matcher(regi);//regist
        System.out.println("Rank:");
        String ran=s.next();
        Matcher rank=R.matcher(ran);//rank
        System.out.println("Year:");
        String y=s.next();
        Matcher year=R.matcher(y);//year
        System.out.println("Dep:");
        String de=s.next();
        Matcher dep=dp.matcher(de);//dep
  if(fn.matches())
        {}
   else
        {
        	System.out.println(" fn invalid");
        }
        
 if(ln.matches())
 {}
 else
 {
 	System.out.println(" ln invalid");
 }
 
 if(em.matches())
 {}
 else
 {
 	System.out.println(" em invalid");
 }
 if(regist.matches())
 {}
 else
 {
 	System.out.println("reg invalid");
 }
 if(rank.matches())
 {}
 else
 {
 	System.out.println("rank invalid");
 }
 if(year.matches())
 {}
 else
 {
 	System.out.println("yr invalid");
 }
 if(dep.matches())
 {}
 else
 {
 	System.out.println(" dep invalid");
 }
        if(fn.matches()&&ln.matches()&&em.matches()&&regist.matches()&&rank.matches()&&year.matches()&&dep.matches())
        {
        	System.out.println("Password");
    		String password=s.next();
    		Matcher psw=p.matcher(password);//bw user pass nd pattern psw
               if(psw.matches())
               {
            	   System.out.println("User name :"+email);
                   System.out.println("Password :"+password);
              }
               else
               {
            	   System.out.println("wrong password");
               }
               System.out.println("Registration successful");
        }
        else 
        {
        	System.out.println("Registration invalid");
        }
        
		
	}

}
