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
		* Test case for {@link Arena#countActiveRobots()} method.
		* This test case checks if the method returns the correct value when the arena is empty.
		*/
		@Test
		void testCountActiveRobots_empty() {
				Arena arena = new Arena();
				assertEquals(0, arena.countActiveRobots());
		}
		
		/**
		* Test case for {@link Arena#countActiveRobots()} method.
		* This test case checks if the method returns the correct value when the arena contains one robot.
		*/
		@Test
		void testCountActiveRobots_one() {
				Arena arena = new Arena();
				arena.addRobot(new TangibleArenaObject() {
						@Override
						public void update(Duration duration) {
						}
						@Override
						public void accept(ArenaObjectVisitor arenaObjectVisitor) {
						}
						@Override
						public void winRound() {
						}
						@Override
						public void tieRound() {
						}
						@Override
						public void checkCollision(CollidableArenaObject collidableArenaObject) {
						}
						@Override
						public void setArena(Arena arena) {
						}
						@Override
						public boolean isDead() {
								return false;
						}
						@Override
						public ArenaObjectSnapshot getSnapshot() {
								return null;
						}
						@Override
						public RadioDispatcher getRadioDispatcher() {
								return null;
						}
						@Override
						public ArenaObject getArenaObject() {
								return null;
						}
				});
				assertEquals(1, arena.countActiveRobots());
		}
		
		/**
		* Test case for {@link Arena#countActiveRobots()} method.
		* This test case checks if the method returns the correct value when the arena contains two robots.
		*/
		@Test
		void testCountActiveRobots_two() {
				Arena arena = new Arena();
				arena.addRobot(new TangibleArenaObject() {
						@Override
						public void update(Duration duration) {
						}
						@Override
						public void accept(ArenaObjectVisitor arenaObjectVisitor) {
						}
						@Override
						public void winRound() {
						}
						@Override
						public void tieRound() {
						}
						@Override
						public void checkCollision(CollidableArenaObject collidableArenaObject) {
						}
						@Override
						public void setArena(Arena arena) {
						}
						@Override
						public boolean isDead() {
								return false;
						}
						@Override
						public ArenaObjectSnapshot getSnapshot() {
								return null;
						}
						@Override
						public RadioDispatcher getRadioDispatcher() {
								return null;
						}
						@Override
						public ArenaObject getArenaObject() {
								return null;
						}
				});
				arena.addRobot(new TangibleArenaObject() {
						@Override
						public void update(Duration duration) {
						}
						@Override
						public void accept(ArenaObjectVisitor arenaObjectVisitor) {
						}
						@Override
						public void winRound() {
						}
						@Override
						public void tieRound() {
						}
						@Override
						public void checkCollision(CollidableArenaObject collidableArenaObject) {
						}
						@Override
						public void setArena(Arena arena) {
						}
						@Override
						public boolean isDead() {
								return false;
						}
						@Override
						public ArenaObjectSnapshot getSnapshot() {
								return null;
						}
						@Override
						public RadioDispatcher getRadioDispatcher() {
								return null;
						}
						@Override
						public ArenaObject getArenaObject() {
								return null;
						}
				});
				assertEquals(2, arena.countActiveRobots());
		}
		
		/**
		* Test case for {@link Arena#countActiveRobots()} method.
		* This test case checks if the method returns the correct value when the arena contains three robots.
		*/
		@Test
		void testCountActiveRobots_three() {
				Arena arena = new Arena();
				arena.addRobot(new TangibleArenaObject() {
						@Override
						public void update(Duration duration) {
						}
						@Override
						public void accept(ArenaObjectVisitor arenaObjectVisitor) {
						}
						@Override
						public void winRound() {
						}
						@Override
						public void tieRound() {
						}
						@Override
						public void checkCollision(CollidableArenaObject collidableArenaObject) {
						}
						@Override
						public void setArena(Arena arena) {
						}
						@Override
						public boolean isDead() {
								return false;
						}
						@Override
						public ArenaObjectSnapshot getSnapshot() {
								return null;
						}
						@Override
						public RadioDispatcher getRadioDispatcher() {
								return null;
						}
						@Override
						public ArenaObject getArenaObject() {
								return null;
						}
				});
				arena.addRobot(new TangibleArenaObject() {
						@Override
						public void update(Duration duration) {
						}
						@Override
						public void accept(ArenaObjectVisitor arenaObjectVisitor) {
						}
						@Override
						public void winRound() {
						}
						@Override
						public void tieRound() {
						}
						@Override
						public void checkCollision(CollidableArenaObject collidableArenaObject) {
						}
						@Override
						public void setArena(Arena arena) {
						}
						@Override
						public boolean isDead() {
								return false;
						}
						@Override
						public ArenaObjectSnapshot getSnapshot() {
								return null;
						}
						@Override
						public RadioDispatcher getRadioDispatcher() {
								return null;
						}
						@Override
						public ArenaObject getArenaObject() {
								return null;
						}
				});
				arena.addRobot(new TangibleArenaObject() {
						@Override
						public void update(Duration duration) {
						}
						@Override
						public void accept(ArenaObjectVisitor arenaObjectVisitor) {
						}
						@Override
						public void winRound() {
						}
						@Override
						public void tieRound() {
						}
						@Override
						public void checkCollision(CollidableArenaObject collidableArenaObject) {
						}
						@Override
						public void setArena(Arena arena) {
						}
						@Override
						public boolean isDead() {
								return false;
						}
						@Override
						public ArenaObjectSnapshot getSnapshot() {
								return null;
						}
						@Override
						public RadioDispatcher getRadioDispatcher() {
								return null;
						}
						@Override
						public ArenaObject getArenaObject() {
								return null;
						}
				});
				assertEquals(3, arena.countActiveRobots());
		}
		
		/**
		* Test case for {@link Arena#countActiveRobots()} method.
		* This test case checks if the method returns the correct value when the arena contains four robots.
		*/
		@Test
		void testCountActiveRobots_four() {
				Arena arena = new Arena();
				arena.addRobot(new TangibleArenaObject() {
						@Override
						public void update(Duration duration) {
						}
						@Override
						public void accept(ArenaObjectVisitor arenaObjectVisitor) {
						}
						@Override
						public void winRound() {
						}
						@Override
						public void tieRound() {
						}
						@Override
						public void checkCollision(CollidableArenaObject collidableArenaObject) {
						}
						@Override
						public void setArena(Arena arena) {
						}
						@Override
						public boolean isDead() {
								return false;
						}
						@Override
						public ArenaObjectSnapshot getSnapshot() {
								return null;
						}
						@Override
						public RadioDispatcher getRadioDispatcher() {
								return null;
						}
						@Override
						public ArenaObject getArenaObject() {
								return null;
						}
				});
				arena.addRobot(new TangibleArenaObject() {
						@Override
						public void update(Duration duration) {
						}
						@Override
						public void accept(ArenaObjectVisitor arenaObjectVisitor) {
						}
						@Override
						public void winRound() {
						}
						@Override
						public void tieRound() {
						}
						@Override
						public void checkCollision(CollidableArenaObject collidableArenaObject) {
						}
						@Override
						public void setArena(Arena arena) {
						}
						@Override
						public boolean isDead() {
								return false;
						}
						@Override
						public ArenaObjectSnapshot getSnapshot() {
								return null;
						}
						@Override
						public RadioDispatcher getRadioDispatcher() {
								return null;
						}
						@Override
						public ArenaObject getArenaObject() {
								return null;
						}
				});
				arena.addRobot(new TangibleArenaObject() {
						@Override
						public void update(Duration duration) {
						}
						@Override
						public void accept(ArenaObjectVisitor arenaObjectVisitor) {
						}
						@Override
						public void winRound() {
						}
						@Override
						public void tieRound() {
						}
						@Override
						public void checkCollision(CollidableArenaObject collidableAren