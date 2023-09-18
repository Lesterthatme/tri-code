package trio_program;

public class ATM {
	private int balance;
	
	public ATM(int balance){
		this.balance = balance;	
	}
	
	public int getBalance(){
		return this.balance;
	};
	
	private void setBalance(int balance) {
		this.balance = balance;
	}
	
	public boolean isWithdrawalValid(int amount) {
		if(amount > this.balance) {
			return false;
		}
		return true;
	}
	
	public void withdraw(int amount) {
		this.setBalance(this.balance - amount);
	}
}