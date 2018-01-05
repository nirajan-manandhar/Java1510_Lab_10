/**
 * 
 */
package ca.bcit.comp1510.lab10;

/**
 * The Lockable interface.
 * 
 * @author Nirajan Manandhar
 * @version 1.0
 *
 */
public interface Lockable {
    
    
    /**
     * Establishes the key used to unlock.
     * @param key an int
     */
    void setKey(int key);
    
    /**
     * Locks the implementing object if the correct key is 
     * provided and returns true if the object was locked.
     * 
     * @param key an int
     * @return a boolean
     */
    boolean lock(int key);
    
    /**
     * Unlocks the implementing object if the correct key is
     * provided and returns true if the object was unlocked.
     * @param key an int
     * @return a boolean
     */
    boolean unlock(int key);
    
    /**
     * Returns true if the implementing object is locked.
     * @return a boolean
     */
    boolean locked();
            
}
