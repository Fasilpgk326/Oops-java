package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patmatches {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		Pattern p=Pattern.compile(".@");//accept single character
		Matcher m=p.matcher("a@");//check for match in pattern
		Boolean b=m.matches();//return boolean value after checking matches
		System.out.println(b);
	}

}
