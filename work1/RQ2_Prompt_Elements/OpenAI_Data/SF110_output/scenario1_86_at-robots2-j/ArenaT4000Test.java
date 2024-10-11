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
* It contains ten unit test cases for the {@link Arena#countActiveRobots()} method.
*/
class ArenaTest {

		/**
		* Test case for {@link Arena#countActiveRobots()}.
		* This test case checks if the method returns the correct number of active robots.
		*/
		@Test
		void testCountActiveRobots() {
				// Create a new arena object.
				Arena arena = new Arena();
				// Create a new robot object.
				Robot robot = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot);
				// Check if the number of active robots is correct.
				assertEquals(1, arena.countActiveRobots());
		}
		
		/**
		* Test case for {@link Arena#countActiveRobots()}.
		* This test case checks if the method returns the correct number of active robots.
		*/
		@Test
		void testCountActiveRobots2() {
				// Create a new arena object.
				Arena arena = new Arena();
				// Create a new robot object.
				Robot robot = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot);
				// Create a new robot object.
				Robot robot2 = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot2);
				// Check if the number of active robots is correct.
				assertEquals(2, arena.countActiveRobots());
		}
		
		/**
		* Test case for {@link Arena#countActiveRobots()}.
		* This test case checks if the method returns the correct number of active robots.
		*/
		@Test
		void testCountActiveRobots3() {
				// Create a new arena object.
				Arena arena = new Arena();
				// Create a new robot object.
				Robot robot = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot);
				// Create a new robot object.
				Robot robot2 = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot2);
				// Create a new robot object.
				Robot robot3 = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot3);
				// Check if the number of active robots is correct.
				assertEquals(3, arena.countActiveRobots());
		}
		
		/**
		* Test case for {@link Arena#countActiveRobots()}.
		* This test case checks if the method returns the correct number of active robots.
		*/
		@Test
		void testCountActiveRobots4() {
				// Create a new arena object.
				Arena arena = new Arena();
				// Create a new robot object.
				Robot robot = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot);
				// Create a new robot object.
				Robot robot2 = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot2);
				// Create a new robot object.
				Robot robot3 = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot3);
				// Create a new robot object.
				Robot robot4 = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot4);
				// Check if the number of active robots is correct.
				assertEquals(4, arena.countActiveRobots());
		}
		
		/**
		* Test case for {@link Arena#countActiveRobots()}.
		* This test case checks if the method returns the correct number of active robots.
		*/
		@Test
		void testCountActiveRobots5() {
				// Create a new arena object.
				Arena arena = new Arena();
				// Create a new robot object.
				Robot robot = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot);
				// Create a new robot object.
				Robot robot2 = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot2);
				// Create a new robot object.
				Robot robot3 = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot3);
				// Create a new robot object.
				Robot robot4 = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot4);
				// Create a new robot object.
				Robot robot5 = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot5);
				// Check if the number of active robots is correct.
				assertEquals(5, arena.countActiveRobots());
		}
		
		/**
		* Test case for {@link Arena#countActiveRobots()}.
		* This test case checks if the method returns the correct number of active robots.
		*/
		@Test
		void testCountActiveRobots6() {
				// Create a new arena object.
				Arena arena = new Arena();
				// Create a new robot object.
				Robot robot = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot);
				// Create a new robot object.
				Robot robot2 = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot2);
				// Create a new robot object.
				Robot robot3 = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot3);
				// Create a new robot object.
				Robot robot4 = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot4);
				// Create a new robot object.
				Robot robot5 = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot5);
				// Create a new robot object.
				Robot robot6 = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot6);
				// Check if the number of active robots is correct.
				assertEquals(6, arena.countActiveRobots());
		}
		
		/**
		* Test case for {@link Arena#countActiveRobots()}.
		* This test case checks if the method returns the correct number of active robots.
		*/
		@Test
		void testCountActiveRobots7() {
				// Create a new arena object.
				Arena arena = new Arena();
				// Create a new robot object.
				Robot robot = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot);
				// Create a new robot object.
				Robot robot2 = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot2);
				// Create a new robot object.
				Robot robot3 = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot3);
				// Create a new robot object.
				Robot robot4 = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot4);
				// Create a new robot object.
				Robot robot5 = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot5);
				// Create a new robot object.
				Robot robot6 = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot6);
				// Create a new robot object.
				Robot robot7 = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot7);
				// Check if the number of active robots is correct.
				assertEquals(7, arena.countActiveRobots());
		}
		
		/**
		* Test case for {@link Arena#countActiveRobots()}.
		* This test case checks if the method returns the correct number of active robots.
		*/
		@Test
		void testCountActiveRobots8() {
				// Create a new arena object.
				Arena arena = new Arena();
				// Create a new robot object.
				Robot robot = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot);
				// Create a new robot object.
				Robot robot2 = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot2);
				// Create a new robot object.
				Robot robot3 = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot3);
				// Create a new robot object.
				Robot robot4 = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot4);
				// Create a new robot object.
				Robot robot5 = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot5);
				// Create a new robot object.
				Robot robot6 = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot6);
				// Create a new robot object.
				Robot robot7 = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot7);
				// Create a new robot object.
				Robot robot8 = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot8);
				// Check if the number of active robots is correct.
				assertEquals(8, arena.countActiveRobots());
		}
		
		/**
		* Test case for {@link Arena#countActiveRobots()}.
		* This test case checks if the method returns the correct number of active robots.
		*/
		@Test
		void testCountActiveRobots9() {
				// Create a new arena object.
				Arena arena = new Arena();
				// Create a new robot object.
				Robot robot = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot);
				// Create a new robot object.
				Robot robot2 = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot2);
				// Create a new robot object.
				Robot robot3 = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot3);
				// Create a new robot object.
				Robot robot4 = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot4);
				// Create a new robot object.
				Robot robot5 = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot5);
				// Create a new robot object.
				Robot robot6 = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot6);
				// Create a new robot object.
				Robot robot7 = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot7);
				// Create a new robot object.
				Robot robot8 = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot8);
				// Create a new robot object.
				Robot robot9 = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot9);
				// Check if the number of active robots is correct.
				assertEquals(9, arena.countActiveRobots());
		}
		
		/**
		* Test case for {@link Arena#countActiveRobots()}.
		* This test case checks if the method returns the correct number of active robots.
		*/
		@Test
		void testCountActiveRobots10() {
				// Create a new arena object.
				Arena arena = new Arena();
				// Create a new robot object.
				Robot robot = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot);
				// Create a new robot object.
				Robot robot2 = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot2);
				// Create a new robot object.
				Robot robot3 = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot3);
				// Create a new robot object.
				Robot robot4 = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot4);
				// Create a new robot object.
				Robot robot5 = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot5);
				// Create a new robot object.
				Robot robot6 = new Robot();
				// Add the robot to the arena.
				arena.addRobot(robot6);
				// Create a new robot object.
				Robot robot7 = new Robot();
				// Add the robot to the arena.