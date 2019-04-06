package race_car;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */



public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
	RaceCar lambo = new RaceCar("lambo",5); 
		// 2. Print the RaceCar's position in the race
System.out.println("The Lambo is in "+lambo.getPositionInRace()+"th place");
		// 3. Crash the RaceCar
		lambo.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
		if (lambo.isDamaged()) { lambo.pit();
			
		}
		// 5. Help the car move into first place.
		for (int i = lambo.getPositionInRace(); i > 1;i--) {
		lambo.overtake();	
		}
		
	}
}
