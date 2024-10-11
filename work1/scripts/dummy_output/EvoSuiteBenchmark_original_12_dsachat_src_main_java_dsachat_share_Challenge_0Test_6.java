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
		  
    /**
     * Roll the attack or defense with the given weapon.
     * @throws java.lang.Exception
     */
    @Test
	void roll() throws Exception {
	Challenge.roll(1,true, 1, 1, false);
    }

    /**
     * Roll the attack or defense with each weapon (including the current one).
     * @throws java.lang.Exception
     */
    @Test
    void roll2() throws Exception {
	Challenge.roll(1,true, 1, 1,true);
    }

    /**
     * Roll the attack or defense with the given weapon (excluding the current one).
     * @throws java.lang.Exception
     */
    @Test
    void roll3() throws Exception {
	Challenge.roll(1,true, 1, 1,true, false);
    }

    /**
     * Roll the attack or defense with the given weapon and each weapon (excluding the current one) with a bonus.
     * @throws java.lang.Exception
     */
    @Test
    public void roll4() throws Exception {
	Challenge.roll(1,true, 1, 1,true, false, 1);
    }

    /**
     * Roll the attack or defense with each weapon and each weapon plus the current one (excluding the current one).
     * @throws java.lang.Exception
     */
    @Test
    public void roll5() throws Exception {
	Challenge.roll(1,true, 1, 1,true, false,1, true);
    }

}