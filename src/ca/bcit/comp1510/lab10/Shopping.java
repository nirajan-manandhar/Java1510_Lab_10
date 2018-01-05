/**
 * 
 */
package ca.bcit.comp1510.lab10;

import java.util.Scanner;

/**
 * Tests the Item and Transaction classes.
 * @author Nirajan Manandhar
 * @version 1.0
 *
 */
public class Shopping {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
      
        
        Scanner scan = new Scanner(System.in);
        
        int items = 0;
        int counter = 0;
        
        System.out.println("How many items");
        int number = scan.nextInt();
        items = number;
        Transaction trans = new Transaction(items);
        
        while (counter < items) {

            System.out.println("What do you want to buy");
            String name = scan.next();
            
            System.out.println("Price?");
            double price = scan.nextDouble();
            System.out.println("Quantity?");
            int quan = scan.nextInt();
            System.out.println("\nNext item:");
            
            trans.addToCart(name, price, quan);
            counter++;
            
            if (counter == items) {
                System.out.println(trans.toString());
                scan.close();
            }
        }
        
    }

}
