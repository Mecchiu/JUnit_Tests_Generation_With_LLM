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
		
	@Test
	public void showShootline() {
		//create the test case
    }


    private static final class Configuration_2Test implements PlayerConfiguration {
	final private final Lock lock = new ReentrantLock(true);
	final double shoot = Configuration.SHOOTLINE_MIN;
	private final Set<PlayerConfiguration> configurationSet = new HashSet<>();

	public void addConfiguration(PlayerConfiguration playerConfiguration) {
		lock.lock();
		try {
			configurationSet.add(playerConfiguration);
		}
		finally {
			lock.unlock();
		}
	}

	public Set<PlayerConfiguration> getConfigurationSet() {
		lock.lock();
		try {
			return new HashSet<PlayerConfiguration>(configurationSet);
		}
		finally {
			lock.unlock();
		}

	}
	
	public PlayerConfiguration getConfiguration() {
		return getConfigurationSet().iterator().next();
	}
	
	@Override
	public boolean showShootline() {
		return shoot > Configuration.SHOOTLINE_MIN;
	}
    }

}