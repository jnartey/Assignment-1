import java.util.Scanner;

/**
 * @author Jacob Nartey
 * 5. Day of the week
 */
public class DayOfTheWeek {

	public static void main(String[] args) {
		//Day of the week prompt
		System.out.println("#############################");
		System.out.println("#      Day of the week      #");
		System.out.println("#############################");
		System.out.println("1 -> Monday");
		System.out.println("2 -> Tuesday");
		System.out.println("3 -> Wednesday");
		System.out.println("4 -> Thursday");
		System.out.println("5 -> Friday");
		System.out.println("6 -> Saturday");
		System.out.println("7 -> Sunday");
		System.out.println("Please enter an integer (1-7):");
		System.out.print("> ");
		
		//Instantiating the Scanner class to take input
		Scanner input = new Scanner(System.in);
		
		//Take input integer
		int day = input.nextInt();
		
		System.out.print("\n");
		//Response
		//Day of the week control statement
		if(day == 1) {
			System.out.println("Weekday " + day + " is Monday!");
		}else if(day == 2){
			System.out.println("Weekday " + day + " is Tuesday!");
		}else if(day == 3){
			System.out.println("Weekday " + day + " is Wednesday!");
		}else if(day == 4){
			System.out.println("Weekday " + day + " is Thursday!");
		}else if(day == 5){
			System.out.println("Weekday " + day + " is Friday!");
		}else if(day == 6){
			System.out.println("Weekday " + day + " is Saturday!");
		}else if(day == 7){
			System.out.println("Weekday " + day + " is Sunday!");
		}else{
			System.out.println("Error");
		}
		
		input.close();
	}

}
