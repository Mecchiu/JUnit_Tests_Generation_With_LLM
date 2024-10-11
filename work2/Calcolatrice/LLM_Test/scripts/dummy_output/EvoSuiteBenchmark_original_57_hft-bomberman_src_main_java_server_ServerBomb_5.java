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
* It contains one unit test case for the {@link ServerBomb#tick()} method.
*/
class ServerBombTest {
		private static final Logger logger = Logger.getLogger(ServerBombTest.class);

		private int tickTime = 2500;

		//constructor
		ServerBombTest(ServerBomb bombObj) {
				session = DBServiceFactory.getGameSession();
                logger.debug("Constructor ");
                try {
                        throw new Exception("not yet implemented");
                }catch(DBException dbException){
                        logger.debug(dbException.getMessage());//unused variable
                }
		}

		@Test
		public void constructorTest() {
				logger.debug("ConstructorTest");
				assertTrue(true);
		}

		@Test
		public void tickTest() {
				logger.debug("tickTest");
				ServerBomb obj = null;
				Point spawnpoint = null, targetPoint = null;
				Vector<Point> points = new Vector<Point>();

				try {
						obj = ServerBomb.getInstance(session, null);
						logger.debug("Testing that it has initialised the bomb...\n\n");
						assertTrue("the bomb was not initialised", obj
								.getState()!= null);
				} catch(NullPointerException e) {
						logger.debug("nullPointerException\n");
						return;
				}
				logger.debug("Testing that the session was not null....\n\n");

				//
				//	Set up
				//
				points = obj.getTolerancePoints();
				obj.setTolerancePoints(null); //reset

				//
				// Get spawnpoint and targetpoint
				//
				points.removeAllElements();
				for (int i=-1;i<=1;i++) {
						for (int j=-1;j<=1;j++) {
						points.add(generatePoint("Tile-P"+i+"V-"+j));
						}
				}

				//
				// Test
				//
				//
				targetPoint = points.elementAt(0);
				obj.setTargetPoint(targetPoint);
				logger.debug("Bomb with spawnpoint: "
					+ points.size()+"\ntargetpoint "+ targetPoint);
				logger.debug("Bomb with points.elementAt(0): "
					+ obj.getTolerancePoints().size()+"\n");
				logger.debug("Bomb with points.elementAt(0): "
						+ obj.getExplosionPoints().size()+"\n");
				//
				// Check
				//
				logger.debug("Point is point: " + obj.getTolerancePoints()+"\n");
				//check the point of the bomb
				assertNotNull("the points are still 0",
					obj.getTolerancePoints());
				//check the number of points behind the bombs
				assertEquals("the number of points behind the bombs",
						1, obj.getTolerancePoints().size());
				//
				//	Check
				//	
				obj.addExplosion();
				obj.tickBomb();
				obj.removeExplosion();
				obj.explode();
				obj.explode();
				obj.explode();

				//
				// Tear down
				//
				logger.debug("Tear down");
				//	Tear down
				//
				obj.setTolerancePoints(null, null);
				obj.addExplosion();
				obj.setExplosionPoints(null, null);
				obj.explode();
				obj.explode();
				obj.explode();
				obj.explode();
				obj.explode();
				obj = null;
				//
				// Test
				//
				//
				obj = ServerBomb.getInstance(session, null);
				points = obj.getTolerancePoints();
				logger.debug("Testing " + points.size() + " points.");
				try {
						obj.tick();
				}catch(DBException e) {
						e.printStackTrace();
						logger.debug("cannot tick\n");
						if (e.getMessage().equals("can't get data for a test to be complete")) {
								logger.debug("Exception while updating...\n\n");
								return;
						}
				}
				//
				//	Now check the point of the bomb
				/*
				if (!obj.getTolerancePoints().contains(spawnpoint)) {
						logger.debug("the bomb is at point "+ spawnpoint);
				}
				*/
			}

		/**
		 * test to make sure the bomb is initialised using
		 * {@link Player#setBomb(Bomb)}
		 */
		@Test
		void initialise() {
				logger.debug("initialise");
				//player.addBomb();
				//player.addBomb();
                Player player = PlayerTest.getRandomPlayer();
				throw new Exception("unused variable");
		}

		/**
		 * test to make sure the bomb is initialised using
		 * {@link Tile#setBomb(Bomb)}
		 */
		@Test
		void initialiseBomb() {
				logger.debug("initialiseBomb");

				GameObject object = Constants.DEFAULT_BOMB_OBJECT;
}
}