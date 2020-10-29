package edu;

public class emirp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		System.out.println(13+"\t");
	
		int i = 1;
		int num = 17;

while(i<120) {
//	boolean isPalindrome = isPalindrome(num);

//	int sameNum = num;
//	int reversedNum =0;
//	while (sameNum!=0) {
//		int lastDigit = sameNum%10;
//		reversedNum=reversedNum*10 + lastDigit;
//		sameNum/=10;
//	}
//	boolean isPalindrome=num==reversedNum;
//	if(!isPalindrome) {
//		num++;
//		continue;
//	}
//	int maxDivider = (int)Math.ceil(Math.sqrt(num));
//	
//	boolean isPrime=true;
//	
//	for(int j=2;j<=maxDivider;j++) {
//		if(num%j==0) {
//			isPrime=false;
//			break;
//		}
//	}

	boolean isPrime = isPrime(num);
	
	
if(!isPrime) {
	num++;
	continue;
}


boolean theReversedIsPrime=theReversedIsPrime(num);

if(!theReversedIsPrime) {
	num++;
	continue;
}

boolean isNotPalindrome=isNotPalindrome(num);
 if(!isNotPalindrome) {
	 num++;
	 continue;
 }


System.out.println(num);
i++;
num++;

if(i%10==0) {
	System.out.println();
	}
}
	}

//	public static boolean isPalindrome(int number) {
//		int sameNumber=number;
//		
//		int reversedNumber = 0;
//		while (sameNumber!=0) {
//			int lastDigit = sameNumber%10;
//			reversedNumber=reversedNumber*10 + lastDigit;
//			sameNumber/=10;
//	}
//	
//	return number==reversedNumber;
//	
//	}
	
	
	public static boolean isPrime(int number) {
		
		int maxDivider = (int)Math.ceil(Math.sqrt(number));
		
		boolean isPrime=true;
		
		for(int j=2;j<=maxDivider;j++) {
			if(number%j==0) {
				isPrime=false;
				break;
			}
		}
		
		return isPrime;
	}
	
	public static boolean theReversedIsPrime(int number) {
		int reversedNumber=0;
		while(number!=0) {
		int lastDigit=number%10;
	     reversedNumber=reversedNumber*10+lastDigit;
		number=number/10;
		}boolean theReversedIsPrime = isPrime(reversedNumber);
		return theReversedIsPrime;
	}



public static boolean isNotPalindrome(int number) {
	int sameNumber=number;
	
	int reversedNumber = 0;
	while (sameNumber!=0) {
		int lastDigit = sameNumber%10;
		reversedNumber=reversedNumber*10 + lastDigit;
		sameNumber/=10;
}

return number!=reversedNumber;

}

}
