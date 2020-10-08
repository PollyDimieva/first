package edu;
import java.util.Scanner;
public class Paint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
System.out.println("Enter the width: ");
double width = sc.nextDouble();
System.out.println("Enter the height: ");
double height = sc.nextDouble();
System.out.println("Enter the length: ");
double length = sc.nextDouble();

double plosht = width * length + 2*((width+length)*height);
int area = (int)Math.ceil(plosht);

int fiveLiterPrice =15;
int oneLiterPrice = 4;
int fiveLiterCover=140;
int oneLiterCover = 30;
int fiveLiterBuckets = 0;
int oneLiterBuckets = 0;

fiveLiterBuckets = area/fiveLiterCover;
int areaLeft = area%fiveLiterCover;
oneLiterBuckets = areaLeft/oneLiterCover + ( (areaLeft%oneLiterCover!=0)? 1 : 0);

if(oneLiterBuckets * oneLiterPrice>fiveLiterPrice) {
	oneLiterBuckets =0;
	fiveLiterBuckets++;
}
System.out.println("You need " + fiveLiterBuckets + " five liter buckets and " + oneLiterBuckets + " one liter buckets");
}
	


}
