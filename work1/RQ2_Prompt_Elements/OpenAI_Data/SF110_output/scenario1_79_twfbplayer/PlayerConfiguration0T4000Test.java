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
				assertEquals(config, copy);
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

    private final PlayerConfiguration config;

    public Player(final PlayerConfiguration config) {
        this.config = config;
    }

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
				PlayerConfiguration config = new PlayerConfiguration();
				Player player = new Player(config);
				assertEquals(config, player.getConfig());
		}
}

// Game.java
package de.outstare.fortbattleplayer.game;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import de.outstare.fortbattleplayer.player.Player;

/**
 * A Game is a match between two players.
 *
 * @author daniel
 */
public class Game {

    private final Player player1;
    private final Player player2;

    public Game(final Player player1, final Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }
}

// GameTest.java
package de.outstare.fortbattleplayer.game;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import de.outstare.fortbattleplayer.player.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Game}.
* It contains ten unit test cases for the {@link Game#getPlayer1()} method.
*/
class GameTest {
		
		@Test
		void testGetPlayer1() {
				Player player1 = new Player(new PlayerConfiguration());
				Player player2 = new Player(new PlayerConfiguration());
				Game game = new Game(player1, player2);
				assertEquals(player1, game.getPlayer1());
		}
}

// GameTest.java
package de.outstare.fortbattleplayer.game;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import de.outstare.fortbattleplayer.player.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Game}.
* It contains ten unit test cases for the {@link Game#getPlayer2()} method.
*/
class GameTest {
		
		@Test
		void testGetPlayer2() {
				Player player1 = new Player(new PlayerConfiguration());
				Player player2 = new Player(new PlayerConfiguration());
				Game game = new Game(player1, player2);
				assertEquals(player2, game.getPlayer2());
		}
}

// GameTest.java
package de.outstare.fortbattleplayer.game;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import de.outstare.fortbattleplayer.player.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Game}.
* It contains ten unit test cases for the {@link Game#getPlayer2()} method.
*/
class GameTest {
		
		@Test
		void testGetPlayer2() {
				Player player1 = new Player(new PlayerConfiguration());
				Player player2 = new Player(new PlayerConfiguration());
				Game game = new Game(player1, player2);
				assertEquals(player2, game.getPlayer2());
		}
}

// GameTest.java
package de.outstare.fortbattleplayer.game;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import de.outstare.fortbattleplayer.player.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Game}.
* It contains ten unit test cases for the {@link Game#getPlayer2()} method.
*/
class GameTest {
		
		@Test
		void testGetPlayer2() {
				Player player1 = new Player(new PlayerConfiguration());
				Player player2 = new Player(new PlayerConfiguration());
				Game game = new Game(player1, player2);
				assertEquals(player2, game.getPlayer2());
		}
}

// GameTest.java
package de.outstare.fortbattleplayer.game;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import de.outstare.fortbattleplayer.player.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Game}.
* It contains ten unit test cases for the {@link Game#getPlayer2()} method.
*/
class GameTest {
		
		@Test
		void testGetPlayer2() {
				Player player1 = new Player(new PlayerConfiguration());
				Player player2 = new Player(new PlayerConfiguration());
				Game game = new Game(player1, player2);
				assertEquals(player2, game.getPlayer2());
		}
}

// GameTest.java
package de.outstare.fortbattleplayer.game;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import de.outstare.fortbattleplayer.player.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Game}.
* It contains ten unit test cases for the {@link Game#getPlayer2()} method.
*/
class GameTest {
		
		@Test
		void testGetPlayer2() {
				Player player1 = new Player(new PlayerConfiguration());
				Player player2 = new Player(new PlayerConfiguration());
				Game game = new Game(player1, player2);
				assertEquals(player2, game.getPlayer2());
		}
}

// GameTest.java
package de.outstare.fortbattleplayer.game;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import de.outstare.fortbattleplayer.player.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Game}.
* It contains ten unit test cases for the {@link Game#getPlayer2()} method.
*/
class GameTest {
		
		@Test
		void testGetPlayer2() {
				Player player1 = new Player(new PlayerConfiguration());
				Player player2 = new Player(new PlayerConfiguration());
				Game game = new Game(player1, player2);
				assertEquals(player2, game.getPlayer2());
		}
}

// GameTest.java
package de.outstare.fortbattleplayer.game;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import de.outstare.fortbattleplayer.player.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Game}.
* It contains ten unit test cases for the {@link Game#getPlayer2()} method.
*/
class GameTest {
		
		@Test
		void testGetPlayer2() {
				Player player1 = new Player(new PlayerConfiguration());
				Player player2 = new Player(new PlayerConfiguration());
				Game game = new Game(player1, player2);
				assertEquals(player2, game.getPlayer2());
		}
}

// GameTest.java
package de.outstare.fortbattleplayer.game;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import de.outstare.fortbattleplayer.player.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Game}.
* It contains ten unit test cases for the {@link Game#getPlayer2()} method.
*/
class GameTest {
		
		@Test
		void testGetPlayer2() {
				Player player1 = new Player(new PlayerConfiguration());
				Player player2 = new Player(new PlayerConfiguration());
				Game game = new Game(player1, player2);
				assertEquals(player2, game.getPlayer2());
		}
}

// GameTest.java
package de.outstare.fortbattleplayer.game;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import de.outstare.fortbattleplayer.player.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Game}.
* It contains ten unit test cases for the {@link Game#getPlayer2()} method.
*/
class GameTest {
		
		@Test
		void testGetPlayer2() {
				Player player1 = new Player(new PlayerConfiguration());
				Player player2 = new Player(new PlayerConfiguration());
				Game game = new Game(player1, player2);
				assertEquals(player2, game.getPlayer2());
		}
}

// GameTest.java
package de.outstare.fortbattleplayer.game;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import de.outstare.fortbattleplayer.player.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Game}.
* It contains ten unit test cases for the {@link Game#getPlayer2()} method.
*/
class GameTest {
		
		@Test
		void testGetPlayer2() {
				Player player1 = new Player(new PlayerConfiguration());
				Player player2 = new Player(new PlayerConfiguration());
				Game game = new Game(player1, player2);
				assertEquals(player2, game.getPlayer2());
		}
}

// GameTest.java
package de.outstare.fortbattleplayer.game;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import de.outstare.fortbattleplayer.player.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Game}.
* It contains ten unit test cases for the {@link Game#getPlayer2()} method.
*/
class GameTest {
		
		@Test
		void testGetPlayer2() {
				Player player1 = new Player(new PlayerConfiguration());
				Player player2 = new Player(new PlayerConfiguration());
				Game game = new Game(player1, player2);
				assertEquals(player2, game.getPlayer2());
		}
}

// GameTest.java
package de.outstare.fortbattleplayer.game;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import de.outstare.fortbattleplayer.player.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Game}.
* It contains ten unit test cases for the {@link Game#getPlayer2()} method.
*/
class GameTest {
		
		@Test
		