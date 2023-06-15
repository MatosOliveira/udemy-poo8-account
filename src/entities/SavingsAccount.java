/**
 * 
 */
package entities;

/**
 * Classe Conta Poupanca - extende a classe Conta(Account)
 * 
 * @author Matos - 14.06.2023
 *
 */
public class SavingsAccount extends Account {
	
	//taxa de juros
	private Double interestRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}

	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
	
}
