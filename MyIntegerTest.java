package edu;

public class MyIntegerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyInteger int1 = new MyInteger(29);
MyInteger int2 = new MyInteger(29);
MyInteger int3 = new MyInteger(17);

System.out.println(int1.isOdd());
System.out.println(int1.isEven());
System.out.println(int3.isPrime()+"\n");

System.out.println(MyInteger.isOdd(int2));
System.out.println(MyInteger.isEven(int2));
System.out.println(MyInteger.isPrime(int2)+"\n");

System.out.println(MyInteger.isOdd(17));
System.out.println(MyInteger.isEven(13));
System.out.println(MyInteger.isPrime(11)+"\n");

System.out.println(int1.equals(29));
System.out.println(int2.equals(int1)+"\n");


System.out.println(MyInteger.parseInt(new char[] {'2', '5', '8'}));
System.out.println(MyInteger.parseInt("174"));
	}

}
