package edu.handong.csee.java.lab14.prob3;

/**
 * Name:Doyoung Kim
 * Date: 2018-05-10
 */

public class PowerCalc {//class PowerCalc
	public long power(int n, int p) throws Exception//
    {
        long result = 0;//create long result value, 0

        result = (long)Math.pow(n, p);//save n^p on result
        if(n < 0 || p < 0){//when value is -
            throw new Exception("n or p should not be negative.");//throw exception message
        }
        if(n == 0 && p == 0){//when values are 0
            throw new Exception("n and p should not be zero.");//throw exception message
        }
        return result; //send result
    }

}
