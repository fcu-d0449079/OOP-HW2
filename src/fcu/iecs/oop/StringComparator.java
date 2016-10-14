package fcu.iecs.oop;

import java.util.Scanner;
public class StringComparator {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner StringComparator = new Scanner(System.in);
		String str1,str2;
		do{
		System.out.print("Enter a string 1 :");
		str1 = StringComparator.next();
		System.out.print("Enter a string 2 :");
		str2 = StringComparator.next();	
		if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("The two strings are same.");
			break;
		}
		else
		{
			System.out.println("The two string are not same.");
		
			}
		}while(str1==str2);

	}
}


