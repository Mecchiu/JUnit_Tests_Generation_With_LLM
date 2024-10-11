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
* It contains ten unit test cases for the {@link PlayerConfiguration#copy()} method.
*/
class PlayerConfigurationTest {

		@Test
		void testCopy() throws CloneNotSupportedException {
				PlayerConfiguration config = new PlayerConfiguration();
				PlayerConfiguration copy = config.copy();
				assertNotSame(config, copy);
		}
}

// Player.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;

/**
 * A Player is a participant of a game.
 *
 * @author daniel
 */
public class Player {

    /**
     * @return a copy of this object
     * @throws CloneNotSupportedException
     */
    public Player copy() throws CloneNotSupportedException {
        return (Player) clone();
    }
}

// PlayerTest.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Player}.
* It contains ten unit test cases for the {@link Player#copy()} method.
*/
class PlayerTest {
		
		@Test
		void testCopy() throws CloneNotSupportedException {
				Player player = new Player();
				Player copy = player.copy();
				assertNotSame(player, copy);
		}
}

// PlayerFactory.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;

/**
 * A PlayerFactory is used to create new players.
 *
 * @author daniel
 */
public class PlayerFactory {

    /**
     * @return a new player
     */
    public Player createPlayer() {
        return new Player();
    }
}

// PlayerFactoryTest.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlayerFactory}.
* It contains ten unit test cases for the {@link PlayerFactory#createPlayer()} method.
*/
class PlayerFactoryTest {
		
		@Test
		void testCreatePlayer() {
				PlayerFactory factory = new PlayerFactory();
				Player player = factory.createPlayer();
				assertNotNull(player);
		}
}

// PlayerManager.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;

/**
 * A PlayerManager is used to manage players.
 *
 * @author daniel
 */
public class PlayerManager {

    /**
     * @return a new player
     */
    public Player createPlayer() {
        return new Player();
    }
}

// PlayerManagerTest.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlayerManager}.
* It contains ten unit test cases for the {@link PlayerManager#createPlayer()} method.
*/
class PlayerManagerTest {
		
		@Test
		void testCreatePlayer() {
				PlayerManager manager = new PlayerManager();
				Player player = manager.createPlayer();
				assertNotNull(player);
		}
}

// PlayerManagerFactory.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;

/**
 * A PlayerManagerFactory is used to create new player managers.
 *
 * @author daniel
 */
public class PlayerManagerFactory {

    /**
     * @return a new player manager
     */
    public PlayerManager createPlayerManager() {
        return new PlayerManager();
    }
}

// PlayerManagerFactoryTest.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlayerManagerFactory}.
* It contains ten unit test cases for the {@link PlayerManagerFactory#createPlayerManager()} method.
*/
class PlayerManagerFactoryTest {
		
		@Test
		void testCreatePlayerManager() {
				PlayerManagerFactory factory = new PlayerManagerFactory();
				PlayerManager manager = factory.createPlayerManager();
				assertNotNull(manager);
		}
}

// PlayerManagerFactoryFactory.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;

/**
 * A PlayerManagerFactoryFactory is used to create new player manager factorys.
 *
 * @author daniel
 */
public class PlayerManagerFactoryFactory {

    /**
     * @return a new player manager factory
     */
    public PlayerManagerFactory createPlayerManagerFactory() {
        return new PlayerManagerFactory();
    }
}

// PlayerManagerFactoryFactoryTest.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlayerManagerFactoryFactory}.
* It contains ten unit test cases for the {@link PlayerManagerFactoryFactory#createPlayerManagerFactory()} method.
*/
class PlayerManagerFactoryFactoryTest {
		
		@Test
		void testCreatePlayerManagerFactory() {
				PlayerManagerFactoryFactory factory = new PlayerManagerFactoryFactory();
				PlayerManagerFactory managerFactory = factory.createPlayerManagerFactory();
				assertNotNull(managerFactory);
		}
}

// PlayerManagerFactoryFactoryFactory.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
