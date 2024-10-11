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
		// TODO: implement this test
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

    /**
     * @return the configuration of this player
     */
    public PlayerConfiguration getConfiguration();
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
* It contains ten unit test cases for the {@link Player#getConfiguration()} method.
*/
class PlayerTest {
		
	@Test
	void testGetConfiguration() {
		// TODO: implement this test
	}
}

// Game.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;

/**
 * A Game is a match between two players.
 *
 * @author daniel
 */
public class Game {

    /**
     * @return the player that is currently active
     */
    public Player getActivePlayer();
}

// GameTest.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Game}.
* It contains ten unit test cases for the {@link Game#getActivePlayer()} method.
*/
class GameTest {
		
	@Test
	void testGetActivePlayer() {
		// TODO: implement this test
	}
}

// GameController.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;

/**
 * A GameController is responsible for the game logic.
 *
 * @author daniel
 */
public class GameController {

    /**
     * @return the game that is currently played
     */
    public Game getGame();
}

// GameControllerTest.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GameController}.
* It contains ten unit test cases for the {@link GameController#getGame()} method.
*/
class GameControllerTest {
		
	@Test
	void testGetGame() {
		// TODO: implement this test
	}
}

// GameView.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;

/**
 * A GameView is responsible for the graphical representation of the game.
 *
 * @author daniel
 */
public class GameView {

    /**
     * @return the game controller that is used by this view
     */
    public GameController getController();
}

// GameViewTest.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GameView}.
* It contains ten unit test cases for the {@link GameView#getController()} method.
*/
class GameViewTest {
		
	@Test
	void testGetController() {
		// TODO: implement this test
	}
}

// GameViewController.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;

/**
 * A GameViewController is responsible for the graphical representation of the game.
 *
 * @author daniel
 */
public class GameViewController {

    /**
     * @return the game view that is used by this controller
     */
    public GameView getView();
}

// GameViewControllerTest.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GameViewController}.
* It contains ten unit test cases for the {@link GameViewController#getView()} method.
*/
class GameViewControllerTest {
		
	@Test
	void testGetView() {
		// TODO: implement this test
	}
}

// GameViewControllerTest.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GameViewController}.
* It contains ten unit test cases for the {@link GameViewController#getView()} method.
*/
class GameViewControllerTest {
		
	@Test
	void testGetView() {
		// TODO: implement this test
	}
}

// GameViewControllerTest.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of