package account;
public class viewbalance {
	public static void ViewBalance(Account account){
        System.out.println("You have $" + account.getTotal() + " in your " + account.getName());
    }
}
