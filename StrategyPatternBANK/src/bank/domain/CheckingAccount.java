package bank.domain;
/**
 * 
 * @author ESAYAS G.
 *
 */
public class CheckingAccount extends Account{
	
	public CheckingAccount(long accountNumber) {
		super(accountNumber);
	}
	
	@Override
	public void addInterest(){
		System.out.println("Add interest in checking getting executed ....");
		if(getTotalBalance()< 1000){
			interest = 0.015*getTotalBalance();
		}else if(getTotalBalance() > 1000){
			interest = 0.025*getTotalBalance();
		}
	}
	
	@ Override
	public AccountType getAcctType() {
		return AccountType.CHECKING;
	}

}
