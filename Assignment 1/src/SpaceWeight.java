import java.util.Scanner;

/**
 * @author Jacob Nartey
 * 6. Space Weight
 */
public class SpaceWeight {
	
	public static void main(String[] args) {
		
		//Relative gravity of planets in double data type
		double venus = 0.78;
		double mars = 0.39;
		double jupiter = 2.65;
		double saturn = 1.17;
		double uranus = 1.05;
		double neptune = 1.23;
		
		//Instantiating the Scanner class to take input
		Scanner input = new Scanner(System.in);
		
		//Prompt for earth weight
		System.out.println("Please enter your current earth weight:");
		int earth_weight = input.nextInt();
		
		if(earth_weight > 0) {
			//Prompt for planet
			System.out.print("\n");
			System.out.println("I have information for the following planets:");
			System.out.println("1. Venus");
			System.out.println("2. Mars");
			System.out.println("3. Jupiter");
			System.out.println("4. Saturn");
			System.out.println("5. Uranus");
			System.out.println("6. Neptune");
			System.out.println("Which planet are you visiting?");
			input.nextLine();
			int planet = input.nextInt();
			
			System.out.print("\n");
			
			//output of relative weight on that planet (gravity * weight)
			if(planet == 1) {
				System.out.println("Your weight would be " + (venus * (double) earth_weight)  + " pounds on Venus.");
			}else if(planet == 2) {
				System.out.println("Your weight would be " + (mars * (double) earth_weight)  + " pounds on Mars.");
			}else if(planet == 3) {
				System.out.println("Your weight would be " + (jupiter * (double) earth_weight)  + " pounds on Jupiter.");
			}else if(planet == 4) {
				System.out.println("Your weight would be " + (saturn * (double) earth_weight)  + " pounds on Saturn.");
			}else if(planet == 5) {
				System.out.println("Your weight would be " + (uranus * (double) earth_weight)  + " pounds on Uranus.");
			}else if(planet == 6) {
				System.out.println("Your weight would be " + (neptune * (double) earth_weight)  + " pounds on Neptune.");
			}else {
				System.out.println("Error");
			}
		}else {
			System.out.println("Error");
		}
		
		input.close();
	}

}
