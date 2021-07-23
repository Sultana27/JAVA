package fixtures;

public class Room extends Fixture {
	/*
	 * exits is a list of the 'adjacent' rooms...Here it is established
	 * that all rooms will have an array that can hold 4 references.
	 * Note that this number is arbitrary, and that is specifically is
	 * used to associate the cardinal directions. There are other ways
	 * to implement this logic...
	 */
	private Room[] exits = new Room[4];
	public Room northExit;
	public Room eastExit;
	public Room southExit;
	public Room westExit;
	
	
	/*
	 * This Fixture array is a collection of the items we can potentially
	 * have in our room.
	 */
	private Fixture[] items;

	public Room(String name, String shortDesc, String longDesc) {
		super(name, shortDesc, longDesc);
	}
	
	public Room[] getExits() {
		return this.exits;
	}
	
	/*
	 * This method can be used to obtain a specific Exit from
	 * the Room Object...
	 * 
	 * This method is used in the example to provide the arbitrary
	 * way to move north/south/east/west
	 */
	public Room getExit(String direction) {
		
		if(direction.equals("north")) {
			return northExit;
			}
		if(direction.equals("east")) {
	        return eastExit;
	        }
		if(direction.equals("south")) {
	        return southExit;
	        }
		if(direction.equals("west")) {
	        return westExit;
	        }
		return null;
	}
	
	// setter for exits
	public void setExits(Room north, Room east, Room south, Room west) {
		if(north != null) {
			northExit = north;
			}
			if(east != null) {
			eastExit = east;
			}
			if(south != null) {
			southExit = south;
			}
			if(west != null) {
			westExit = west;
			}
	}

	// Overloaded setter method. Allows us to set single exit based on index...
	public void setExits(Room exit, int index) {
		this.exits[index] = exit;
	}
	
	// Getter and Setter for Fixtures
	
	
	/*
	 * The setter method here uses VarArgs simply for ease of use
	 */
	public void setItems(Fixture... items) {
		this.items = items;
	}
}
