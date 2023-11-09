package strategypatterns_in_bank;
/**
 * 
 * @author ESAYAS G.
 *
 */
public class SavingAccount extends Account {

	public SavingAccount(long accountNumber) {
		super(accountNumber);
	}
	
	@Override
	public void addInterest(){
		System.out.println("Add interest in SAVING getting executed ....");
		
		if(getTotalBalance() < 1000){
			totalBalance = 0.01*getTotalBalance();
		}
		
		else if(getTotalBalance() > 1000 && getTotalBalance() < 5000){
			totalBalance = getTotalBalance() + 0.02*getTotalBalance();
			
		}else if(getTotalBalance() > 5000){
			totalBalance = 0.04*getTotalBalance();
		}
	}
	
	@ Override
	public AccountType getAcctType() {
		return AccountType.SAVINGS;
	}

}
