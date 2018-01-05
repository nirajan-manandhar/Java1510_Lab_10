package ca.bcit.comp1510.lab10;

/**
 * Tests the coin class.
 * @author Nirajan Manandhar
 * @version 1.0
 *
 */
public class CoinDriver {
    
    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        Coin coin = new Coin();
        
        final int pass = 1234;
        
        coin.setKey(pass);
        
        coin.lock(pass);
        
        boolean hasKey = !coin.locked();
        
        coin.flip();

        if (hasKey) {
            System.out.println(coin);
        } else {
            System.out.println("That's the wrong key.");
        }
    }

}
