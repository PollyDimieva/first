package inheritance;

public class Faculty extends Employee {
  
	private int officeHours = 8;
	private String rank;
	
	
	public Faculty(String name, String adress, 
			String phoneNum, String email, String office, 
			int salary , String dateHired, int officeHours, String rank) {
		super(name,adress,phoneNum,email,office,salary, dateHired);
		this.setOfficeHours(officeHours);
		this.setRank(rank);
	}
	public int getOfficeHours() {
		return officeHours;
	}
	public void setOfficeHours(int officeHours) {
		this.officeHours = officeHours;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	public String toString() {
		return super.toString()+ " , Office hours: "+officeHours+" , Rank: "+rank;
	}
	
	
}
