package fcu.iecs.oop;

import java.util.Scanner;
public class KeyboardScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a interger :");
		int integer = keyboard.nextInt();
		System.out.print("Enter a float point number :");
		float number = keyboard.nextFloat();
		System.out.print("Enter a you name :");
		String name = keyboard.next();
		float answer = integer * number;
		System.out.print("Hi " + name + ",the multiplication of " + integer + " and " 
		+ number + " is ");
		System.out.printf("%e",answer);
	}
}
