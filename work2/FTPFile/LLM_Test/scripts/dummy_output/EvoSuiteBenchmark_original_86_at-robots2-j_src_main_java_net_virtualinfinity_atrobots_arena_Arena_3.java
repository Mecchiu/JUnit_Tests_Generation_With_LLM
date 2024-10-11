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
		
    @Test
    void test1() throws Exception {
        Arena arena = new Arena();
        ArrayList<ArenaObject> allTangibleRobots = arena.getAllTangibleRobots();
        ArrayList<ArenaObject> allRobots = arena.getAllRobots();
        ArrayList<CollidableArenaObject> allCollidable = arena.getAllCollidable();
        int testTime = 1;
        while( testTime > 0 ) {
            ArenaObject dummy = new ArenaObject();
            ArenaObjectVisitor visitor = new ArenaObjectVisitor();
            dummy.accept(visitor);
            testTime--;
        }
        assertEquals(ArenaObject.Count.ALL, allTangibleRobots.size());
        assertEquals(ArenaObject.Count.ALL, allRobots.size());
        assertEquals(ArenaObject.Count.ALL, allCollidable.size());
        assertEquals(ArenaObject.Object.ALL, dummy);
        ArrayList<ArenaObject> activeRobots = arena.getActiveRobots();
        ArrayList<CollidableArenaObject> collidables = arena.getCollidableObjects();
        assertEquals(ArenaObject.Count.ACTIVE, activeRobots.size());
        assertEquals(ArenaObject.Object.ACTIVE, dummy);
        assertEquals(ArenaObject.Count.SOLID, collidables.size());
        Map<Arena, Duration> roundTime = arena.getRoundTime();
        for( Arena arena2 : roundTime.keySet() ) {
            assertEquals(1, roundTime.get(arena2).getSeconds());
        }
        
    }
	
}