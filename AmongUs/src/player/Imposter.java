package player;

public class Imposter extends Player {

	public Imposter(String  color) {
		super(color);
	}

	public String toString(){ return String.format("I am Imposter in %s !" , getColor()); }	
}
