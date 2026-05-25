
import java.util.Scanner;

class Bank {
	// Private instance variable for the name of the bank
	private String bankName;

	// Private static variable for the singleton instance
	private static Bank bankObj;

	// Private constructor to prevent instantiation
	private Bank() {
		// Constructor is empty or can initialize defaults if needed
	}

	// Public static method to get the single instance of Bank
	public static Bank getBankInstance() {
		// If the instance is null, create a new instance
		if (bankObj == null) {
			bankObj = new Bank();
		}
		return bankObj;
	}

	/*
	 * 
	 * 
	 * public static synchronized Bank getBankInstance() { if (bankObj == null) {
	 * bankObj = new Bank(); } return bankObj; }
	 */

	// Setter method for bankName
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	// Getter method for bankName
	public String getBankName() {
		return bankName;
	}
}

public class Main {
	public static void main(String[] args) {
		// Create a scanner object for user input
		Scanner scanner = new Scanner(System.in);

		// Get the single instance of the Bank class
		Bank bank = Bank.getBankInstance();

		// Prompt the user to enter the bank name
		System.out.println("Enter Bank Name");
		String name = scanner.nextLine();

		// Set the bank name using the setter method
		bank.setBankName(name);

		// Get the bank name using the getter method and print it
		System.out.println("Bank name is " + bank.getBankName());

		// Close the scanner
		scanner.close();
	}
}
