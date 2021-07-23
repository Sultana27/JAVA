package game;

import java.util.Scanner;

import fixtures.Room;

public class Input {
	
	static Scanner sc = new Scanner (System.in);
	/*
	 * Method used to gather input from the user, and converts it to an array
	 */
	public static String[] collectInput() {
		Scanner sc = new Scanner (System.in);
		String str = sc.nextLine();
		String[] command = str.split(" ");
		
		return command;
		
	}
	

	/*
	 * Method used to examine collected input and perform actions
	 */
	public static void parse(String[] command, Player player) {
		/*
		 * 'action' relates to the overall functionality we want to perform this
		 * includes, moving the player, interacting with an object and quitting
		 */
		String action = command[0].toUpperCase().intern();

		/*
		 * 'details' refers to additional options for the specific commands. Set to null
		 * initially, because we don't know if the player will enter an additional
		 * command...
		 */
		String details = null;

		if (command.length > 1) {
			details = command[1].toUpperCase().intern();
		}

		if (action == "GO" | action == "MOVE") {
			
			if (command.length == 1) {
				System.out.println(action + " WHERE?? ");
				return;
				}
			
			movePlayer(details, player);
	}
	else if (action == "INTERACT") {
			// What to do when the 'action' specified is to 'interact'
		
		if (command.length == 1) {
			System.out.println(action + " WITH?? ");
			return;
			}
		
		objectInteraction(details, player);
		} else if (action == "QUIT") {
			Runner.endGame();
		}
	}

	/*
	 * Method used to move the player to a new Room. Note, we can include
	 * this logic directly within the parse method, but encapsulating this
	 * code into a separate method makes the code easier to read, and also
	 * makes the code more maintainable (we can invoke this functionality 
	 * in other locations in our project as well...)
	 */
	public static void movePlayer(String details, Player player) {
		String direction = details; 
		Room currentRoom = player.getCurrentRoom();
		
		// leaving the current room 
		Room nextRoom = null;
		if(direction.equals("NORTH")) {
		nextRoom = currentRoom.northExit;
		}
		if(direction.equals("EAST")) {
		nextRoom = currentRoom.eastExit;
		}
		if(direction.equals("SOUTH")) {
		nextRoom = currentRoom.southExit;
		}
		if(direction.equals("WEST")) {
		nextRoom = currentRoom.westExit;
		}
		if (nextRoom == null) {
		System.out.println("There is no door!");
		}
		else {			
			
			player.setCurrentRoom(nextRoom) ;		
			
			}
		}

	/*
	 * Method used to allow the player to interact with objects in a Room
	 * that implement the 'Interactable' interface. Note, we can include
	 * this logic directly within the parse method, but encapsulating this
	 * code into a separate method makes the code easier to read, and also
	 * makes the code more maintainable (we can invoke this functionality 
	 * in other locations in our project as well...)
	 */
	public static void objectInteraction(String details, Player player) {
		// TODO: Implement method
	}
	
}