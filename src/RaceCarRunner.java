

public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
	RaceCar vroom = new RaceCar("minecraft", 5);
	
		// 2. Print the RaceCar's position in the race
System.out.println(vroom.getPositionInRace());
		// 3. Crash the RaceCar
		vroom.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
if(vroom.damaged) {
	vroom.pit();
}
		// 5. Help the car move into first place.
for (int i = 1; vroom.getPositionInRace()>1; i++) {
	vroom.overtake();
}


	}
}
