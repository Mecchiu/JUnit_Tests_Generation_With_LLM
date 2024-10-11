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
		/**
		 * It is impossible to modify Object.clone() while executing one
		 * class method, so we replace this class, which is only supposed
		 * to be safe.
		 *
		 * @throws CloneNotSupportedException
		 */
		@Test
		public void copy() throws CloneNotSupportException {
			PlayerConfiguration_a = new PlayerConfiguration();
			PlayerConfiguration_a.setTune1(1);
			PlayerConfiguration_a.setTune2(2);
			PlayerConfiguration_a.setTune3(3);
			PlayerConfiguration_a.clone().setTune1(5.0); // change value by 0, because the method is run before another method has a chance to get executed
			boolean exceptionThrown = false;
			try {
				PlayerConfiguration_a.setTune2(2);
			} catch (DuplicateKeyException ignored) {
				exceptionThrown = true;
			}
			assertEquals(exceptionThrown, true, "The parameter was not copied.");
		}
        /*
         * test for method {@link PlayerConfiguration#equals(Object)}
         * Test that we do not get duplicated keys on the original object.
         */
        @Test
        public void equals() {
            ConfigurablePlayerConfiguration a = new ConfigurablePlayerConfiguration("tune1", 1);
            ConfigurablePlayerConfiguration b = new ConfigurablePlayerConfiguration("tune1", 1);
            PlayerConfiguration_a.equals(b);
            assertTrue(a.equals(b));
            PlayerConfiguration_a.equals(PlayerConfiguration_a);
            assertTrue(PlayerConfiguration_a.equals(b));
            assertFalse(a.equals(new PlayerConfiguration_a()));
            assertFalse(b.equals(new PlayerConfiguration_a()));
        }
	
        /**
         * Test the toString() method
         */
        @Test
        public void toString() {
            PlayerConfiguration_a = new PlayerConfiguration();
            PlayerConfiguration_a.tune1 = 1;
            PlayerConfiguration_a.tune2 = 2;
            PlayerConfiguration_a.tune3 = 3;
            PlayerConfiguration_a.clone().tune1 = 5.0; // Change value for toString()
            String s = PlayerConfiguration_a.toString();
            // print the parameter
            String newLine = System.getProperty("line.separator");
            System.out.println(newLine + s);
            assertTrue(newLine + s.equals(PlayerConfiguration_a.toString()));
        }
	
        /**
		 * Create a set of all parameters.
		 *
         * @return All set of values.
		 */
        @Test
        public void createAll_Parameter() {
            Set<Integer> set = new HashSet<Integer>();
            set.add(5);
            set.add(3);
            ConfigurablePlayerConfiguration_a.createAll();
            int parameters[] = PlayerConfiguration_a.getAllParameters();
            for (int a = 0; a < parameters.length; a++) {
                assertTrue(set.contains(parameters[a]));
            }
        }

        /**
         * Test the getAllParameters() method
         */
        @Test
        public void getAllParameters() {
            PlayerConfiguration_a = new PlayerConfiguration();
            PlayerConfiguration_a.setTune1(1);
            PlayerConfiguration_a.setTune2(2);
            PlayerConfiguration_a.setTune3(3);
            //System.out.println(PlayerConfiguration_a.getAllParameters());
            // add some additional methods
            PlayerConfiguration_a.getAllParameters();
        }
        
}

/**
 * @author daniel
 */

/**
 * Class to hold the test-configuration
 *
 * @version $id$
 * @since Feb  8  2011
 */
class ConfigurablePlayerConfiguration {
	
    /**
	 * The player key.
	 */
	private String key = Configuration.DEFAULT_PLAYER;
	public int tuning1 = -1;
	public int tune2 = -1;
	public int tune3 = -1;
	
    /**
	 * Constructor of this object.
	 *
	 * @param tuning1 The player's current tuning.
	 * @param tune2 The player's current tuning.
	 * @param tune3 The player's current tuning.
	 */
	public ConfigurablePlayerConfiguration(String tuning1, int tune2, int tune3) {
		this.key = tuning1.intern();
		this.tune1 = tune1;
		this.tune2 = tune2;
		this.tune3 = tune3;
		Tuneable t = Configuration.getTuneable(tuning1);
		if (t!= null) {
			tuning1 = t.getID();
		}
	}
	
	/**
	 * Return the player key.
	 *
	 * @return return the player key.
	 */
	public String getPlayerKey() {
		return key;
	}

    /**
     * Set the player key of this object.
     *
     * @param key
     */
    public void setPlayerKey(String key) {
        this.key = key;
    }

    /**
     * @return true if the get key is set.
     */
    public boolean isKeySet() {
        return key!= null;
    }
	
    /**
    * The getTune3 method.
    *
    * @return True if tune3 is changed, false otherwise.
    */
	public boolean getTune3Changed() {
        return tune3!= -1;
    }
	
    /**
    * The setTune3 method.
    *
    * @param tune3
    */
        public void setTune3Changed(boolean tune3) {
            this.tune3 = tune3? 1 : -1;
    }
	
    /**
    * The getTune1 method.
    *
    * @return The player's current tune 1.
    */
    public int getTune1() {
        return this.tune1;
    }
        public int getTune2() {
        return this.tune2;
    }
    
    /**
    * The setTune2 method.
    *
    * @param tune2
    */
    public void setTune2(int tune2) {
        this.tune2 = tune2;
    }
	
}