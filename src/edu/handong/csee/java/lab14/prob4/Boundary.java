package edu.handong.csee.java.lab14.prob4;

/**
 * Name:Doyoung Kim
 * Date: 2018-05-10
 */

public class Boundary {//class Boundary
	private static int [] arr = new int[5];//create array arr with 5 space
	private static int cnt = 0;//create int cnt, set 0
	
	public void receive(int num) throws ArrayIndexOutOfBoundsException{//method receive which throws ArrayIndexOutOfBoundsException
		int i = cnt;//set int i to cnt
		arr[i] = num;//save num value in arr array
		cnt++;//add cnt +1 to count
		System.out.printf("arr[%d] <- %d\n", i, num);//print out message
	}

}
