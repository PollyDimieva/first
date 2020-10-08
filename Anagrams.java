package edu;
import java.util.Arrays;
import java.util.Scanner;
public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   
   
 System.out.println("Enter the first word: ");
 String word1 = sc.nextLine();
 System.out.println("Enter the second word: ");
 String word2 = sc.nextLine();
 
// if(word1.length()!= word2.length()) {
//	System.out.println("These words are not anagrams.");
//	break;
// }
 
 word1=word1.replaceAll("\\s","");
 word2=word2.replaceAll("\\s", "");
 
 
 char[] arr1 = word1.toLowerCase().toCharArray();
 char[] arr2 = word2.toLowerCase().toCharArray();
 
 Arrays.sort(arr1);
 Arrays.sort(arr2);
 
 if (arr1.equals(arr2)) {
	
	 System.out.println("These words are anagrams");
 }else {
	 System.out.println("These words are not anagrams.");
 }

	}

}
