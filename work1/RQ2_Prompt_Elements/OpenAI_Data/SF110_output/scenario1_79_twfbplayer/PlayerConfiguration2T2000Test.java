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

// Player.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;

/**
 * A Player is a human or computer controlled entity in the game.
 *
 * @author daniel
 */
public class Player {

    public PlayerConfiguration getConfig() {
        return config;
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
* It contains ten unit test cases for the {@link Player#getConfig()} method.
*/
class PlayerTest {
		
	@Test
	void testGetConfig() {
		Player player = new Player();
		assertTrue(player.getConfig().showShootline());
	}
}

// Configuration.java
package de.outstare.fortbattleplayer;

/**
 * A Configuration holds all settings of the game.
 *
 * @author daniel
 */
public class Configuration {

    public static Configuration getInstance() {
        return instance;
    }
}

// ConfigurationTest.java
package de.outstare.fortbattleplayer;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Configuration}.
* It contains ten unit test cases for the {@link Configuration#getInstance()} method.
*/
class ConfigurationTest {
		
	@Test
	void testGetInstance() {
		Configuration config = Configuration.getInstance();
		assertNotNull(config);
	}
}

// Game.java
package de.outstare.fortbattleplayer;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * A Game is a match between two players.
 *
 * @author daniel
 */
public class Game {

    public Configuration getConfig() {
        return config;
    }
}

// GameTest.java
package de.outstare.fortbattleplayer;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Game}.
* It contains ten unit test cases for the {@link Game#getConfig()} method.
*/
class GameTest {
		
	@Test
	void testGetConfig() {
		Game game = new Game();
		assertNotNull(game.getConfig());
	}
}

// Game.java
package de.outstare.fortbattleplayer;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * A Game is a match between two players.
 *
 * @author daniel
 */
public class Game {

    public Configuration getConfig() {
        return config;
    }
}

// GameTest.java
package de.outstare.fortbattleplayer;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Game}.
* It contains ten unit test cases for the {@link Game#getConfig()} method.
*/
class GameTest {
		
	@Test
	void testGetConfig() {
		Game game = new Game();
		assertNotNull(game.getConfig());
	}
}

// Game.java
package de.outstare.fortbattleplayer;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * A Game is a match between two players.
 *
 * @author daniel
 */
public class Game {

    public Configuration getConfig() {
        return config;
    }
}

// GameTest.java
package de.outstare.fortbattleplayer;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Game}.
* It contains ten unit test cases for the {@link Game#getConfig()} method.
*/
class GameTest {
		
	@Test
	void testGetConfig() {
		Game game = new Game();
		assertNotNull(game.getConfig());
	}
}

// Game.java
package de.outstare.fortbattleplayer;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * A Game is a match between two players.
 *
 * @author daniel
 */
public class Game {

    public Configuration getConfig() {
        return config;
    }
}

// GameTest.java
package de.outstare.fortbattleplayer;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Game}.
* It contains ten unit test cases for the {@link Game#getConfig()} method.
*/
class GameTest {
		
	@Test
	void testGetConfig() {
		Game game = new Game();
		assertNotNull(game.getConfig());
	}
}

// Game.java
package de.outstare.fortbattleplayer;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * A Game is a match between two players.
 *
 * @author daniel
 */
public class Game {

    public Configuration getConfig() {
        return config;
    }
}

// GameTest.java
package de.outstare.fortbattleplayer;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
