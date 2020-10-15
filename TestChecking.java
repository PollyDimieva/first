package edu.smg;

import java.util.Scanner;

public class TestChecking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] keyAnswers = new char[10];
		{
			keyAnswers[0] = 'D';
			keyAnswers[1] = 'B';
			keyAnswers[2] = 'D';
			keyAnswers[3] = 'C';
			keyAnswers[4] = 'C';
		        keyAnswers[5]='D';
		        keyAnswers[6]='A';
			keyAnswers[7]='E';
			keyAnswers[8]='A';
			keyAnswers[9]='D';

			char[][] answers = new char[8][10];

			int points = 0;

			for (int i = 0; i < 8; i++) {
				System.out.println("Input the answers to student number "+(i+1));
				
				for (int j = 0; j < 10; j++) {
					
					answers[i][j] = sc.nextLine().charAt(0);
				}
			}
		

			for (int i = 0; i < 8; i++) {
				points = 0;
				for (int j = 0; j < 10; j++) {
					if (answers[i][j] == keyAnswers[j]) {
						points++;
					}
				}
					
				System.out.println(points);

			}
			
		}

	}
}
