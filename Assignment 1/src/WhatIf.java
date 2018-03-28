/**
 * @author Jacob Nartey
 * 1. What if
 */
public class WhatIf {

	public static void main(String[] args) {
		
		/* Initial values of variables of data type integer
		 * These values will output 
		 * line1: "Too few cats! The world is saved for another day!"
		 * line2: "The world is dry!"
		 */
		int people = 100;
		int cats = 60;
		int dogs = 80;
		
		/* 2. Change your values so that your output is completely different than what you first saw
		 * These values will output 
		 * line1: "Too many cats! The world is doomed!"
		 * line2: "The world is drooled on!"
		 */
		people = 70;
		cats = 90;
		dogs = 90;
		
		/*
		 * 3. Change your values so that no output is given.
		 * These values will output nothing if all variables are equal
		 */
		people = 90;
		cats = 90;
		dogs = 90;
		
		
		/*
		 * This if condition is to check if there are more cats than people"
		 * or there are more people than cats
		 */
		if(people < cats) {
			//If there are less people than cats, then print "Too many cats! The world is doomed!"
			System.out.println("Too many cats! The world is doomed!");
		}
		
		/*
		 * This if condition is to check if there are more people than cats"
		 */
		if(people > cats){
			//If there are more people than cats, then print "Too few cats! The world is saved for another day!"
			System.out.println("Too few cats! The world is saved for another day!");
		}
		
		
		/*
		 * This if condition is to check if there are more dogs than people"
		 */
		if(people < dogs) {
			//If there are less people than dogs, then print "The world is drooled on!"
			System.out.println("The world is drooled on!");
		}
		
		/*
		 * This if condition is to check if there are more people than dogs
		 */
		if(people > dogs){
			//If there are less people than dogs, then print "The world is drooled on!"
			System.out.println("The world is dry!");
		}
	}

}
