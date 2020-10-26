package player;

public class Crewmate extends Player {

	public Crewmate(String  color) {
		super(color);
	}

	public String toString(){ return String.format("I am Crewmate in %s !" , getColor()); }	
}
