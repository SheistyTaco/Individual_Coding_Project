package account;
import java.util.Scanner;

public class pin {
	public static void ChangePIN(String PIN){
    	Scanner input = new Scanner(System.in);
        System.out.println("Enter existing PIN: ");
        String existing_PIN = input.nextLine();
        if (existing_PIN == PIN){
            System.out.println("Enter new PIN: ");
            
        }
        else {
        	//throw exception
        }
    }
}
