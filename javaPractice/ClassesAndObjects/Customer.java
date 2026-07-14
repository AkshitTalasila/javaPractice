public class Customer{

	private String name;
	private int creditLimit;
	private String emailAdress;


	public String getName(){
	
		return name;
	}

	public String getMail(){

		return emailAdress;
	}

	public int getCreditLimit(){

		return creditLimit;
	}


	public Customer(String name, int creditLimit, String emailAdress){

		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAdress = emailAdress;
	}

	public Customer(){
		
		this("Jhon Doe", 0, "None@none.com");
	}


	public Customer(String name, String emailAdress){

		this(name, 0, emailAdress);
	}

}
