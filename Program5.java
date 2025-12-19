package Assignment1;

import java.util.Scanner;

/*Design a console-based Bank Management Program in Java that allows a user to create a bank account 
and perform basic banking operations such as 
deposit, 
withdrawal, 
balance enquiry, 
and account details display. 
The program should handle exceptions as required.*/

class BankAccount{
	
	private int accNo;
	private String name;
	private double balance;
	
	 BankAccount(int accNo, String name, double balance) {
	        this.accNo = accNo;
	        this.name = name;
	        this.balance = balance;
	    }
	 
	 void deposit(double amount) {
		 if(amount <= 0 ) {
			 throw new IllegalArgumentException("Invalid deposit amount");
		 }
		 
		 balance += amount;
		 System.out.println("Amount Deposited..Successfully!!");
		 System.out.println("Balance after deposit : " + balance);
	 }
	 
	 void withdrawal(double amount) {
		 if(amount <= 0 ) {
			 throw new IllegalArgumentException("Invalid withdrawal amount..");
		 }
		 
		 if(amount > balance)
			 throw new ArithmeticException("Insufficient balance.");
		 
		 balance -= amount;
		 System.out.println("Amount Withdrawal..Successfully!!");
		 System.out.println("Balance after withdrawal : " + balance);
	 }
	
	 void checkBalance() {
		 System.out.println("Current Balance : " + balance);
	 }
	 
	 void accountDetails() {
		 System.out.println("Account No: " + accNo);
	     System.out.println("Name: " + name);
	     System.out.println("Balance: " + balance);
	 }
	
}
public class Program5 {
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the account number : ");
		int accNo = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the account holder name : ");
		String name = sc.nextLine();
		System.out.println("Enter the total balance : ");
		double balance = sc.nextDouble();
		
		BankAccount acc = new BankAccount(accNo, name, balance);
		
		while(true) {
			System.out.println("\n 1. Deposit ; 2. Withdrawal ; 3. Balance Enquiry ; 4. Account Details ; 5. Exit");
		    System.out.println("Enter the choice : ");
			int choice = sc.nextInt();
			
			try {
			switch(choice) {
			case 1 : 
				System.out.println("Enter the amount to be deposited : ");
				double amountDeposit = sc.nextDouble();
				acc.deposit(amountDeposit);
				break;
			case 2 : 
				System.out.println("Enter the amount to be withdrawal : ");
				double amountWithdrawal = sc.nextDouble();
				acc.withdrawal(amountWithdrawal);
				break;
			case 3 : 
				System.out.println("Total Balance : ");
				acc.checkBalance();
				break;
			case 4 : 
				System.out.println("Account Details : ");
				acc.accountDetails();
				break;
			case 5 : 
				System.out.println("Exited!!");
				return;
				
			default : 
				System.out.println("Invalid Choice..");
					
				
			  }
			}catch(Exception e) {
				System.out.println("Error Message : " + e.getMessage());
			}
		}
	}
}


