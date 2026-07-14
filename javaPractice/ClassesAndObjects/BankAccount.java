public class BankAccount{

	private String accountNumber;
	private int accountBalance;
	private String customerName;
	private String email;
	private String phoneNumber;

	public void setAccountNo(String accountNumber){
		
		this.accountNumber = accountNumber;
	}


	public String getAccountNo(){
	
		return accountNumber;
	}


	public void setAccountBal(int accountBalance){

		this.accountBalance = accountBalance;
	}


	public int getAccountBal(){
	
		return accountBalance;
	}

	public void setName(String customerName){
		
		this.customerName = customerName;
	}

	public String getName(){

		return customerName;
	}
	public void setMail(String email){

		this.email = email;
	}


	public String getMail(){
	
		return email;
	}


	public void setPhone(String phoneNumber){
	
	this.phoneNumber = phoneNumber;
	}




	public void withdraw(int amount){

		if((accountBalance - amount) < 0){
			
			System.out.println("The account does not have sufficient balance");
		}else{

			accountBalance -= amount;
		}
	}



	public void deposit(int amount){

		if(amount<=0){
			
			System.out.println("Please enter a vaild amount more than 0");
		}else{

			accountBalance += amount;
		}
	}
}
