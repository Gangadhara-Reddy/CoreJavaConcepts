package encapsulation;

public class Bank {
	
	private int accountNo = 123456;
	private int pinNo = 1234;
	public double balanceAmount = 1000000;
	
	public void withdrawAmount(int accNo,int pin,int amount) {
		if(accNo == accountNo && pin == pinNo) {
			if(amount<=balanceAmount) {
				balanceAmount= balanceAmount-amount;
				System.out.println("Amount withdrawal :"+amount);
			}else {
				System.out.println("Insufficent balance!!!");
			}
				
			
		}else {
			System.out.println("Invalid credentials!!!");
		}
	}
	
	/*public double getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}*/

	public void updatePin(int accNo,int oldPin,int newPin) {
		if(accNo==accountNo && oldPin== pinNo) {
			pinNo = newPin;
			System.out.println("Pinc changed successfully!!!");
		
		}else {
			System.out.println("Invalid credentials!!!");
		}
	}
	
	public double depostCash(int accNo,int pin,double amount) {
		if(accNo==accountNo && pin== pinNo) {
			balanceAmount = balanceAmount + amount;
			return balanceAmount;
			
		}else {
			System.out.println("Invalid credentials!!!");
			return balanceAmount;
		}
			
	}

}
