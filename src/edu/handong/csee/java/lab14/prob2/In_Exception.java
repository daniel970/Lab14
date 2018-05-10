package edu.handong.csee.java.lab14.prob2;

/**
 * Name:Doyoung Kim
 * Date: 2018-05-10
 */

import java.util.*;//import util

public class In_Exception {//class In_Exception
	private int x = 0, y = 0;//create private int x and y, set to 0

	public In_Exception()//In_Exception where exception will saved
	{}
	public void error_det() {//error_det method
		try{//try
			Scanner keyboard = new Scanner(System.in);//create new scanner keyboard
			System.out.print("x: ");//print message
			x = keyboard.nextInt();//save user input to x
			System.out.print("y: ");//print message
			y = keyboard.nextInt();//save user input to y
			System.out.println(this.x/this.y);//print out divided value
	    }
	    catch(ArithmeticException e){//when there is invalid value
	        System.out.println("java.lang.ArithmeticException: " + e.getMessage());//print error message
	    }
	    catch(InputMismatchException e){//when there is different value rather than number
	        System.out.println("java.util.InputMismatchException");//print error message
	    }
	    catch(Exception e) {//when there are different errors
	    	System.out.println("Some other exception has occurred: " + e.getMessage());//print error message
	    }
	}
}
