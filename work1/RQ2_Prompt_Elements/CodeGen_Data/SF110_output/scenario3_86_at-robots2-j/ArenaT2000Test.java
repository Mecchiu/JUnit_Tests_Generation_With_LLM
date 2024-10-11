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
    public void testCountActiveRobots() throws Exception {
        assertEquals(30, countActiveRobots());
        assertEquals(0, countActiveRobots());
    }

    @Test
    public void testGetAllRooms() throws Exception {
        List<AreaObject> rooms = getAllRooms();
		assertNotNull(rooms);
		assertEquals(4, rooms.size());
    }

    @Test
	public void testGetRoomByName() throws Exception {
		Room room = new Room();
		room.getName();
	}

    @JUnitTest
    public void testVisitAllObjects() throws Exception {
        ArenaObjectVisitor.visitAllObjects(this);
    }

    @JUnitTest
    public void testVisitObjectByName() throws Exception {
        ArenaObjectVisitor.visitObjectByName(new AreaObject());
    }

    @Test
    public void testVisitObject() throws Exception {
        ArenaObject a = new AreaObject();
        arenaObjects.put(a.getId(), a);

        ArenaObjectVisitor.visitAllObjects(this);

        List<ArenaObject> aObjects = arenaObjects.get(a.getId());
        assertNotNull(aObjects);
        assertFalse(aObjects.isEmpty());
    }

    @Test
	public void testVisitObjectByPosition() throws Exception {
		ArenaObjectVisitor.visitObjectByPosition(new AreaObject());
	}

    @Test
    public void testRender() throws Exception {
        ArenaObjectVisitor.visitObjectByPosition(new AreaObject());
        ArrayList<ArbitraryObject> objects = arenaObjects.get(0).getObjects();
		assertContainsSame(objects, AreaObject.class, "getArena");
        ArenaObject an = (ArenaObject) objects.get(0);
        assertEquals(0, an.getMinutes());
        ArrayList<CollidableArenaObject> cObj = an.getCollectionObj();
		assertContainsSame(cObj, CollidableArenaObject.*, "getCollidable");
        assertArrayEquals(AreaObject.COLLECTION_OBJ_LINK, an.getObject(), an.getLink());
        List<AreaObject> objectsToDelete = new ArrayList<>();
        objectsToDelete.add(objects.get(0));
        arenaObjectVisitor.visitObjectByPosition(objectsToDelete);
        assertTrue(objectsToDelete.isEmpty());
    }

    @Test
    public void testVisitObjects(ArenaObjectVisitor visitor) throws Exception {
    	// visitor.visitAllObjects();
    	// visitor.visitObjectByPosition(objects);
    	// visitObjects(visitor);
		List<ArenaObject> objects = getAllRooms().get(0).getObjects();
		objects.forEach(obj -> visitor.visitObjectByPosition(obj));
    }

    @Test
    public void testDamageInflicter() throws Exception {
        ArenaObjectVisitor.visitAllObjects();
    	List<DamageInflicter> damages = DamageInflicter.getDefault().getDamageInflicters();
    	assertEquals(4, damages.size());
    }

    @Test
    public void testRadarDispatcher() throws Exception {
        ArenaObjectVisitor.visitAllObjects();
    	// List<ArcadeDispatcher> rdss = Arde.getDefault().getRadarDispatchers();
    	// assertEquals(4, rdss.size());
    }

    /**
     * @return the time the arena will take.
     */
    public Duration getTime() {
    	return Duration.ZERO;
    }

    /**
     * Get the total max duration of all objects of this arena.
     *
     * @return the total max duration of all objects of this arena.
     */
    public Duration getTotalMaxDuration() {
    	return Duration.ONE;
    }

    @Test
    public void testReceiveAuxDispatcher() throws Exception {
        ReceiveDispatcher receiver = new ReceiveDispatcher();
        // receiver.receiveObject(null);
    	// receiver.receiveObject("");
    	ReceiveDispatcher.receivedObject.clear();
        ReceiveDispatcher.receivedObject.put(null);
        ReceiveDispatcher.receivedObject.contains("()");
        ReceiveDispatcher.receivedObject.put("()");
    	receiver.sendAuxDispatcher("()");
    	List<Collection<Object>> received = receiver.sendAuxDispatcher("()");
    	assertEquals(5, received.size());
    }
}
