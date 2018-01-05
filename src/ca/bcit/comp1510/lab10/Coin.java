package ca.bcit.comp1510.lab10;

/**
 * Represents a two-sided coin that can be flipped.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class Coin implements Lockable {
    /** Internal representation of coin showing heads. */
    public static final int HEADS = 0;

    /** Internal representation of coin showing tails. */
    public static final int TAILS = 1;

    /** Coin's current face showing. */
    private int face;
    
    /**
     * Declares a password.
     */
    private int masterKey;
    
    /**
     * Declares the status of the object.
     */
    private boolean statusIsLocked;

    /**
     * Constructs a Coin object and flips it to give it a starting value.
     */
    public Coin() {
        flip();
    }

    /**
     * Flips this Coin by randomly choosing a face value.
     */
    public void flip() {
       
        face = (int) (Math.random() * 2);
    }

    /**
     * Returns true if the current face of the Coin is heads.
     * @return true if current face is heads, else false.
     */
    public boolean isHeads() {
        return (face == HEADS);
    }

    /**
     * Returns the current face value of this Coin as a String.
     * @return toString description
     */
    public String toString() {
        String faceName;

        if (face == HEADS) {
            faceName = "Heads";
        } else {
            faceName = "Tails";
        }
        //You can not declare a local variable, and make two return statements
        //but that is up to preference for bruce.
        /* if (face == HEADS) {
            return Heads;*/
        
        return faceName;
    }

    @Override
    public void setKey(int key) {
        this.masterKey = key;
    }

    @Override
    public boolean lock(int key) {
        if (this.masterKey == key) {
            statusIsLocked = true;
            return true;
        } else {
            statusIsLocked = false;
            return false;
        }
    }

    @Override
    public boolean unlock(int key) {
        if (this.masterKey == key) {
            statusIsLocked = false;
            return true;
        } else {
            statusIsLocked = true;
            return false;
        }
    }

    @Override
    public boolean locked() {
        return statusIsLocked;
    }

   
}

