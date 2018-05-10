package edu.handong.csee.java.lab14.prob6;

/**
 * Name:Doyoung Kim
 * Date: 2018-05-10
 */

public class CustomID extends Exception{//class CustomID extends Exception
		private String[] races = new String[]{"Vulcans", "Romulan", "Klingons"};//create new array races with elements
		private String name = "";//create string name 
		private int age = 0;//create int age, with 0 value
		private String race = "";//create string race
		private int state = 0;//create int state with 0 value

		public void set_name(String str) throws Exception{// method set_name throws Exception
			if(str.length() < 5) {//if length of str is lower than 5
				state = 0;//set state to 0
				throw new Exception("Your name is short! Try again!");//throw message error
			}

		else {//or else
			this.name = str;//save str to name value
			System.out.println("Name is valid");//print message
			System.out.println("Name: " + this.name);//print message
			state++;//add +1 on state
		}
	}

public void set_age(int num) throws Exception{//method set_age throws Exception
	if(num < 18) {//if num valuen is lower than 18
		state = 1;//set state to 1
		throw new Exception("You are too young! Try again!");//throw error emssage
	}
	else {//or else
		this.age = num;////save num to age value
		System.out.println("Age is valid");//print message
		System.out.println("Age: " + this.age);//print message
		state++;//add 1 to state
	}
}

public void set_race(String race) throws Exception{//method set_race throws Exception
	for(int i = 0; i < races.length; i++){//loop number of races
		if(races[i].equals(race)) {//if race array value is equal to race value
			this.race = races[i];//save race value in race array
			System.out.println("Race is valid");//print message
			System.out.println("Race: " + races[i]);//print message
			state = 0;//set state to 0
			return;//return
		}
	}
	state = 2;//set state to 2
	throw new Exception("Human! Try again.");//print message
}

public int getState(){//method getState
return state;//return state value
}
}
