package inheritance;
import java.util.Date;
public class GeometricObject {

	
	private String color = "white";
	private boolean filled = false;
	private Date dateCreated;
	
	
	
	public GeometricObject() {
	 setDateCreated(new Date());
	}
	
	
	public GeometricObject(String color,boolean filled) {
		this.setColor(color);
		this.setFilled(filled);
		setDateCreated(new Date());
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public boolean isFilled() {
		return filled;
	}


	public void setFilled(boolean filled) {
		this.filled = filled;
	}


	public Date getDateCreated() {
		return dateCreated;
	}


	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	
	public String toString() {
		return "Created on " + dateCreated + " , Color: "+color + " , Filled: "+filled;
	}
	
	
	
}
