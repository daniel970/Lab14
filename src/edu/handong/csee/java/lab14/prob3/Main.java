package edu.handong.csee.java.lab14.prob3;

/**
 * Name:Doyoung Kim
 * Date: 2018-05-10
 */

import java.util.Scanner;//import scanner

public class Main {//Main class
	public static final PowerCalc my_calculator = new PowerCalc();//create static final PowerCalc my_calculator
    public static final Scanner in = new Scanner(System.in);//create static final in Scanner
    
    public static void main(String[] args) {//main
        while (in.hasNextInt()) {//until 2 times
            int n = in.nextInt();//get value from user input
            int p = in.nextInt();//get value from user input
            
            try {//try
                System.out.println(my_calculator.power(n, p));//proceed calculation
            } 
            catch (Exception e) {//if there is error
                System.out.println(e);//print out proper error message
            }
        }
    }

}
