package inheritance;

public class Student extends Person{

	private String classStatus;
	
	
	
	public Student(String name, String adress, String phoneNum, String email, String classStatus) {
		super(name, adress, phoneNum,email);
		this.classStatus =classStatus;
	}

	public String getClassStatus() {
		return classStatus;
	}

	public void setClassStatus(String classStatus) {
		this.classStatus = classStatus;
	}
	
	public String toString() {
		return super.toString() + " , Class status: "+classStatus;
	}
	
}
