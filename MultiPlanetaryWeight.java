package edu;

import java.util.Scanner;
public class MultiPlanetaryWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Your weight on Earth: ");
		
		int weight = sc.nextInt();
		
		System.out.println("You can choose from: \n"
				+ "Mercury \nVenus \nMars \n"
				+ "Jupiter \nSaturn \nUranus \nNeptune");
		String mercury = new String("Mercury");
		String venus = new String("Venus");
		String mars = new String("Mars");
		String jupiter = new String("Jupiter");
		String saturn = new String("Saturn");
		String uranus = new String("Uranus");
		String neptune = new String("Neptune");
	
		String planet = sc.next();
		
		if(planet.equals(mercury)) {
			System.out.println( weight * 0.38 );
		}else if(planet.equals(venus)) {
			System.out.println( weight * 0.91 );
		}else if(planet.equals(mars)) {
			System.out.println( weight * 0.38 );
        }else if(planet.equals(jupiter)) {
	     System.out.println( weight * 2.36 );
        }else if(planet.equals(saturn)) {
				System.out.println( weight * 0.92 );
	    }else if(planet.equals(uranus)) {
					System.out.println( weight * 0.89);
	    }else if(planet.equals(neptune)) {
			System.out.println( weight * 1.13);
}else {
	System.out.println("Invalid data.");
}
}}