package edu;

public class MyInteger {
	
private int value=0;


public MyInteger(int value) {
	this.value=value;
}



public int getValue() {
	return value; 
}
	
public boolean isEven() {
	return MyInteger.isEven(this.value);
}
	
public boolean isOdd() {
	 return MyInteger.isOdd(this.value);
	}
	       
public boolean isPrime() {
	return	MyInteger.isPrime(this.value);	
		
	}
public static boolean isEven(int value) {
	return value%2==0;
	
		
	}
		
public static boolean isOdd(int value) {
			return value%2==1;
		}
		
public static boolean isPrime(int value) {
	
			int maxDivider = (int)Math.ceil(Math.sqrt(value));	
			
			for(int i=2;i<=maxDivider;i++) {
				if(value%i==0) {
		
					return false;
				}
			}
			return true;
			
			
			
		}
		
	
	
		
	
	public static boolean isEven(MyInteger value) {
		return MyInteger.isEven(value.getValue());
	}
		
		public static boolean isOdd(MyInteger value) {
			return MyInteger.isOdd(value.getValue());
		}
		
		public static boolean isPrime(MyInteger value) {
			
			return MyInteger.isPrime(value.getValue());
			
		}
	
	public boolean equals(int myInt) {
		if(myInt==value) {
			return true;
		}else {
			return false;
		}
		
	}

	public boolean equals(MyInteger myInt) {
		if(myInt.value==this.value){
		return true;
		}else {
			return false;
		}
	}
	
	
	public static int parseInt(char[]values ) {
	return MyInteger.parseInt(new String (values));
}
	
	public static int parseInt (String value) {
		
	return Integer.parseInt(value);
	}
	
	
}
