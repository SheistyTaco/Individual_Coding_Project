package account;
public class transactions {
	public static void Transactions(Account account){
        for(String item : account.getHistory()){
            System.out.println(item);
        }
    }
}
