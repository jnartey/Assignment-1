/**
 * @author Jacob Nartey
 * 3. Cars or Buses
 */
public class CarsBuses {

	public static void main(String[] args) {
		//Initial values of variables of data type integer
		int people = 10;
		int cars = 40;
		int buses = 30;
		
		//Java control statements if, else if and else for cars and people
		if(cars > people) {//If there are more cars than people
			System.out.println("We should take the cars");
		}else if(cars < people) {//Else If there are less cars than people
			System.out.println("We should not take the cars.");
		}else {//Else if none of the conditions above are true.
			System.out.println("We can't decide.");
		}
		
		//Java control statements if, else if and else for buses and cars
		if(buses > cars) {//If there are more buses than cars
			System.out.println("That's too many buses.");
		}else if(buses < cars) {//Else If there are less buses than cars
			System.out.println("Maybe we should take the buses.");
		}else {//Else if none of the conditions above are true.
			System.out.println("We still can't decide.");
		}
		
		//Java control statements if, else if and else for people and buses
		if(people > buses) {//If there are more people than buses
			System.out.println("Alright, let's just take the buses");
		}else{//if people are less than or equal to buses
			System.out.println("Let's just take the cars.");
		}
		
		/*
		 * 1. What do you think else if and else are doing? Answer in a comment.
		 * 
		 * Else if condition executes when the if condition fails or is false
		 * Else condition executes when if and else if conditions are not satisfied or false
		 * 
		 * 2. Remove the else from one of your else if statements. What differences does that make? Why?
		 * 
		 * There are no differences when else is removed from one of the else if statements because that statement 
		 * becomes an independent if statement that works same as the else if as both have conditions that must be met
		 * 
		 */

	}

}
