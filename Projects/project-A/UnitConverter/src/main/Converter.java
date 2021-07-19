package main;
import java.util.Scanner; 

public class Converter {
	
		private static double collectQuantity(String unit1, String unit2) {			
			System.out.println("Enter the amount in "+unit1+" to convert to "+unit2+": ");
		    double qty;
		    Scanner sc = new Scanner(System.in);
		    qty = sc.nextDouble();
		    return qty;
		}
		
		public static double convertTeaspoonsToTablespoons(double qty) {			
			qty = qty/3;
			return qty;
		}
		
		public static double convertTeaspoonsToCups(double qty) {
			qty = qty/48;
			return qty;
		}
		
		public static double convertLitersToMilliliters(double qty) {			
			qty = qty*1000;
			return qty;			
		}
		
		public static double convertFootToMeters(double qty) {			
			qty = qty*0.3048;
			return qty;			
		}
		
		public static double convertMilesToKilometers(double qty) {			
			qty = qty*1.609344;
			return qty;			
		}
		
		public static double convertFootToInches(double qty) {			
			qty = qty*12;
			return qty;
		}
		
		public static double convertCelsiusToFarenheit(double qty) {			
			qty = (1.8*qty)+32;
			return qty;
		}
		
		public static void main(String[] args) {
			
			int menuSelection =0; 
			double quantity1, quantity2;
			
			Scanner sc = new Scanner(System.in);
				 
			System.out.println(" Welcome to Unit Converter App ");
			try {
				
		    while(menuSelection != 4) {
		    	System.out.println("\n");
			System.out.println(" Enter 1 for Volume Conversions\n Enter 2 for Distance Conversions\n Enter 3 for Temperature Conversions\n Enter 4 to Quit");		
			menuSelection = sc.nextInt(); 
						
			switch(menuSelection){ 
				case 1: 
					char ch;
					System.out.println(" You have selected Volume Conversion");
					System.out.println(" Enter A for Teaspoons to Tablespoons\n Enter B for Teaspoons to Cups\n Enter C for Liters to Milliliters");
					ch = sc.next().charAt(0);
					ch = Character.toUpperCase(ch);
					
					switch(ch) {
						case 'A':
						quantity1 = collectQuantity("Teaspoons","Tablespoons");
						quantity2 = convertTeaspoonsToTablespoons(quantity1);
						System.out.printf(quantity1+" Teaspoons = %.2f Tablespoons", quantity2);
						break;
						
						case 'B':
						quantity1 = collectQuantity("Teaspoons","Cups");
						quantity2 = convertTeaspoonsToCups(quantity1);
						System.out.printf(quantity1+" Teaspoons  = %.2f Cups", quantity2);
						break;
							
						case 'C':
						quantity1 = collectQuantity("Liters","Milliliters");
						quantity2 = convertLitersToMilliliters(quantity1);
						System.out.printf(quantity1+" Liters  = %.2f Milliliters", quantity2);
						break;
						
						default:
							System.out.println("No such entry, wrong input. Choose from selection.");			
					}
					break;
					
				case 2: 
					System.out.println(" You have selected Distance Conversion");
					System.out.println(" Enter A for Foot to Meters\n Enter B for Miles to Kilometers\n Enter C for Foot to Inches");
					ch = sc.next().charAt(0);
					ch = Character.toUpperCase(ch);
					
					switch(ch) {
						case 'A':
						quantity1 = collectQuantity("Foot","Meters");
						quantity2 = convertFootToMeters(quantity1);
						System.out.printf(quantity1+" Foot  = %.2f Meters", quantity2);
						break;
						
						case 'B':
						quantity1 = collectQuantity("Miles","Kilometers");
						quantity2 = convertMilesToKilometers(quantity1);
						System.out.printf(quantity1+" Miles  = %.2f Kilometers", quantity2);
						break;
							
						case 'C':
						quantity1 = collectQuantity("Foot","Inches");
						quantity2 = convertFootToInches(quantity1);
						System.out.printf(quantity1+" Foot  = %.2f Inches", quantity2);
						break;
						
						default:
							System.out.println("No such entry, wrong input. Choose from selection.");
					}
					break;

				case 3: 
					System.out.println(" You have selected Temperature Conversion");
					System.out.println(" Enter A for Celsius to Farenheit");
					ch = sc.next().charAt(0);
					ch = Character.toUpperCase(ch);
					
					switch(ch) {
						case 'A':
						quantity1 = collectQuantity("Celsius","Farenheit");
						quantity2 = convertCelsiusToFarenheit(quantity1);
						System.out.printf(quantity1+" Celsius  = %.2f Farenheit", quantity2);
						break;
										
						default:
							System.out.println("No such entry, wrong input. Choose from selection.");
					}
					break;

				case 4:
					System.out.println("Thank You for choosing Unit Converter, Visit Again!");
					break;
					
				default:
					System.out.println("No such entry, wrong input. Choose between 1-4 from selection.");
			}
		    }
			}
			catch(java.util.InputMismatchException err) {
	            
				System.out.println("No such entry, wrong input.");
				System.out.println("Thank You for choosing Unit Converter, Visit Again!");
			}
			
			sc.close();
			}
		    
		}
