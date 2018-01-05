/**
 * 
 */
package ca.bcit.comp1510.lab10;

/**
 * Item class.
 * 
 * @author Nirajan Manandhar
 * @version 1.0
 *
 */
public class Item {
    
    /**
     * Declares String item name.
     */
    private final String itemName;
    
    /**
     * Declares double item price.
     */
    private final double itemPrice;
    
    /**
     * Declares int item quantity.
     */
    private final int itemQuantity;
    
    /**
     * Constructs an Item object.
     * 
     * @param itemName an String
     * @param itemPrice a double
     * @param itemQuantity an int
     */
    public Item(String itemName, double itemPrice, int itemQuantity) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }
    
    /**
     * Constructs an Item object.
     * 
     * @param itemName a String
     * @param itemPrice a double
     */
    public Item(String itemName, double itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        itemQuantity = 0;
    }

    /**
     * Returns the item's name.
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Returns the item's price.
     * @return the itemPrice
     */
    public double getItemPrice() {
        return itemPrice;
    }

    /**
     * Returns the item's quantity.
     * @return the itemQuantity
     */
    public int getItemQuantity() {
        return itemQuantity;
    }

    @Override
    public String toString() {
        return "\nItem [itemName=" + itemName + ", itemPrice=" 
                + itemPrice + ", itemQuantity=" + itemQuantity + "]";
    }

}
