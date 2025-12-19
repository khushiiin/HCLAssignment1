package Assignment1;

import java.util.Scanner;

//A class sixth student required to solve basic mathematics problems. For this he/ she needs to perform 
//operations such as 
//addition, 
//subtraction, 
//multiplication, 
//division, 
//remainder, 
//square, 
//cube, 
//and absolute.
//Write a program using methods to perform these basic operations.

public class Program1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the first number : ");
		int num1 = s.nextInt();
		System.out.print("Enter the second number : ");
		int num2 = s.nextInt();
		
		System.out.println("Addition of a and b : "  + add(num1,num2));
		System.out.println("Subtraction of a and b : "  + sub(num1,num2));
		System.out.println("Multiplication of a and b : "  + mul(num1,num2));
		System.out.println("Division of a and b : "  + div(num1,num2));
		System.out.println("Remainder of a/b : "  + rem(num1,num2));
		System.out.println("Square of a : "  + sq(num1));
		System.out.println("Cube of a : "  + cube(num1));
		System.out.println("Absolute of a : "  + absolute(num1));
		
		s.close();
	}

	private static int absolute(int num1) {
		return Math.abs(num1);
	}

	private static int cube(int num1) {
		return num1*num1*num1;
	}

	private static int sq(int num1) {
		return num1*num1;
	}

	private static int rem(int num1, int num2) {
		return num1%num2;
	}

	private static double div(int num1, int num2) {
		return (double) num1/num2;
	}

	private static int mul(int num1, int num2) {
		return num1*num2;
	}

	private static int sub(int num1, int num2) {
		return num1-num2;
	}

	private static int add(int num1, int num2) {
		return num1+num2;
	}
	
}