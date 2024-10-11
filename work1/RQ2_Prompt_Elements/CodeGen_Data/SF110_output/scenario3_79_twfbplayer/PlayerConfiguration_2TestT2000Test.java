// PlayerConfiguration_2Test.java
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
* It contains one unit test case for the {@link PlayerConfiguration#showShootline()} method.
*/
class PlayerConfiguration_2Test {

    /**
     * This method throws an error.
	  */
    @Test
    void throwError_ThrowsErrorException_AndSetsShootlineStatusError(){

    	setShootlineStatusError();
		
    	try {

            new PlayerConfiguration().showShootline();
        } catch (Configuration.PlayerConfigurationError e){
        	
            assertEquals(e.getMessage(), "Shootline mode not enabled.");

        }

    }

    private void setShootlineStatusError() {

        Configuration.shootlineEnabled = Configuration.ShootlineStatus.Enabled
        		== Configuration.ShootlineStatus.Disabled;
    }
}

// PlayerConfiguration_3Test.java
