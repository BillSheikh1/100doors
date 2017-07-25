import java.util.*;

public class Puzzle {

	private LinkedList<Door> doors;
		
	public Puzzle() {
		doors = new LinkedList<>();
		makeDoors();		
	}

	public void makeDoors() {
		
		for(int d=0; d<100; d++) {
			Door door = new Door();
			doors.push(door);
		}
		
	}

	public void makePass() {
		int start = 0;
		while(start != 99) {
			for(int i=start; i<doors.size(); i+=start+1) {
				doors.get(i).changeDoor();
			}			
			start++;
		}
	}

	public void passOne() {
		for(int i=0; i<doors.size(); i++) {
			doors.get(i).changeDoor();
		}
	}

	public void passTwo() {
		for(int i=1; i<doors.size(); i+=2) {
			doors.get(i).changeDoor();
		}
	}

	public void passThree() {
		for(int i=2; i<doors.size(); i+=3) {
			doors.get(i).changeDoor();
		}
	}

	public void printState() {
		String string = "";

		for(Door d : doors) {
			if(d.isOpen()) {
				string += doors.indexOf(d)+1 + ": Open \n";
			}
			else {
				string += doors.indexOf(d)+1 + ": Closed \n";
			}
		}

		System.out.println(string);
	}





}