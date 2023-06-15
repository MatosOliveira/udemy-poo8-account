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
public class AccountCastingProgram {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Account conta1 = new Account(1000, "Joao", 2000.0);
		BusinessAccount bConta1 = new BusinessAccount(2000, "Maria", 2000.0, 5000.0);
		
		//UPCASTING
		Account conta2 = bConta1;
		Account conta3 = new BusinessAccount(2001, "Jose", 1000.0, 4000.0);
		Account conta4 = new SavingsAccount(3000, "Paulo", 4000.0, 10.0);
		
		//DOWNCASTING
		BusinessAccount bConta2 = (BusinessAccount) conta3;
		bConta2.loan(100.0);
		
		//conta4 não e BusinessAccount, mas SavingsAccount, portanto ocorre erro
		//BusinessAccount bConta3 = (BusinessAccount) conta4;
		
		if (conta4 instanceof BusinessAccount) {
			BusinessAccount bConta3 = (BusinessAccount) conta4;
			bConta3.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (conta4 instanceof SavingsAccount) {
			SavingsAccount savConta1 = (SavingsAccount) conta4;
			savConta1.updateBalance();
			System.out.println("Update!");
		}
		
	}

}
