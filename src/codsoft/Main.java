package codsoft;

public class Main {
	public static void main(String[] args) {
        // Create a bank account with an initial balance of $1000
        Bankaccount account = new Bankaccount(0000.00);

        // Create an ATM instance with the bank account
        ATM atm = new ATM(account);

        // Run the ATM
        atm.run();
    }
}
