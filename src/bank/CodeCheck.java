package bank;

public class CodeCheck {
private int code = 5555;
	
	public int getCode() {
		return code;
	}
	public boolean codeCheck(int codeToCheck) {
		if(codeToCheck == code) {
			return true;
		}
		else
			return false;
	}

}
