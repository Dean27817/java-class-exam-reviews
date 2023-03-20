/*
 * Dean Morgan
 * 3/6/2023
 * this will be the review for the first exam in computer Science 1
 */

import java.util.Scanner;

public class HelpMe {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		double userNum;
		System.out.println("input a real number");
		userNum = scnr.nextInt();
		System.out.println("your number was " + userNum);
		
		///////////////////////////////////////////////Q3
		int y = 1;
		int x = 3;
		x -= y;
		System.out.println("the number is " + x);

		////////////////////////////////////////////////Q8
		char ch = 'y';
		System.out.println("the origional char was " + ch);
		ch = Character.toUpperCase(ch);
		System.out.println("now it is " + ch);

		////////////////////////////////////////////////Q12
		String s1 = "hey";
		System.out.println("type a word");
		String userString = scnr.next();
		int userStringNum = userString.length();
		System.out.println("your string was " + userStringNum + " letters long");
		System.out.println("our word was \"" + s1 + "\"");
		if (s1.equals(userString))
		{
			System.out.println("our words were the same");
		}
		else
		{
			System.out.println("our words were different");
		}

		////////////////////////////////////////////////Q13
		System.out.println("enter a number 1-5");
		int posNeg = scnr.nextInt();
		switch(posNeg)
		{
			case 1:
			System.out.println("negative");
				break;
			case 2:
			System.out.println("negative");
				break;
			case 3:
			System.out.println("neutral");
				break;
			case 4:
			System.out.println("neutral");
				break;
			case 5:
			System.out.println("positive");
				break;
			default:
			System.out.println("not a valid number");
		};

		////////////////////////////////////////////////Q14
		int loopNum = 0;
		int count = 0;
		int loopTotal = 0;
		System.out.println("enter a number");
		loopNum = scnr.nextInt();
		while (loopNum >= 0)
		{

			System.out.println("enter a number");
			loopTotal += loopNum;
			loopNum = scnr.nextInt();
			count++;
		}
		System.out.println("that last number was negative");
		System.out.println("you looped " + count + " times");
		System.out.println("your total was " + loopTotal);
		System.out.println("the average number was " + ((double)loopTotal)/((double)count));

		////////////////////////////////////////////////Q15
		scnr.close();
	}

}
