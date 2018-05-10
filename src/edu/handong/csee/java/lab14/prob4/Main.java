package edu.handong.csee.java.lab14.prob4;

/**
 * Name:Doyoung Kim
 * Date: 2018-05-10
 */

import java.util.Scanner;//import scanner

public class Main {//class Main
	public static void main(String[] args){//main
		Scanner keyboard = new Scanner(System.in);//create new scanner
		int num = 0;//create int num, set to 0
		Boundary arr = new Boundary();//create arr which will use Boundary method
		boolean repeat = true;//create boolean repeat, set to true
		while(repeat){//loop when repeat value is true
			try{//try
				System.out.print("Enter an integer: ");//print message
				num = keyboard.nextInt();//save user input in num
				arr.receive(num);//play receive using num value
			}
			catch(ArrayIndexOutOfBoundsException e){//when there is error (ArrayIndexOutOfBoundsException)
				System.out.println("Invalid array index access!");//print message
				repeat = false;//stop while
			}
		}
	}
}
