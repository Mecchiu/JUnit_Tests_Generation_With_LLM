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
     * @test public void testCountActiveRobots()
     *
     * It checks that we can get a count of all registered robots across all frame builds.
     *
     * @throws Exception
     */
    @Test
    public void testCountActiveRobots() throws Exception
    {

        World world = new World();

        Arena arena = new Arena();

        assertEquals(0, arena.countActiveRobots());

        arena.addAll(world);

        assertEquals(5, arena.countActiveRobots());


        ArrayList<ArenaObject> allObjects = new ArrayList<ArenaObject>();

        Collection<ArenaObject> allRobots = new ArrayList<ArenaObject>();

        allRobots.add(new ArenaObject(), new CollidableArenaObject());

        allRobots.add(new ArenaObject(), new DamageInflicter());

        allObjects.add(new ArenaObject(), allRobots);

        arena.addAll(allObjects);

        // Iterate over active robots
        for (ArenaObject obj : allRobots)
        {
            System.out.println(obj);
            assertEquals(1, arena.countActiveRobots());
        }

        Collection<ArenaObject> intangibles = new ArrayList<ArenaObject>();

        intangibles.add(new ArenaObject());

        intangibles.add(new CollidableArenaObject(3.141592653));

        allObjects.add(new ArenaObject(), intangibles);

        arena.addAll(allObjects);

        assertEquals(5, arena.countActiveRobots());
    }

    /**
     * @test public void testBuildRound()
     *
     * It checks that we can generate round start times for every frame.
     *
     * @throws Exception
     */
    @Test
    public void testBuildRound() throws Exception
    {

        World world = new World();

        Arena arena = new Arena();

        Duration duration = new Duration();

        assertEquals(1, arena.generateRoundStartTime(), 0.01);
        assertEquals(1, arena.generateRoundStartTime(1), 0.01);
        assertEquals(1, arena.generateRoundStartTime(0), 0.01);

        arena.addAll(world);

        assertEquals(2, arena.generateRoundStartTime(), 0.01);
        assertEquals(2, arena.generateRoundStartTime(1), 0.01);
        assertEquals(2, arena.generateRoundStartTime(0), 0.01);

        List<World> worldList = new ArrayList<World>();
        List<World> worldList2 = new ArrayList<World>();
        List<World> worldList3 = new ArrayList<World>();
        List<World> worldList3L = new ArrayList<World>();

        worldList.add(new World());
        worldList.add(new World(6));
        worldList.add(new World(23));

        worldList2.add(new World());
        worldList2.add(new World(18));
        
        worldList.add(new World());
        worldList.add(new World(25));
        
        worldList3.add(new World());
        worldList3.add(new World(20));
        
        worldList3L.add(new World());
        worldList3L.add(new World(40));

        arena.addAll(worldList);
        arena.addAll(worldList2);
        arena.addAll(worldList3);
        arena.addAll(worldList3L);


        assertEquals(4, arena.generateRoundStartTime(), 0.01);
}
}