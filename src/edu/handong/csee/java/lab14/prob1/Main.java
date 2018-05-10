package edu.handong.csee.java.lab14.prob1;

/**
 * Name:Doyoung Kim
 * Date: 2018-05-10
 */

import java.util.Scanner;//import Scanner to use Scanner
import java.util.Random;//import Random to generate random value

public class Main {//class Main
	public static void main(String[] args) {//main
		Scanner keyboard = new Scanner(System.in);//create new scanner keyboard
		Random rand = new Random();//create new random rand
		int limit = 0, speed = 0;//create int limit and speed, set to 0

		System.out.print("Set the speed limit, officer: ");//print out message
		limit = keyboard.nextInt();//save the user input in limit
		speed = rand.nextInt(101);//save the random input in speed

		SpeedLimiter lim = new SpeedLimiter(limit, speed);//make new lim using SpeedLimiter class, send the limit and speed value

		lim.warnSpeedLimit();//play method warnSpeedLimit using lim values

		keyboard.close();//close keyboard
		}

}
