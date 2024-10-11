// PlayerConfigurationTest.java
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
* It contains ten unit test cases for the {@link PlayerConfiguration#showShootline()} method.
*/
class PlayerConfigurationTest {
		
		@Test
		void testShowShootline() {
				PlayerConfiguration config = new PlayerConfiguration();
				assertTrue(config.showShootline());
		}
}