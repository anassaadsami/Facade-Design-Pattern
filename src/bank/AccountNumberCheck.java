package bank;

public class AccountNumberCheck {
	private int accountNum = 123456;

	public int getAccountNum() {
		return accountNum;
	}

	public boolean accountNumCheck(int numToCheck) {
		if (numToCheck == accountNum) {
			return true;
		} else
			return false;
	}

}
