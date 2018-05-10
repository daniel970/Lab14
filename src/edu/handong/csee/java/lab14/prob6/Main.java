package edu.handong.csee.java.lab14.prob6;

/**
 * Name:Doyoung Kim
 * Date: 2018-05-10
 */

import java.util.Scanner;//import scanner

public class Main {//class Main
	public static void main(String[] args){//main
		String name, race;//create string name and race
		int age = 0;//create int age value 0
		Scanner keyboard = new Scanner(System.in);//create new scanner
		CustomID obj = new CustomID();//create new CustomID obj
		boolean repeat = true;//create boolean repeat which is true value

		while(repeat){//when repeat is true, loop
			try {//try
				if(obj.getState() == 0) {//when state of object ==0
					System.out.print("Enter your name: ");//print message
					name = keyboard.nextLine();//save the user input
					obj.set_name(name);//set the name in obj using name value
				}
				else if(obj.getState() == 1) {//when state of object==1
					System.out.print("Enter your age: ");//print message
					age = keyboard.nextInt();//save the user input
					keyboard.nextLine();//goto next line
					obj.set_age(age);//set the age in obj using age value
				}
				else if(obj.getState() == 2) {//when state of object==2
					System.out.print("Enter your race: ");//print message
					race = keyboard.nextLine();//save the user input
					obj.set_race(race);//set the race in obj using race value
				}
			}
			catch(Exception e){//when there is error
				System.out.println(e.getMessage());//print proper error message
				continue;//continue
			}
		}
	}
}
