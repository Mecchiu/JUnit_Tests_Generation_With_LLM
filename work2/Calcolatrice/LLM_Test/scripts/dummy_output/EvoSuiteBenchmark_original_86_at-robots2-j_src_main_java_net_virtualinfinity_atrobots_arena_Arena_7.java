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
  * This is used in unit test for the {@link Arena#countActiveRobots()} method.
 */

	List<ArenaObject> list = new LinkedList<ArenaObject>();
	int inti = 0;
	int intid = 0;
	List<TangibleArenaObject> lista = new LinkedList<TangibleArenaObject>();
	private static final boolean DIALOG_SHOW = true;

    private static final boolean DIALOG_USE_COLOR = true;
    private static final boolean DIALOG_NOTIFICATION = true;

//    @Test
    /**
     * Unit test for {@link Arena#countActiveRobots()}
     * (see if we can test the method correctly)
     */
    public void testCountAcountRobots(){
        ArenaObject obj;
        int i = 0;
        for(ArenaObject object : list){
            obj = object;
                assertEquals(inti++, obj.countActiveRobots());
                i++;
        }
    }
	@Test
    public void testAddRobot(){
        ArenaObject object = new RemoteClient();
        object.setId(2);
        object.play();
        assertTrue(object.isArobject());
        object.play();
        assertEquals(2, object.countActiveRobots());
        assertTrue(((RemoteClient)object).isArobject());
        assertEquals(0, ((RemoteClient)object).countActiveRobots());
        lista.add(object);
        assertEquals(1, object.countActiveRobots());
        assertEquals(1, ((RemoteClient)object).countActiveRobots());
        assertEquals(1, list.size());
        assertSame(object, list.get(0));
    }

    @Test
    public void testAddCollidable(){
        ArenaObject object = new RemoteClient();
        list.add(object);
        object.play();
        assertEquals(1, object.countActiveRobots());
        TangibleArenaObject obj = new CollidableArenaObject();
        List<ArenaObject> list = new LinkedList<ArenaObject>();
        list.add(obj);
        obj.play();
        assertEquals(2, obj.countActiveRobots());
        assertTrue(list.iterator().hasNext());
        assertTrue(list.iterator().next().isArobject());
        assertTrue(list.iterator().next().isCollidable());
        object.play();
        int d1 = ((RemoteClient)object).getDamageTaken();
        d1++;
        assertEquals(1, d1);
        assertEquals(((CollidableArenaObject) list.iterator().next()).damageTaken(), d1);
        obj.play();
        int d2 = ((RemoteClient)object).getDamageTaken();
        d2++;
        assertEquals(2, d2);
        assertEquals(((CollidableArenaObject) list.iterator().next()).damageTaken(), d2);
    }
	@Test
    public void testRemove() {
        lista.add(new RemoteClient(),10);
        assertEquals(2, list.size());
        lista.remove(1);
        assertEquals(2, lista.size());
    }
	@Test
    public void testAddRemainsEmpty(){
        lista.add(new RemoteClient(),100);
        assertEquals(2, lista.size());
    }
	@Test
    public void testRemoveOne(){
        assertEquals(2, list.size());
        lista.remove(list.iterator().next());
        assertEquals(1, lista.size());
    }
	@Test
    public void testIterationOne(){
}
}