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
     * Test method for {@link Challenge#roll()}.
     * @throws Exception if the method fails
     */
    @Test
    public void testRoll() throws Exception {
        // Arrange
        Challenge challenge = new Challenge();
        
        // Act
        String actual = (String)challenge.roll();
        
        // Assert
        assertEquals("challenge.roll", challenge.toString(), actual);
    }
    
    /**
     * Test method for {@link Challenge#run()}.
     * @throws Exception if the method fails
     */
    @Test
    public void testRun() throws Exception {
        // Arrange
        Challenge challenge = new Challenge();
        
        // Act
        challenge.run();
        
        // Assert
        assertTrue(challenge.isDone());
    }

    /**
     * Test method for {@link Challenge#toString()}.
     * @throws Exception if the method fails
     */
    @Test
    public void testToString() throws Exception {
        // Arrange
        Challenge challenge = new Challenge();
        
        // Act
        String actual = (String)challenge.roll();
        
        // Assert
        assertNotNull("challenge.roll", actual);
        System.out.println(challenge);
    }

    /**
     * Test method for {@link Challenge#rollFight()}.
     * @throws Exception if the method fails
     */
    @Test
    public void testRollFight() throws Exception {
        // Arrange
        Challenge challenge = new Challenge();
        
        // Act
        String actual = (String)challenge.rollFight();
        
        // Assert
        assertEquals("challenge.rollFight", challenge.toString(), actual);
    }
    
    /**
     * Test method for {@link Challenge#rollTalent()}.
     * @throws Exception if the method fails
     */
    @Test
    public void testRollTalent() throws Exception {
        // Arrange
        Challenge challenge = new Challenge();
        
        // Action
        String actual = (String)challenge.rollTalent();
        
        // Assert
        assertEquals("challenge.rollTalent", challenge.toString(), actual);
    }
    
    /**
     * Test method for {@link Challenge#rollAttr()}.
     * @throws Exception if the method fails
     */
    @Test
    public void testRollAttr() throws Exception {
        // Arrange
        Challenge challenge = new Challenge();
        
        // Action
        int actual = (Integer)challenge.rollAttr();
        System.out.println(actual);
        assertTrue("Challenge.rollAttr == " + actual, actual > 0);
    }

    /**
     * test method for {@link Challenge#run()}.
     * @throws Exception if the method fails
     */
    @Test
    public void testRun() throws Exception {
        // Arrange
        Challenge challenge = new Challenge();
        
        // Act
        challenge.run();
        
        // Assert
        assertTrue(challenge.isDone());
    }

    /**
     * test method for {@link Challenge#toString()}.
     * @throws Exception if the method fails
     */
    @Test
    public void testToString() throws Exception {
        // Arrange
        Challenge challenge = new Challenge();
        
        // Act
        String actual = (String)challenge.roll();
        
        // Assert
        assertNotNull("challenge.roll", actual);
    }

}