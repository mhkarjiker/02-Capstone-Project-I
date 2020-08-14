
public class Architect {
	
	//Attributes
	
	int projectNumberArchitect;
	String nameArchitect;
	String surnameArchitect;
	int telephoneArchitect;
	String emailArchitect;
	String addressArchitect;
	
	
	
	//Methods
	public Architect(int projectNumberArchitect, String nameArchitect, String surnameArchitect, int telephoneArchitect, String emailArchitect, String addressArchitect) {
		
		this.projectNumberArchitect = projectNumberArchitect;
		this.nameArchitect = nameArchitect;
		this.surnameArchitect = surnameArchitect;
		this.telephoneArchitect = telephoneArchitect;
		this.emailArchitect = emailArchitect;
		this.addressArchitect = emailArchitect;
		
		
	}
	
	//getters
	public int getProjectNumberArchitect() {
		return projectNumberArchitect;
	}
	
	public String getNameArchitect() {
		return nameArchitect;
	}
	
	public String getSurnameArchitect() {
		return surnameArchitect;
	}
	
	public int getTelephoneArchitect() {
		return telephoneArchitect;
	}
	
	public String getEmailArchitect() {
		return emailArchitect;
	}
	public String getAddress() {
		return addressArchitect;
	}
	
	

}
