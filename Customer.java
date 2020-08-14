
public class Customer {
	
	
	//Attributes
	
	int projectNumberCustomer;
	String nameCustomer;
	String surnameCustomer;
	int telephoneCustomer;
	String emailCustomer;
	String addressCustomer;
		
		
		
	//Methods
	public Customer(int projectNumberCustomer, String nameCustomer, String surnameCustomer, int telephoneCustomer, String emailCustomer, String addressCustomer) {
			
		this.projectNumberCustomer = projectNumberCustomer;
		this.nameCustomer = nameCustomer;
		this.surnameCustomer = surnameCustomer;
		this.telephoneCustomer = telephoneCustomer;
		this.emailCustomer = emailCustomer;
		this.addressCustomer = emailCustomer;
			
			
	}
		
	//getters
	public int getProjectNumberCustomer() {
		return projectNumberCustomer;
	}
		
	public String getNameCustomer() {
		return nameCustomer;
	}
		
	public String getSurnameCustomer() {
		return surnameCustomer;
	}
		
	public int getTelephoneCustomer() {
		return telephoneCustomer;
	}
		
	public String getEmailCustomer() {
		return emailCustomer;
	}
	public String getAddress() {
		return addressCustomer;
	}
		
	

}
