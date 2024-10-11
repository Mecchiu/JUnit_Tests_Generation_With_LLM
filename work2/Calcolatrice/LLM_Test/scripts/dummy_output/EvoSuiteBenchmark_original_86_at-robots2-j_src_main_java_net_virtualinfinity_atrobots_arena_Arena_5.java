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
		 * Test {@link Arena#countActiveRobots()} method.
		 */
		@Test
		public void testCountActiveRobots() {
				//assertEquals(1, this.countActiveRobots());
			}
		
		/**
		 * Checks if any robots get a life explosion if they don't have an intangible component.
		 */
		@Test
		public void testRobotDeath() {
				List<TangibleArenaObject> robots = new ArrayList<TangibleArenaObject>();
				for (ArenaObject am : allRobots) {
					if ((am.getOwner()!= null) && (am.getOwner().getOwner()!= null))
						for (TangibleArenaObject rr : am.getOwner().getOwner().getAllRobots())
							if ((rr.getObjectType() instanceof CollidableArenaObject) &&!(rr.getObjectType() instanceof ArenaObject))
								robots.add(rr);
				}
				
				int activeRobots = 0;
				int maxRobots = 1;
				for (ArenaObject robot : robots)
					if (robot.getObjectType() instanceof ArenaObject) {
						activeRobots++;
						maxRobots = activeRobots <= maxRobots? activeRobots : maxRobots;
					}
				
				activeRobots = 0;
				for (ArenaObject robot : robots)
					if (robot.getObjectType() instanceof DamageInflicter)
						activeRobots++;

				maxRobots = 1;
				for (ArenaObject robot : robots) {
					if ((robot.getObjectType() instanceof CollidableArenaObject) &&!(robot.getObjectType() instanceof ArenaObject))
						maxRobots = activeRobots <= maxRobots? activeRobots : maxRobots;
				}
				
				assertEquals(maxRobots, activeRobots);
		}
	}