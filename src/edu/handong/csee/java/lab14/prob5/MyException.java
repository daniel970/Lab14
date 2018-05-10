package edu.handong.csee.java.lab14.prob5;

/**
 * Name:Doyoung Kim
 * Date: 2018-05-10
 */

public class MyException  extends Exception {//class MyException extends Exception
	private String message = null; //create null string message
 
    public MyException() {//public MyException
        super();//reset
    }
 
    public MyException(String message) {//method MyException with String message
        super(message);//reset message
        this.message = message; //bring message
    }
 
    public MyException(Throwable cause) {//public MyException with Throwable cause
        super(cause);//reset cause
    }
 
    public String toString() {//String toString
        return message;//return message value
    }

}
