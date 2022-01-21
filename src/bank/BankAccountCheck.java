package bank;

public class BankAccountCheck {
	private double account = 1000;

	public double getAccount() {
		return account;
	}

	// void without print statement
	public void withdraw(double withdrawMoney) {
//		if(enoughMoney(withdrawMoney)) {
		account -= withdrawMoney;
		System.out.printf("withdrawel is complete and your account is %,.3f.%n", getAccount());
	}
//	}

	public void deposite(double depositedMoney) {
		account += depositedMoney;
		System.out.printf("deposite is complete and your account is %,.3f.%n", getAccount());

	}

	public boolean enoughMoney(double withdrawMoney) {
		if (withdrawMoney > getAccount()) {
			System.out.println("you don't have enough money in your accout");
			System.out.printf("your account is %,.3f.%n", getAccount());
			return false;

		} else {
			withdraw(withdrawMoney);
			System.out.printf("completely and your account now is %,.3f.%n", getAccount());
		}
		return true;

	}
}
