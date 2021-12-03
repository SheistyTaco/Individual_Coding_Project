package account;
public class deposit {
	public static void Deposit(Account account, double amount){
        account.setTotal(account.getTotal() + amount);
        //update transaction history
        System.out.println("You have deposited $" + amount + " into your " + account.getName());
    }
}
