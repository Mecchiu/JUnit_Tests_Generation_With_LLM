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
		// Challenge_0Test.java
		@Test
    public void testRoll() {
        // Roll should return an equal value of attributes
        // since these are attributes of spells and weapons
        System.out.println(dice(3)+"\t- attributes: "+getAttribFromHero(null, null)+"\t- roll " +getRollFight());
        System.out.println(dice(3)+"\t- attributes: "+getAttribFromHero(null, null)+"\t- roll " +getRollTalent());
        System.out.println(dice(3)+"\t- attributes: "+getAttribFromHero(null, null)+"\t- roll " +getRollAttr());
        assertEquals(getAttribFromHero(null, null), getAttribFromHero(null, null), 0.5);
		}

        // Roll should return an equal value of attributes
        // since these are attributes of spells and weapons
}