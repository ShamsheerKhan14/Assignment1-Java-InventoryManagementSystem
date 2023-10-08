/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shamsheerkhan;

/**
 * Date completed: 24 September 2022
 * Student Id: 991661386
 * @author Shamsheer Khan
 */
/**
 * Importing scanner to be used in the class
 * Main method below contains the declaration of new object item
 * and all the required variables, item id, name, qoh, rop and sellprice used in the assignment
 * it also carries the exceptions for each variables. that is if the required condition
 * is not met then we throw a exception
 * after everything is correct then we format the input after taking it from user and
 * provide him the output and the total price
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        /** 
         * New Inventory object
         */
        Inventory item = new Inventory();
        /**
         * importing new scanner to get user inputs
         */
        Scanner sc = new Scanner(System.in);
        /**
         * boolean variable isTrue is used to exit the loop when the conditions are met
         */
        boolean isTrue = false;
	String itemId = "";
        /**
         * here we are prompting the user for the item Id
         */
	System.out.print("Enter Inventory Item ID: ");
	/**
         * for validating whether the user entered valid item Id in the form of 
         * ABC-1234 through a do-while loop
         * we have to also use try-catch along with it to get this done
         * if the condition is not met we throw a illegal argument exception and 
         * prompt the user to enter again
         */	
	do {
			
            try {
                isTrue = false;
                itemId = sc.nextLine();
                item.setId(itemId);
                item.getId(itemId);
            } catch (IllegalArgumentException e) {
                isTrue = true;
                System.out.println("Error: Inventory ID must be in the form ABC-1234");
                System.out.print("Enter Inventory Item ID: ");
	    }
		
        } while (isTrue);
        
        
        
        /**
         * Prompting the user to enter the name of the item
         */
        System.out.print("Enter Item Name: "); 
        String name = "";
        /**
         * for validating whether the user entered valid name and that it is not null
         * through do-while loop
         * we have to also use try-catch along with it to get this done
         * if the condition is not met we throw a illegal argument exception and 
         * prompt the user to enter again
         */
        do {
			
	    try { 
                name = sc.nextLine();
                item.setName(name);
                if(item.getName(name).isEmpty()){
                    throw new IllegalArgumentException();
                } else {
                    break;
                }
	    } catch (IllegalArgumentException e) {
                 System.out.println("Error: You have to enter a item name.");
                 System.out.print("Enter Item Name: ");
	    }
		
        } while (isTrue == false);
       
       
        int qoh = 0;
        /**
         * Prompting the user to enter the Quantity on hand.
         */
        System.out.print("Quantity On Hand: "); 
        /**
         * for validating whether the user entered valid quantity which should be 
         * 0 or more and we find it through do-while loop
         * we have to also use try-catch along with it to get this done
         * if the condition is not met we throw a illegal argument exception and 
         * prompt the user to enter again
         */
        do {
			
	    try {
                qoh = sc.nextInt();
                item.setQoh(qoh);

                if( item.getQoh(qoh) < 0){
                    throw new IllegalArgumentException();
                }else{
                    break;
                }
   
	    } catch (IllegalArgumentException e) {
                System.out.println("Error: QOH must be 0 or more.");
                System.out.print("Quantity on Hand: ");
	    }
		
        } while (isTrue == false);
        
        
        
        int rop = 0;
        /**
         * Prompting the user to enter the re-order point
         */
        System.out.print("Re-Order Point: "); 
        /**
         * for validating whether the user entered valid re-order point which should be 
         * 0 or more and we find it through do-while loop
         * we have to also use try-catch along with it to get this done
         * if the condition is not met we throw a illegal argument exception and 
         * prompt the user to enter again
         */
        do {
			
	    try {
                rop = sc.nextInt();
                item.setRop(rop);

                if( item.getRop(rop) <= 0){
                    throw new IllegalArgumentException();
                }else{
                    break;
                }
   
	    } catch (IllegalArgumentException e) {
                System.out.println("Error: ROP must be greater than 0.");
                System.out.print("Re-Order Point: ");
	    }
		
        } while (isTrue == false);
        
        
        double sellPrice = 0;
        /**
         * Prompting the user to enter the selling price
         */
        System.out.print("Selling Price: ");
        /**
         * for validating whether the user entered valid selling price which should be 
         * more than 0 and we find it through do-while loop
         * we have to also use try-catch along with it to get this done
         * if the condition is not met we throw a illegal argument exception and 
         * prompt the user to enter again
         */
        do {	
	    try {
                sellPrice = sc.nextDouble();
                item.setSellPrice(sellPrice);
                if( item.getSellPrice(sellPrice) <= 0){
                    throw new IllegalArgumentException();
                }else{
                    break;
                }
	    } catch (IllegalArgumentException e) {
                System.out.println("Error: Selling price must be greater than 0.");
                System.out.print("Selling Price: ");
	    }
		
        } while (isTrue == false);
        /**
         * A Printf statement to format the input given by user and present it at the end as output
         */
        
       System.out.println(item.toString());  
       /**
        * Prompting the user to enter number of units he wants to buy
        * it is stored in int numOfUnits
        */
       System.out.print("Enter # of units to buy: ");
       int numOfUnits;
       numOfUnits = sc.nextInt();
       /**
        * double variable total to calculate the total price and add 13% hst on it
        */
       double total;
       total = (sellPrice * numOfUnits) + ((sellPrice * numOfUnits) * 0.13);
       /**
        * If user enters 0 number of units to buy then total price to be 0
        */
       if(numOfUnits <= 0){
           total = 0;
       }
       /**
        * using printf statement to print the output as Total cost and round the
        * total to 2 decimal points
        */
       System.out.printf("%13s%.2f\n","Total Cost: $", total);
       
    }
}
