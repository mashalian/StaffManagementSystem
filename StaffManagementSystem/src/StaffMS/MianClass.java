package StaffMS;


import java.util.*;

import javax.swing.JOptionPane;

public class MianClass {


		public static void main(String []args){

//			Employee e=new Employee();
//		e.createdData();
//			e.addNew();
//			ArrayList<Employee> emplist = new ArrayList<Employee>();
//			
//		//	Department d=new Department();
//			//d.displayallDepartment();
//	
//		}
//		public static void createdData(){
//			
//			 Employee empObj1=new Employee(Employee.getId(),"Yonas Abrehqm","988-00-74","Male",
//									"Stockholm",012345,null,"Computer",20);
//			Employee empObj2=new Employee(this.getId(),"Yonas Abrehqm","1988-00-74","Male",
//				"Stockholm",012345,null,"Computer",860);
//			Employee empObj3=new Employee(this.getId(),"Yonas Abrehqm","988-00-74","Male",
//				"Stockholm",012345,null,"Computer",20);
//			Employee empObj4=new Employee(this.getId(),"Yonas Abrehqm","988-00-74","Male",
//				"Stockholm",012345,null,"Computer",9720);
//			Employee empObj5=new Employee(this.getId(),"Yonas Abrehqm","988-00-74","Male",
//				"Stockholm",012345,null,"Computer",270);
//			Employee empObj6=new Employee(this.getId(),"Yonas Abrehqm","988-00-74","Male",
//				"Stockholm",012345,null,"Computer",560);
//			
//			emplist.add(empObj1);
//			emplist.add(empObj2);
//			emplist.add(empObj3);
//			emplist.add(empObj4);
//			emplist.add(empObj5);
//			emplist.add(empObj6);*
			
//}
			byte result = 0;
			Report rp =new Report();
			result = rp.showDepartmentSubMenu();
			if (result == 1)
				System.out.println("Hi");
			
		}
				
}
