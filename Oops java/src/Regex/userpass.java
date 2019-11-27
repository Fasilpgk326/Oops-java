package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class userpass {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
		 Pattern psw = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
		 Pattern p =Pattern.compile(regex);//regex convert to pattern type
         System.out.println("Enter the Email-Id");
         String email=s.next();
         Matcher em=p.matcher(email);//match emaild id then pattern stored to em
         System.out.println("Enter the password");
         String password=s.next();
         Matcher mat=psw.matcher(password);//match the psw patt nd ur password
         if(em.matches())
         {
        	 System.out.println("Valid Email Id");
         }
         else
         {
        	 System.out.println("Inavlid Email ID");
         }
	if(mat.matches())
	{
		System.out.println("Valid psw");
	}
	else
	{
		System.out.println("Invalis psw");
	}
	
	}

}
