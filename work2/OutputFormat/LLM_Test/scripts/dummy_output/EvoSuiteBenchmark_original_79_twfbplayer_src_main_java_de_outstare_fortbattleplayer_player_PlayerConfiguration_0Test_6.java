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
		{
				final Set<String> paramSet = new HashSet<String>();
				paramSet.addAll(Configuration.getParameterNames());
				assertEquals("Number of defined parameters", paramSet.size(), Configuration.getParameterNames().size());
		}
}

// Other PlayerConfiguration_0Test.java