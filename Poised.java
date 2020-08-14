import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Poised {

	public static void main(String[] args) {
		
		//Variable Declaration
		
		Project project = null;
		
		//Project Class Variables
		int projectNumber;
		String projectName;
		String buildingType;
		String addressProject;
		int erf;
		float fee;
		float paid;
		String projectDeadline;
		String complete;
		String completeDate; //change to string
		
		//Architect Variables
		int projectNumberArchitect;
		String nameArchitect;
		String surnameArchitect;
		int telephoneArchitect;
		String emailArchitect;
		String addressArchitect;
		
		//Contractor Variables
		int projectNumberContractor;
		String nameContractor;
		String surnameContractor;
		int telephoneContractor;
		String emailContractor;
		String addressContractor;
		
		//Customer Variables
		int projectNumberCustomer;
		String nameCustomer;
		String surnameCustomer;
		int telephoneCustomer;
		String emailCustomer;
		String addressCustomer;
		
		
		//This will generate the menu:
		//Select a number
		//1 Create a new project
		//2 Edit Project 
		//3 Finalise Project 
		//4 Completed Projects 
		//5 Overdue Projects 
		//6 Search 
		
		
		System.out.println("Please select an option from the menu by entering the corresponding number");
		System.out.println("1 Create a new project");
		System.out.println("2 Edit Project");
		System.out.println("3 Finalise Project");
		System.out.println("4 List Completed Projects");
		System.out.println("5 List Overdue Projects");
		System.out.println("6 Search");
		Scanner d = new Scanner(System.in);
		int userInput = d.nextInt();
		
//***********************************************************************************************//	
		
		//1 CREATE NEW PROJECT
		//The user selects '1'
		//Code requests user to input the following Project attributes:
		//project number, project name(auto populate customer surname), building type, 
		//address, erf, fee, paid
		//Code requests user to input the following Customer, Architect & Contractor attributes:
		//name, surname, telephone number, email, physical address
		//this needs to be stored somewhere = ask where?? lists?
		
		// Project Class inputs
		if (userInput == 1) {
			
			Scanner s = new Scanner(System.in);
		
			System.out.print("Enter Project Number: " );
			projectNumber = s.nextInt(); 
		
			System.out.print("Enter Project Name: " );
			projectName = s.nextLine(); 
		
			System.out.print("Enter Building Type: " );
			buildingType = s.nextLine(); 
		
			System.out.print("Enter Physical Address: " );
			addressProject = s.nextLine(); 
		
			System.out.print("Enter Erf Number: " );
			erf = s.nextInt(); 
		
			System.out.print("Enter Project Fee: " );
			fee = s.nextFloat();
		
			System.out.print("Enter Paid to Date: " );
			paid = s.nextFloat(); 
			
			System.out.print("Deadline: " );
			projectDeadline = s.nextLine(); 
			
			System.out.print("Complete (Type 'No' if new): " );
			complete = s.nextLine(); 
			
			System.out.print("Complete Date (Type 'N/A' if new: " ); //how do I make this autofill null when creating a new project
			completeDate = s.nextLine(); // 
			
			//Not sure if I had to pass the inputs to the Project Class
			Project Test1 = new Project(projectNumber, projectName, buildingType, addressProject, erf, fee, paid,projectDeadline, complete, completeDate);
		
			//Architect Class Inputs
		
			Scanner a = new Scanner(System.in);
		
			System.out.print("Enter Project Number: " );
			projectNumberArchitect = a.nextInt(); 
		
			System.out.print("Enter Architect Name: " );
			nameArchitect = a.nextLine(); 
		
			System.out.print("Enter Architect Surname: " );
			surnameArchitect = a.nextLine(); 
		
			System.out.print("Enter Telephone Number: " );
			telephoneArchitect = a.nextInt(); 
	
			System.out.print("Enter email: " );
			emailArchitect = a.nextLine(); 
		
			System.out.print("Enter Physical Address: " );
			addressArchitect = a.nextLine(); 
			
			Architect Test2 = new Architect(projectNumberArchitect, nameArchitect, surnameArchitect, telephoneArchitect, emailArchitect, addressArchitect);
		
			//Contractor Class Inputs
		
			Scanner b = new Scanner(System.in);
				
			System.out.print("Enter Project Number: " );
			projectNumberContractor = b.nextInt(); 
				
			System.out.print("Enter Contractor Name: " );
			nameContractor = b.nextLine(); 
				
			System.out.print("Enter Contractor Surname: " );
			surnameContractor = b.nextLine(); 
				
			System.out.print("Enter Telephone Number: " );
			telephoneContractor = b.nextInt(); 
		
			System.out.print("Enter email: " );
			emailContractor = b.nextLine(); 
				
			System.out.print("Enter Physical Address: " );
			addressContractor = b.nextLine(); 

			//Customer Class Inputs
		
			Scanner c = new Scanner(System.in);
						
			System.out.print("Enter Project Number: " );
			projectNumberCustomer = c.nextInt(); 
						
			System.out.print("Enter Customer Name: " );
			nameCustomer = c.nextLine(); 
						
			System.out.print("Enter Customer Surname: " );
			surnameCustomer = c.nextLine(); 
						
			System.out.print("Enter Telephone Number: " );
			telephoneCustomer = c.nextInt(); 
					
			System.out.print("Enter email: " );
			emailCustomer = c.nextLine(); 
						
			System.out.print("Enter Physical Address: " );
			addressCustomer = c.nextLine(); 
		}
//***********************************************************************************************//			
		
		//2 EDIT PROJECT
		//Another menu  appears asking which attribute to edit
		// a sub-menu
		//1 Project Number
		//2 Project Name
		//3 Building Type
		//4 Physical Address
		//5 Erf Number
		//6 Project Fee
		//7 Paid to Date
		//user selects a number and asked to input new entry 
		//and that must get stored to the correct project
		if (userInput == 2) {
			
			System.out.println("Please select which class you would like to edit: ");
			System.out.println("1 Project");
			System.out.println("2 Architect");
			System.out.println("3 Contractor");
			System.out.println("4 Customer");
			Scanner e = new Scanner(System.in);
			int editInputLevel1 = e.nextInt();
			
			//Edit Project Class
			if(editInputLevel1 == 1) {
				System.out.println("Please select an option you would like to edit: ");
				System.out.println("1 Project Number");
				System.out.println("2 Project Name");
				System.out.println("3 Building Type");
				System.out.println("4 Physical Address");
				System.out.println("5 Erf Number");
				System.out.println("6 Project Fee");
				System.out.println("7 Paid to Date");
				System.out.println("8 Deadline Date");
				System.out.println("9 Complete");
				System.out.println("10 Date Completed");
				Scanner f = new Scanner(System.in);
				int editInputLevel2 = f.nextInt();
				
				// Change the total amount of the fee paid to date
				if (editInputLevel2 == 7) {
					
				}
				
				//Change the due date of the project
				if (editInputLevel2 == 8) {
					
				}
				
				
			}
			
			//Edit Architect Class
			if(editInputLevel1 == 2) {
				
			}
			
			//Edit Contractor Class
			if(editInputLevel1 == 3) {
				
				System.out.println("Please select an option you would like to edit: ");
				System.out.println("1 Project Number");
				System.out.println("2 Contractor Name");
				System.out.println("3 Contractor Surname");
				System.out.println("4 Telephone Number");
				System.out.println("5 Email");
				System.out.println("6 Physical Address");
			
				Scanner h = new Scanner(System.in);
				int editInputLevel2 = h.nextInt();
				
				if (editInputLevel2 == 1) {
					
				}
				
				if (editInputLevel2 == 2) {
					
				}
				
				if (editInputLevel2 == 3) {
					
				}
				
				if (editInputLevel2 == 4) {
					
				}
				
				if (editInputLevel2 == 5) {
					
				}
				
				if (editInputLevel2 == 6) {
					
				}
				
			}
			
			//Edit Customer Class
			if(editInputLevel1 == 4) {
				
			}
			
			
	
			
			
			
		}
			
//***********************************************************************************************//	
		
		//3 FINALISE PROJECT
		//
		if(userInput == 3) {
			System.out.println("Please enter project number: ");
			
			Scanner h = new Scanner(System.in);
			int editInputLevel1 = h.nextInt();
			
			if(editInputLevel1 == projectNumber ) {
				
				complete = "Yes";
				
				//Date date = Calendar.getInstance().getTime();  
				//DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
				//String strDate = dateFormat.format(date);
				//completeDate = strDate;
				completeDate = Calendar.getInstance().getTime();
				
				//print invoice
				System.out.println("Customer Name & Surname: " +  nameCustomer + surnameCustomer);
				System.out.println("Telephone Number: " + telephoneCustomer);
				System.out.println("Email: " + emailCustomer);
				System.out.println("Address: " + addressCustomer);
				
				float owed = fee - paid;
				System.out.println("Outstanding Amount: R"+ owed);
				
				
				//Write to text file: all data of all classes
				
				
			}
			
			
		}
//***********************************************************************************************//	
		
		//4 COMPLETED PROJECTS
		// if projects are marked complete then print
		if(userInput == 4) {
			
		}
//***********************************************************************************************//	
		
		//5 OVERDUE PROJECTS
		// if due date< today's date then print
		if (userInput == 5) {
			
		}
//***********************************************************************************************//	
		
		//6 SEARCH	
		// Please enter project name or number:
		//if input = project name || project number
		// print project details
		if (userInput == 6) {
			
		}
		// TODO Auto-generated method stub

	}

}
