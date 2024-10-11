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
		 * Get the test case for {@link PlayerConfiguration#copy()}.
		 * @return the test case for {@link PlayerConfiguration#copy()}
		 */
        @Test
        void test_copy(){
                final Set<String> tunableParameterKeys = new HashSet<String>();
                final PlayerConfiguration player1;
                final PlayerConfiguration player2;
        	final String key1;
        	final String key2;
        	final String key3;
        	final String key4;
        	player1 = new PlayerConfiguration(
    		        Configuration.getInstance().getString(Configuration.KEY_FIELD_NAME_PLAYER_1),
    	                Configuration.getInstance().getString(Configuration.KEY_FIELD_NAME_PLAYER_2));

 	        player2 = new PlayerConfiguration(
    		        Configuration.getInstance().getString(Configuration.KEY_FIELD_NAME_PLAYER_2),
    	                Configuration.getInstance().getString(Configuration.KEY_FIELD_NAME_PLAYER_3));

            key1 = Configuration.getInstance().getString(Configuration.KEY_FIELD_NAME_KEY_1);
            key2 = Configuration.getInstance().getString(Configuration.KEY_FIELD_NAME_KEY_2);
            key3 = Configuration.getInstance().getString(Configuration.KEY_FIELD_NAME_KEY_3);
            key4 = Configuration.getInstance().getString(Configuration.KEY_FIELD_NAME_KEY_4);
        	
        	final Lock lock = new ReentrantLock();
        	// Get keys of tunable keys
        	final Set<String> keyKeys = Configuration.getInstance().getStringSet(Configuration.KEY_FIELD_NAME_TUNABLE_KEYS);
                
          	assertTrue(Configuration.getInstance().isConfigurable(Configuration.KEY_FIELD_NAME_TUNABLE_KEYS, tunableParameterKeys));
                
        	// Add tunable parameter to tunable key
 			tunableParameterKeys.add(key1);
 			assertFalse(Configuration.getInstance().isConfigurable(Configuration.KEY_FIELD_NAME_TUNABLE_KEYS, tunableParameterKeys));
        	// Add tunable parameter to tunable key
 			tunableParameterKeys.add(key2);
 			assertFalse(Configuration.getInstance().isConfigurable(Configuration.KEY_FIELD_NAME_TUNABLE_KEYS, tunableParameterKeys));
        	// Add tunable parameter to tunable key
 			tunableParameterKeys.add(key3);
 			assertFalse(Configuration.getInstance().isConfigurable(Configuration.KEY_FIELD_NAME_TUNABLE_KEYS, tunableParameterKeys));
        	// Add tunable parameter to tunable key
 			tunableParameterKeys.add(key4);
 			assertTrue(Configuration.getInstance().isConfigurable(Configuration.KEY_FIELD_NAME_TUNABLE_KEYS, tunableParameterKeys));
        	// Remove tunable key
        	tunableParameterKeys.remove(key2);
        	assertTrue(Configuration.getInstance().isConfigurable(Configuration.KEY_FIELD_NAME_TUNABLE_KEYS, tunableParameterKeys));
        	// Remove tunable key
        	tunableParameterKeys.remove(key3);
        	assertFalse(Configuration.getInstance().isConfigurable(Configuration.KEY_FIELD_NAME_TUNABLE_KEYS, tunableParameterKeys));
        	// Remove tunable key
        	tunableParameterKeys.remove(key4);
        	assertTrue(Configuration.getInstance().isConfigurable(Configuration.KEY_FIELD_NAME_TUNABLE_KEYS, tunableParameterKeys));

        	// Add tunable parameter to tunable key
        	final Set<String> tunableKeyList = Configuration.getInstance().getStringSet(Configuration.KEY_FIELD_NAME_TUNABLE_KEYS);
        	final Lock lock1;
        	lock = new ReentrantLock();
        	// Get keys of tunable key
         lock1 = new Lock();

           assertFalse(Configuration.getInstance().isConfigurable(Configuration.KEY_FIELD_NAME_TUNABLE_KEYS, tunableKeyList));
           lock1.lock();
              // Add tunable parameter to tunable key
          tunableParameterKeys.add(key1);
           lock1.unlock();
              // Verify tunable key
        	assertFalse(Configuration.getInstance().isConfigurable(Configuration.KEY_FIELD_NAME_TUNABLE_KEYS, tunableKeyList));
        	// Verify tunable key
        	assertTrue(Configuration.getInstance().isConfigurable(Configuration.KEY_FIELD_NAME_TUNABLE_KEYS, tunableKeyList));
        	// Remove tunable key
        	tunableParameterKeys.remove(key1);
        	assertTrue(Configuration.getInstance().isConfigurable(Configuration.KEY_FIELD_NAME_TUNABLE_KEYS, tunableKeyList));
        	// Remove tunable key
        	tunableParameterKeys.remove(key2);
        	assertFalse(Configuration.getInstance().isConfigurable(Configuration.KEY_FIELD_NAME_TUNABLE_KEYS, tunableKeyList));
        	// Remove tunable key
        	tunableParameterKeys.remove(key3);
        	assertTrue(Configuration.getInstance().isConfigurable(Configuration.KEY_FIELD_NAME_TUNABLE_KEYS, tunableKeyList));
        	// Remove tunable key
        	tunableParameterKeys.remove(key4);
        	assertTrue(Configuration.getInstance().isConfigurable(Configuration.KEY_FIELD_NAME_TUNABLE_KEYS, tunableKeyList));
           lock1.lock();
        	assertTrue(Configuration.getInstance().isConfigurable(Configuration.KEY_FIELD_NAME_TUNABLE_KEYS, tunableKeyList));
           lock1.unlock();

        }
}
// PlayerConfiguration_0Test.java