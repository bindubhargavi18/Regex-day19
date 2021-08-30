package day19regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserResgistration 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String firstname,lastname,phnNo,pwd;
		System.out.println("Enter First Name: ");
		firstname=sc.next();
		System.out.println(FirstName(firstname));
		System.out.println("Enter second Name: ");
		lastname=sc.next();
		System.out.println(secondName(lastname));
		String email1="abc@yahoo.com";
		String email2="abc-100@yahoo.com";
		String email3="abc.100@yahoo.com";
		String email4="abc111@abc.com";
		String email5="abc-100@abc.net";
		String email6="abc@abc.com.au";
		String email7="abc@gmail.com.com";
		String email8="abc+100@yahoo.com";
		System.out.println(email(email1));
		System.out.println(email(email2));
		System.out.println(email(email3));
		System.out.println(email(email4));
		System.out.println(email(email5));
		System.out.println(email(email6));
		System.out.println(email(email7));
		System.out.println(email(email8));
		System.out.println("Enter phone number:");
		phnNo=sc.next();
		System.out.println(phoneNumber(phnNo));
		System.out.println("Enter password:");
		pwd=sc.next();
		System.out.println(password(pwd));
		sc.close();
	}
	public static boolean FirstName(String fname)
	{
		String regex="^[A-Za-z]{1,}$";
		Pattern pattern = Pattern.compile(regex);
		if(pattern.matcher(fname).matches()) 
			return true;
		else
			return false;
	}
	public static boolean secondName(String sname)
	{
		String regex="^[A-Za-z]{1,}$";
		Pattern pattern = Pattern.compile(regex);
		if(pattern.matcher(sname).matches()) 
			return true;
		else
			return false;
	}
	public static boolean email(String mail)
	{
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		if(pattern.matcher(mail).matches()) 
			return true;
		else
			return false;
	}
	public static boolean phoneNumber(String number)
	{
		String regex="91?[0-9]{10}";
		Pattern pattern = Pattern.compile(regex);
		if(pattern.matcher(number).matches())
			return true;
		else 
			return false;
	}
	public static boolean password(String password)
	{
		String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";
		Pattern pattern = Pattern.compile(regex);
		if(pattern.matcher(password).matches())
			return true;
		else
			return false;
	}
}
