package inheritance;

public class Person {
	
private String name;
private String adress ;
private String phoneNum ;
private String email ;

public Person() {
	
}

public Person(String name, String adress, String phoneNum , String email) {
	this.name = name;
	this.adress = adress;
	this.phoneNum =phoneNum;
	this.email = email;
	
	
}


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAdress() {
	return adress;
}

public void setAdress(String adress) {
	this.adress = adress;
}


public String getPhoneNumber() {
	return phoneNum;
}

public void setPhoneNumber(String phoneNum) {
	this.phoneNum = phoneNum;
}



public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email= email;
}

public String toString() {
	return "Name: " + name + " , Adress: "+adress+" , Phone number: "
            +phoneNum + " , Email: " +email;
	}



}
