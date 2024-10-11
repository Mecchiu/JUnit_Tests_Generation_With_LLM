// ServerBombTest.java
package server;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.Collection;
import java.util.Vector;
import messages.round.BombExplodedMsg;
import org.apache.log4j.Logger;
import common.Bomb;
import common.Constants;
import common.GameObject;
import common.Player;
import common.PowerUp;
import common.Tile;
import db.DBException;
import db.DBGameUser;
import db.DBServiceFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ServerBomb}.
* It contains ten unit test cases for the {@link ServerBomb#tick()} method.
*/
class ServerBombTest {

		/**
		* Test case 1 for {@link ServerBomb#tick()}.
		* The test case checks if the bomb explodes after the tick time.
		*/
		@Test
		public void testTick1() {
				ServerBomb bomb = new ServerBomb(new Point(0, 0), null);
				bomb.tick();
				assertTrue(bomb.isExploded());
		}
		
		/**
		* Test case 2 for {@link ServerBomb#tick()}.
		* The test case checks if the bomb explodes after the tick time.
		*/
		@Test
		public void testTick2() {
				ServerBomb bomb = new ServerBomb(new Point(0, 0), null);
				bomb.tick();
				bomb.tick();
				assertTrue(bomb.isExploded());
		}
		
		/**
		* Test case 3 for {@link ServerBomb#tick()}.
		* The test case checks if the bomb explodes after the tick time.
		*/
		@Test
		public void testTick3() {
				ServerBomb bomb = new ServerBomb(new Point(0, 0), null);
				bomb.tick();
				bomb.tick();
				bomb.tick();
				assertTrue(bomb.isExploded());
		}
		
		/**
		* Test case 4 for {@link ServerBomb#tick()}.
		* The test case checks if the bomb explodes after the tick time.
		*/
		@Test
		public void testTick4() {
				ServerBomb bomb = new ServerBomb(new Point(0, 0), null);
				bomb.tick();
				bomb.tick();
				bomb.tick();
				bomb.tick();
				assertTrue(bomb.isExploded());
		}
		
		/**
		* Test case 5 for {@link ServerBomb#tick()}.
		* The test case checks if the bomb explodes after the tick time.
		*/
		@Test
		public void testTick5() {
				ServerBomb bomb = new ServerBomb(new Point(0, 0), null);
				bomb.tick();
				bomb.tick();
				bomb.tick();
				bomb.tick();
				bomb.tick();
				assertTrue(bomb.isExploded());
		}
		
		/**
		* Test case 6 for {@link ServerBomb#tick()}.
		* The test case checks if the bomb explodes after the tick time.
		*/
		@Test
		public void testTick6() {
				ServerBomb bomb = new ServerBomb(new Point(0, 0), null);
				bomb.tick();
				bomb.tick();
				bomb.tick();
				bomb.tick();
				bomb.tick();
				bomb.tick();
				assertTrue(bomb.isExploded());
		}
		
		/**
		* Test case 7 for {@link ServerBomb#tick()}.
		* The test case checks if the bomb explodes after the tick time.
		*/
		@Test
		public void testTick7() {
				ServerBomb bomb = new ServerBomb(new Point(0, 0), null);
				bomb.tick();
				bomb.tick();
				bomb.tick();
				bomb.tick();
				bomb.tick();
				bomb.tick();
				bomb.tick();
				assertTrue(bomb.isExploded());
		}
		
		/**
		* Test case 8 for {@link ServerBomb#tick()}.
		* The test case checks if the bomb explodes after the tick time.
		*/
		@Test
		public void testTick8() {
				ServerBomb bomb = new ServerBomb(new Point(0, 0), null);
				bomb.tick();
				bomb.tick();
				bomb.tick();
				bomb.tick();
				bomb.tick();
				bomb.tick();
				bomb.tick();
				bomb.tick();
				assertTrue(bomb.isExploded());
		}
		
		/**
		* Test case 9 for {@link ServerBomb#tick()}.
		* The test case checks if the bomb explodes after the tick time.
		*/
		@Test
		public void testTick9() {
				ServerBomb bomb = new ServerBomb(new Point(0, 0), null);
				bomb.tick();
				bomb.tick();
				bomb.tick();
				bomb.tick();
				bomb.tick();
				bomb.tick();
				bomb.tick();
				bomb.tick();
				bomb.tick();
				assertTrue(bomb.isExploded());
		}
		
		/**
		* Test case 10 for {@link ServerBomb#tick()}.
		* The test case checks if the bomb explodes after the tick time.
		*/
		@Test
		public void testTick10() {
				ServerBomb bomb = new ServerBomb(new Point(0, 0), null);
				bomb.tick();
				bomb.tick();
				bomb.tick();
				bomb.tick();
				bomb.tick();
				bomb.tick();
				bomb.tick();
				bomb.tick();
				bomb.tick();
				bomb.tick();
				assertTrue(bomb.isExploded());
		}
}

// ServerGameSession.java
package server;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.Collection;
import java.util.Vector;
import messages.round.BombExplodedMsg;
import org.apache.log4j.Logger;
import common.Bomb;
import common.Constants;
import common.GameObject;
import common.Player;
import common.PowerUp;
import common.Tile;
import db.DBException;
import db.DBGameUser;
import db.DBServiceFactory;

/**
 * The GameSession of the Server. This class contains the game logic.
 *
 * @author Bj�rn, Steffen, Daniel
 */
public class ServerGameSession {

    /**
     * The negated number of frames rendered after an explosion
     */
    private static final int POST_EXPLOSION_FRAMES = -40;

    private static final Logger logger = Logger.getLogger(ServerGameSession.class);

    private int tickTime = 2500;

    private int tickFrames = tickTime / 16;

    private ServerGameSession session;

    private boolean hasAlreadyExploded;

    private ExplosionBounds bounds;

    private boolean explodesrightnow = false;

    public ServerGameSession(Point position, ServerGameSession session) {
    }

    @Override
    protected synchronized void move();

    @Override
    public synchronized void updateMovement(Point targetPosition);

    /**
     * Handles the explosion and the hit-detection of the bomb
     *
     * @return
     */
    public void explode(Collection<GameObject> gameObjects);

    private void determineHits(Collection<GameObject> gameObjects);

    private ExplosionBounds getExplosionBounds(Collection<GameObject> gameObjects);

    /**
     * Returns the vertical hitbox of the bomb
     *
     * @return
     */
    private Rectangle getVerticalHitBox();

    /**
     * Returns the horizontal hitbox of the bomb
     *
     * @return
     */
    private Rectangle getHorizontalHitBox();