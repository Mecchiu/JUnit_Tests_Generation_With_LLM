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
		private final static int numCases =10;
    private final static int minHp = 100;
    private Hero H;
    private Hero W;
    private String to;
    private String toHp;
    private String msg;
    private Vector<String> results;
    private int hits = 0;

    /**
     * Constructor of the {@link Challenge_1Test} class
     */
    public Challenge_1Test(){
        this.H = new Hero("H","H1", 2);
		this.W = new Hero("W","W1", 2);
	}

    /**
     * {@link Challenge#rollExperience(int)}
     * return a random number greater than minHp
     * @return the random number
     */
    public int rollExperience()
    {
        double d;
        Vector<Double> v;
        int result = 0;
        d = 0.02;
        v = new Vector<Double>(numCases);
        for(int i=0;i<numCases;i++)
        {
            v.addElement(d);
            d = randDouble(d);
        }
}
}