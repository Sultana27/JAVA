package game;


import fixtures.Dishwasher;
import fixtures.Fixture;
import fixtures.Refridgerator;
import fixtures.Room;

/*
 * The RoomManager class is used to create all of the Rooms in
 * the house, establish the exits, create the Room Objects, and
 * add those objects to the rooms.
 * 
 * This class contains the most lines of code, due to the number
 * of objects being created by this class
 */
public class RoomManager {
	private Room startingRoom;	
	private Room[] rooms;
	private Fixture[] fixtures; 
	
	public RoomManager(int roomCount) {
		super();
		rooms = new Room[roomCount];
		
	}
	
	public void init() {
		/*
		 * The init method is called one time at the start
		 * of our program execution to create all rooms, 
		 * set exits, create other objects, and set object
		 * lists for those rooms...
		 */
		
		// 1 - Create all Rooms
		Room lobby = new Room(
			"Lobby",
			"A small Lobby",
			"The small entryway of a Castillo Villa. A Kitchen is open to the East, where a Refridgerator and Dishwasher \n \t can be seen. The hardwood floor leads West into Study Room. To the North is the Door for exit which is jammed. ");
		this.rooms[0] = lobby;
		
		Room kitchen = new Room(
				"Kitchen",
				"High-Quality Design Kitchen ",
				"he Beautiful Kitchen Is The Heart Of The Home Complete With Large Customized Granite Island & Stainless Steel Appliances. ");
		this.rooms[1] = kitchen;
			
		Room diningRoom = new Room(
				"Dining Room",
				"A long Dining Room",
				"The room has elegant furniture that typically is an all matching set. It usually includes a rectangular \n table, but you will see a round or oval table too. They often are more elaborate in design with curves and inlays.");
		this.rooms[2] = diningRoom;
		
		Room studyRoom = new Room(
				"Study Room",
				"A cozy Study Room",
				"This Study Room has the West and South walls completely covered with built-in bookshelves, the botton of which are storage cabinets. The floor is covered in a large persian rug, atop which three antique parlour chairs are arranged in front of bookshelves. ");
		this.rooms[3] = studyRoom;
					
		Room masterbedroom = new Room(
				"Master Bedroom",
				"The cozy Master Bedroom",
				"The master bedroom is large with no lack of storage, including a separate walk-in closet and additional dual closets. Updated vanity with granite counters, and a beautiful tile and glass shower remodel make this entire room an owner’s retreat!  ");
		this.rooms[4] = masterbedroom;	
		
		
		// 2 - Set Exits
		lobby.setExits(null, kitchen, null, studyRoom);		
		kitchen.setExits(studyRoom, null, null, lobby);		
		diningRoom.setExits(null, null, kitchen, masterbedroom);
		studyRoom.setExits(masterbedroom, lobby, null, null);		
		masterbedroom.setExits(null, diningRoom, studyRoom, null);
		
		
		// 3 - Create Objects 
		
		
		// 5 - Set Starting Room
		this.startingRoom = lobby;
	}
	
	public Room getStartingRoom() {
		return this.startingRoom;
	}
	
	public void setStartingRoom(Room startingRoom) {
		this.startingRoom = startingRoom;
	}
	
	public Room[] getRooms() {
		return this.rooms;
	}
	
	public void setRooms(Room[] rooms) {
		this.rooms = rooms;
	}

		
	}

