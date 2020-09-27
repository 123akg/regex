package com.regex;

import java.util.regex.*; 
import java.util.*;

public class RegexUC1 {
	
	public static boolean isValidFirstName(String fname) 
	{ 

		String regex = "^[A-Z]{1}[a-zA-Z]{2,}";
		Pattern ptrn = Pattern.compile(regex); 
		Matcher match = ptrn.matcher(fname); 
		return match.matches(); 
	} 

	public static void main(String args[]) 
	{ 
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the first name: ");
		String fname = sc.nextLine();
		System.out.println( 
			fname + " can be a first name??: "
			+ isValidFirstName(fname)); 
	} 

}
