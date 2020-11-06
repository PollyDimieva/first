package edu;
import java.util.Scanner;




public class StudentFinancialAid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		Student[] student=new Student[5];		
		
		for(int i=0;i<5;i++) {
			String name=sc.nextLine();
			double grades=sc.nextDouble();
			
			sc.nextLine();
			student[i]=new Student(name,grades);
		}
		
		eligibleStudents(student);
		
		
	}
	
	
	
	public static void eligibleStudents(Student student[]) {
		for(Student s : student) {
			if(isTheStudentEligible(s)) {
				System.out.println(s.name);
			}
		}
	}

	
	
	public static boolean isTheStudentEligible(Student student1) {
		return student1.grades >5.50;
	}
	
	
	}	
