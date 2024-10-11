// Challenge_0Test.java
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
* It contains one unit test case for the {@link Challenge#roll()} method.
*/
class Challenge_0Test {
private Challenge challenge;
		
        /**
         * This method create a new instance of Challenge object.
         * @param hthe test hero's entity
         * @param mod the difficulty modifier of the challenge
         * @param t the talent
         * @param w the weapon it is using
         * @param silent is silent the challenge
         * @param str the results string to send to the sender (for spell attacks)
         * @return the instance of Challenge
         */
    public static Challenge_0Test createTestCase(Hero h, int mod, Talent t, Weapon w, boolean silent, String str) { 
        challenge = new Challenge(w, t.isSpell(), h, mod, silent, str); 

        return new Challenge_0Test (h, mod, t, w, silent, str);
    }
    

    public Challenge_0Test(Hero h, int mod, Talent t, Weapon w, boolean silent, String str) {
		this.challenge = new Challenge(w, t.isSpell(), h, mod, silent, str);
	}
    
    /** Add a specific test to the class. */
    @Test
    public void test(){
	if (Challenge_0Test.challenge == null){ //only new test cases possible
        System.out.println("test for testcase "+challenge.toString()+"");
        return;
	}

        System.out.println("testing for "+Challenge_0Test.challenge.toString());
        
	assertTrue(Challenge_0Test.challenge.compareTo(Challenge_0Test.createTestCase(h, mod, t)) >= 0);
    }

}
