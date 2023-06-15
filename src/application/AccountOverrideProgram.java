/**
 * 
 */
package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

/**
 * @author Matos
 *
 */
public class AccountOverrideProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Testando a sobreposicao ou sobrescrita
		Account conta5 = new Account(1002, "Jose", 2000.0);
		conta5.withdraw(500.0);
		System.out.println("Balance - Account " + conta5.getBalance());
		
		Account savConta2 = new SavingsAccount(3001, "Filipe", 2000.0, 10.0);
		savConta2.withdraw(500.0);
		System.out.println("Balance - Saving Account " + savConta2.getBalance());
		
		Account bConta4 = new BusinessAccount(2002, "Irene", 2000.0, 4000.0);
		bConta4.withdraw(500.0);
		System.out.println("Balance - Business Account " + bConta4.getBalance());
		

	}

}
