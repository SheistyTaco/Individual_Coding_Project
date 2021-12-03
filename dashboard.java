import java.util.*;
import account.*;
public class dashboard{
	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
			System.out.println("Hello! Enter your username: ");
			String username = input.nextLine();
			System.out.println("Enter your PIN: ");
			String PIN = input.nextLine();
			account.login.Login(username, PIN);
			Account checkings = new Account("Checkings", 500.00);
			Account savings = new Account("Savings", 500.00);
			System.out.println("Hello Admin!");
			System.out.println(checkings.getName()+": $"+checkings.getTotal());
			System.out.println(savings.getName()+": $"+savings.getTotal());
			System.out.println("What changes do you want to make to your account?");
			String option = input.nextLine();
			switch(option.toLowerCase()) {
			case "deposit":
				System.out.println("How much would you like to deposit?");
				double deposit_amount = input.nextDouble();
				System.out.println("Which account would you like to deposit in?");
				String account_type = input.nextLine();
				if(account_type.equalsIgnoreCase("checkings")) {
					account.deposit.Deposit(checkings, deposit_amount);
					break;
				}
				else if(account_type.equalsIgnoreCase("savings")) {
					account.deposit.Deposit(savings, deposit_amount);
					break;
				}
				else {
					//throw exception
				}
				break;
			case "withdraw":
				System.out.println("How much would you like to withdraw?");
				double withdraw_amount = input.nextDouble();
				System.out.println("Which account would you like to withdraw from?");
				account_type = input.nextLine();
				if(account_type.equalsIgnoreCase("checkings")) {
					account.withdraw.Withdraw(checkings, withdraw_amount);
					break;
				}
				else if(account_type.equalsIgnoreCase("savings")) {
					account.withdraw.Withdraw(savings, withdraw_amount);
					break;
				}
				else {
					//throw exception
				}
				break;
			case "transfer":
				System.out.println("How much would you like to transfer?");
				double transfer_amount = input.nextDouble();
				System.out.println("Which account would you like to transfer the money?");
				account_type = input.nextLine();
				if(account_type.equalsIgnoreCase("checkings")) {
					account.transfer.Transfer(checkings, savings, transfer_amount);
					break;
				}
				else if(account_type.equalsIgnoreCase("savings")) {
					account.transfer.Transfer(savings, checkings, transfer_amount);
					break;
				}
				else {
					//throw exception
				}
				break;
			case "view balance":
				System.out.println("Which account would you like view?");
				account_type = input.nextLine();
				if(account_type.equalsIgnoreCase("checkings")) {
					account.viewbalance.ViewBalance(checkings);
					break;
				}
				else if(account_type.equalsIgnoreCase("savings")) {
					account.viewbalance.ViewBalance(savings);
					break;
				}
				else {
					//throw exception
				}
				break;
			case "transaction history":
				System.out.println("Which account would you like view?");
				account_type = input.nextLine();
				if(account_type.equalsIgnoreCase("checkings")) {
					account.transactions.Transactions(checkings);
					break;
				}
				else if(account_type.equalsIgnoreCase("savings")) {
					account.transactions.Transactions(savings);
					break;
				}
				else {
					//throw exception
				}
				break;
			case "change pin":
				account.pin.ChangePIN(PIN);
				break;
			case "exit":
				System.out.println("Logging out...");
				break;
			default:
				//throw exception
			}
		}
		catch(Exception e){
			//stuff
		}
	}
}