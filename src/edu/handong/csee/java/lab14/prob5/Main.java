package edu.handong.csee.java.lab14.prob5;

/**
 * Name:Doyoung Kim
 * Date: 2018-05-10
 */

import java.util.Scanner;//import scanner

public class Main {//class Main
	public static void main(String[] a){//main
        try{//try
        Scanner keyboard = new Scanner(System.in);//create new scanner
        String str = keyboard.nextLine();//get user input and save on str
            Main.myTest(str);//play myTest method using str value
        } catch(MyException mae){//if there is null value
            System.out.println("Inside catch block: " + mae);//print out message
        }
    }
     
    static void myTest(String str) throws MyException{//method myTest which throws MyException
        if(str.equals("null")){//if input is null
            throw new MyException("String val is null");//print out message
        }
        else//or else
        System.out.println("String val is:" + str);//print out message
    }
}
