package project21;

public class ChildrenBook extends Book{

	private int age;
	
	public ChildrenBook(double regularPrice, String publisher, int yearPublished, int age) {
		super(regularPrice,publisher,yearPublished);
		this.setAge(age);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

    // Override this method
    public double computeSalePrice(){
        return super.getRegularPrice() - super.getRegularPrice()* 0.7;
    }
	
	
}
	
	

