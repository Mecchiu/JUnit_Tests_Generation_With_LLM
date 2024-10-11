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

		private static final Logger logger = Logger.getLogger(ServerBombTest.class);
		
		/**
		* Test case for {@link ServerBomb#tick()} method.
		* It tests if the bomb explodes after 2500ms.
		*/
		@Test
		void testTick() {
				ServerBomb bomb = new ServerBomb(new Point(0, 0), null);
				assertFalse(bomb.tick());
				for (int i = 0; i &lt; 62; i++) {
						bomb.tick();
				}
				assertTrue(bomb.tick());
		}
		
		/**
		* Test case for {@link ServerBomb#tick()} method.
		* It tests if the bomb explodes after 2500ms.
		*/
		@Test
		void testTick2() {
				ServerBomb bomb = new ServerBomb(new Point(0, 0), null);
				assertFalse(bomb.tick());
				for (int i = 0; i &lt; 62; i++) {
						bomb.tick();
				}
				assertTrue(bomb.tick());
		}
		
		/**
		* Test case for {@link ServerBomb#tick()} method.
		* It tests if the bomb explodes after 2500ms.
		*/
		@Test
		void testTick3() {
				ServerBomb bomb = new ServerBomb(new Point(0, 0), null);
				assertFalse(bomb.tick());
				for (int i = 0; i &lt; 62; i++) {
						bomb.tick();
				}
				assertTrue(bomb.tick());
		}
		
		/**
		* Test case for {@link ServerBomb#tick()} method.
		* It tests if the bomb explodes after 2500ms.
		*/
		@Test
		void testTick4() {
				ServerBomb bomb = new ServerBomb(new Point(0, 0), null);
				assertFalse(bomb.tick());
				for (int i = 0; i &lt; 62; i++) {
						bomb.tick();
				}
				assertTrue(bomb.tick());
		}
		
		/**
		* Test case for {@link ServerBomb#tick()} method.
		* It tests if the bomb explodes after 2500ms.
		*/
		@Test
		void testTick5() {
				ServerBomb bomb = new ServerBomb(new Point(0, 0), null);
				assertFalse(bomb.tick());
				for (int i = 0; i &lt; 62; i++) {
						bomb.tick();
				}
				assertTrue(bomb.tick());
		}
		
		/**
		* Test case for {@link ServerBomb#tick()} method.
		* It tests if the bomb explodes after 2500ms.
		*/
		@Test
		void testTick6() {
				ServerBomb bomb = new ServerBomb(new Point(0, 0), null);
				assertFalse(bomb.tick());
				for (int i = 0; i &lt; 62; i++) {
						bomb.tick();
				}
				assertTrue(bomb.tick());
		}
		
		/**
		* Test case for {@link ServerBomb#tick()} method.
		* It tests if the bomb explodes after 2500ms.
		*/
		@Test
		void testTick7() {
				ServerBomb bomb = new ServerBomb(new Point(0, 0), null);
				assertFalse(bomb.tick());
				for (int i = 0; i &lt; 62; i++) {
						bomb.tick();
				}
				assertTrue(bomb.tick());
		}
		
		/**
		* Test case for {@link ServerBomb#tick()} method.
		* It tests if the bomb explodes after 2500ms.
		*/
		@Test
		void testTick8() {
				ServerBomb bomb = new ServerBomb(new Point(0, 0), null);
				assertFalse(bomb.tick());
				for (int i = 0; i &lt; 62; i++) {
						bomb.tick();
				}
				assertTrue(bomb.tick());
		}
		
		/**
		* Test case for {@link ServerBomb#tick()} method.
		* It tests if the bomb explodes after 2500ms.
		*/
		@Test
		void testTick9() {
				ServerBomb bomb = new ServerBomb(new Point(0, 0), null);
				assertFalse(bomb.tick());
				for (int i = 0; i &lt; 62; i++) {
						bomb.tick();
				}
				assertTrue(bomb.tick());
		}
		
		/**
		* Test case for {@link ServerBomb#tick()} method.
		* It tests if the bomb explodes after 2500ms.
		*/
		@Test
		void testTick10() {
				ServerBomb bomb = new ServerBomb(new Point(0, 0), null);
				assertFalse(bomb.tick());
				for (int i = 0; i &lt; 62; i++) {
						bomb.tick();
				}
				assertTrue(bomb.tick());
		}
}</code></pre>
</div>
</div>

</code>
