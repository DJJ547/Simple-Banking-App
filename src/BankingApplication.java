import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount obj1 = new BankAccount("David", "@00277153");
		obj1.showMenu();
	}
}
	
	class BankAccount {
		int balance;
		int previousTransaction;
		String customerName;
		String customerID;
		
		//constructor
		BankAccount(String name, String id){ //constructor should have the same name asa the class!!
			customerName = name;
			customerID = id;
		}
		
		void deposit(int amount) {
			if(amount > 0) {
				balance = balance + amount;
				previousTransaction = amount;
			}
		}
		
		void withdraw(int amount) {
			if(amount > 0) {
				balance = balance - amount;
				previousTransaction = -amount; //shows a minus transaction
			}
		}
		
		void getPreviousTransaction() {
			if(previousTransaction > 0) {
				System.out.println("Deposit: " + previousTransaction);
			}else if(previousTransaction < 0) {
				System.out.println("Withdrawn: " + Math.abs(previousTransaction));
			}else {
				System.out.println("No transaction occured");
			}
		}
		
		void showMenu() {
			char option = '\0';
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Welcome " + customerName);
			System.out.println("Your ID is " + customerID);
			System.out.println("A. Check Balance");
			System.out.println("B. Deposit");
			System.out.println("C. Withdrawn");
			System.out.println("D. previous transacction");
			System.out.println("E. Exit");
			
			do {
				System.out.println("*****************");
				System.out.println("Enter an option");
				System.out.println("*****************");
				option = scanner.next().charAt(0);
				System.out.println("\n");
				
				switch(option) {
				case 'A':
					System.out.println("*****************");
					System.out.println("Balance = " + balance);
					System.out.println("*****************");
					break;
				case 'B':
					System.out.println("*****************");
					System.out.println("Enter an amount to deposit: ");
					System.out.println("*****************");
					int amount = scanner.nextInt();
					deposit(amount);
					break;
				case 'C':
					System.out.println("*****************");
					System.out.println("Enter an amount to withdrawn: ");
					System.out.println("*****************");
					int amount2 = scanner.nextInt();
					withdraw(amount2);
					break;
				case 'D':
					System.out.println("*****************");
					getPreviousTransaction();
					System.out.println("*****************");
					break;
				case 'E':
					System.out.println("*****************");
					System.out.println("Exited.");
					System.out.println("*****************");
					break;
				default:
					System.out.println("Invalid option! Please enter again.");
					break;
				}
			}while(option != 'E');
			System.out.println("Thank you for your services.");
		}
	}

