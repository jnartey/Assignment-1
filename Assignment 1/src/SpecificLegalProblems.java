import java.util.Scanner;

/**
 * @author Jacob Nartey
 * 4. Specific Legal Problems
 */
public class SpecificLegalProblems {

	public static void main(String[] args) {
		//Instantiating the Scanner class to take input
		Scanner input = new Scanner(System.in);
		
		//Prompt for user's name
		System.out.println("Hey, what's your name?");
		String name = input.nextLine();
		
		//Display name in prompt asking for user's age
		System.out.println("Ok, " + name + ", how old are you?");
		int age = input.nextInt();
		
		//Age legal If conditions
		if(age < 16) {
			System.out.println("You can't drive, " + name + ".");
		}else if(age < 18) {
			System.out.println("You can't vote, " + name + ".");
		}else if(age < 25) {
			System.out.println("You can't rent a car, " + name + ".");
		}else{
			System.out.println("You can do anything that's legal, " + name + ".");
		}
		
		//System.out.println("***Exiting Program. Goodbye***");
		input.close();
	}

}
