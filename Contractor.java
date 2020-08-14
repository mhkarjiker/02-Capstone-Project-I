
public class Contractor {
	
	//Attributes
	
	int projectNumberContractor;
	String nameContractor;
	String surnameContractor;
	int telephoneContractor;
	String emailContractor;
	String addressContractor;
		
		
		
	//Methods
	public Contractor(int projectNumberContractor, String nameContractor, String surnameContractor, int telephoneContractor, String emailContractor, String addressContractor) {
			
		this.projectNumberContractor = projectNumberContractor;
		this.nameContractor = nameContractor;
		this.surnameContractor = surnameContractor;
		this.telephoneContractor = telephoneContractor;
		this.emailContractor = emailContractor;
		this.addressContractor = emailContractor;
			
			
	}
		
	//getters
	public int getProjectNumberContractor() {
		return projectNumberContractor;
	}
	
	public String getNameContractor() {
		return nameContractor;
	}
	
	public String getSurnameContractor() {
		return surnameContractor;
	}
	
	public int getTelephoneContractor() {
		return telephoneContractor;
	}
	
	public String getEmailContractor() {
		return emailContractor;
	}
	public String getAddress() {
		return addressContractor;
	}
		
	
}
