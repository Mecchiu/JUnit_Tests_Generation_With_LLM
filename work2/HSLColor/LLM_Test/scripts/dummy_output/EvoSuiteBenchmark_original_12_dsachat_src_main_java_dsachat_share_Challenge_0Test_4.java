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
		 * Test for a simple challenge - attack
		 */
    @Test
    public void test00() {
        Challenge.roll("ATT", new Hero("ATT"), "BRI", false);
        assertEquals(4, t.getValue());
        assertTrue(t.isAttack());
    }

    /**
     * Test of {@link Challenge#roll(string)} method.
     */
    @Test
    public void test01() {
        Challenge.roll("ATT", new Hero("ATT"), "BRI", false);
        String expResult = "{\"attrib\" : 13,  \"attrib1\" : 7,\"attrib2\" : 0,\"attrib3\" : 0, \"mod\" : 1, \"to\" : \"ATT\", \"silent\" : true,\"dmgkk\" : 45}";
        assertEquals(expResult,t.getTo());
        assertFalse(t.isSilent());
    }

}
// Challenge_0Test.class