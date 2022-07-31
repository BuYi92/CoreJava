package oops;

public class Bank {
	
	public int AccountNum;
	
	
	public void DisplayBalane() {
		System.out.println("Inside Account Balance");
	}
	
	public int GetBalance() { 
		return 1000;
	}
	
	public void CloseAccount(int AccountNum) {
		System.out.println("Inside Bank CloseAccount");
	}

}
