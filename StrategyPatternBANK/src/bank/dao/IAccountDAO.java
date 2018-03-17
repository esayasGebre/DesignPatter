package bank.dao;

import java.util.Collection;

import bank.domain.Account;
import bank.domain.AccountType;

public interface IAccountDAO {
	void saveAccount(Account account);
	void updateAccount(Account account);
	Account loadAccount(long accountnumber, AccountType type);
	Collection<Account> getAccounts();

}
