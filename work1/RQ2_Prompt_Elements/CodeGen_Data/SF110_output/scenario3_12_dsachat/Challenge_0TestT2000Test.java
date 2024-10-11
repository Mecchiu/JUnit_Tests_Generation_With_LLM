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
     * test first unit
     */
    @Test
    public void testFirstUnit() {
        assertEquals(Challenge.challenge, Challenge.roll());
    }
	
    /**
     * Unit test for the {@link Challenge#roll()} method.
     *
     * @param args test case parameters
     */
    @Test
    public void testRollClass(Object[] args) {
        System.out.println("challenge.roll()");

        Challenge challenge=new Challenge(new Hero("Test", new Weapon(false), "Talent"), new Hero("Test"), new Talent("Talent"));

        int result=challenge.roll();

        assertEquals(Challenge.results[0], result);
    }

        /*  Test for the roll() method of the {@link Challenge} class.
         *  This method should check a test object of Challenge for correctness.
         *  It should return the final value of the roll().
         *  There must be at least ONE {@link Hero} to execute this test.
         *
         *  @author bernshausen
         */
    @Test

    public void testRoll() {

        System.out.println("test for roll()");

        Challenge challenge=new Challenge(new Hero("Test", new Weapon(false), "Talent"), new Hero("Test"), new Talent("Talent"));

        Challenge result=challenge.getResult();

        System.out.println("test for getResult()");

        assertEquals(challenge.getResult(), result);

        System.out.println("test for roll()");
    }

        /*  Test for the roll() method of the {@link Challenge} class.
         *  This method should check a test object of Challenge for correctness.
         *  It should return the final value of the roll().
         *  There must be at least ONE {@link Hero} to execute this test.
         *
         *  @author bernshausen
         */

    @Test

    public void testRolleiStadt() {
        System.out.println("test for roll()");

        Challenge challenge=new Challenge(new Hero("Test", new Weapon(false), "Talent"), new Hero("Test"), new Talent("Talent"));

        int result=challenge.roll();

        System.out.println("test for getResult()");

        assertEquals(Challenge.results[0], result);

        System.out.println("test for roll()");
    }

        /*  Test for the roll() method of the {@link Challenge} class.
         *  This method is supposed to get the final result. For it to
         *  get the final result, the final result should be the result of the roll().
         *  It should return the result of the roll().
         *  There must be at least ONE {@link Hero} to execute this test.
         *
         *  @author bernshausen
         */
    @Test

    public void testRollIntoResult() {
        System.out.println("test for roll()");

        Challenge challenge=new Challenge(new Hero("Test", new Weapon(false), "Talent"), new Hero("Test"), new Talent("Talent"));

        int result=challenge.roldef();

        System.out.println("test for getResult()");

        assertEquals(result, challenge.getResult());

        System.out.println("test for roll()");
    }

    /**
     * Unit test for the {@link Player} class and its get/set methods.
     */
    @Test
    public void testGetSetPlayer() throws ClassNotFoundException {
        Challenge challenge=new Challenge(null, null, null);
        challenge.setPlayer("Player");

        assertEquals("Player", challenge.getPlayer());
        challenge.setPlayer("Player2");
        assertEquals("Player2", challenge.getPlayer());
    }

    /**
     * Unit test for the {@link Hero} class and its get/set methods.
     */
    @Test
    public void testGetSetHero() throws ClassNotFoundException {
        Challenge challenge=new Challenge(new Hero("Test", new Weapon(false), "Talent"), null, null);
        challenge.setHero("hero");

        assertEquals("hero", challenge.getHero());
        challenge.setHero("hero2");
        assertEquals("hero2", challenge.getHero());
    }

    /**
     * Unit test for the {@link Hero} class and its get/set methods.
     */
    @Test
    public void testGetSetTalent() throws ClassNotFoundException {
        Challenge challenge=new Challenge(new Hero("Test", new Weapon(false), "Talent"), null, new Hero("Test2", new Weapon(false), "Talent2"));
        challenge.setTalent("talent");

        assertEquals("talent", challenge.getTalent());
        challenge.setTalent("talent2");
        assertEquals("talent2", challenge.getTalent());
    }

    /**
     * Unit test for the {@link Hero} class and its get/set methods.
     */
    @Test
    public void testGetSetWeapon() throws ClassNotFoundException {
        Challenge challenge=new Challenge(new Hero("Test", new Weapon(false), "Talent"), null, new Hero("Test2", new Weapon(false), "Talent2"));
        challenge.setWeapon("weapon");

        assertEquals("weapon", challenge.getWeapon());
        challenge.setWeapon("weapon2");
        assertEquals("weapon2", challenge.getWeapon());
    }

    /**
     * Unit test for the {@link Hero} class and its get/set methods.
     */
    @Test
    public void testGetSetTalent2() throws ClassNotFoundException {
        Challenge challenge=new Challenge(new Hero("Test", new Weapon(false), "Talent"), null, null);
        challenge.setTalent2("talent2");

        assertEquals("talent2", challenge.getTalent2());
        challenge.setTalent2("talent2r");
        assertEquals("talent2r", challenge.getTalent2());
    }

    /**
     * Test the {@link Hero} class's get/set methods.
     */
    @Test
    public void testGetSetWeapon2() throws ClassNotFoundException {
        Challenge challenge=new Challenge(new Hero("Test", new Weapon(false), "Talent"), null, null);
        challenge.setWeapon2("weapon2");

        assertEquals("weapon2", challenge.getWeapon2());
        challenge.setWeapon2("weapon2r0");
        assertEquals("weapon2r0", challenge.getWeapon2());
    }

    /**
     * Unit test for an empty {@link Hero} class, which is used for its unit tests.
     */
    @Test
    public void testEmptyHero() {
        Hero hero = new Hero("", null);
        assertFalse(hero.hasWeapon());
        assertEquals(0, hero.getAttributesSet().size());
    }
	
    /**
     * Unit test for an empty class, which is used for its unit tests.
     */
    @