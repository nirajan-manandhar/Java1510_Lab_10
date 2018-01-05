package ca.bcit.comp1510.lab10;

/**
 * Test command line arguments.
 * @author Nirajan Manandhar;
 * @version 1.0;
 *
 */
public class Average {
    
    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        double total = 0;
        int counter = 0;
        
        if (args.length == 0) {
            System.out.println("No arguments.");
        } else {
            for (int i = 0; i < args.length; i++) {
                
                try {
                System.out.println(args[i]);
                int number = Integer.parseInt(args[i]);
                total += number;
                counter++;
                } catch (NumberFormatException n) {
                    System.out.println("Error. All values must be integers.");
                    System.out.println("The value above will be skipped.");
                    counter--;
                }
            }
            double average = total / counter;
            System.out.println("The average is: " + average);
        }
        
    }
}
