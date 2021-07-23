package game;

import java.util.Scanner;

import fixtures.Refridgerator;
import fixtures.Room;

public class Menus {
	 static Scanner sc = new Scanner(System.in);

	
public static void play() {
		
		System.out.println("");
		System.out.println("\t ::::::::: WELCOME ::::::::: ");
		System.out.println();
		System.out.print("Enter your name:  ");
		String input = sc.nextLine();
		System.out.println();
		input = input.toUpperCase();
		System.out.println("\t Hello " + input + "!");
		System.out.println();
		System.out.println("\t> Welcome to the Tour of Castillo Villa!!" );
		System.out.println();
		System.out.println("\t> I am more than happy to assist you navigate the Castillo Villa today.");
		System.out.println();
		System.out.println("\t> Castillo Villa is one of those buildings that if it didn't exist any longer [it] would be hard to find any others to compare it to.");
		System.out.println("\t> It's a fair-sized house built of red Sandstone with the most god-awful-looking picket fence you’d ever seen.");
				
	}
	
	
	/*
	 * This method prints information to the console regarding the 
	 * player's current location...
	 */
	public static void printRoom(Player player) {
		// PRINT INFORMATION FOR THE PLAYER'S CURRENT ROOM		
		System.out.println("-----------------------------------------------------------------");
		System.out.println("\t> You are in " + player.getCurrentRoom().getName());
		System.out.println();
		System.out.print("\t " + player.getCurrentRoom().getLongDesc());
		Menus.printRoomExits(player);
		System.out.println(Menus.printRoomExits(player));
		Menus.printInteractableObjects(player.getCurrentRoom());		
	}
	
	/*
	 * Method used to print Instructions for how to play the game
	 */
	public static void printInstructions() {
		
		System.out.println();
		System.out.println("\t> Follow these instructions to continue: ");
		System.out.println("\t> Use the commands : 'go' , 'move' to move in any of directions" );
		//System.out.println("\t> You can also Interact with items in the Room");
		System.out.println("\t> Enter 'QUIT' to exit");
		System.out.println("\t> Hit Enter to Start");
		Scanner sc = new Scanner(System.in);
				sc.nextLine();
				
	}
	
	/*
	 * This method is used to print a list of all exits connected to
	 * a Room. This method is based on the arbitrary way that the 
	 * connections to rooms are established. In the case of the example
	 * the Room class has a 'getExit' method which can be used to 
	 * arbitrarily determine a string associated with an exit (i.e.
	 * North/South/East/West), and we print this information using
	 * this method
	 */
	public static String printRoomExits(Player player) {
		
		Room currentRoom = player.getCurrentRoom();

		System.out.println();
		String exitString = "\t Exits: \n";
        if(currentRoom.northExit != null)
        exitString += "\t NORTH: " + currentRoom.northExit.getShortDesc() + "\n";
        if(currentRoom.eastExit != null)
        exitString += "\t EAST: " + currentRoom.eastExit.getShortDesc() + "\n";;
        if(currentRoom.southExit != null)
        exitString += "\t SOUTH: " + currentRoom.southExit.getShortDesc() + "\n";;
        if(currentRoom.westExit != null)
        exitString += "\t WEST: " + currentRoom.westExit.getShortDesc() + "\n";;
        return exitString;
	}


	/*
	 * This method is used to Print a list of the Objects in a room
	 * using the list of 'items' (Fixture[]). Specifically, this 
	 * method searches through all Fixture objects of the items in
	 * a Room, and if the Fixture Object is an instanceof (binary operator)
	 * the Interactable interface, we print it out.
	 */
	public static void printInteractableObjects(Room room) {
	}
	
	
}