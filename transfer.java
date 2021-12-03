package account;
public class transfer {
	public static void Transfer(Account withdraw_account, Account deposit_account, double amount){
        if (amount < withdraw_account.getTotal()){
            deposit_account.setTotal(deposit_account.getTotal() + amount);
            withdraw_account.setTotal(withdraw_account.getTotal() - amount);
            //update transaction history for both accounts
            System.out.println();
        }
        else {
            //throw exception
        }
	}
}