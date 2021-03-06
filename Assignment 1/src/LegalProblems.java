import java.util.Scanner;

/**
 * @author Jacob Nartey
 * 2. Legal Problems
 */
public class LegalProblems {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Instantiating the Scanner class to take input
		Scanner input = new Scanner(System.in);
		
		//Prompt for user's name
		System.out.println("Hey, what's your name?");
		System.out.print("> ");
		String name = input.nextLine();
		
		//Display name in prompt asking for user's age
		System.out.println("Ok, " + name + ", how old are you?");
		System.out.print("> ");
		int age = input.nextInt();
		
		System.out.print("\n");
		//Age legal If conditions
		if(age < 16) {
			System.out.println("You can't drive, " + name + ".");
		}
		
		if(age < 18) {
			System.out.println("You can't vote, " + name + ".");
		}
		
		if(age < 25) {
			System.out.println("You can't rent a car, " + name + ".");
		}
		
		if(age >= 25) {
			System.out.println("You can do anything that's legal, " + name + ".");
		}
		
		//System.out.println("***Exiting Program. Goodbye***");
		input.close();
	}

}
