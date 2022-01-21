package bank;

class BankAccountFacade {   
	/*
	 *  Facade class for all classes and he connect with every thing that we need 
	 *  and client class just contact with Facade class and he avoid to contact
	 *  the  complexity of their relationship
	 */
	private int accountNum;
	private int code;

	AccountNumberCheck x;
	CodeCheck y;
	BankAccountCheck z;
	WelcometToBank welcome;

	public BankAccountFacade(int accountNum, int code) {
		this.accountNum = accountNum;
		this.code = code;
		x = new AccountNumberCheck();
		y = new CodeCheck();
		z = new BankAccountCheck();
		welcome = new WelcometToBank();

	}

	public int getAccountNum() {
		return accountNum;
	}

	public int getCode() {
		return code;
	}

	public void withdraw(double withdrawAmount) {
		if (x.accountNumCheck(getAccountNum()) && y.codeCheck(getCode())) {
			z.enoughMoney(withdrawAmount);
//			z.withdraw(withdrawAmount);
			System.out.printf("withdrawel is complete and your account is %f.%n", z.getAccount());
		}
	}

	public void deposte(double depositeAmount) {
		if (x.accountNumCheck(getAccountNum()) && y.codeCheck(getCode())) {
			z.deposite(depositeAmount);

		}
	}

}
