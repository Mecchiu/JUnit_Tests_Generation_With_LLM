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

    private FrameBuilder frameBuilder;
    
    public ArenaTest() {
        frameBuilder = new FrameBuilder();
    }
    
    @Test
    public void testCountActiveRobots() {
        Arena arena = new Arena();
        arena.startRound();
        arena.addRobot(new RadiotestRobot(FrameBuilder.getTileWorld().getPlayer()) );
        arena.addRobot(new RadiotestRobot(FrameBuilder.getTileWorld().getPlayer()) );
        arena.addRobot(new RadiotestRobot(FrameBuilder.getTileWorld().getPlayer()) );
        frameBuilder.addRobots(Integer.MAX_VALUE, arena.getActiveRobots(), arena.getAllRobots());
        arena.addCollidable(Integer.MAX_VALUE, arena.getCollidableRobots(), arena.getCollidableAllCollidable());
        arena.addIntangible(Integer.MAX_VALUE, arena.getIntangibleRobots(), arena.getIntangibleAllIntangible());
        arena.addCollidable(Integer.MAX_VALUE, arena.getCollidableRobots(), arena.getCollidableAllCollidable());
        arena.removeDead();
        arena.stop();
        assertEquals(1, arena.getActiveRobots().size());
        assertEquals(1, arena.getAllRobots().size());
        assertEquals(1, arena.getCollidableRobots().size());
        assertEquals(1, arena.getCollidableAllCollidable().size());
        assertEquals(2, arena.getIntangibleRobots().size());
        assertEquals(2, arena.getIntangibleAllIntangible().size());
        assertEquals(2, arena.getCollidableRobots().size());
        assertEquals(2, arena.getCollidableAllCollidable().size());
    }
    
    /**
     * The test frame builder is a singleton, thus we use it only when we need it
     * @return this frameBuilder
     */
    public static FrameBuilder getFrameBuilder() {
        if (frameBuilder == null) {
            frameBuilder = new FrameBuilder();
        }
        return frameBuilder;
    }
}

/**
 * Tests using the frambuilder.
 * It is the only test which takes care of everything before the framebuilder has finished.
 */
class FrameBuilderTest {
	
	private Arena arena;
	
	/**
	 * Setup the test frame builder.
	 * @param frameBuilder frame builder
	 */
	public FrameBuilderTest(FrameBuilder frameBuilder) {
		this.frameBuilder = frameBuilder;
	}
	
	public void assertThatFrameBuilderHasExactlyAtLeastSizeOf(int size) {
		FrameBuilderTest.getFrameBuilder().assertThatFrameBuilderHasAtLeastSizeOf(size);
	}
	
	public void testStartRoundBefore() {
		ArenaTest.getFrameBuilder().assertThatFrameBuilderHasAtLeastSizeOf(1);
	}
	
	public void testStartRoundAfter() {
		ArenaTest.getFrameBuilder().assertThatFrameBuilderHasAtLeastSizeOf(2);
	}
	
	public void execute() {
		ArenaTest.getFrameBuilder().execute();
	}

	public void run() {
		try {
			FrameBuilderTest.getFrameBuilder().run();
		} catch (Exception ignore) {
			// nothing todo
		}
		FrameBuilderTest.getFrameBuilder().assertThatFrameBuilderHasExactlyAtLeastSizeOf(2);
		ArenaTest.getFrameBuilder().assertThatFrameBuilderHasAtLeastSizeOf(1);
	}
	
	/**
	 * Reset the test frame builder.
	 */
	public void reset() {
		FrameBuilderTest.getFrameBuilder().reset();
	}
}