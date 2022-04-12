package kr.co.ezenac.staticvariable;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("이순신");
		
		Employee employeeWang = new Employee();
		employeeWang.setEmployeeName("왕건");
		
		
		System.out.println(employeeLee.getEmployeeName() +", "+ employeeLee.getEmployeeId());
		System.out.println(employeeWang.getEmployeeName() +", "+ employeeWang.getEmployeeId());

		Employee.setSerialNum(2000);
		System.out.println(Employee.serialNum);
	}

}
