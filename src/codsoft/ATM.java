package codsoft;
import java.util.Scanner;
public class ATM {
	private Bankaccount account;

    public ATM(Bankaccount account) {
        this.account = account;
    }

    public void displayMenu() {
        System.out.println("Welcome to the ATM!");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayMenu();
            System.out.print("Please select an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    boolean successWithdraw = account.withdraw(withdrawAmount);
                    if (successWithdraw) {
                        System.out.println("Withdrawal successful. New balance: $" + account.checkBalance());
                    } else {
                        System.out.println("Withdrawal failed. Insufficient funds or invalid amount.");
                    }
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    boolean successDeposit = account.deposit(depositAmount);
                    if (successDeposit) {
                        System.out.println("Deposit successful. New balance: $" + account.checkBalance());
                    } else {
                        System.out.println("Deposit failed. Invalid amount.");
                    }
                    break;

                case 3:
                    System.out.println("Current balance: $" + account.checkBalance());
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
