package bank;

public class Main {

	public static void main(String[] args) {
		BankAccountFacade facade = new BankAccountFacade(123456, 5555);
		facade.deposte(300);
		facade.withdraw(500);
		facade.withdraw(2000);
		
		

	}

}
