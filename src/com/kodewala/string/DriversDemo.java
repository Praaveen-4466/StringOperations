package com.kodewala.string;

public class DriversDemo {
	
	public static void main(String args[]) {	
	
		String[] employeeRecords = {

			    "EMP101|Praveen Kumar|Software Engineer|IT|praveen.kumar@company.com",

			    "EMP102|RAVI REDDY|Senior Developer|IT|ravi.reddy@company.com",

			    "EMP103|anil sharma|HR Manager|HR|anil.sharma@company.com",

			    "INVALID|priya|Developer|IT|invalid-email",

			    "EMP104|  KIRAN RAO  |Developer|Finance|kiran.rao@gmail.com"
			};
		
		for(String employee: employeeRecords) {
			String[] employeeDetails = employee.split("\\|");
			
			String employeeId = employeeDetails[0];
			String employeeName = employeeDetails[1];
			String employeeRole = employeeDetails[2];
			String employeeDepartment = employeeDetails[3];
			String employeeEmail = employeeDetails[4];
			
			if(employeeId.startsWith("EMP") && employeeEmail.contains("@") && employeeRole.length() > 0 && employeeDepartment.length() > 0) {
				employeeName = employeeName.toUpperCase();
				
				EmployeeOnboarding employeeObject1 = new EmployeeOnboarding(employeeId, employeeName, employeeEmail, employeeRole, employeeDepartment);
				
				employeeObject1.displayProfile();
				
			}
					
		}
		
	}
}
