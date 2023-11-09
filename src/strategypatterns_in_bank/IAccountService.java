package strategypatterns_in_bank;

import java.util.Collection;

public interface IAccountService {
    Account createAccount(long accountNumber, String customerName, AccountType type);
    Account getAccount(long accountNumber, AccountType type);
    Collection<Account> getAllAccounts();
    void deposit (long accountNumber, double amount, AccountType type);
    void withdraw (long accountNumber, double amount, AccountType type);
    void transferFunds(long fromAccountNumber, long toAccountNumber, double amount, String description,AccountType typeFrom, AccountType typeTo);
	void addInterest();
    
}
