package edu;
import java.util.Scanner;
public class TestChecking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

char [] keyAnswers = new char [10];

keyAnswers[0]='D';
keyAnswers[1]='B';
keyAnswers[2]='D';
keyAnswers[3]='C';
keyAnswers[4]='C';
keyAnswers[5]='D';
keyAnswers[6]='A';
keyAnswers[7]='E';
keyAnswers[8]='A';
keyAnswers[9]='D';


char [][] answers = new char [2][5];

int points = 0;

for(int i=0;i<2;i++) {
	for(int j=0;j<5;j++) {
		answers [i][j]=sc.next().charAt(j);
	}
} System.out.print(answers);

//for(int i = 0; i<8;i++) {
//	points = 0;
//	for(int j=0;j<10;j++) {
//		if(answers[i][j].equals(keyAnswers[j])) {
//			points++;
//		}
//	}
//	
//	}
//System.out.println(points);


	}

}
