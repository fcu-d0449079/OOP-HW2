package fcu.iecs.oop;

import java.util.Scanner;
public class PrintNumberInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner PrintNumberInWord = new Scanner(System.in);
		System.out.println("Enter a integer :");
		int number = PrintNumberInWord.nextInt();
		if(number < 10 && number > 0 ){
			if(number == 1)
				System.out.println("This input integer is 'ONE'");
			if(number == 2)
				System.out.println("This input integer is 'TWO'");
			if(number == 3)
				System.out.println("This input integer is 'THREE'");
			if(number == 4)
				System.out.println("This input integer is 'FOUR'");
			if(number == 5)
				System.out.println("This input integer is 'FIVE'");
			if(number == 6)
				System.out.println("This input integer is 'SIX'");
			if(number == 7)
				System.out.println("This input integer is 'SEVEN'");
			if(number == 8)
				System.out.println("This input integer is 'EIGHT'");
			if(number == 9)
				System.out.println("This input integer is 'NINE'");
		}
		else
			System.out.println("This input integer is 'OTHER'");
	}

}
