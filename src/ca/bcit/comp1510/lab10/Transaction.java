/**
 * 
 */
package ca.bcit.comp1510.lab10;

import java.util.Arrays;

/**
 * Transaction class.
 * 
 * @author Nirajan Manandhar
 * @version 1.0
 *
 */
public class Transaction {
    
    /**
     * Declares an ArrayList of type item.
     */
    private Item[] cart;
    
    /**
     * Declares a double of Price.
     */
    private double totalPrice;
    
    /**
     * Declares an int of item count.
     */
    private int itemCount;
    
    /**
     * Constructs a Transaction object.
     * @param arraySize an int
     */
    public Transaction(int arraySize) {
        cart = new Item[arraySize];
        totalPrice = 0.0;
        itemCount = 0;
    }
    
    /**
     * Creates an item, and adds it to the cart.
     * @param itemName a String
     * @param itemPrice a double
     * @param itemQuantity an int
     */
    public void addToCart(String itemName, double itemPrice, int itemQuantity) {
        if (itemCount >= cart.length) {
            increaseSize();
        } else {
            Item item = new Item(itemName, itemPrice, itemQuantity);
            cart[itemCount] = item;
            itemCount++;
            totalPrice += (item.getItemQuantity() * item.getItemPrice());
        }
    }
    
    /**
     * Adds an Item object to the cart.
     * @param item an Item object
     */
    public void addToCart(Item item) {
        if (itemCount >= cart.length) {
            increaseSize();
        } else {
            cart[itemCount] = item;
            itemCount++;
            totalPrice += (item.getItemQuantity() * item.getItemPrice());
        }
    }
    
    /**
     * Increases the size of the array.
     */
    public void increaseSize() {
        final int increaseAmount = 3;
        int newSize = itemCount + increaseAmount;
   
        Item[] newCart = new Item[newSize];
        
        for (int item = 0; item < cart.length; item++) {
            newCart[item] = cart[item];
        }
        
        cart = newCart;
        
    }
    
    /**
     * Returns the total price.
     * @return a double
     */
    public double getTotalPrice() {
        return totalPrice;
    }
    
    /**
     * Returns the number of total items.
     * @return an int.
     */
    public int getCount() {
        int totalCount = 0;
        for (int i = 0; i <= itemCount; i++) {
            int currentCount = cart[i].getItemQuantity();
            totalCount += currentCount;
        }
        return totalCount;
    }

    @Override
    public String toString() {
        return "Transaction \n[cart=" + Arrays.toString(cart) 
        + ", \ntotalPrice=" + totalPrice + ", \nitemCount=" 
                + itemCount
                + "]";
    }
    
    
}
