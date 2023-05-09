package curs15;

public class EmployeeUtils<T extends Employee> {	//genericul este limitat la elementele de tip Employee (clasele care mostenesc Employee)

	T employee;
	
	public EmployeeUtils(T employee) {
		this.employee = employee;
	}
	
	public int getSalary() {
		return employee.salary; 
	}
}
