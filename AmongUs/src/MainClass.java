import player.*;

public class MainClass {

	public static void main(String[] args) {
		
		Player a = new Crewmate("White");
		Player b = new Imposter("Black");
	
		System.out.println(a);
		System.out.println(b);
	}
}