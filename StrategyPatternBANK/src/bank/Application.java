package bank;

import java.util.Collection;

import bank.domain.Account;
import bank.domain.AccountEntry;
import bank.domain.AccountType;
import bank.domain.Customer;
import bank.service.AccountService;
import bank.service.IAccountService;

public class Application {
	public static void main(String[] args) {
		
		IAccountService accountService = new AccountService();
		accountService.createAccount(1263862, "Frank Brown", AccountType.CHECKING);
		accountService.createAccount(7253892, "Drake Tom", AccountType.CHECKING);
		
		accountService.createAccount(4253892, "John Doe", AccountType.SAVINGS);
		
		
	//	System.out.println(AccountType.CHECKING);
	//	System.out.println(AccountType.SAVINGS);
		
		accountService.deposit(1263862, 240, AccountType.CHECKING);
		accountService.deposit(1263862, 529, AccountType.CHECKING);
		accountService.withdraw(1263862, 230, AccountType.CHECKING);
		
		accountService.deposit(7253892, 12450, AccountType.CHECKING);
		
		accountService.deposit(4253892, 12450, AccountType.SAVINGS);
		
		// to transfer funds please insert the account type to be deducted from first , and account type to be added next
		//  you can transfer from any account to any type of account
    	accountService.transferFunds(7253892, 1263862, 100, "payment of invoice 10232", AccountType.CHECKING, AccountType.CHECKING );
    	
    	accountService.transferFunds(4253892, 1263862, 50, "payment of invoice 10232", AccountType.SAVINGS, AccountType.CHECKING );
    	System.out.println("");
		
    	//  add interest to all accounts
    	accountService.addInterest();
		
		
		//  show balances
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		
		Collection<Account> accountlist = accountService.getAllAccounts();
		Customer customer = null;
		for (Account account : accountlist) {
			customer = account.getCustomer();
			System.out.println("Statement for Account: " + account.getAccountnumber());
			System.out.println("Account Holder: " + customer.getName());
			System.out.println("Account Type: " + account.getAcctType());
			System.out.println("-Date-------------------------"
							+ "-Description------------------"
							+ "-Amount-------------");
			for (AccountEntry entry : account.getEntryList()) {
				System.out.printf("%30s%30s%20.2f\n", entry.getDate()
						.toString(), entry.getDescription(), entry.getAmount());
			}
			System.out.println("----------------------------------------"
					+ "----------------------------------------");
			System.out.printf("%30s%30s%20.2f\n\n", "", "Current Balance:",
					account.getBalance());
			System.out.printf("%30s%30s%20.2f\n\n", "", "Balance after Interest:",
					account.getTotalBalance());
		}

	}

}


