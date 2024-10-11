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
 * A PlayerFactory creates new players.
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
 * A PlayerManager manages players.
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
 * A PlayerManagerFactory creates new player managers.
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
 * A PlayerManagerFactoryFactory creates new player manager factories.
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
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;

/**
 * A PlayerManagerFactoryFactoryFactory creates new player manager factory factories.
 *
 * @author daniel
 */
public class PlayerManagerFactoryFactoryFactory {

    /**
     * @return a new player manager factory factory
     */
    public PlayerManagerFactoryFactory createPlayerManagerFactoryFactory() {
        return new PlayerManagerFactoryFactory();
    }
}

// PlayerManagerFactoryFactoryFactoryTest.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlayerManagerFactoryFactoryFactory}.
* It contains ten unit test cases for the {@link PlayerManagerFactoryFactoryFactory#createPlayerManagerFactoryFactory()} method.
*/
class PlayerManagerFactoryFactoryFactoryTest {
		
		@Test
		void testCreatePlayerManagerFactoryFactory() {
				PlayerManagerFactoryFactoryFactory factory = new PlayerManagerFactoryFactoryFactory();
				PlayerManagerFactoryFactory managerFactoryFactory = factory.createPlayerManagerFactoryFactory();
				assertNotNull(managerFactoryFactory);
		}
}

// PlayerManagerFactoryFactoryFactoryFactory.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;

/**
 * A PlayerManagerFactoryFactoryFactoryFactory creates new player manager factory factory factories.
 *
 * @author daniel
 */
public class PlayerManagerFactoryFactoryFactoryFactory {

    /**
     * @return a new player manager factory factory factory
     */
    public PlayerManagerFactoryFactoryFactory createPlayerManagerFactoryFactoryFactory() {
        return new PlayerManagerFactoryFactoryFactory();
    }
}

// PlayerManagerFactoryFactoryFactoryFactoryTest.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlayerManagerFactoryFactoryFactoryFactory}.
* It contains ten unit test cases for the {@link PlayerManagerFactoryFactoryFactoryFactory#createPlayerManagerFactoryFactoryFactory()} method.
*/
class PlayerManagerFactoryFactoryFactoryFactoryTest {
		
		@Test
		void testCreatePlayerManagerFactoryFactoryFactory() {
				PlayerManagerFactoryFactoryFactoryFactory factory = new PlayerManagerFactoryFactoryFactoryFactory();
				PlayerManagerFactoryFactoryFactory managerFactoryFactoryFactory = factory.createPlayerManagerFactoryFactoryFactory();
				assertNotNull(managerFactoryFactoryFactory);
		}
}

// PlayerManagerFactoryFactoryFactoryFactoryFactory.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;

/**
 * A PlayerManagerFactoryFactoryFactoryFactoryFactory creates new player manager factory factory factory factories.
 *
 * @author daniel
 */
public class PlayerManagerFactoryFactoryFactoryFactoryFactory {

    /**
     * @return a new player manager factory factory factory factory
     */
    public PlayerManagerFactoryFactoryFactoryFactory createPlayerManagerFactoryFactoryFactoryFactory() {
        return new PlayerManagerFactoryFactoryFactoryFactory();
    }
}

// PlayerManagerFactoryFactoryFactoryFactoryFactoryTest.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlayerManagerFactoryFactoryFactoryFactoryFactory}.
* It contains ten unit test cases for the {@link PlayerManagerFactoryFactoryFactoryFactoryFactory#createPlayerManagerFactoryFactoryFactoryFactory()} method.
*/
class PlayerManagerFactoryFactoryFactoryFactoryFactoryTest {
		
		@Test
		void testCreatePlayerManagerFactoryFactoryFactoryFactory() {
				PlayerManagerFactoryFactoryFactoryFactoryFactory factory = new PlayerManagerFactoryFactoryFactoryFactoryFactory();
				PlayerManagerFactoryFactoryFactoryFactory managerFactoryFactoryFactoryFactory = factory.createPlayerManagerFactoryFactoryFactoryFactory();
				assertNotNull(managerFactoryFactoryFactoryFactory);
		}
}

// PlayerManagerFactoryFactoryFactoryFactoryFactoryFactory.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;

/**
 * A PlayerManagerFactoryFactoryFactoryFactoryFactoryFactory creates new player manager factory factory factory factory factories.
 *
 * @author daniel
 */
public class PlayerManagerFactoryFactoryFactoryFactoryFactoryFactory {

    /**
     * @return a new player manager factory factory factory factory factory
     */
    public PlayerManagerFactoryFactoryFactoryFactoryFactory createPlayerManagerFactoryFactoryFactoryFactoryFactory() {
        return new PlayerManagerFactoryFactoryFactoryFactoryFactory();
    }
}

// PlayerManagerFactoryFactoryFactoryFactoryFactoryFactoryTest.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlayerManagerFactoryFactoryFactoryFactoryFactoryFactory}.
* It contains ten unit test cases for the {@link PlayerManagerFactoryFactoryFactoryFactoryFactoryFactory#createPlayerManagerFactoryFactoryFactoryFactoryFactory()} method.
*/
class PlayerManagerFactoryFactoryFactoryFactoryFactoryFactoryTest {
		
		@Test
		void testCreatePlayerManagerFactoryFactoryFactoryFactoryFactory() {
				PlayerManagerFactoryFactoryFactoryFactoryFactoryFactory factory = new PlayerManagerFactoryFactoryFactoryFactoryFactoryFactory();
				PlayerManagerFactoryFactoryFactoryFactoryFactory managerFactoryFactoryFactoryFactoryFactory = factory.createPlayerManagerFactoryFactoryFactoryFactoryFactory();
				assertNotNull(managerFactoryFactoryFactoryFactoryFactory);
		}
}

// PlayerManagerFactoryFactoryFactoryFactoryFactoryFactoryFactory.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;

/**
 * A PlayerManagerFactoryFactoryFactoryFactoryFactoryFactoryFactory creates new player manager factory factory factory factory factory factories.
 *
 * @author daniel
 */
public class PlayerManagerFactoryFactoryFactoryFactoryFactoryFactoryFactory {

    /**
     * @return a new player manager factory factory factory factory factory factory
     */
    public PlayerManagerFactoryFactoryFactoryFactoryFactoryFactory createPlayerManagerFactoryFactoryFactoryFactoryFactoryFactory() {
        return new PlayerManagerFactoryFactoryFactoryFactoryFactoryFactory();
    }
}

// PlayerManagerFactoryFactoryFactoryFactoryFactoryFactoryFactoryTest.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks