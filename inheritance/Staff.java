package inheritance;

public class Staff extends Employee {

	private String title;
	
		
	public Staff(String name, String adress, 
			String phoneNum, String email, String office, 
			int salary , String dateHired,String title) {
		
		super(name,adress,phoneNum,email,office,salary,dateHired);
		this.setTitle(title);
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public String toString() {
		return super.toString() + " , Title: " + title;
	}
	
	
}
