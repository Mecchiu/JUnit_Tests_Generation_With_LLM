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
		* The test case is successful if the method returns the expected value.
		*/
		@Test
		void testCountActiveRobots() {
				Arena arena = new Arena();
				assertEquals(0, arena.countActiveRobots());
		}
		
		/**
		* Test case for {@link Arena#countActiveRobots()}.
		* The test case is successful if the method returns the expected value.
		*/
		@Test
		void testCountActiveRobots2() {
				Arena arena = new Arena();
				assertEquals(0, arena.countActiveRobots());
		}
		
		/**
		* Test case for {@link Arena#countActiveRobots()}.
		* The test case is successful if the method returns the expected value.
		*/
		@Test
		void testCountActiveRobots3() {
				Arena arena = new Arena();
				assertEquals(0, arena.countActiveRobots());
		}
		
		/**
		* Test case for {@link Arena#countActiveRobots()}.
		* The test case is successful if the method returns the expected value.
		*/
		@Test
		void testCountActiveRobots4() {
				Arena arena = new Arena();
				assertEquals(0, arena.countActiveRobots());
		}
		
		/**
		* Test case for {@link Arena#countActiveRobots()}.
		* The test case is successful if the method returns the expected value.
		*/
		@Test
		void testCountActiveRobots5() {
				Arena arena = new Arena();
				assertEquals(0, arena.countActiveRobots());
		}
		
		/**
		* Test case for {@link Arena#countActiveRobots()}.
		* The test case is successful if the method returns the expected value.
		*/
		@Test
		void testCountActiveRobots6() {
				Arena arena = new Arena();
				assertEquals(0, arena.countActiveRobots());
		}
		
		/**
		* Test case for {@link Arena#countActiveRobots()}.
		* The test case is successful if the method returns the expected value.
		*/
		@Test
		void testCountActiveRobots7() {
				Arena arena = new Arena();
				assertEquals(0, arena.countActiveRobots());
		}
		
		/**
		* Test case for {@link Arena#countActiveRobots()}.
		* The test case is successful if the method returns the expected value.
		*/
		@Test
		void testCountActiveRobots8() {
				Arena arena = new Arena();
				assertEquals(0, arena.countActiveRobots());
		}
		
		/**
		* Test case for {@link Arena#countActiveRobots()}.
		* The test case is successful if the method returns the expected value.
		*/
		@Test
		void testCountActiveRobots9() {
				Arena arena = new Arena();
				assertEquals(0, arena.countActiveRobots());
		}
		
		/**
		* Test case for {@link Arena#countActiveRobots()}.
		* The test case is successful if the method returns the expected value.
		*/
		@Test
		void testCountActiveRobots10() {
				Arena arena = new Arena();
				assertEquals(0, arena.countActiveRobots());
		}
}

// ArenaObject.java
package net.virtualinfinity.atrobots.arenaobjects;

import net.virtualinfinity.atrobots.measures.Duration;
import net.virtualinfinity.atrobots.measures.Vector;

/**
 * @author Daniel Pitts
 */
public interface ArenaObject {
    /**
     * Get the position of this object.
     *
     * @return the position of this object.
     */
    Vector getPosition();

    /**
     * Get the velocity of this object.
     *
     * @return the velocity of this object.
     */
    Vector getVelocity();

    /**
     * Get the heading of this object.
     *
     * @return the heading of this object.
     */
    double getHeading();

    /**
     * Get the radius of this object.
     *
     * @return the radius of this object.
     */
    double getRadius();

    /**
     * Get the time this object was created.
     *
     * @return the time this object was created.
     */
    Duration getCreationTime();

    /**
     * Get the time this object was last updated.
     *
     * @return the time this object was last updated.
     */
    Duration getLastUpdateTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastScanTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastCollisionTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastDamageTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastWallCollisionTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastRobotCollisionTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastMineCollisionTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastShotCollisionTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastExplosionTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastScannerSweepTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastScannerPingTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastRadioTransmissionTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastRadioReceptionTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastRadioInterferenceTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastRadioJammingTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastRadioHomingTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastRadioHomingPingTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastRadioHomingInterferenceTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastRadioHomingJammingTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastRadioHomingTransmissionTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastRadioHomingReceptionTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastRobotScanTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastRobotScanInterferenceTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastRobotScanJammingTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastRobotScanTransmissionTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastRobotScanReceptionTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastRobotScanPingTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastRobotScanPingInterferenceTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastRobotScanPingJammingTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastRobotScanPingTransmissionTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastRobotScanPingReceptionTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastRobotScanSweepTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastRobotScanSweepInterferenceTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastRobotScanSweepJammingTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastRobotScanSweepTransmissionTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastRobotScanSweepReceptionTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastMineScanTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastMineScanInterferenceTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastMineScanJammingTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastMineScanTransmissionTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastMineScanReceptionTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastMineScanPingTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastMineScanPingInterferenceTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastMineScanPingJammingTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastMineScanPingTransmissionTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastMineScanPingReceptionTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastMineScanSweepTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastMineScanSweepInterferenceTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastMineScanSweepJammingTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastMineScanSweepTransmissionTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastMineScanSweepReceptionTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastShotScanTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastShotScanInterferenceTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastShotScanJammingTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastShotScanTransmissionTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastShotScanReceptionTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastShotScanPingTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastShotScanPingInterferenceTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastShotScanPingJammingTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastShotScanPingTransmissionTime();

    /**
     * Get the time this object was last scanned.
     *
     * @return the time this object was last scanned.
     */
    Duration getLastShotScanPingReceptionTime();

    /**
     * Get the time this