package account;

public class login {
	public static void Login(String username, String PIN){
        if(username.equalsIgnoreCase("admin")){
        	if(PIN.equals("12345")) {
        		System.out.println("You're logged in Admin!");
        	}
        }
        else{
            //throw exception 
        }
    }
}
