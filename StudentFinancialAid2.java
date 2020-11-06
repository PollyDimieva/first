package edu;
import java.util.Scanner;
public class StudentFinancialAid2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc=new Scanner(System.in);
		
		Student2[] student=new Student2[5];		
		
		for(int i=0;i<5;i++) {
			String name=sc.nextLine();
			double grades=sc.nextDouble();
			
			sc.nextLine();
			student[i]=new Student2(name,grades);
		}
		
		eligibleStudents(student);
		
		
	}
	
	
	
	public static void eligibleStudents(Student2 student[]) {
		for(Student2 s : student) {
			if(isTheStudentEligible(s)) {
				System.out.println(s.getName());
			}
		}
	}

	
	
	public static boolean isTheStudentEligible(Student2 student1) {
		return student1.getGrades() >5.50 && student1.getGrades()<6.01;
	}
	
	
		
		
	}

