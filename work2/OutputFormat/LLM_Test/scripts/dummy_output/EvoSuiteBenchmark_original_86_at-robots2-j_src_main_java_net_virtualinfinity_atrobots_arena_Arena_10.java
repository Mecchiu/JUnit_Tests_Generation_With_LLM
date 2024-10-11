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
     * Test of getActiveRobots method, of class Arena.
     */
    @Test
		public final void testGetActiveRobots() {
    		Arena instance = new Arena();

        List<TangibleArenaObject> robbians = new ArrayList<TangibleArenaObject>();
        robbians.add(instance.newCollidableArenaObject(1, 2, 3, 4));
        robbians.add(instance.newCollidableArenaObject(5, 6, 7, 8));
        assertEquals(1, instance.getActiveRobots().size());
        assertEquals(1, instance.getActiveRobots().size());
        
        List<CollidableArenaObject> collidableArenaObjects = instance.getCollidableArenas();
        assertCount(1, collidableArenaObjects);

        assertObjectsAreEqual(instance.getActiveRobots(), collidableArenaObjects);

        List<TangibleArenaObject> robots = instance.getRobots();
        assertCount(1, robots);
        
        Robot targetRobot = (Robot) robots.get(new Random().nextInt(robots.size()));
        Robot targetRobot2 = (Robot) robots.get(new Random().nextInt(robots.size()));
        assertEquals(targetRobot, new CollidableArenaObject(targetRobot2, 0, 0, 0));
        
        instance.removeRobot(new CollidableArenaObject(targetRobot, 9, 9, 9));
        
        instance.updateFrame();
        assertEquals(1, instance.getActiveRobots().size());
        assertEquals(0, robotCounter.get().size());
        
        
        robbians.add(instance.newCollidableArenaObject(1, 2, 3, 4));
        robbians.add(instance.newCollidableArenaObject(5, 6, 7, 8));
        
        colidableArenaObjects = instance.getCollidableArenas();
        assertCount(1, collidableArenaObjects);
        
        collidableArenaObjects = instance.getCollidableArenas();
        assertCount(1, collidableArenaObjects);
        assertObjectsAreEqual(clonesOfRobots(robbians), collidableArenaObjects);
        
        Robot target = (Robot) robots.get(new Random().nextInt(robots.size()));
        
        instance.removeRobot(target);
        
        instance.removeRobot(instance.newCollidableArenaObject(target, 0, 0, 0));
        
        instance.updateFrame();
        assertEquals(1, instance.getActiveRobots().size());
        assertEquals(0, robotCounter.get().size());
    }
    
    private void assertObjectsAreEqual(Collection<? extends Collection<? extends ArenaObject>> expected, Collection<? extends ArenaObject> actual) {
        HashSet<String> allObjects = new HashSet<String>();
        for (ArenaObject ano : actual)
            allObjects.add(ano.getId().getId());
        for (ArenaObject ano : expected)
            allObjects.add(ano.getId().getId());
        assertEquals(allObjects, new HashSet<String>(((List) expected.get(0)).size()));
        assertEquals(allObjects, ((List) expected.get(0)).subList(0, 1));
        assertEquals(allObjects, ((List) expected.get(1)).subList(0, 1));
    }
    
    private Collection<? extends Collection<? extends ArenaObject>> clonesOfRobots(Collection<? extends ArenaObject> oldNodes) {
        HashSet<String> allObjects = new HashSet<String>();
}
}