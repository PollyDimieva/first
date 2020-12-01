package inheritance;
import java.util.Scanner;
public class GeometricObjTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		Triangle ABC = new Triangle();
		
		System.out.println("a = ?");
		double a = sc.nextDouble();
		ABC.setSide1(a);
		
		System.out.println("b = ?");
		double b = sc.nextDouble();
		ABC.setSide2(b);
		
		System.out.println("c = ?");
		double c = sc.nextDouble();
		ABC.setSide3(c);
		
		System.out.println("What color?");
		String color1 = sc.next();
		ABC.setColor(color1);
		
		System.out.println("Is it filled?");
		boolean filled1 = sc.hasNext();
		ABC.setFilled(filled1);
		
		System.out.println(ABC.getArea());
		System.out.println(ABC.getPerimeter());
		System.out.println(ABC.getColor());
		System.out.println( ABC.isFilled());
		System.out.println(ABC.getDateCreated());
		
		
	}

}
