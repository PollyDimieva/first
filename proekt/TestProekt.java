package proekt;

import java.util.Arrays;

import oop.Book;

public class TestProekt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Country country1 = new Country();
		country1.name = "Finland";
		
		Country country2 = new Country();
		country2.name = "the Netherlands";
		
		Country country3 = new Country();
		country3.name = "Germany";
		
		University uni1 = new University();
		uni1.name = "Aalto";
		uni1.yearEstablished = 1849;
		
		
		University uni2 = new University();
		uni2.name = "University of Hesinki";
	    uni2.yearEstablished = 1640;
	    

		University uni3 = new University();
		uni3.name = "Design Academy Eindhoven";
	    uni3.yearEstablished = 1955;
	    

		University uni4 = new University();
		uni4.name = "Delft University of Technology";
	    uni4.yearEstablished = 1842;
	    
	    studyProgram business = new studyProgram();
	    business.name = "Business, Economics and Finance";
	    
	    studyProgram arts = new studyProgram();
	    arts.name = "Arts, Design and Architecture";
	    
	    studyProgram science = new studyProgram();
	    science.name = "Science and Technology"; 
	    
	    uni1.studyProgram = science;
	    uni2.studyProgram = business;
	    uni3.studyProgram = arts;
	    uni4.studyProgram = science;
	    
	//  uni1.levelsOfDegree = Arrays.asList();
	    
	 //   levelsOfDegree(uni1, "Bachelor");
	    
	    country1.universities =  Arrays.asList(uni1, uni2);
	    System.out.println("Universities in " + country1.name);
	    for (University university : country1.universities) {
	    	
	        System.out.println(university.name +", established in "+ university.yearEstablished+" Best study programmes in " + university.studyProgram.name );
	       System.out.println();
	    }
       
	    
	    country2.universities = Arrays.asList(uni3, uni4);
	    System.out.println("Universities in " + country2.name);
	    for (University university : country2.universities) {
	    	
	        System.out.println(university.name +", established in "+ university.yearEstablished+". Best study programmes in " + university.studyProgram.name);
	       System.out.println();
	    }
	}

	private static void levelsOfDegree(University uni1, String string) {
		// TODO Auto-generated method stub
		
	}

}
