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
		 * Test of roll
		 */
		@Test
    	public void testRoll() {
            System.out.println("roll");
            Challenge challenge = new Challenge();
            assertTrue(challenge.roll()!=null);
            assertEquals(challenge.roll(), challenge.toString());
    	}
	
    	/**
     	 * Test of roll
     	 */
    	@Test
    	public void testRollFight() {
            System.out.println("rollFight");
            Challenge challenge = new Challenge();
            assertTrue(challenge.rollFight()!=null);
            assertEquals(challenge.rollFight(), challenge.toString());
    	}
    	
    	/**
     * Test of rollFight
     */
    	@Test
    	public void testRollTalent() {
            System.out.println("rollTalent");
            Challenge challenge = new Challenge();
            assertTrue(challenge.rollFight().equals(challenge.toString()));
    	}
    	
    	/**
     * Test of rollFight
     */
    	@Test
    	public void testRollAttr() {
    		System.out.println("test rollAttr");
    		Challenge challenge = new Challenge();
    		Vector<String> responses = new Vector<String>();
    		responses.add("This is a test.");
    		Vector<String> abilities = new Vector<String>();
    		abilities.add("attack");
    		abilities.add("silent");
    		abilities.add("attackWithWeapon");
    		String[] abilitiesResp = {"attack", "silent", "attackWithWeapon"};
    		String[] abilitiesVal = {"attack", "attrib"};
    		challenge.attrib = abilitiesResp;
    		challenge.attrValue = abilitiesVal;
    		String attr = challenge.rollAttr();
    		String resp = challenge.roll();
    		System.out.println("resp = "+resp);
    		System.out.println("resp = "+(resp));
    		response(challenge, responses);
    		response(challenge, abilities);
    		truth(challenge, attr, responses, abilities);
    		truth(challenge, resp, abilities);
    	}
    	
    	/**
     * Test of getTo
     */
    	@Test
    	public void testGetTo() {
            System.out.println("getTo");
            Challenge challenge = new Challenge();
            assertEquals(challenge.getTo(), challenge.toString());
    	}
    	
    	/**
     * Test of getAttrib
     */
    	@Test
    	public void testGetAttrib() {
            System.out.println("getAttrib");
            Challenge challenge = new Challenge();
            assertEquals(challenge.getAttrib(), challenge.toString());
    	}
    }