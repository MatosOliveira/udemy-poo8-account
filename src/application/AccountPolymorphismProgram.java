/**
 * 
 */
package application;

import entities.Account;
import entities.SavingsAccount;

/**
 * @author Matos
 *
 */
public class AccountPolymorphismProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Account x = new Account(1000, "Joao", 2000.0);
		Account y = new SavingsAccount(3000, "Paulo", 2000.0, 10.0);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println("Balance - Account " + x.getBalance());
		System.out.println("Balance - Saving Account " + y.getBalance());
		

	}

}
