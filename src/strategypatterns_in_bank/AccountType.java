package strategypatterns_in_bank;

public enum AccountType {
	CHECKING, SAVINGS;
	
	public String toString() {
		if (this == CHECKING)
			return "Checking";
		if (this == SAVINGS)
			return "Savings";
		else
			return null;
	}
}
