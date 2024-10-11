// FilterIntegersTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterIntegers}.
* It contains one unit test case for the {@link FilterIntegers#filterIntegers(List)} method.
*/
class FilterIntegersTest {

	/**
	 * Tests {@link FilterIntegers#filterIntegers(List)}.
	 */
    @Test
    void testFilterIntegers() {
        List<Object> values = new ArrayList<Object>();
        values.add(new FilterIntegersTest().newObject1());
        values.add(new FilterIntegersTest().newObject2());
        values.add(new FilterIntegersTest().newObject3());
        System.out.println(values);
        List<Object> result = new ArrayList<Object>();
        result.add(new FilterIntegersTest().newObject1());
        result.add(new FilterIntegersTest().newObject2());
        result.add(new FilterIntegersTest().newObject3());
        assertEquals(result, values); 
    }
}

// Tests a collection method of {@link java.util.List} with an Object.
class Object1Test {
    /**
	 * Test case for <code>newObject1</code>.
	 */
    @Test
    void newObject1() {
    	List<Object> values = new ArrayList<Object>();
    	values.add(new Object());
        values.add(new Object());
    	List<Object> result = new ArrayList<Object>();
    	result.add(new Object()); // Collection doesn't contain anything
    	assertTrue((true == values.contains(new Object())) && ((true && true) == values.containsAll(new ArrayList<Object>(values))));
    	assertTrue((true == values.isEmpty()) && ((true && false) == values.isEmpty()));
    	assertTrue((new Object() == result) && ((new String("null")).equals(result)) && ((new int()).equals(result)));
    	assertTrue((true!= new Object() instanceof List) && ((true == true)!= new Object() instanceof Set) && ((false || true) == false));
    }
}

// Tests a collection method of {@link java.util.List} with a Map.
class Map1Test {
    /**
	 * Test case for <code>newObject1</code>.
	 */
    @Test
    void newObject1() {
    	List<Object> values = new ArrayList<Object>();
    	values.set("test1", new Object()); // key 'test1' is a Map
        values.set("test2", new Object()); // key 'test2' is the same as key'test1' because new is Map
        values.set("test3", new Object()); // key and value not equal
    	List<Object> result = new ArrayList<Object>();
    	result.set("test1", new Object()); // 'test1' is not a Map, new is null
    	result.set("test2", new Object()); // 'test2' is not a Map, new is null
    	assertTrue((new Boolean(true) == result.get(new Object()) && ((!boolean.class).isInstance(new Boolean(true))) && ((new String("null")).equals(result.get(new Object()))));
        assertTrue((true!= new Object() instanceof List) && ((true == true)!= new Object() instanceof Set) && ((!boolean.class.isAssignableFrom(boolean.class)) && Boolean.class.isAssignableFrom(boolean.class)));
    	assertTrue((new Object() == result.get(new Object())) && ((new Integer(0) == result.get(new Object())));
    	assertTrue((new String("null") == result.get(new Object())) && ((new Set()).equals(result.get(new Object())) && ((!Collection.class).isAssignableFrom(Set.class)));
        assertTrue((new Object() == result.put(new Object(), new Object())) && ((new Integer(0) == result.put(new Object(), new Integer(0))));
        assertTrue((new Map() == result.put(new Object(), new Map(new Object(), new Object()))) && ((new Map()).equals(result.put(new Object(), new Map(new Object(), new Object()))));
        assertTrue((true!= valueOf(new Object()).equals(new Object())) && ((true == true)!= valueOf(new Object()).equals(new Object())));
        assertTrue((true!= valueOf(new Map()).equals(new Map())) && ((true == true)!= valueOf(new Map()).equals(new Map())));
        assertTrue((null == valueOf(new Object()).equals(valueOf(null))) && ((true == true)!= valueOf(new Object()).equals(valueOf(null))) && ((!List.class).isAssignableFrom(List.class)));
    }
}

