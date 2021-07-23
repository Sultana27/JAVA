package fixtures;


public class Dishwasher extends Fixture implements Interactable {
	
	// Parameterized Constructor
	public Dishwasher(String name, String shortDesc, String longDesc) {
		super(name, shortDesc, longDesc);
	}
	
	public void interact() {
		
		System.out.println("You interacted with Dishwasher");
	}
}