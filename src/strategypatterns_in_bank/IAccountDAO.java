package strategypatterns_in_bank;

import java.util.Collection;

public interface IAccountDAO {
	void saveAccount(Account account);
	void updateAccount(Account account);
	Account loadAccount(long accountnumber, AccountType type);
	Collection<Account> getAccounts();

}
