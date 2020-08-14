import java.util.Date;

public class Project {
	
	
	//Attributes
	int projectNumber;
	String projectName;
	String buildingType;
	String addressProject;
	int erf;
	float fee;
	float paid;
	String projectDeadline;
	String complete;
	String completeDate;
	
	
	public Project (int projectNumber, String projectName, String buildingType, String addressProject, int erf,float fee, float paid, String projectDeadline, String complete, String completeDate ) {
		
		this.projectNumber = projectNumber;
		this.projectName = projectName;
		this.buildingType = buildingType;
		this.addressProject = addressProject;
		this.erf = erf;
		this.fee = fee;
		this.paid = paid;
		this.projectDeadline = projectDeadline;
		this.complete = complete;
		this.completeDate = completeDate;
		
	}
	
	//getters
	public int getProjectNumber() {
		return projectNumber;
	}
	
	public String getProjectName() {
		return projectName;
	}
	
	public String getbuildingType() {
		return buildingType;
	}
	
	public String getAddressProject() {
		return addressProject;
	}
	
	public int getErf() {
		return erf;
	}
	
	public float getFee() {
		return fee;
	}
	
	public float getPaid() {
		return paid;
	}
	
	public String getProjectDeadline() {
		return projectDeadline;
	}
	public String getComplete() {
		return complete;
	}
	
	public String getCompleteDate() {
		return completeDate;
	}
	
	//toString
	public String toString() {
		
		
		 
	    String output = "Project Number: " + projectNumber;
	    output += "\nProject Name:" + projectName;
	    output += "\nBuilding Type:" + buildingType;
	    output += "\nPhysical Address:" + addressProject;
	    output += "\nErf Number:" + erf;
	    output += "\nProject Fee:" + fee;
	    output += "\nPaid to date:" + paid;
	    output += "\nDeadline:" + projectDeadline;
	    output += "\nComplete:" + complete;
	    output += "\nComplete Date:" + completeDate;
	    
	    return output;
	}
	
	
	

}
