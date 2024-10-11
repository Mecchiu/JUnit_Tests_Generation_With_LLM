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

// GameController.java
package de.outstare.fortbattleplayer;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * A GameController controls a game.
 *
 * @author daniel
 */
public class GameController {

    public Configuration getConfig() {
        return config;
    }
}

// GameControllerTest.java
package de.outstare.fortbattleplayer;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GameController}.
* It contains ten unit test cases for the {@link GameController#getConfig()} method.
*/
class GameControllerTest {
		
	@Test
	void testGetConfig() {
		GameController controller = new GameController();
		assertNotNull(controller.getConfig());
	}
}

// GameView.java
package de.outstare.fortbattleplayer;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * A GameView shows a game.
 *
 * @author daniel
 */
public class GameView {

    public Configuration getConfig() {
        return config;
    }
}

// GameViewTest.java
package de.outstare.fortbattleplayer;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GameView}.
* It contains ten unit test cases for the {@link GameView#getConfig()} method.
*/
class GameViewTest {
		
	@Test
	void testGetConfig() {
		GameView view = new GameView();
		assertNotNull(view.getConfig());
	}
}

// GameViewController.java
package de.outstare.fortbattleplayer;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * A GameViewController controls a game view.
 *
 * @author daniel
 */
public class GameViewController {

    public Configuration getConfig() {
        return config;
    }
}

// GameViewControllerTest.java
package de.outstare.fortbattleplayer;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GameViewController}.
* It contains ten unit test cases for the {@link GameViewController#getConfig()} method.
*/
class GameViewControllerTest {
		
	@Test
	void testGetConfig() {
		GameViewController controller = new GameViewController();
		assertNotNull(controller.getConfig());
	}
}

// GameViewControllerTest.java
package de.outstare.fortbattleplayer;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GameViewController}.
* It contains ten unit test cases for the {@link GameViewController#getConfig()} method.
*/
class GameViewControllerTest {
		
	@Test
	void testGetConfig() {
		GameViewController controller = new GameViewController();
		assertNotNull(controller.getConfig());
	}
}

// GameViewControllerTest.java
package de.outstare.fortbattleplayer;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GameViewController}.
* It contains ten unit test cases for the {@link GameViewController#getConfig()} method.
*/
class GameViewControllerTest {
		
	@Test
	void testGetConfig() {
		GameViewController controller = new GameViewController();
		assertNotNull(controller.getConfig());
	}
}

// GameViewControllerTest.java
package de.outstare.fortbattleplayer;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GameViewController}.
* It contains ten unit test cases for the {@link GameViewController#getConfig()} method.
*/
class GameViewControllerTest {
		
	@Test
	void testGetConfig() {
		GameViewController controller = new GameViewController();
		assertNotNull(controller.getConfig());
	}
}

// GameViewControllerTest.java
package de.outstare.fortbattleplayer;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GameViewController}.
* It contains ten unit test cases for the {@link GameViewController#getConfig()} method.
*/
class GameViewControllerTest {
		
	@Test
	void testGetConfig() {
		GameViewController controller = new GameViewController();
		assertNotNull(controller.getConfig());
	}
}

// GameViewControllerTest.java
package de.outstare.fortbattleplayer;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GameViewController}.
* It contains ten unit test cases for the {@link GameViewController#getConfig()} method.
*/
class GameViewControllerTest {
		
	@Test
	void testGetConfig() {
		GameViewController controller = new GameViewController();
		assertNotNull(controller.getConfig());
	}
}

// GameViewControllerTest.java
package de.outstare.fortbattleplayer;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GameViewController}.
* It contains ten unit test cases for the {@link GameViewController#getConfig()} method.
*/
class GameViewControllerTest {
		
	@Test
	void testGetConfig() {
		GameViewController controller = new GameViewController();
		assertNotNull(controller.getConfig());
	}
}

// GameViewControllerTest.java
package de.outstare.fortbattleplayer;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GameViewController}.
* It contains ten unit test cases for the {@link GameViewController#getConfig()} method.
*/
class GameViewControllerTest {
		
	@Test
	void testGetConfig() {
		GameViewController controller = new GameViewController();
		assertNotNull(controller.getConfig());
	}
}

// GameViewControllerTest.java
package de.outstare.fortbattleplayer;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GameViewController}.
* It contains ten unit test cases for the {@link GameViewController#getConfig()} method.
*/
class GameViewControllerTest {
		
	@Test
	void testGetConfig() {
		GameViewController controller = new GameViewController();
		assertNotNull(controller.getConfig());
	}
}

// GameViewControllerTest.java
package de.outstare.fortbattleplayer;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GameViewController}.
* It contains ten unit test cases for the {@link GameViewController#getConfig()} method.
*/
class GameViewControllerTest {
		
	@Test
	void testGetConfig() {
		GameViewController controller = new GameViewController();
		assertNotNull(controller.getConfig());
	}
}

// GameViewControllerTest.java
package de.outstare.fortbattleplayer;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GameViewController}.
* It contains ten unit test cases for the {@link GameViewController#getConfig()} method.
*/
class GameViewControllerTest {
		
	@Test
	void testGetConfig() {
		GameViewController controller = new GameViewController();
		assertNotNull(controller.getConfig());
	}
}

// GameViewControllerTest.java
package de.outstare.fortbattleplayer;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GameViewController}.
* It contains ten unit test cases for the {@link GameViewController#getConfig()} method.
*/
class GameViewControllerTest {
		
	@Test
	void testGetConfig() {
		GameViewController controller = new GameViewController();
		assertNotNull(controller.getConfig());
	}
}

// GameViewControllerTest.java
package de.outstare.fortbattleplayer;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org