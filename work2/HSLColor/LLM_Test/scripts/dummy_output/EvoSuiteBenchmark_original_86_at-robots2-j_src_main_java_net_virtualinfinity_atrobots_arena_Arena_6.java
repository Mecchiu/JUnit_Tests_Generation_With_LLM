// ArenaTest.java
package net.virtualinfinity.atrobots.arena;

import net.virtualinfinity.atrobots.ArenaObjectVisitor;
import net.virtualinfinity.atrobots.arenaobjects.ArenaObject;
import net.virtualinfinity.atrobots.arenaobjects.CollidableArenaObject;
import net.virtualinfinity.atrobots.arenaobjects.DamageInflicter;
import net.virtualinfinity.atrobots.measures.Duration;
import net.virtualinfinity.atrobots.radio.RadioDispatcher;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Arena}.
* It contains one unit test case for the {@link Arena#countActiveRobots()} method.
*/
class ArenaTest {
		/**
		 * Test method for getRobots().
		 *
		 * @throws java.lang.IllegalStateException if any
		 */
		@Test
		public void testGetRobots() throws IllegalStateException {
			Arena area = new Arena();
			assertNotNull(area.getRobots());
		}

		/**
		 * Test method for getRobots().
		 *
		 * @throws java.lang.IllegalStateException if any
		 */
		@Test
		public void testRemoveRobot() throws IllegalStateException {

			ArenaObject[] objects = new ArenaObject[2];
				objects[0] = new CollidableArenaObject("1.0X0.0x0");
				Object[] unused = new Object[1];
				objects[1] = new CollidableArenaObject("1.0X1.0x0");

				assertNotNull(objects[0].getType());
				assertNotNull(objects[1].getType());

				assertNotNull(objects[0].getCollisionRadius());
				assertNotNull(objects[1].getCollisionRadius());

				assertTrue(objects[0].getCollisionRadius() > objects[1].getCollisionRadius() + 1.0);

				// we don't expect collisions on 2 robots
				assertFalse(objects[0].isColliding(objects[1]));

				// we only expect a collision of 1 robot
				List<CollidableArenaObject> result = new ArrayList<CollidableArenaObject>();
				result.add(objects[1]);
				Iterator<CollidableArenaObject> objIter = result.iterator();
				while (objIter.hasNext()) {
					CollidableArenaObject obj = objIter.next();
				}
				assertTrue(objects[1].isColliding(objects[0]));
				assertFalse(objects[1].isColliding(objects[1]));

				// we don't expect a collision between robots
				assertFalse(objects[0].isColliding(objects[0]));
				assertFalse(objects[0].isColliding(objects[1]));
				assertFalse(objects[1].isColliding(objects[1]));

				// we expect all robots to survive as long as we have a collision
				assertEquals(objects[0].getCollisionRadius(),objects[1].getCollisionRadius());

				// we expect robots to survive if we destroy an object
				int r = 0;
				do {
					r++;
					assertTrue(objects[0].equals(objects[1]));
					objects[1].disconnectRobot();
					objects[1].disconnectRobot();
				}
				long elapsed = System.currentTimeMillis() - objects[0].getLastDisconnectTime();
				assertTrue(elapsed >= 20);
				objects[0].destroyRobot();
				objects[1].destroyRobot();
				robotRemoved(objects[1]);
				objects[0].destroyRobot();
				objects[1].destroyRobot();
				objects[0].destroyRobot();
				objects[1].destroyRobot();

				// if we remove the second robot, the other will also lose access to the old robot
				assertFalse(objects[0].equals(objects[1]));
			}
}