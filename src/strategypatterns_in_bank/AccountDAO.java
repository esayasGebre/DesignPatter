package strategypatterns_in_bank;

import java.util.ArrayList;
import java.util.Collection;

public class AccountDAO implements IAccountDAO {
	Collection<Account> accountlist = new ArrayList<Account>();

	public void saveAccount(Account account) {
		accountlist.add(account); // add the new
	}

	public void updateAccount(Account account) {
		Account accountexist = loadAccount(account.getAccountnumber(), account.getAcctType());
		if (accountexist != null) {
			accountlist.remove(accountexist); // remove the old
			accountlist.add(account); // add the new
		}

	}

	public Account loadAccount(long accountnumber, AccountType type) {
		for (Account account : accountlist) {
			if (account.getAccountnumber() == accountnumber && account.getAcctType().equals(type)) {
				return account;
			}
		}
		return null;
	}

	public Collection<Account> getAccounts() {
		return accountlist;
	}

}
