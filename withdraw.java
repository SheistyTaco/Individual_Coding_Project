package account;
public class withdraw {
	public static void Withdraw(Account account, double amount){
        if (amount < account.getTotal()){
            account.setTotal(account.getTotal() - amount);
            //update transaction history
            System.out.println("You have withdrawn $" + amount + " out of your " + account.getName());
        }
        else {
            //throw exception
        }
    }
}
