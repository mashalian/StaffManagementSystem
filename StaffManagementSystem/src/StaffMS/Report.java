package StaffMS;

import java.util.Scanner;

public class Report {

	public byte showMenu(){
		byte btyInput = 0;
		String strMessage = "Welcome to Staff Manegment System \n";
		strMessage += "Please choose an item from menu below\n";
		strMessage += "1.Create Company.\n2.Create Department.\n3.Create Employee.\n";
		System.out.println(strMessage);
		Scanner in = new Scanner(System.in);
		btyInput = in.nextByte();
		if (btyInput == 1 || btyInput == 2 || btyInput ==3)
			return btyInput;
		else{
			System.out.println("Wrong input try again!");
		return 0;
		}
		
	}
	
	public byte showCompanySubMenu(){
		byte btyInput = 0;
		String strMessage = "Choose what do you want:\n";
		strMessage += "1.Add a company.\n2.Edit information.\n3.Delete company.\n";
		System.out.println(strMessage);
		Scanner in = new Scanner(System.in);
		btyInput = in.nextByte();
		if (btyInput == 1 || btyInput == 2 || btyInput ==3)
			return btyInput;
		else{
			System.out.println("Wrong input try again!");
		return 0;
		}
		
	}
	
	public byte showDepartmentSubMenu(){
		byte btyInput = 0;
		String strMessage = "Choose what do you want:\n";
		strMessage += "1.Add a department.\n2.Edit information.\n3.Delete department.\n";
		System.out.println(strMessage);
		Scanner in = new Scanner(System.in);
		btyInput = in.nextByte();
		if (btyInput == 1 || btyInput == 2 || btyInput ==3)
			return btyInput;
		else{
			System.out.println("Wrong input try again!");
		return 0;
		}
	}
		
		
	public byte showEmployeeSubMenu(){
		byte btyInput = 0;
		String strMessage = "Choose what do you want:\n";
		strMessage += "1.Add a Employee.\n2.Edit information.\n3.Delete Employee.\n";
		System.out.println(strMessage);
		Scanner in = new Scanner(System.in);
		btyInput = in.nextByte();
		if (btyInput == 1 || btyInput == 2 || btyInput ==3)
			return btyInput;
			else{
				System.out.println("Wrong input try again!");
			return 0;
			}
	}
	
	public byte showAddKindEmployeeSubMenu(){
		byte btyInput = 0;
		String strMessage = "Choose what do you want:\n";
		strMessage += "1.Add a Secretary.\n2.Add a Programmer.\n3.Add a Technician.\n";
		System.out.println(strMessage);
		Scanner in = new Scanner(System.in);
		btyInput = in.nextByte();
		if (btyInput == 1 || btyInput == 2 || btyInput ==3)
			return btyInput;
			else{
				System.out.println("Wrong input try again!");
			return 0;
			}
	}
	
	public byte showEditKindEmployeeSubMenu(){
		byte btyInput = 0;
		String strMessage = "Choose what do you want:\n";
		strMessage += "1.Edit a Secretary.\n2.Edit a Programmer.\n3.Edit a Technician.\n";
		System.out.println(strMessage);
		Scanner in = new Scanner(System.in);
		btyInput = in.nextByte();
		if (btyInput == 1 || btyInput == 2 || btyInput ==3)
			return btyInput;
			else{
				System.out.println("Wrong input try again!");
			return 0;
			}
	}
	
	public byte showDeleteKindEmployeeSubMenu(){
		byte btyInput = 0;
		String strMessage = "Choose what do you want:\n";
		strMessage += "1.Delete a Secretary.\n2.Delete a Programmer.\n3.Delete a Technician.\n";
		System.out.println(strMessage);
		Scanner in = new Scanner(System.in);
		btyInput = in.nextByte();
		if (btyInput == 1 || btyInput == 2 || btyInput ==3)
			return btyInput;
			else{
				System.out.println("Wrong input try again!");
			return 0;
			}
	}
	
	
	public byte showSecraterySubMenu(){
		byte btyInput = 0;
		String strMessage = "Choose what do you want:\n";
		strMessage += "1.Add a Secretary.\n2.Edit information.\n3.Delete Secretary.\n";
		System.out.println(strMessage);
		Scanner in = new Scanner(System.in);
		btyInput = in.nextByte();
		if (btyInput == 1 || btyInput == 2 || btyInput ==3)
			return btyInput;
			else{
				System.out.println("Wrong input try again!");
			return 0;
			}
	}
	
	public byte showProgrammerSubMenu(){
		byte btyInput = 0;
		String strMessage = "Choose what do you want:\n";
		strMessage += "1.Add a Programmer.\n2.Edit information.\n3.Delete Programmer.\n";
		System.out.println(strMessage);
		Scanner in = new Scanner(System.in);
		btyInput = in.nextByte();
		if (btyInput == 1 || btyInput == 2 || btyInput ==3)
			return btyInput;
			else{
				System.out.println("Wrong input try again!");
			return 0;
			}
	}
	
	public byte showTechnicianSubMenu(){
		byte btyInput = 0;
		String strMessage = "Choose what do you want:\n";
		strMessage += "1.Add a Technician.\n2.Edit information.\n3.Delete Technician.\n";
		System.out.println(strMessage);
		Scanner in = new Scanner(System.in);
		btyInput = in.nextByte();
		if (btyInput == 1 || btyInput == 2 || btyInput ==3)
			return btyInput;
			else{
				System.out.println("Wrong input try again!");
			return 0;
			}
	}
		
		
		
		
		
		
		
	
		
	

}






















