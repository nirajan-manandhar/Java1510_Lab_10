/**
 * 
 */
package ca.bcit.comp1510.lab10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Reverse Array Class.
 * @author Nirajan Manandhar.
 * @version 1.0
 *
 */
public class ReverseArray {
    
    /**
     * Declares an ArrayList of type integer.
     */
    private static ArrayList<Integer> numberList;
    
    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        ReverseArray reverse = new ReverseArray();
        
        numberList = new ArrayList<Integer>();
        
        System.out.println("Please enter an integer:");
        int numOfInts = scan.nextInt();
        System.out.println("Please enter " + numOfInts + " Integers.");
        
        for (int i = 1; i <= numOfInts; i++) {
            numberList.add(scan.nextInt());
        }
        
        System.out.println(numberList);
        
        reverse.swap();
        
        System.out.println(numberList);
        
        //I found this way of reversing an ArrayList,
        //but I did make a helper method as well.
        Collections.reverse(numberList); 
                                            
        
        System.out.println(numberList);


        scan.close();
    }
    
    /**
     * Reverses the order of an ArrayList.
     */
    private void swap() {
        int times = numberList.size() / 2;
        for (int i = 0; i < times; i++) {
            
            int oppositeIndex = numberList.size() - 1 - i;
            int first = numberList.get(i);
            int second = numberList.get(oppositeIndex);
            
            numberList.set(oppositeIndex, first);
            numberList.set(i, second);
        }
    }

}
