package inheritance;




public class Employee extends Person {
	
private String office;
private int salary = 1500;
private String dateHired;


public Employee(String name, String adress, String phoneNum, String email, String office, int salary , String dateHired) {
	super(name,adress,phoneNum,email);
	this.setOffice(office);
	this.setSalary(salary);
	this.setDateHired(dateHired);
}




public String getOffice() {
	return office;
}

public void setOffice(String office) {
	this.office = office;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

public String getDateHired() {
	return dateHired;
}

public void setDateHired(String dateHired) {
	this.dateHired = dateHired;
}

public String toString() {
	return super.toString() + ", Office: "+office+ " , Salary; "+ salary+ ", Hired on "+dateHired;
}


}
