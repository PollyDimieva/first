package edu;

public class CourseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Course course1 = new Course("Data Structures");
		Course course2 = new Course("Database Systems");
		course1.addStudent("Peter Jones");
		course1.addStudent("Kim Smith");
		course1.addStudent("Anne Kennedy");
		course2.addStudent("Peter Jones");
		course2.addStudent("Polly Dimieva");
		course2.addStudent("Kalina Kostova");
		course2.addStudent("Elisaveta Nedyalkova");
		
		System.out.println("Number of students in the course "+course1.getCourseName()+": "+
		+ course1.getNumberOfStudents());
		String[] students1 = course1.getStudents();
		for (int i = 0; i < course1.getNumberOfStudents(); i++) {
		System.out.print(students1[i] + ", ");
		}
		
		System.out.println("\n");
		
		System.out.println("Number of students in the course " + course2.getCourseName() +": "
		+ course2.getNumberOfStudents());
		String [] students2 = course2.getStudents();
		for(int j=0;j<course2.getNumberOfStudents();j++) {
			System.out.print(students2[j]+", ");
			
		}
		
		
		
		}
		

		
		
		
		
		
		
		
		
		
		
		
	}


