// PlayerConfiguration_0Test.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlayerConfiguration}.
* It contains one unit test case for the {@link PlayerConfiguration#copy()} method.
*/
class PlayerConfiguration_0Test {

    // This variable will be used for unlocking the player's locks
    private PlayerConfiguration configuration;
		
    // This variable will be used for locking the player's locks
    private Player player;
		
    // This variable will be used for unlocking the player's locks
    private Lock lock = new ReentrantLock();
    
    // This variable will be used to track when the player has no more locks
            
    /**
     * Use the constructor.
     * It can be used by several different test cases for the same case.
     *
     * @param configuration that has to be used by the test
    */
    public PlayerConfiguration_0Test(PlayerConfiguration configuration) {
        this.configuration = configuration;
    }

    
    /**
     *
     * Sets up the test. 
     * This will first lock the player's locks.
     */
    @Test
	public void testPlayerConfig() {
        assertNotNull("The test object cannot be null", configuration);
        System.out.println("The test has been run");
        
        lock.lock();
        try {
            player = configuration.getPlayer();
            player.getPlayerConfiguration().getScoreboardConfiguration().setWorldScore(1);
        } catch (Exception e) {
            fail("An exception occurred", e);
        }
        lock.unlock();
        
        assertNotNull("There can't be an exception thrown", player);
	}
    
    /**
     *
     * @throws CloneNotSupportedException
     */
    @Test
    public void testsCloneObject() throws CloneNotSupportedException {

    	Lock lock = new ReentrantLock();
    	// This variable will be used for unlocking the player's locks
        player = (Player) player.clone();
        lock.lock();
        try {
            assertNotNull("The player cannot be null", player);
        } finally {
            lock.unlock();
        }    
    }
    
	/** {@inheritDoc} */
	@Override
	public PlayerConfiguration clone() throws CloneNotSupportedException {
		return ((PlayerConfiguration) super.clone());
	}

}