package strategypatterns_in_bank;

import java.util.Collection;


public class AccountService implements IAccountService {
	private IAccountDAO accountDAO;
	
	public AccountService(){
		accountDAO=new AccountDAO();
	
	}

	public Account createAccount(long accountNumber, String customerName, AccountType type) {
		
		Account account=null;
		if(type.equals(AccountType.CHECKING)){
			account = new CheckingAccount(accountNumber);
			
		}else if(type.equals(AccountType.SAVINGS)){
			
			account = new SavingAccount(accountNumber);
		}
//  	Account account = new Account(accountNumber);
		Customer customer = new Customer(customerName);
		account.setCustomer(customer);
		
		accountDAO.saveAccount(account);
		return account;
	}

	public void deposit(long accountNumber, double amount, AccountType type) {
		Account account = accountDAO.loadAccount(accountNumber, type);
		account.deposit(amount);
		account.setAcctType(type);
		accountDAO.updateAccount(account);
	}

	public Account getAccount(long accountNumber, AccountType type) {
		Account account = accountDAO.loadAccount(accountNumber, type);
		return account;
	}

	public Collection<Account> getAllAccounts() {
		return accountDAO.getAccounts();
	}

	public void withdraw(long accountNumber, double amount, AccountType type) {
		Account account = accountDAO.loadAccount(accountNumber, type);
		account.withdraw(amount);
		account.setAcctType(type);
		accountDAO.updateAccount(account);
	}



	public void transferFunds(long fromAccountNumber, long toAccountNumber, double amount, String description, AccountType typeFrom, AccountType typeTo) {
		Account fromAccount = accountDAO.loadAccount(fromAccountNumber, typeFrom);
		Account toAccount = accountDAO.loadAccount(toAccountNumber, typeTo);
		fromAccount.transferFunds(toAccount, amount, description);
		accountDAO.updateAccount(fromAccount);
		accountDAO.updateAccount(toAccount);
	}

	@Override
	public void addInterest() {
		Collection<Account> accountlist = getAllAccounts();
		for (Account account : accountlist) {
			account.addInterest();
			System.out.println(account.getAccountnumber());
			System.out.println(account.getAcctType());
			System.out.println(account.getTotalBalance());
		}
		
		
	}

}
