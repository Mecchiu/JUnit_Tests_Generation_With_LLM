// PlayerConfiguration_1Test.java
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
* It contains one unit test case for the {@link PlayerConfiguration#showMoveTargets()} method.
*/
class PlayerConfiguration_1Test {
		
    @Test
    void testShowMoveTargets() throws Exception {
        
        Configuration conf = new Configuration(ConfType.STANDARD);
	conf.addParameter("move-targets", true);
	
	Object obj = conf.clone();
	assertTrue(obj instanceof HashSet);
	assertTrue(!obj.equals(new HashSet()));
    }
}