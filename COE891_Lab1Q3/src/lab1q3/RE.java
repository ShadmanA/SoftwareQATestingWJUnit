package lab1q3;

import java.util.*;
import java.io.*;
import java.util.regex.*;
public class RE {

	// Method 1
	// To check whether number is valid or not
	public static boolean checkPhoneNumber(String s)
	{
	 Pattern p = Pattern.compile("^(\\+\\d{1,3}( )?)?((\\(\\d{1,3}\\))|\\d{1,3})[- .]?\\d{3,4}[- .]?\\d{4}$");

		Matcher m = p.matcher(s);
		return (m.matches());
	}

	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a phone number: ");
		String input = sc.nextLine();
		boolean wasPhoneNum = checkPhoneNumber(input);
		System.out.println("\nThat was"+(wasPhoneNum? "" : "n't")+" a phone number.");
	}
}
