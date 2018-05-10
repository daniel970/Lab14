package edu.handong.csee.java.lab14.prob1;

/**
 * Name:Doyoung Kim
 * Date: 2018-05-10
 */

public class SpeedLimiter {//class SpeedLimiter
	private int speed = 0;//create private int value speed and set to 0
	private int limit = 0;//create private int value limit and set to 0
	
	public SpeedLimiter(int limit, int speed){//public SpeedLimiter
		this.limit = limit;//get limit value
		this.speed = speed;//get speed value
	}

	public void warnSpeedLimit(){//method warnSpeedLimit
		try{//proceed
			if(this.speed > this.limit)//if speed value is bigger than limit value
				throw new Exception("Speed Limit " + this.limit + "km exceeded!");//make exception
			System.out.println("You are a law abiding citizen!");//else, not exceeded, than print
		}
		catch(Exception e) {//if there is exception
			System.out.println(e.getMessage());//print message throw
			System.out.println("You are being fined. ");//print message
		}
		System.out.println("Your current speed: " + this.speed);//print message
	}

}
