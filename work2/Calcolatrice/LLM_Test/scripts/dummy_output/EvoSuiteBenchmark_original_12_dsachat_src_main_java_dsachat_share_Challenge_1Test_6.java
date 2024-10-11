// Challenge_1Test.java
package dsachat.share;

import java.io.Serializable;
import java.util.Vector;
import dsachat.share.hero.Hero;
import dsachat.share.hero.Talent;
import dsachat.share.hero.Weapon;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Challenge}.
* It contains one unit test case for the {@link Challenge#dice(int)} method.
*/
class Challenge_1Test {
		
    class Test {

        /**
         * create a new challenge
         */
        Test() {
            /*
             * Set the maximum dice value
             * to 1, so all tests need to be checked.
             */
            if (dice(2) > 1) {
                fail("Set max dice value to 1!");
            } 

            if (dice(4) > 1) {
                fail("Set max dice value to 4");
            } 
        }

        /**
         * return the dice values (no need to use method, the method is already tested!)
         * @return the dice values
         */
        int dice() {
            return dice(2);
        }
    }

    /**
     * for a given test set of challenges, execute these challenges with the given weapon.
     */
    public static void dice(Test test) {
        Challenge.execute(test, true);
    }

	/**
	 * run a test
	 * @param test test to be executed
	 * @param silent silent mode
	 */
	public static void execute(Test test, boolean silent) {
        Challenge_1Test.test(test.dice(), silent);
	}

	/**
	 * test set of challenges
	 * @param diceArray a vector with all the dice values (one for each unit test case) 
	 * @param silent ignore silent mode
	 */
	public static void test(Vector<Integer> diceArray, boolean silent) {
       Player player;
	try {
	    // create a test object
	    // get the player, so we can compare values:
	    // (player, diceArray.size()),
	    /*
	     * now get the dice and test with the given player and diceArray
	     * (which is the same as test.dice()),
	     */
	    player = new Player(); // create a new player
	    Vector<Integer> diceArrayTest = new Vector<>();
	    
	    // use the player's dice
	    int maxDice = player.maxDice();
	    
	    // determine the amount of dice
	    int diceAmount = player.dice();
	    
	    // calculate for the given number of dice
	    int dice = dice(diceAmount);
        
        // define test values 
        int diceValue = diceArray.elementAt(diceArray.size()-1);

	    // test die, calculate test value and compare
	    if (!test.dice().equals(diceValue)) {
        	fail("Dice number for the test of this test case is the wrong!");
        }
	
	    player.attrib = test.dice();
    
	    // test for same attribute for the same dice
	    if (!test.attrib.equals(player.attrib)) {
        	fail("Dice attributes are the same!");
        } 
        
	    // test for different attributes
	    if (test.attrib1()!= player.attrib1()) {
        	fail("Dice attributes are the same!");
        }
	}
		catch(Exception e) {
            if (!SilentMode.silent_mode) {
                e.printStackTrace();
            } else {
                System.out.println(e);
            }
		}
		
		// test for bad number of dice
	    if (diceArray.size()!= diceArrayTest.size()) {
    		fail("Did not get the same number of dice for the test of this test case! The test value : "+(player.attrib)+" - "+(diceArray.size()));
    	}
	}
}